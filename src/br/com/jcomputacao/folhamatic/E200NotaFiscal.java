package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * **** Quais registros gerar? ****<br/>
 * Se você possui esta dúvida, consulte o contador para saber quais registros devem ser gerados em cada empresa para atender suas obrigações fiscais perante o estado, o município, a legislação federal, comercial e contábil.
 * Exemplo:<br/>
 * Para uma nota fiscal de venda, seria necessário gerar no mínimo os registros<br/>
 * IDENTICAÇÃO DA EMPRESA (sempre obrigatório) CADASTRO DE CLIENTES/FORNECEDORES CADASTRO DE PRODUTOS/SERVIÇOS<br/>
 * NOTAS FISCAIS (cabeçalho)<br/>
 * LANÇAMENTOS DE IMPOSTOS DAS NOTAS FISCAIS (exemplo: um registro para cada alíquota de ICMS, para cada CFOP) CHAVE DO LANÇAMENTO PRODUTOS<br/>
 * LANÇAMENTO DOS PRODUTOS/SERVIÇOS<br/>
 * E016 CONTAS REDUZIDAS<br/>
 * Se tem obrigações com DIPAM gerar também:<br/>
 * E203 DIPAM<br/>
 * Se é uma empresa transportadora, deverá gerar:<br/>
 * E220 REGISTRO DADOS DO TRANSPORTE - INFORMAÇÕES DA CARGA<br/>
 * <br/>
 * 05/02/2017 13:20:34<br/>
 * @author murilo<br/>
 */
public class E200NotaFiscal extends LineArchetype {
    
    /**
     * E200
     */
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de saída.
     */
    public static final String ENTRADA_OU_SAIDA = "ENTRADA_OU_SAIDA";
    /**
     * ESPÉCIE N.F. - Informe a espécie da nota fiscal.<br/>
     */
    public static final String EPECIE_NOTA_FISCAL = "EPECIE_NOTA_FISCAL";
    /**
     * SÉRIE N.F.<br/>
     * Informe a série da nota fiscal conforme Tabela de Orientações de Séries e Subséries.<br/>
     * Quando se tratar de cupom fiscal informe a série conforme o campo Código (Série)<br/>
     * do cadastro dos Dados da Máquina Registradora/ECF/PDV/CF-e contido no Sistema E-Fiscal (menu Arquivos).<br/>
     * Quando for necessário importar um cupom fiscal em que já exista cadastrado no sistema<br/>
     * a mesma numeração inicial, será necessário criar uma nova série neste mesmo cadastro<br/>
     * (menu Arquivos-Máquina Registradora-Dados da Máquina Registradora/ECF/PDV/CF-e).<br/>
     * Ex. No mês 01/2009 há cadastro no Sistema E-Fiscal do cupom no 0051 a 0100,<br/>
     * Espécie ECF, Série 001.<br/>
     * Supondo que em 01/2010 pelo fato da numeração do cupom ter atingido 999.999<br/>
     * reiniciou-se a numeração e a mesma coincidiu com uma numeração inicial já cadastrada no sistema<br/>
     * como por exemplo 0051 a 0080, neste caso<br/>
     * para que seja possível importar este cupom de 01/2010<br/>
     * é preciso alterar a série dele no arquivo e incluir esta nova série<br/>
     * no cadastro dos Dados da Máquina Registradora/ECF/PDV/CF-e<br/>
     * ficando por exemplo 0051 a 0080, Espécie ECF, Série 002.<br/>
     * OBS: A inclusão de novas séries é necessária porque no sistema<br/>
     * não é permitido cadastrar um mesmo número de nota com:<br/>
     * CNPJ - Espécie - Série - Sub-Série iguais.<br/>
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    /**
     * SUBSÉRIE N.F<br/>
     * Informe a subsérie da nota fiscal conforme Tabela de Orientações de Séries e Subséries.<br/>
     * Quando se tratar de cupom fiscal, deixe este campo vazio.<br/>
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    /**
     * No INICIAL DA NOTA FISCAL<br/>
     * Informe o número da nota fiscal.<br/>
     * Caso esteja lançando nota fiscal de saídas com várias notas agrupadas (ex. série D..)<br/>
     * informe o número da primeira nota fiscal. Campo Obrigatório.<br/>
     */
    public static final String NUMERO_INICIAL_NOTA_FISCAL = "NUMERO_INICIAL_NOTA_FISCAL";
    /**
     * No FINAL DA NOTA FISCAL<br/>
     * Caso esteja lançando nota fiscal de saídas com várias notas agrupadas (ex. série D..)<br/>
     * informe o número da última nota fiscal, caso contrário<br/>
     * repetir o número da nota fiscal informada no campo 06.<br/>
     * Este campo somente será utilizado nas notas fiscais de saídas<br/>
     * quando tratar de nota fiscal de entradas, informar zeros.<br/>
     */
    public static final String NUMERO_FINAL_NOTA_FISCAL = "NUMERO_FINAL_NOTA_FISCAL";
    /**
     * CÓDIGO DO CLIENTE/FORNECEDOR<br/>
     * Informe o código do cliente ou fornecedor da nota fiscal conforme cadastro do sistema de faturamento.<br/>
     * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01"<br/>
     * e no sistema de faturamento com código "10", informe "10" neste campo.<br/>
     * Campo obrigatório para notas fiscais de entradas.<br/>
     * OBS: Este campo só poderá estar vazio nas notas de saídas<br/>
     * quando se tratar de venda a consumidor (NF série D..)<br/>
     * ou quando cupom fiscal (NF espécie ECF, CMR e PDV ou CF- e)<br/>
     * diferente disso, o campo deverá ser informado para não ocorrer rejeição<br/>
     * na validação de arquivos magnéticos como SINTEGRA, GRF-CBT, SINCO, EFD e outros.<br/>
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    public static final String DATA_EMISSAO = "DATA_EMISSAO";
    /**
     * DATA DE ENTRADA/SAÍDA<br/>
     * Informe a data da entrada ou saída da nota fiscal na empresa no formato AAAAMMDD.<br/>
     * Quando se tratar de cupom fiscal esta data de saída deve ser igual a data de emissão.<br/>
     * Campo Obrigatório.<br/>
     */
    public static final String DATA_ENTRADA_SAIDA = "DATA_ENTRADA_SAIDA";
    /**
     * UF DA N.F.<br/>
     * Informe o estado (UF) constante na nota fiscal.<br/>
     * Atenção: Para notas fiscais de Exportação informar EX<br/>
     * e de Importação informar IM.<br/>
     */
    public static final String UF = "UF";
    /**
     * MODELO DA N.F. - Informe o modelo da nota fiscal conforme Tabela de Modelos de Documentos Fiscais. Campo obrigatório.
     * @see https://www.fazenda.sp.gov.br/sped/downloads/Guia_Pratico_EFD_Versao_2_0_8.pdf
     * <table>
     * <thead><tr><th>Código</th><th>Descrição</th><th>Modelo</th><th>Registro Pai</th></tr></threa>
     * <tbody><tr><td>01</td><td>Nota Fiscal</td><td>1/1A</td><td>C100<tr><td><tr><td>1B</td><td>Nota Fiscal Avulsa - C100<tr><td>
     * <tr><td>02</td><td>Nota Fiscal de Venda a Consumidor 2 C300 ou C350 ou C400 (emissão por ECF)<tr><td>
     * <tr><td>2D</td><td>Cupom Fiscal - C400<tr><td>
<tr><td>2E</td><td>Cupom Fiscal Bilhete de Passagem - D350 (emissão por ECF)<tr><td>
<tr><td>04</td><td>Nota Fiscal de Produtor 4 C100<tr><td>
<tr><td>06</td><td>Nota Fiscal/Conta de Energia Elétrica 6 Se aquisição C500;
Se fornecimento: C500 ou C600; C700 (somente
empresas obrigadas aos arquivos previstos no
Convênio 115/03)<tr><td>
<tr><td>07</td><td>Nota Fiscal de Serviço de Transporte 7 D100<tr><td>
<tr><td>08</td><td>Conhecimento de Transporte Rodoviário de Cargas 8 D100<tr><td>
<tr><td>8B</td><td>Conhecimento de Transporte de Cargas Avulso - D100<tr><td>
<tr><td>09</td><td>Conhecimento de Transporte Aquaviário de Cargas 9 D100<tr><td>
<tr><td>10</td><td>Conhecimento Aéreo 10 D100<tr><td>
<tr><td>11</td><td>Conhecimento de Transporte Ferroviário de Cargas 11 D100<tr><td>
<tr><td>13</td><td>Bilhete de Passagem Rodoviário 13 D300<tr><td>
<tr><td>14</td><td>Bilhete de Passagem Aquaviário 14 D300<tr><td>
<tr><td>15</td><td>Bilhete de Passagem e Nota de Bagagem 15 D300<tr><td>
<tr><td>16</td><td>Bilhete de Passagem Ferroviário 16 D300<tr><td>
<tr><td>18</td><td>Resumo de Movimento Diário 18 D400<tr><td>
<tr><td>21</td><td>Nota Fiscal de Serviço de Comunicação</td><td>21</td><td><p>Se aquisição: D500;</p><p>Se prestação: D500 ou D600;</p><p>D695 (somente empresas obrigadas aos arquivos</p><p>previstos no Convênio 115/03)</p><tr><td></tr>
<tr><td>22</td><td>Nota Fiscal de Serviço de Telecomunicação</td><td>22</td><td><p>Se aquisição: D500;</p><p>Se prestação: D500 ou D600; ou</p><p>D695 (somente empresas obrigadas aos arquivos</p><p>previstos no Convênio 115/03)</p></td></tr>
<tr><td>26 Conhecimento de Transporte Multimodal de Cargas 26 D100<tr><td>
<tr><td>27 Nota Fiscal De Transporte Ferroviário De Carga D100<tr><td>
<tr><td>28 Nota Fiscal/Conta de Fornecimento de Gás Canalizado - C500 ou C600<tr><td>
<tr><td>29 Nota Fiscal/Conta de Fornecimento de Água Canalizada - C500 ou C600<tr><td>
<tr><td>55 Nota Fiscal Eletrônica – NF-e 55 C100<tr><td>
<tr><td>57 Conhecimento de Transporte Eletrônico - CT-e 57 D100<tr><td>
<tr><td>59 Cupom Fiscal Eletrônico – CF-e 59 C800 ou C850<tr><td>
</tbody></table>
     */
    public static final String MODELO = "MODELO";
    /**
     * EMITENTE DA N.F. - Para notas de saídas informe "P" (emissão própria), se a emissão foi feita pela empresa que está importando as notas fiscais, ou informe "T" (emissão de terceiros) no caso de documentos fiscais modelo 01, 1B, 04 ou 55 emitidos por terceiros, como por ex. os consórcios constituído nos termos do disposto nos arts. 278 e 279 da Lei no 6.404, de 15 de dezembro de 1976, e os documentos emitidos por estabelecimentos filiais que possuem Inscrição Estadual Única ou centralizada.
     * Para notas de entradas informe "T" (emissão de terceiros) no caso de documentos fiscais emitidos por terceiros, ou seja, a nota foi recebida de outra empresa, ou "P" se a emissão foi feita pela empresa que está importando as notas fiscais (ex. por compras feitas de pessoas físicas, produtor rural, etc, os quais não possuem nota fiscal própria, e então a empresa que adquire os produtos, emite a nota para fazer o lançamento de entradas). Campo Obrigatório.
     */
    public static final String EMITENTE = "EMITENTE";
    /**
     * SITUAÇÃO DA N.F.<br/>
     * Informe a situação da nota fiscal conforme abaixo:<br/>
     * 00 - Regular<br/>
     * 01 - Extemporâneo<br/>
     * 02 - Cancelado<br/>
     * 03 - Cancelado Extemporâneo.<br/>
     * 04 - NF-e ou CT-e denegada.<br/>
     * 05 - NF-e ou CT-e inutilizada.<br/>
     * 06 - Complementar<br/>
     * 07 - Complementar Extemporâneo<br/>
     * 08 - Regime Especial/Norma Específica<br/>
     * OBS: Mesmo que a situação seja de cancelamento<br/>
     * ou complemento, deve ser gerado também o<br/>
     * registro filho E201 informando até o CFOP campo 08 e o campo 27<br/>
     * demais campos que se refere a valores deixar zerado.<br/>
     */
    public static final String SITUACAO = "SITUACAO";
    /**
     * JUSTIFICATIVA NF CANCELADA<br/>
     * Se a empresa utiliza a geração do arquivo REDF-Nota Fiscal Paulista<br/>
     * a situação da NF de saída (campo 14) é Cancelado ou Cancelado Extemporâneo<br/>
     * e o modelo da nota (campo 12) é 01 ou 02<br/>
     * informe a justificativa do cancelamento da nota fiscal.<br/>
     * Diferente da situação acima deixe este campo vazio.<br/>
     * OBS: A justificativa deverá conter no mínimo 15 caracteres<br/>
     * para que o Programa da Secretaria da Fazenda, valide o arquivo corretamente<br/>
     * caso contrário, o mesmo será rejeitado.<br/>
     */
    public static final String JUSTIFICATIVA_CANCELAMENTO = "JUSTIFICATIVA_CANCELAMENTO";
    

    public E200NotaFiscal() {
        setName("Folhamatic - Nota Fiscal");
        
        FieldDecimalFixedLengthArchetype faip = new FieldDecimalFixedLengthArchetype(7, 4);
        faip.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling('S');
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E020"));
        addFieldArchetype(ENTRADA_OU_SAIDA, fef);
        addFieldArchetype(EPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, f2);
        addFieldArchetype(NUMERO_INICIAL_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(NUMERO_FINAL_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(20);
        fa.setAcceptNullable(true);
        fa.setFullFiling(' ');
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, fa);
        
        addFieldArchetype(DATA_EMISSAO, faa);
        addFieldArchetype(DATA_ENTRADA_SAIDA, faa);
    }
}
