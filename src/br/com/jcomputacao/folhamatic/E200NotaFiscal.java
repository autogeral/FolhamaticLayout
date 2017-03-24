package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * <br>**** Quais registros gerar? ****</br>
 * <br>Se você possui esta dúvida, consulte o contador para saber quais registros devem ser gerados em cada empresa para atender suas obrigações fiscais perante o estado, o município, a legislação federal, comercial e contábil.
 * <br>Exemplo:</br>
 * <br>Para uma nota fiscal de venda, seria necessário gerar no mínimo os registros</br>
 * <br>IDENTICAÇÃO DA EMPRESA (sempre obrigatório) CADASTRO DE CLIENTES/FORNECEDORES CADASTRO DE PRODUTOS/SERVIÇOS</br>
 * <br>NOTAS FISCAIS (cabeçalho)</br>
 * <br>LANÇAMENTOS DE IMPOSTOS DAS NOTAS FISCAIS (exemplo: um registro para cada alíquota de ICMS, para cada CFOP) CHAVE DO LANÇAMENTO PRODUTOS</br>
 * <br>LANÇAMENTO DOS PRODUTOS/SERVIÇOS</br>
 * <br>E016 CONTAS REDUZIDAS</br>
 * <br>Se tem obrigações com DIPAM gerar também:</br>
 * <br>E203 DIPAM</br>
 * <br>Se é uma empresa transportadora, deverá gerar:</br>
 * <br>E220 REGISTRO DADOS DO TRANSPORTE - INFORMAÇÕES DA CARGA</br>
 * 
 * <br>05/02/2017 13:20:34</br>
 * <br>@author murilo</br>
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
     * ESPÉCIE N.F. - Informe a espécie da nota fiscal.</br>
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    /**
     * <br>SÉRIE N.F.</br>
     * <br>Informe a série da nota fiscal conforme Tabela de Orientações de Séries e Subséries.</br>
     * <br>Quando se tratar de cupom fiscal informe a série conforme o campo Código (Série)</br>
     * <br>do cadastro dos Dados da Máquina Registradora/ECF/PDV/CF-e contido no Sistema E-Fiscal (menu Arquivos).</br>
     * <br>Quando for necessário importar um cupom fiscal em que já exista cadastrado no sistema</br>
     * <br>a mesma numeração inicial, será necessário criar uma nova série neste mesmo cadastro</br>
     * <br>(menu Arquivos-Máquina Registradora-Dados da Máquina Registradora/ECF/PDV/CF-e).</br>
     * <br>Ex. No mês 01/2009 há cadastro no Sistema E-Fiscal do cupom no 0051 a 0100,</br>
     * <br>Espécie ECF, Série 001.</br>
     * <br>Supondo que em 01/2010 pelo fato da numeração do cupom ter atingido 999.999</br>
     * <br>reiniciou-se a numeração e a mesma coincidiu com uma numeração inicial já cadastrada no sistema</br>
     * <br>como por exemplo 0051 a 0080, neste caso</br>
     * <br>para que seja possível importar este cupom de 01/2010</br>
     * <br>é preciso alterar a série dele no arquivo e incluir esta nova série</br>
     * <br>no cadastro dos Dados da Máquina Registradora/ECF/PDV/CF-e</br>
     * <br>ficando por exemplo 0051 a 0080, Espécie ECF, Série 002.</br>
     * <br>OBS: A inclusão de novas séries é necessária porque no sistema</br>
     * <br>não é permitido cadastrar um mesmo número de nota com:</br>
     * <br>CNPJ - Espécie - Série - Sub-Série iguais.</br>
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    /**
     * <br>SUBSÉRIE N.F</br>
     * <br>Informe a subsérie da nota fiscal conforme Tabela de Orientações de Séries e Subséries.</br>
     * <br>Quando se tratar de cupom fiscal, deixe este campo vazio.</br>
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    /**
     * <br>No INICIAL DA NOTA FISCAL</br>
     * <br>Informe o número da nota fiscal.</br>
     * <br>Caso esteja lançando nota fiscal de saídas com várias notas agrupadas (ex. série D..)</br>
     * <br>informe o número da primeira nota fiscal. Campo Obrigatório.</br>
     */
    public static final String NUMERO_INICIAL_NOTA_FISCAL = "NUMERO_INICIAL_NOTA_FISCAL";
    /**
     * <br>No FINAL DA NOTA FISCAL</br>
     * <br>Caso esteja lançando nota fiscal de saídas com várias notas agrupadas (ex. série D..)</br>
     * <br>informe o número da última nota fiscal, caso contrário</br>
     * <br>repetir o número da nota fiscal informada no campo 06.</br>
     * <br>Este campo somente será utilizado nas notas fiscais de saídas</br>
     * <br>quando tratar de nota fiscal de entradas, informar zeros.</br>
     */
    public static final String NUMERO_FINAL_NOTA_FISCAL = "NUMERO_FINAL_NOTA_FISCAL";
    /**
     * <br>CÓDIGO DO CLIENTE/FORNECEDOR</br>
     * <br>Informe o código do cliente ou fornecedor da nota fiscal conforme cadastro do sistema de faturamento.</br>
     * <br>Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01"</br>
     * <br>e no sistema de faturamento com código "10", informe "10" neste campo.</br>
     * <br>Campo obrigatório para notas fiscais de entradas.</br>
     * <br>OBS: Este campo só poderá estar vazio nas notas de saídas</br>
     * <br>quando se tratar de venda a consumidor (NF série D..)</br>
     * <br>ou quando cupom fiscal (NF espécie ECF, CMR e PDV ou CF- e)</br>
     * <br>diferente disso, o campo deverá ser informado para não ocorrer rejeição</br>
     * <br>na validação de arquivos magnéticos como SINTEGRA, GRF-CBT, SINCO, EFD e outros.</br>
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    public static final String DATA_EMISSAO = "DATA_EMISSAO";
    /**
     * <br>DATA DE ENTRADA/SAÍDA</br>
     * <br>Informe a data da entrada ou saída da nota fiscal na empresa no formato AAAAMMDD.</br>
     * <br>Quando se tratar de cupom fiscal esta data de saída deve ser igual a data de emissão.</br>
     * <br>Campo Obrigatório.</br>
     */
    public static final String DATA_ENTRADA_SAIDA = "DATA_ENTRADA_SAIDA";
    /**
     * <br>UF DA N.F.</br>
     * <br>Informe o estado (UF) constante na nota fiscal.</br>
     * <br>Atenção: Para notas fiscais de Exportação informar EX</br>
     * <br>e de Importação informar IM.</br>
     */
    public static final String UF = "UF";
    /**
     * MODELO DA N.F. - Informe o modelo da nota fiscal conforme Tabela de Modelos de Documentos Fiscais. Campo obrigatório.
     * @see https://www.fazenda.sp.gov.br/sped/downloads/Guia_Pratico_EFD_Versao_2_0_8.pdf
     * <table>
     * <thead><tr><th>Código</th><th>Descrição</th><th>Modelo</th><th>Registro Pai</th></tr></threa>
     * <tbody><tr><td>01</td><td>Nota Fiscal</td><td>1/1A</td><td>C100<tr><td><tr><td>1B</td><td>Nota Fiscal Avulsa - C100<tr><td>
     * <tr><td>02</td><td>Nota Fiscal de Venda a Consumidor</td><td>2</td><td>C300 ou C350 ou C400 (emissão por ECF)<tr><td>
     * <tr><td>2D</td><td>Cupom Fiscal - C400<tr><td>
     * <tr><td>2E</td><td>Cupom Fiscal Bilhete de Passagem - D350 (emissão por ECF)<tr><td>
     * <tr><td>04</td><td>Nota Fiscal de Produtor 4 C100<tr><td>
     * <tr><td>06</td><td>Nota Fiscal/Conta de Energia Elétrica 6 Se aquisição C500;
     * Se fornecimento: C500 ou C600; C700 (somente
     * empresas obrigadas aos arquivos previstos no
     *Convênio 115/03)<tr><td>
     * <tr><td>07</td><td>Nota Fiscal de Serviço de Transporte 7 D100<tr><td>
     * <tr><td>08</td><td>Conhecimento de Transporte Rodoviário de Cargas 8 D100<tr><td>
     * <tr><td>8B</td><td>Conhecimento de Transporte de Cargas Avulso - D100<tr><td>
     * <tr><td>09</td><td>Conhecimento de Transporte Aquaviário de Cargas 9 D100<tr><td>
     * <tr><td>10</td><td>Conhecimento Aéreo 10 D100<tr><td>
     * <tr><td>11</td><td>Conhecimento de Transporte Ferroviário de Cargas 11 D100<tr><td>
     * <tr><td>13</td><td>Bilhete de Passagem Rodoviário 13 D300<tr><td>
     * <tr><td>14</td><td>Bilhete de Passagem Aquaviário 14 D300<tr><td>
     * <tr><td>15</td><td>Bilhete de Passagem e Nota de Bagagem 15 D300<tr><td>
     * <tr><td>16</td><td>Bilhete de Passagem Ferroviário 16 D300<tr><td>
     * <tr><td>18</td><td>Resumo de Movimento Diário<tr><td>09</td><td>Conhecimento de Transporte Aquaviário de Cargas 9 D100<tr><td> 18 D400<tr><td>
     * <tr><td>21</td><td>Nota Fiscal de Serviço de Comunicação</td><td>21</td><td><p>Se aquisição: D500;</p><p>Se prestação: D500 ou D600;</p><p>D695 (somente empresas obrigadas aos arquivos</p><p>previstos no Convênio 115/03)</p><tr><td></tr>
     * <tr><td>22</td><td>Nota Fiscal de Serviço de Telecomunicação</td><td>22</td><td><p>Se aquisição: D500;</p><p>Se prestação: D500 ou D600; ou</p><p>D695 (somente empresas obrigadas aos arquivos</p><p>previstos no Convênio 115/03)</p></td></tr>
     * <tr><td>26 Conhecimento de Transporte Multimodal de Cargas 26 D100<tr><td>
     * <tr><td>27 Nota Fiscal De Transporte Ferroviário De Carga D100<tr><td>
     * <tr><td>28 Nota Fiscal/Conta de Fornecimento de Gás Canalizado - C500 ou C600<tr><td>
     * <tr><td>29 Nota Fiscal/Conta de Fornecimento de Água Canalizada - C500 ou C600<tr><td>
     * <tr><td>55 Nota Fiscal Eletrônica – NF-e 55 C100<tr><td>
     * <tr><td>57 Conhecimento de Transporte Eletrônico - CT-e 57 D100<tr><td>
     * <tr><td>59 Cupom Fiscal Eletrônico – CF-e 59 C800 ou C850<tr><td>
     * </tbody></table>
     */
    public static final String MODELO = "MODELO";
    /**
     * <br>EMITENTE DA N.F.</br>
     * <br>Para notas de saídas informe "P" (emissão própria), se a emissão foi feita pela empresa que está importando as notas fiscais</br>
     * <br>Informe "T" (emissão de terceiros) no caso de documentos fiscais modelo 01, 1B, 04 ou 55 emitidos por terceiros</br>
     * <br>Exemmplo.: os consórcios constituído nos termos do disposto nos arts. 278 e 279 da Lei no 6.404, de 15 de dezembro de 1976</br>
     * <br>Para os documentos emitidos por estabelecimentos filiais que possuem Inscrição Estadual Única ou centralizada.</br>
     * <br>Para notas de entradas informe "T" (emissão de terceiros) no caso de documentos fiscais emitidos por terceiros</br>
     * <br>ou seja, a nota foi recebida de outra empresa, ou "P" se a emissão foi feita pela empresa que está importando as notas fiscais</br>
     * <br>(ex. por compras feitas de pessoas físicas, produtor rural, etc, os quais não possuem nota fiscal própria</br>
     * <br>e então a empresa que adquire os produtos, emite a nota para fazer o lançamento de entradas). Campo Obrigatório.</br>
     */
    public static final String EMITENTE = "EMITENTE";
    /**
     * <br>SITUAÇÃO DA N.F.</br>
     * <br>Informe a situação da nota fiscal conforme abaixo:</br>
     * <br>00 - Regular</br>
     * <br>01 - Extemporâneo</br>
     * <br>02 - Cancelado</br>
     * <br>03 - Cancelado Extemporâneo.</br>
     * <br>04 - NF-e ou CT-e denegada.</br>
     * <br>05 - NF-e ou CT-e inutilizada.</br>
     * <br>06 - Complementar</br>
     * <br>07 - Complementar Extemporâneo</br>
     * <br>08 - Regime Especial/Norma Específica</br>
     * <br>OBS: Mesmo que a situação seja de cancelamento</br>
     * <br>ou complemento, deve ser gerado também o</br>
     * <br>registro filho E201 informando até o CFOP campo 08 e o campo 27</br>
     * <br>demais campos que se refere a valores deixar zerado.</br>
     */
    public static final String SITUACAO = "SITUACAO";
    /**
     * <br>JUSTIFICATIVA NF CANCELADA</br>
     * <br>Se a empresa utiliza a geração do arquivo REDF-Nota Fiscal Paulista</br>
     * <br>a situação da NF de saída (campo 14) é Cancelado ou Cancelado Extemporâneo</br>
     * <br>e o modelo da nota (campo 12) é 01 ou 02</br>
     * <br>informe a justificativa do cancelamento da nota fiscal.</br>
     * <br>Diferente da situação acima deixe este campo vazio.</br>
     * <br>OBS: A justificativa deverá conter no mínimo 15 caracteres</br>
     * <br>para que o Programa da Secretaria da Fazenda, valide o arquivo corretamente</br>
     * <br>caso contrário, o mesmo será rejeitado.</br>
     */
    public static final String JUSTIFICATIVA_CANCELAMENTO = "JUSTIFICATIVA_CANCELAMENTO";
    
    /**
     * <br>(REDF) - Se a empresa utiliza a geração do arquivo REDFNota</br>
     * <br>Fiscal Paulista, informe a hora, minuto e segundo</br>
     * <br>da emissão da nota fiscal.</br>
     * <br>(formatoHHMMSS)</br>
     */
    public static final String HORA_EMISSAO_NOTA_FISCAL = "HORA_EMISSAO_NOTA_FISCAL";
    
    /**
     * <br>(REDF) - Se a empresa utiliza a geração do arquivo</br>
     * <br>REDF-Nota Fiscal Paulista, informe a hora, minuto e segundo</br>
     * <br>da entrada ou saída damercadoria/produto/serviço da nota.</br>
     * <br>(formato HHMMSS).</br>
     */
    public static final String HORA_ENTRADA_SAIDA_NOTA_FISCAL = "HORA_ENTRADA_SAIDA_NOTA_FISCAL";
    
    /**
     * <br>TIPO DO FRETE</br>
     * <br>"Preencher com:</br>
     * <br>"1" caso o frete tenha sido pago pelo Emitente (CIF)</br>
     * <br>"2" caso tenha sido pago pelo Destinatário (FOB)</br>
     * <br>"3" se o frete foi pago por terceiros.</br>
     * <br>Preencher com zero quando for lançamento de CMR, ECF, PDV ou CF-e</br>
     * <br>ou caso não haja na nota fiscal informação do pagamento do frete</br>
     * <br>(Ex. remessas simbólicas, faturamento simbólico, transporte próprio,</br>
     * <br>venda balcão), diferente disso, para fins de geração</br>
     * <br>do arquivo de combustíveis (GRF-CBT), SINTEGRA</br>
     * <br>SINCO e EFD, esta informação será necessária.</br>
     * <br>Para fins da EFD é orientado que quando houver transporte</br>
     * <br>com mais de um responsável pelo seu pagamento</br>
     * <br>deve ser informado o indicador do frete relativo ao</br>
     * <br>responsável pelo primeiro percurso.</br>
     */
    public static final String FRETE_TIPO = "FRETE_TIPO";
    
    /**
     * VALOR CONTÁBIL - Informe o valor total da nota fiscal. 19 (Valor Contábil).
     */
    public static final String VALOR_CONTABIL = "VALOR_CONTABIL";
    
    /**
     * CÓD. INT. CONTÁBIL IMPOSTOS RETIDOS- Informe o número do código de
     * integração se a empresa exporta os impostos retidos das notas fiscais de
     * saídas para a contabilidade do Sistema Telecont, caso contrário, deixe
     * este campo vazio. Este código equivale aos impostos PIS, COFINS e CSLL
     * retidos do registro E209 e ao IRRF do registro E210.
     */
    public static final String CODIGO_INTEGRACAO_CONTABIL_IMPOSTOS_RETIDOS = "CODIGO_INTEGRACAO_CONTABIL_IMPOSTOS_RETIDOS";
    
    /**
     * CÓDIGO DA CONTA - Se a empresa utiliza a geração do arquivo
     * EFD-Escrituração Fiscal Digital e o modelo da nota é 02, 07, 08, 8B, 09,
     * 10, 11, 18, 21, 22, 26, 27 ou 57, informe o código da conta analítica.
     * Exemplos: estoques, receitas, despesas, ativos. Deve ser a conta credora
     * ou devedora principal, podendo ser informada a conta sintética (nível
     * acima da conta analítica). Diferente da situação acima, deixe este campo
     * vazio.
     */
    public static final String CODIGO_CONTA = "CODIGO_CONTA";
    
    /**
     * NF CONJUGADA - Para fins do ISS Digital de Campinas, informe "S" quando a
     * NF for Conjugada ou "N" caso não seja. Se a empresa não utiliza o arquivo
     * Municipal "ISS Digital", preencha esse campo com espaços.
     */
    public static final String NOTA_FISCAL_CONJUGADA = "NOTA_FISCAL_CONJUGADA";
    
    /**
     * Nº LINHAS DE LANÇAMENTO - Informe o número total de linhas de lançamento
     * de ICMS/IPI que a nota fiscal contém. Este total de linhas se refere a
     * quantidade de registros E201 que a nota tem, por exemplo uma N.F. que tem
     * duas alíquotas de ICMS 18% e 25% terá duas linhas com registro E201,
     * então neste campo deverá constar 02. Este número total pode ser
     * identificado através do campo 27 do último registro E201 da nota.
     */
    public static final String NUMERO_LINHAS_LANCAMENTO = "NUMERO_LINHAS_LANCAMENTO";
    
    /**
     * <br>DATA DE LANÇAMENTO NO SISTEMA</br>
     * <br>A importação utilizará este campo como</br>
     * <br>referência para exibição das notas de acordo com o mês/ano ativo no sistema.</br>
     * <br>Ex: se foi informado neste campo 01/02/2009, então ao importar o sistema apresentará a
     * <br>nota no mês 02/2009.
     * <br>Se for notas de entradas repita a data de entrada da nota (campo 10).
     * <br>Se for notas de saídas repita a data de emissão (campo 09) ou data de saída (campo 10)
     * <br>conforme a configuração feita no sistema (Painel de Controle, Configurações do Sistema,
     * <br>Configuração de Datas-Saídas, NF-Saídas-Cálculo de todos os Impostos).
     * <br>Quando for um lançamento extemporâneo, informe a data que o lançamento deverá ser
     * <br>feito no sistema. Ex. nota com data de emissão 31/01/2009 (campo 09) e data de
     * <br>entrada/saída 01/02/2009 (campo 10) que terá um lançamento extemporâneo em 04/2009,
     * <br>então neste exemplo a data neste campo é 01/04/2009.
     * <br>Para lançamentos extemporâneos o dia desta data será utilizado na apuração do IPI
     * <br>Decendial, Quinzenal, Quinzenal/Decendial e Mensal/Decendial. Também será utilizado
     * <br>nos livros e relatórios com emissão por período. (Ex. de 01 a 15)
     * <br>Informe a data no formato AAAAMMDD.
     * <br>Para lançamento extemporâneo, o preenchimento deste campo é obrigatório.
     * <br>Para lançamento normal, se não desejar informar esta data, informe os dados até a
     * <br>posição 414, e desta forma se for notas de entradas e este campo estiver vazio, o sistema
     * <br>importará a nota no mês/ano da data de entrada da nota (campo 10) e se for notas de
     * <br>saídas, verificará o mês/ano da data de emissão (campo 09) e importará a nota conforme a
     * <br>configuração feita no sistema para este mês/ano (Painel de Controle, Configurações do
     * <br>Sistema, Configuração de Datas-Saídas, NF-Saídas-Cálculo de todos os Impostos).
     * <br>Exemplo no arquivo está data de emissão 31/01/2009 (campo 09) e data de saída
     * <br>01/02/2009 (campo 10) e este campo está vazio. Será verificado a configuração do
     * <br>mês/ano da data de emissão (01/2009), se estiver Pela Data de Saída, esta nota será
     * <br>importada para o mês 02/2009 e se estiver Pela Data de Emissão, será importada para o
     * <br>mês 01/2009.
     */
    public static final String DATA_LANCAMENTO_SISTEMA = "DATA_LANCAMENTO_SISTEMA";

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
        
        FieldDateFixedLengthArchetype faann = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faann.setFullFiling(' ');
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E200"));
        addFieldArchetype(ENTRADA_OU_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        f2.setAcceptNullable(true);
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, f2);
        addFieldArchetype(NUMERO_INICIAL_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(NUMERO_FINAL_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(20);
        fa.setAcceptNullable(true);
        fa.setFullFiling(' ');
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, fa);
        
        addFieldArchetype(DATA_EMISSAO, faa);
        addFieldArchetype(DATA_ENTRADA_SAIDA, faann);
        
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MODELO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(EMITENTE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SITUACAO, new FieldIntegerFixedLengthArchetype(2));
        
        fa = new FieldStringFixedLengthArchetype(254);
        fa.setAcceptNullable(true);
        addFieldArchetype(JUSTIFICATIVA_CANCELAMENTO, fa);
        
        FieldDateFixedLengthArchetype fh = new FieldDateFixedLengthArchetype("HHmmss");
        fh.setAcceptNullable(true);
        addFieldArchetype(HORA_EMISSAO_NOTA_FISCAL, fh);
        addFieldArchetype(HORA_ENTRADA_SAIDA_NOTA_FISCAL, fh);
        addFieldArchetype(FRETE_TIPO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(VALOR_CONTABIL, faip142);
        addFieldArchetype(CODIGO_INTEGRACAO_CONTABIL_IMPOSTOS_RETIDOS, f2);
        
        fa = new FieldStringFixedLengthArchetype(50);
        fa.setAcceptNullable(true);
        addFieldArchetype(CODIGO_CONTA, fa);
        
        fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFiling('N');
        addFieldArchetype(NOTA_FISCAL_CONJUGADA, fef);
        addFieldArchetype(NUMERO_LINHAS_LANCAMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DATA_LANCAMENTO_SISTEMA, faa);

    }
}
