package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author DAVID.DIAS
 */
public class E201LancamentoImpostoNotaFiscal extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de</br>  
     * saída.</br>
     */
    public static final String ENTRADA_SAIDA = "ENTRADA_SAIDA";

    /**
    
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /**
    
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    
    /**
    
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    /**
     * NÚMERO N.F. - Informe o número da nota fiscal. No caso de notas fiscais de saídas</br>  
     * agrupadas, informar o número inicial.</br>    
     */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    /**
     * CÓDIGO DO CLIENTE/FORNECEDOR - Informe o código do cliente ou fornecedor da nota</br>  
     * fiscal conforme cadastro do sistema de faturamento.</br>  
     * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e</br>  
     * no sistema de faturamento com código "10", informe "10" neste campo.</br>    
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /**
     * CFOP - Informe o CFOP constante na nota fiscal. Campo obrigatório.</br>    
     */
    public static final String CFOP = "CFOP";
    
    /**
     * C.I. - Informe o número do código de integração (C.I.) se a empresa exporta dados para a</br>  
     * contabilidade do Sistema Telecont, caso contrário, deixe este campo vazio.</br>  
     * OBS. Ao informar números de 1 a 9, informe com zero a esquerda, exemplo: 01, 02...09.</br>    
     */
    public static final String CI = "CI";
    
    /**
     * TIPO DE PAGAMENTO - Informe "1" para compra/venda à vista ou com "2" para</br>  
     * compra/venda a prazo. Quando não houver pagamento, informe "0" (zero).</br>    
     */
    public static final String TIPO_PAGAMENTO = "TIPO_PAGAMENTO";
    
    /**
     * BC ICMS - Informe a Base de Cálculo do ICMS da linha de lançamento.</br>    
     */
    public static final String BC_ICMS = "BC_ICMS";
    
    /**
     * CÓDIGO TURBO - Este campo é para informação dos códigos turbos utilizado em alguns</br>  
     * tipos de operações e para cálculos automáticos no Sistema E-Fiscal; classificar conforme</br>  
     * Tabela de Códigos Turbo.</br>  
     * OBS: Estes códigos turbos fazem o cálculo automático apenas nos lançamentos efetuados</br>  
     * dentro do sistema, já na importação, os valores devem ser informados nos seus</br>  
     * respectivos campos.</br>  
     * Não utilizar o código turbo 506, se a empresa estiver enquadrada no Simples Nacional</br>  
     * (campo IRPJ do cadastro da empresa como Simples ou EPP Simples).</br>    
     */
    public static final String CODIGO_TURBO = "CODIGO_TURBO";
    
    /**
     * REDUÇÃO BASE CÁLC. ICMS - Se utilizado o código turbo 520 - Outras Reduções ou 523</br>  
     * - Diferimento Parcial - RS (este para notas de saídas de empresas do Estado do Rio</br>  
     * Grande do Sul), informe o percentual de redução da Base de Cálculo do ICMS da linha de</br>  
     * lançamento, sendo que para o código turbo 520 é obrigatório o preenchendo com zero na</br>  
     * última casa decimal. Caso não foi utilizado nenhum destes códigos, preencher com zeros.</br>    
     */
    public static final String REDUCAO_BASE_CALCULO_ICMS = "REDUCAO_BASE_CALCULO_ICMS";
    
    /**
     * ALÍQUOTA DO ICMS - Informe a alíquota do ICMS da linha de lançamento.</br>  
     * Exemplo: alíquota de 18% informar no arquivo 0180000.</br>    
     */
    public static final String ALIQUOTA_ICMS = "ALIQUOTA_ICMS";
    
    /**
  
     */
    public static final String VALOR_ICMS = "VALOR_ICMS";
    
    /**
     * ISENTOS DE ICMS - Informe o valor isento de ICMS da linha de lançamento.</br>  
     * Para notas de entradas de empresas situadas em estados diferentes de AM, MG e PR, que</br>  
     * tenha informação de Isentos de ICMS e Outros de ICMS, é aconselhável gerar um registro</br>  
     * E201 para cada valor, pois, para impressão correta do Livro de Entradas em modo gráfico,</br>  
     * não pode haver lançamentos de Isentos ICMS e Outros ICMS na mesma linha de</br>  
     * lançamento.</br>    
     */
    public static final String ISENTOS_ICMS = "ISENTOS_ICMS";
    
    /**
     * OUTRAS DE ICMS - Informe o valor de outras de ICMS da linha de lançamento.</br>   
     */
    public static final String OUTRAS_ICMS = "OUTRAS_ICMS";
    
    /**
     * ICMS SUBST. TRIB. - Informe o valor do ICMS Substituição Tributária da linha de</br>  
     * lançamento.</br>     
     */
    public static final String ICMS_ST = "ICMS_ST";
    
    /**
     * BASE SUBST. TRIB. - Informe a Base de Substituição Tributária da linha de lançamento.</br>    
     */
    public static final String BASE_ST = "BASE_ST";
    
    /**
   
     */
    public static final String BC_IPI = "BC_IPI";
    
    /**
     * CÓDIGO TURBO P/ IPI - Informe "0" quando a alíquota do IPI for zero. Se a empresa for</br>  
     * Simples Nacional e houver notas de saídas com IPI Substituição Tributária, informe "4".</br>  
     * Não sendo nenhuma das situações acima, deixe este campo vazio.</br>     
     */
    public static final String CODIGO_TURBO_IPI = "CODIGO_TURBO_IPI";
    
    /**
     * VALOR DO IPI - Informe o valor do IPI da linha de lançamento.</br>  
     * Preencher a 1ª posição deste campo com o sinal de negativo quando houver a situação de</br>  
     * IPI não aproveitável.</br>     
     */
    public static final String VALOR_IPI = "VALOR_IPI";
    
    /**
     * ISENTOS DE IPI - Informe o valor isento de IPI da linha de lançamento.</br>  
     * Para notas de entradas de empresas indústrias situadas em estados diferentes de AM, MG</br>  
     * e PR, que tenha informação de Isentos de IPI e Outros de IPI, é aconselhável gerar um</br>  
     * registro E201 para cada valor, pois, para impressão correta do Livro de Entradas em modo</br>  
     * gráfico, não pode haver lançamentos de Isentos IPI e Outros IPI na mesma linha de</br>  
     * lançamento.</br>    
     */
    public static final String ISENTOS_IPI = "ISENTOS_IPI";
    
    /**
     * OUTRAS DE IPI - Informe o valor de outras de IPI da linha de lançamento.</br>    
     */
    public static final String OUTRAS_IPI = "OUTRAS_IPI";
    
    /**
     * CONTRIBUINTE DO ICMS - Este campo é utlizado somente para notas fiscais de saída.</br>  
     * Preencher com "S" caso a venda seja para contribuinte do ICMS ou "N" quando venda para</br>  
     * não contribuinte do ICMS.</br>  
     * Quando for nota de entrada preencher este campo com "S".</br>       
     */
    public static final String CONTRIBUENTE_ICMS = "CONTRIBUENTE_ICMS";
    
    /**
     * OBSERVAÇÃO DA LINHA DE LANÇAMENTO - Este campo é para observações diversas</br>  
     * da nota fiscal.</br> 
     */
    public static final String OBSERVACAO_LINHA_LANCAMENTO = "OBSERVACAO_LINHA_LANCAMENTO";
    
    /**
     * Nº SEQUENCIAL DO LANÇAMENTO - Informe o número sequencial de ordem da linha de</br>  
     * lançamento.</br>  
     * Esse número de linhas refere-se a quantidade de linhas que a nota tem, por exemplo uma</br>  
     * NF que tem dois CFOP´s, neste caso haverá dois registros E201, especificando um CFOP</br>  
     * com nº sequencial como 01 e o outro CFOP com nº sequencial como 02.</br>    
     */
    public static final String N_SEQUENCIAL_LANCAMENTO = "N_SEQUENCIAL_LANCAMENTO";
    
    /**
     * <br>TIPO DE ANTECIPAÇÃO TRIBUTÁRIA - Caso a nota contenha valor de ICMS Substituição</br>  
     * <br>Tributária (campo 18), informe o tipo de antecipação tributária conforme tabela abaixo:</br>  
     * <br>0 - Substituição tributária informada pelo substituto ou pelo substituído que não incorra em</br>  
     * <br>nenhuma das situações anteriores.</br>  
     * <br>1 - Pagamento de substituição efetuada pelo destinatário, quando não efetuada ou</br>  
     * <br>efetuada a menor pelo substituto</br>  
     * <br>2 - Antecipação tributária efetuada pelo destinatário apenas com complementação do</br>  
     * <br>diferencial de alíquota</br>  
     * <br>3 - Antecipação tributária com MVA(Margem de Valor Agregado), efetuada pelo</br>  
     * <br>destinatário sem encerrar a fase de tributação</br>  
     * <br>4 - Antecipação tributária com MVA(Margem de Valor Agregado), efetuada pelo</br>  
     * <br>destinatário encerrando a fase de tributação</br>  
     * <br>5 - Substituição Tributária interna motivada por regime especial de tributação.</br>  
     * <br>6 - ICMS pago na importação.</br>  
     * <br>Campo obrigatório para a situação acima. Não existindo esta situação, deixe este campo</br>  
     * <br>vazio.</br>  
     * <br>OBS: Quando a nota possuir vários registros E201 com valor de ICMS Subst. Tribut., repita</br>  
     * <br>em todos os registros o mesmo código. Se for informado códigos diferentes para uma</br>  
     * <br>mesma nota, será considerado o código informado no último registro.</br>    
     */
    public static final String TIPO_ANTECIPACAO_TRIBUTARIA = "TIPO_ANTECIPACAO_TRIBUTARIA";
    
    /**
     * ANULAÇÃO DE SERVIÇO DE TRANSPORTE - Informe "C" caso seja Transporte de</br>  
     * Cargas ou "P" Transporte de Pessoas.</br>  
     * Campo obrigatório quando nota de Anulação de valor de Serviço de transporte..</br>  
     * Não existindo a situação acima, deixe este campo vazio.</br>  
     * OBS: Quando a nota possuir vários registros E201 ref. a anulação de valor de Serviço de</br>  
     * Transporte, repita em todos os registros a mesma informação. Se houver informações</br>  
     * diferentes para uma mesma nota, será considerada a última informação feita no registro.</br>    
     */
    public static final String ANULACAO_SERVICO_TRANSPORTE = "ANULACAO_SERVICO_TRANSPORTE";
    
    /**
     * APURAÇÕES DISTINTAS DO IPI - Se a empresa apura IPI com apurações distintas,</br>  
     * informe o tipo de apuração, sendo "M" para apuração Mensal e "D" para apuração</br>  
     * Decendial.</br>  
     * Para IPI com apurações distintas, estando este campo vazio, o valor do IPI não entrará na</br>  
     * apuração do IPI.</br>  
     * Deixe este campo vazio se a empresa não apura IPI, ou apura o IPI em uma única</br>  
     * apuração.</br>    
     */
    public static final String APURACOES_DISTINTAS_IPI = "APURACOES_DISTINTAS_IPI";
    
    /**
     * VALOR A SER DEDUZIDO DA BASE DE CÁLC. PIS/COFINS (NF ENTRADAS) - Este</br>  
     * campo deve ser utilizado por empresas que necessitam fazer a dedução na base de</br>  
     * cálculo do PIS e COFINS através das notas de entradas pelo fato de utilizarem ECF nas</br>  
     * vendas.</br>  
     * Exemplo: Farmácia na venda de produtos farmacêuticos de higiene pessoal, cujos</br>  
     * produtos possuem alíquotas do PIS e COFINS reduzidas a zero.</br>  
     * Informe então no campo 12(Código Turbo) deste registro o código 522, e neste campo</br>  
     * informe o valor a ser deduzido da base de cálculo do PIS e COFINS para que no cálculo do</br>  
     * sistema este valor seja lançado como Isentos de PIS e COFINS.</br>  
     * Não existindo esta informação, este campo deve ser preenchido com zeros.</br>    
     */
    public static final String VALOR_REDUZIDO_BASE_CALC_PIS_COFINS = "VALOR_REDUZIDO_BASE_CALC_PIS_COFINS";
    
    /**
     * EXCLUÍDAS (RS) - Este campo deverá ser utilizado por empresas situadas no estado do</br>  
     * Rio Grande do Sul para informar as importâncias excluídas do valor adicionado nas notas</br>  
     * de entradas e saídas. Este campo será utilizado na geração da GIA Modelo B (TR 950 -</br>  
     * Anexo 5 - Entradas e Saídas).</br>  
     * Não existindo esta informação, este campo deve ser preenchido com zeros.</br>    
     */
    public static final String EXCLUIDAS = "EXCLUIDAS";
    
    /**
     * VENDA P/ ENTREGA FUTURA - Informe "S" se deseja que o valor desta linha de</br>  
     * lançamento entre no Faturamento, caso contrário informe "N".</br>  
     * Sendo uma das situações abaixo, informe "S"</br>  
     * - Quando se tratar de nota fiscal de entrada</br>  
     * - Quando a informação do campo 08 (CFOP) for diferente de 5.922, 6.922, 5.116, 6.116,</br>  
     * 5.117, 6.117, 5.651, 6.651, 5.652, 6.652, 5.653, 6.653, 5.654, 6.654, 5.655, 6.655 5.656,</br>  
     * 6.656.</br>  
     * - Quando a empresa for Posto de Gasolina (campo Subtipo do cadastro da empresa) e a</br>  
     * informação do campo 08 (CFOP) for 5.651, 6.651, 5.652, 6.652, 5.653, 6.653, 5.654, 6.654,</br>  
     * 5.655, 6.655 5.656, 6.656.</br>  
     * OBS: Caso seja utilizado algum código turbo (campo 12), os cálculos referente ao código</br>  
     * utilizado, serão feitos pelo sistema independente da resposta deste campo.</br>    
     */
    public static final String VENDA_ENTREGA_FUTURA = "VENDA_ENTREGA_FUTURA";
    
    /**
     * OPERAÇÕES/PRESTAÇÕES COM MERCADORIAS SUJEITAS AO REGIME DE</br>  
     * SUBSTITUIÇÃO TRIBUTÁRIA NAS SAÍDAS - Informe "S" ou "N" se a empresa utiliza</br>  
     * máquina registradora/ECF/PDV/CF-e, se a espécie da nota de saídas (campo 03 deste</br>  
     * registro) for ECF, CMR ou PDV, se houver valor no campo Outras de ICMS (campo 17</br>  
     * deste registro ) e se o CFOP (campo 08 deste registro) for um dos abaixo citados.</br>  
     * Não sendo a situação acima ou para notas fiscais de entradas, deixe este campo vazio.</br>  
     * CFOP´s : 5.901, 6.901, 5.902, 6.902, 5.903, 6.903, 5.904, 6.904, 5.905, 6.905, 5.906,</br>  
     * 6.906, 5.907, 6.907, 5.908, 6.908, 5.909, 6.909, 5.910, 6.910, 5.911, 6.911, 5.912, 6.912,</br>  
     * 5.913, 6.913, 5.914, 6.914, 5.915, 6.915, 5.916, 6.916, 5.917, 6.917, 5.918, 6.918, 5.919,</br>  
     * 6.919, 5.920, 6.920, 5.921, 6.921, 5.922, 6.922, 5.923, 6.923, 5.924, 6.924, 5.925, 6.925,</br>  
     * 5.926, 5.927, 5.928, 5.929, 6.929, 5.931, 6.931, 5.932, 6.932, 5.949 e 6.949.</br>    
     */
    public static final String OPER_PREST_MERC_SUJ_REGIME_ST_SAIDA = "OPER_PREST_MERC_SUJ_REGIME_ST_SAIDA";
    
    /**
     * NÚMERO DO TOTALIZADOR - Se a empresa utiliza a geração do arquivo EFDEscrituração</br>  
     * Fiscal, preencha este campo quando se tratar de NF de Saídas, espécie ECF,</br>  
     * CMR e PDV, modelo 2, 2D, 2E, 13, 14, 15 e 16 se para a máquina que está sendo gerado</br>  
     * o lançamento existe mais que um totalizador com a situação Tributado ICMS referente a</br>  
     * alíquota informada no campo 14.</br>  
     * Exemplo: Está sendo gerado um Cupom Fiscal referente ao ECF 001, e a alíquota do</br>  
     * ICMS informada no campo 14 é 18%. Se no cadastro de Máquina Registradora do sistema,</br>  
     * existir para o ECF 001 mais que um totalizador com a situação Tributado ICMS e alíquota</br>  
     * 18%, informe neste campo o número do totalizador que se refere o lançamento.</br>  
     * Não existindo a situação acima, deixe este campo vazio.</br>    
     */
    public static final String NUMERO_TOTALIZADOR = "NUMERO_TOTALIZADOR";
    
    /**
     * SIT.TRIB. ICMS - TAB. A - Se a empresa utiliza a geração do arquivo EFD-Escrituração</br>  
     * Fiscal, para NF modelo 07, 08, 8B, 09, 10, 11, 26, 27 e 57, informe o código da Situação</br>  
     * Tributária referente ao ICMS conforme Tabela A- Situação Tributária do ICMS.</br>  
     * Campo obrigatório para a situação acima. Não existindo esta situação, deixe este campo</br>  
     * vazio.</br>    
     */
    public static final String ST_ICMS_TABELA_A = "ST_ICMS_TABELA_A";
    
    /**
     * SIT. TRIB. ICMS - TAB. B - Se a empresa utiliza a geração do arquivo EFD-Escrituração</br>  
     * Fiscal, para NF modelo 07, 08, 8B, 09, 10, 11, 26, 27 e 57, informe o código da Situação</br>  
     * Tributária referente ao ICMS conforme Tabela B- Situação Tributária do ICMS.</br>  
     * Campo obrigatório para a situação acima. Não existindo esta situação, deixe este campo</br>  
     * vazio.</br>    
     */
    public static final String ST_ICMS_TABELA_B = "ST_ICMS_TABELA_B";
    
    /**
     * SIT. TRIB. IPI - CTIPI - Se a empresa utiliza a geração do arquivo EFD-Escrituração Fiscal,</br>  
     * for Indústria (apurar IPI), e o modelo da nota for 01, 1B, 04 ou 55, informe o Código da</br>  
     * Situação Tributária referente ao IPI conforme Tabela - Situação Tributária do IPI.</br>  
     * Campo obrigatório para a situação acima. Não existindo esta situação, deixe este campo</br>  
     * vazio.</br>    
     */
    public static final String ST_IPI_CTIPI = "ST_IPI_CTIPI";
    
    /**
     * CIAP - SAÍDA TRIBUTADA - Informe "S" ou "N" se:</br>  
     * - No menu Arquivos-Cadastros-Configuração do CFOP-Saídas para CIAP, a pergunta</br>  
     * "Definir se a saída é tributada no lançamento das notas de saídas?" estiver selecionada</br>  
     * para o mês/ano a ser importado.</br>  
     * - O CFOP (campo 08 deste registro) for diferente dos CFOP´s selecionados no campo</br>  
     * "Não considerar o valor deste CFOP nas Saídas Tributadas e Totais do cálculo do CIAP"</br>  
     * desta mesma tela de configuração (Menu Arquivos-Cadastros-Configuração do CFOPSaídas</br>  
     * para CIAP) .</br>  
     * - Quando a nota for de saídas e existir valor de Isentos ICMS e Outros ICMS (campos 16 e</br>  
     * 17 deste registro)</br>  
     * OBS: Esta informação define se o valor da nota deve entrar como saída/prestação</br>  
     * tributada para o cálculo do CIAP.</br>  
     * Exemplo: para o estado de SP conforme art. 6º da Portaria CAT 25/2001 e alterações</br>  
     * posteriores, equiparam-se às saídas tributadas, operações ou prestações isentas ou não</br>  
     * tributadas com previsão legal de manutenção de crédito e saída de papel destinado à</br>  
     * impressão de livros, jornais periódicos.</br>  
     * Outro exemplo é para o estado do RS, conforme RICMS, Livro I, Capítulo V, Art. 31, § 4º,</br>  
     * equiparam-se às saídas tributadas, as saídas de papel destinado à impressão de livros,</br>  
     * jornais e periódicos.</br>  
     * Diferente das situações acima, preencha este campo com espaços.</br>  
     * Mesmo estando na situação acima, preencha este campo com espaços para os CFOP´s de</br>  
     * exportação abaixo, pois o sistema assumirá automaticamente como uma saída/prestação</br>  
     * tributada:</br>  
     * CFOP`s Venda Específico Exportação= 5.501, 5.502, 6.501 e 6.502</br>  
     * CFOP`s Exportação= 7.101, 7.102, 7.105, 7.106, 7.127, 7.251, 7.301, 7.358, 7.501, 7.651 e</br>  
     * 7.654.</br>    
     */
    public static final String CIAP_SAIDA_TRIBUTADA = "CIAP_SAIDA_TRIBUTADA";
    
    /**
     * CONTROLE DO SISTEMA - Informe "0" (zero) para controle interno do Sistema E-Fiscal.</br>    
     */
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
    
    public E201LancamentoImpostoNotaFiscal() {
        
        setName("Folhamatic - Lançamentos de Impostos das Notas Fiscais");
        
        //X
        FieldStringFixedLengthArchetype f14 = new FieldStringFixedLengthArchetype(14);
        f14.setAcceptNullable(true);
        f14.setFullFiling(' ');
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        f2.setAcceptNullable(true);
        
        FieldStringFixedLengthArchetype f4 = new FieldStringFixedLengthArchetype(4);
        f4.setAcceptNullable(true);
        f4.setFullFiling(' ');
        
        FieldStringFixedLengthArchetype f9 = new FieldStringFixedLengthArchetype(9);
        f9.setAcceptNullable(true);
        f9.setFullFiling(' ');
        
        // N
        FieldDecimalFixedLengthArchetype faip062 = new FieldDecimalFixedLengthArchetype(6, 2);
        faip062.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip063 = new FieldDecimalFixedLengthArchetype(6, 3);
        faip063.setAcceptNullable(true);
//        faip063.setFullFiling('0');
        
        FieldDecimalFixedLengthArchetype faip076 = new FieldDecimalFixedLengthArchetype(7, 6);
        faip076.setAcceptNullable(true);
        
         FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7, 4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip14 = new FieldDecimalFixedLengthArchetype(14, 0);
        faip14.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip133 = new FieldDecimalFixedLengthArchetype(13, 3);
        faip133.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip143 = new FieldDecimalFixedLengthArchetype(14, 3);
        faip143.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip144 = new FieldDecimalFixedLengthArchetype(14, 4);
        faip144.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip146 = new FieldDecimalFixedLengthArchetype(14, 6);
        faip146.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip155 = new FieldDecimalFixedLengthArchetype(15, 5);
        faip155.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling(' ');
        
        // D
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E201"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        
        FieldStringFixedLengthArchetype fs2 = new FieldStringFixedLengthArchetype(2);
        fs2.setAcceptNullable(true);
        addFieldArchetype(CI, fs2);
        
        addFieldArchetype(TIPO_PAGAMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(BC_ICMS, faip142);
//        FieldIntegerFixedLengthArchetype fi3 = new FieldIntegerFixedLengthArchetype(3);
//        fi3.setAcceptNullable(true);
//        fi3.setFullFiling(' ');
//        addFieldArchetype(CODIGO_TURBO, fi3);
        addFieldArchetype(CODIGO_TURBO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(REDUCAO_BASE_CALCULO_ICMS, faip063);
        addFieldArchetype(ALIQUOTA_ICMS, faip074);
        addFieldArchetype(VALOR_ICMS, faip142);
        addFieldArchetype(ISENTOS_ICMS, faip142);
        addFieldArchetype(OUTRAS_ICMS, faip142);
        addFieldArchetype(ICMS_ST, faip142);
        addFieldArchetype(BASE_ST, faip142);
        addFieldArchetype(BC_IPI, faip142);
        
        FieldStringFixedLengthArchetype fs1 = new FieldStringFixedLengthArchetype(1);
        fs1.setAcceptNullable(true);
        fs1.setFullFiling(' ');
        
        addFieldArchetype(CODIGO_TURBO_IPI, fs1);
        addFieldArchetype(VALOR_IPI, faip142);
        addFieldArchetype(ISENTOS_IPI, faip142);
        addFieldArchetype(OUTRAS_IPI, faip142);
        addFieldArchetype(CONTRIBUENTE_ICMS, fef);
        FieldStringFixedLengthArchetype fs30 = new FieldStringFixedLengthArchetype(30);
        fs30.setAcceptNullable(true);
        addFieldArchetype(OBSERVACAO_LINHA_LANCAMENTO, fs30);
        addFieldArchetype(N_SEQUENCIAL_LANCAMENTO, new FieldIntegerFixedLengthArchetype(2));
        
        addFieldArchetype(TIPO_ANTECIPACAO_TRIBUTARIA, fs1);
        addFieldArchetype(ANULACAO_SERVICO_TRANSPORTE, fs1);
        addFieldArchetype(APURACOES_DISTINTAS_IPI, fs1);
        addFieldArchetype(VALOR_REDUZIDO_BASE_CALC_PIS_COFINS, faip142);
        addFieldArchetype(EXCLUIDAS, faip142);
        addFieldArchetype(VENDA_ENTREGA_FUTURA, fef);
        addFieldArchetype(OPER_PREST_MERC_SUJ_REGIME_ST_SAIDA, fef);
        addFieldArchetype(NUMERO_TOTALIZADOR, fs2);
        addFieldArchetype(ST_ICMS_TABELA_A, fs1);// no manual diz 1, mas deve ser 2
        addFieldArchetype(ST_ICMS_TABELA_B, fs2);
        addFieldArchetype(ST_IPI_CTIPI, fs2);
        addFieldArchetype(CIAP_SAIDA_TRIBUTADA, fef);
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));

        
    }
    
    
    
}
