package br.com.jcomputacao.folhamatic;

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
public class E222LancamentoProdutosServicos extends LineArchetype{
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de
     * saída.
     */
    public static final String ENTRADA_SAIDA = "ENTRADA_SAIDA";
     /**
     * ESPÉCIE N.F.- Informe a espécie da nota fiscal.
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    /**
     * SÉRIE N.F. - Informe a série da nota fiscal.
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
     /**
     * SUBSÉRIE N.F.- Informe a subsérie da nota fiscal.
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
     /**
     * NÚMERO N.F. - Informe o número da nota fiscal.</br>
     */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    /**
     * CÓDIGO DO CLIENTE/FORNECEDOR - Informe o código do cliente ou fornecedor da nota
     * fiscal conforme cadastro do sistema de faturamento.</br>
     * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e
     * no sistema de faturamento com código "10", informe "10" neste campo.</br>
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
     /**
     * Nº ITEM - Informe o número de ordem do item na nota fiscal começando pelo número 001.</br>
     * OBS: O validador do arquivo magnético SINTEGRA (Convênios 69/02 e 142/02) não aceita
     * que o produto seja de itens 991 a 999.</br>
     */
    public static final String NUMERO_ITEM = "NUMERO_ITEM";
     /**
     * CFOP - Informe o CFOP do item.</br>
     * Ex. 1101, 5101</br>
     */
    public static final String CFOP = "CFOP";
     /**
     * CÓDIGO DO PRODUTO/SERVIÇO - Informe o código do produto/serviço conforme
     * cadastro de Produtos/Serviços.</br>
     */
    public static final String CODIGO_PRODUTO_SERVICO = "CODIGO_PRODUTO_SERVICO";
     /**
     * ALÍQUOTA DO ICMS - Informe a aliquota de ICMS do produto/serviço. Exemplo: alíquota
     * de 18% informar no arquivo 0180000.</br>
     */
    public static final String ALIQUOTA_ICMS = "ALIQUOTA_ICMS";
    
     /**
     * QUANTIDADE - Informe a quantidade do produto/serviço.</br>
     */
    public static final String QUANTIDADE = "QUANTIDADE";
     /**
     * VLR.MERCADORIA/SERVIÇO - Informe o valor da mercadoria/serviço. Deve ser o valor
     * bruto do produto/serviço (valor unitário x quantidade). Não incluir o valor do frete, seguro,
     * etc...</br>
     */
    public static final String VALOR_MERCADORIA_SERVICO = "VALOR_MERCADORIA_SERVICO";
     /**
     * VALOR DO DESCONTO - Informe o valor do desconto concedido no item.</br>
     */
    public static final String VALOR_DESCONTO = "VALOR_DESCONTO";
     /**
     * BASE DE CÁLCULO DO ICMS - Informe o valor da base de cálculo do ICMS do
     * produto/serviço.</br>
     * OBS. Quando se tratar de Base de cálculo reduzida, informe o valor da Base sem a
     * redução.</br>
     */
    public static final String BASE_CALCULO_ICMS = "BASE_CALCULO_ICMS";
     /**
     * BASE SUBST. TRIB. - Informe o valor da base de cálculo do ICMS da substituição
     * tributária do produto/serviço.</br>
     * Quando se tratar de cupom fiscal, zerar este campo.</br>
     */
    public static final String BASE_SUBSTITUICAO_TRIBUTARIA = "BASE_SUBSTITUICAO_TRIBUTARIA";
     /**
     * VALOR DO IPI - Informe o valor de IPI do produto/serviço.</br>
     * Preencher a 1ª posição deste campo com o sinal de negativo quando houver a situação de
     * IPI não aproveitável.</br>
     * Quando se tratar de cupom fiscal, zerar este campo.</br>
     */
    public static final String VALOR_IPI = "VALOR_IPI";
     /**
     * VALOR UNITÁRIO - Informe o valor unitário do produto/serviço.</br>
     */
    public static final String VALOR_UNITARIO = "VALOR_UNITARIO";
     /**
     * NÚMERO DI / DSI - Informe o número da DI (Declaração de importação) quando se tratar
     * de nota fiscal de importação (CFOP 3.xxx).</br>
     */
    public static final String NUMERO_DI_DSI = "NUMERO_DI_DSI";
     /**
     * BC DO IPI - Informe o valor da Base de Cálculo do IPI do produto/serviço. Quando se tratar
     * de cupom fiscal, zerar este campo.</br>
     */
    public static final String BC_IPI = "BC_IPI";
     /**
     * VALOR DO ICMS - Informe o valor de ICMS do produto/serviço.</br>
     */
    public static final String VALOR_ICMS = "VALOR_ICMS";
     /**
     * ISENTOS DE ICMS - Informe o valor Isento de ICMS do produto/serviço.</br>
     */
    public static final String ISENTOS_ICMS = "ISENTOS_ICMS";
     /**
     * OUTROS DE ICMS - Informe o valor Outros de ICMS do produto/serviço.</br>
     */
    public static final String OUTROS_ICMS = "OUTROS_ICMS";
     /**
     * Nº COO - Informe o número do cupom fiscal (COO-Contador de Ordem de Operação)
     * quando notas fiscais de saídas espécie ECF, PDV , caso contrário, informe zeros.</br>
     */
    public static final String N_COO = "N_COO";
     /**
     * ICMS SUBST. TRIB. - Informe o valor do ICMS Substituição Tributária do produto/serviço.</br>
     */
    public static final String ICMS_ST = "ICMS_ST";
     /**
     * MOVIMENTAÇÃO FÍSICA DA MERCADORIA - Informe "S" se houve movimentação física
     * da mercadoria, ou "N" se não houve.</br>
     */
    public static final String MOVIMENTACAO_FISICA_MERCADORIA = "MOVIMENTACAO_FISICA_MERCADORIA";
     /**
     * ISENTOS DE IPI - Informe o valor Isento de IPI do produto/serviço. Quando se tratar de
     * cupom fiscal, zerar este campo.</br>
     */
    public static final String ISENTOS_IPI = "ISENTOS_IPI";
     /**
     * OUTROS DE IPI -Informe o valor Outros de IPI do produto/serviço. Quando se tratar de
     * cupom fiscal, zerar este campo.</br>
     */
    public static final String OUTROS_IPI = "OUTROS_IPI";
     /**
     * BASE ST NA ORIGEM/DESTINO - Informe a base de cálculo utilizada para a substituição</br>
     * tributária na unidade federada de origem e registrada no campo: 'Informações</br>
     * Complementares' da Nota Fiscal; previsão contida nas cláusulas 'nona', 'décima' e 'décima</br>
     * A' (Convênio ICMS 03/99, alterado pelo 138/01), somente para operações com</br>
     * combustíveis, quando o imposto devido à unidade federada de destino for diverso do</br>
     * imposto cobrado na unidade federada de origem.</br>
     * OBS. Se a empresa utiliza a geração da EFD - Escrituração Fiscal Digital informe este</br>
     * campo nos casos acima, mesmo que o produto NÃO seja combustível.</br>
     */
    public static final String BASE_ST_ORIGEM_DESTINO = "BASE_ST_ORIGEM_DESTINO";
     /**
     * ICMS-ST A REPASSAR - Informe o valor do imposto que deverá ser deduzido da UF de
     * origem e repassado à UF de destino.</br>
     * Previsão contida nas cláusulas 'nona', 'décima' e 'décima A' (Convênio ICMS 03/99,</br>
     * alterado pelo 138/01), somente para operações com combustíveis, quando o imposto</br>
     * devido à unidade federada de destino for diverso do imposto cobrado na unidade federada</br>
     * de origem.</br>
     * OBS. Se a empresa utiliza a geração da EFD - Escrituração Fiscal Digital informe este</br>
     * campo nos casos acima, mesmo que o produto NÃO seja combustível.</br>
     */
    public static final String ICMS_ST_A_REPASSAR = "ICMS_ST_A_REPASSAR";
     /**
     * ICMS-ST A COMPLEMENTAR - Informe o valor do imposto relativo à diferença entre o</br>
     * repassado pela refinaria e o devido no estado de destino (em qualquer ponto da cadeia de</br>
     * comercialização), se for o caso. Previsão contida nas cláusulas 'nona', 'décima' e 'décima</br>
     * A' (Convênio ICMS 03/99, alterado pelo Convênio ICMS 138/01), somente para operações</br>
     * com combustíveis, quando o imposto devido à Unidade da Federação de destino for</br>
     * diverso do imposto cobrado na UF de origem.</br>
     * OBS. Se a empresa utiliza a geração da EFD - Escrituração Fiscal Digital informe este</br>
     * campo nos casos acima, mesmo que o produto NÃO seja combustível.</br>
     */
    public static final String ICMS_ST_A_COMPLEMENTAR = "ICMS_ST_A_COMPLEMENTAR";
     /**
     * ITEM CANCELADO - Este campo será utilizado apenas quando lançamentos de ECF e</br>
     * PDV. Informe "S" se o item do Cupom Fiscal for cancelado, caso contrário informe "N".</br>
     * Para lançamentos diferentes de ECF e PDV informe "N".</br>
     */
    public static final String ITEM_CANCELADO = "ITEM_CANCELADO";
     /**
     * OPERAÇÕES/PRESTAÇÕES COM MERCADORIAS SUJEITAS AO REGIME DE</br>
     * SUBSTITUIÇÃO TRIBUTÁRIA NAS SAÍDAS - Informe "S" ou "N" se a empresa utiliza</br>
     * máquina registradora/ECF/PDV/CF-e, se a espécie da nota de saídas (campo 03 deste</br>
     * registro) for ECF, CMR ou PDV, se houver valor no campo Outros de ICMS (campo 23</br>
     * deste registro ) e se o CFOP (campo 09 deste registro) for um dos abaixo citados.</br>
     * Não sendo a situação acima ou para notas fiscais de entradas, este campo deve ser</br>
     * preenchido com espaços.</br>
     * CFOP´s : 5.901, 6.901, 5.902, 6.902, 5.903, 6.903, 5.904, 6.904, 5.905, 6.905, 5.906,</br>
     * 6.906, 5.907, 6.907, 5.908, 6.908, 5.909, 6.909, 5.910, 6.910, 5.911, 6.911, 5.912, 6.912,</br>
     * 5.913, 6.913, 5.914, 6.914, 5.915, 6.915, 5.916, 6.916, 5.917, 6.917, 5.918, 6.918, 5.919,</br>
     * 6.919, 5.920, 6.920, 5.921, 6.921, 5.922, 6.922, 5.923, 6.923, 5.924, 6.924, 5.925, 6.925,</br>
     * 5.926, 5.927, 5.928, 5.929, 6.929, 5.931, 6.931, 5.932, 6.932, 5.949 e 6.949.</br>
     */
    public static final String OPERA_MERC_SUJEITA_REGUIME_ST_SAIDA = "OPERA_MERC_SUJEITA_REGUIME_ST_SAIDA";
     /**
     * ISS - Este campo será utilizado apenas quando lançamentos de ECF e PDV. Informe "S"</br>
     * se o item do Cupom Fiscal for ISSQN, caso contrário informe "N". Para lançamentos</br>
     * diferentes de ECF e PDV informe "N".</br>
     */
    public static final String ISS = "ISS";
     /**
     * CÓDIGO UNID. COMERCIAL - Informe o código da unidade de medida utilizada na</br>
     * comercialização do produto/serviço. Esse código deve existir no Cadastro de Unidade de</br>
     * Medidas do sistema, ou no Registro E018.</br>
     */
    public static final String CODIGO_UNIDADE_COMERCIAL = "CODIGO_UNIDADE_COMERCIAL";
     /**
     * CÓDIGO DA NATUREZA DA OPERAÇÃO - Informe o código da natureza da operação</br>
     * quando se tratar de NF modelo 01, 02, 1B, 04 ou 55. Esse código deve existir no Cadastro</br>
     * da Natureza da Operação do sistema, ou no Registro E027.</br>
     */
    public static final String CODIGO_NATUREZA_OPERACAO = "CODIGO_NATUREZA_OPERACAO";
     /**
     * DESCRIÇÃO COMPLEMENTAR DO PRODUTO - Informe a descrição complementar do</br>
     * produto/serviço, se necessário.</br>
     */
    public static final String DESCRICAO_COMPLEMENTAR_PRODUTO = "DESCRICAO_COMPLEMENTAR_PRODUTO";
     /**
     * FATOR DE CONVERSÃO - Este campo somente deve ser preenchido se a empresa utiliza</br>
     * a geração da EFD - Escrituração Fiscal Digital.</br>
     * Informe o fator utilizado para converter (multiplicar) a unidade comercial a ser convertida na</br>
     * unidade adotada no inventário (estoque).</br>
     * Somente preencha este campo se a informação da unidade de medida comercial for</br>
     * diferente da unidade de medida utilizada no estoque do produto.</br>
     * Não sendo as situações acima informe zeros neste campo.</br>
     */
    public static final String FATOR_CONVERSAO = "FATOR_CONVERSAO";
     /**
     * ALÍQUOTA DO ICMS S.T. - Este campo somente deve ser preenchido se a empresa utiliza</br>
     * a geração da EFD-Escrituração Fiscal Digital, caso contrário, informe zeros neste campo.</br>
     * Informe a Alíquota do ICMS da substituição tributária na unidade da federação de destino</br>
     * quando se tratar de notas fiscais modelo 01, 1B, 04, 06, 28 ou 55.</br>
     */
    public static final String ALIQUOTA_ICMS_ST = "ALIQUOTA_ICMS_ST";
     /**
     * SIT.TRIB. ICMS TAB. A - Informe o código da Situação Tributária referente ao ICMS</br>
     * conforme Tabela A - Situação Tributária do ICMS. Quando for utilizado o CSOSN,</br>
     * preencher este campo com espaço.</br>
     */
    public static final String ST_ICMS_TABELA_A= "ST_ICMS_TABELA_A";
     /**
     * SIT.TRIB. ICMS TAB. B - Informe o código da Situação Tributária referente ao ICMS</br>
     * conforme Tabela B - Situação Tributária do ICMS. Quando for utilizado o CSOSN,</br>
     * preencher este campo com espaços.</br>
     */
    public static final String ST_ICMS_TABELA_B = "ST_ICMS_TABELA_B";
     /**
     * SIT. TRIB. IPI - Informe o Código da Situação Tributária referente ao IPI conforme Tabela</br>
     * da Situação Tributária do IPI.</br>
     */
    public static final String ST_IPI = "ST_IPI";
     /**
     * APURAÇÃO DISTINTAS DO IPI - Este campo somente deve ser preenchido se a empresa</br>
     * utiliza a geração da EFD-Escrituração Fiscal Digital.</br>
     * Informe o período de apuração do IPI quando se tratar de empresa Indústria com</br>
     * periodicidade distinta na apuração do IPI e a nota fiscal for modelo 01, 1B, 04 e 55. Se</br>
     * mensal informe "M", se decendial informe "D".</br>
     * Não sendo as situações acima ou se a empresa não apura IPI ou apura o IPI em uma</br>
     * única apuração, preencha este campo com espaços.</br>
     */
    public static final String APURACAO_DISTINTA_IPI = "APURACAO_DISTINTA_IPI";
     /**
     * CÓDIGO DA CONTA - Se a empresa utiliza a geração do arquivo EFD-Escrituração Fiscal</br>
     * Digital e o modelo da nota é 01, 1B, 04, 06, 21, 22, 28, 29 e 55, informe o código da conta</br>
     * analítica contábil debitada/creditada do produto/serviço, que deve ser a conta credora ou</br>
     * devedora principal, podendo ser informada a conta sintética (nível acima da conta</br>
     * analítica).</br>
     * Diferente da situação acima, deixe este campo vazio.</br>
     */
    public static final String CODIGO_CONTA = "CODIGO_CONTA";
     /**
     * FRETE - Informe o valor do frete do produto.</br>
     */
    public static final String FRETE = "FRETE";
     /**
     * FRETE NO TOTAL DA NF - Informe "S" se o valor do frete está incluso no valor total da</br>
     * nota fiscal ou "N" se não está.</br>
     */
    public static final String FRETE_TOTAL_NOTA_FISCAL = "FRETE_TOTAL_NOTA_FISCAL";
     /**
     * SEGURO - Informe o valor do seguro do produto.</br>
     */
    public static final String SEGURO = "SEGURO";
     /**
     * SEGURO NO TOTAL DA NF - Informe "S" se o valor do seguro está incluso no valor total</br>
     * da nota fiscal ou "N" se não está.</br>
     */
    public static final String SEGURO_TOTAL_NOTA_FISCAL = "SEGURO_TOTAL_NOTA_FISCAL";
     /**
     * DESPESAS ACESSÓRIAS - Informe o valor de outras despesas acessórias do produto.</br>
     */
    public static final String DESPESA_ACESSORIA = "DESPESA_ACESSORIA";
     /**
     * DESPESAS ACESSÓRIAS NO TOTAL DA NF - Informe "S" se o valor das despesas</br>
     * acessórias está incluso no valor total da nota fiscal ou "N" se não está.</br>
     */
    public static final String DESPESA_ACESSORIA_TOTAL_NOTA_FISCAL = "DESPESA_ACESSORIA_TOTAL_NOTA_FISCAL";
     /**
     * ACRÉSCIMO - Quando o lançamento for de cupom fiscal com modelos 02 e 2D, informe o</br>
     * valor de acréscimo do produto/serviço, caso contrário, informe zeros.</br>
     */
    public static final String ACRESCIMO = "ACRESCIMO";
     /**
     * REDUÇÃO BASE CÁLC. ICMS - Informe o percentual de redução da Base de Cálculo do</br>
     * ICMS do produto/serviço, caso contrário, preencher com zeros.</br>
     */
    public static final String REDUCAO_BASE_CALCULO_ICMS = "REDUCAO_BASE_CALCULO_ICMS";
     /**
     * VALOR NÃO TRIBUTADO (RED. DA BC ICMS) - Informe o valor não tributado em função</br>
     * da redução da base de cálculo do ICMS, caso contrário, preencher com zeros.</br>
     * Este valor será o resultado da diferença entre o valor da Base de Cálculo do ICMS e a</br>
     * Base ICMS Reduzida.</br>
     */
    public static final String VALOR_NAO_TRIBUTADO = "VALOR_NAO_TRIBUTADO";
     /**
     * VALOR NÃO TRIBUTADO (RED. DA BC ICMS) - Informe o valor não tributado em função</br>
     * da redução da base de cálculo do ICMS, caso contrário, preencher com zeros.</br>
     * Este valor será o resultado da diferença entre o valor da Base de Cálculo do ICMS e a</br>
     * Base ICMS Reduzida.</br>
     */
    public static final String QUANTIDADE_CANCELADA = "QUANTIDADE_CANCELADA";
     /**
     * BASE ICMS REDUZIDA - Informe o valor da base de cálculo do ICMS reduzida do</br>
     * produto/serviço, caso contrário, preencher com zeros.</br>
     * Este valor será conforme o cálculo da Base do ICMS ( x ) % de redução da Base. A Base</br>
     * do ICMS ( - ) o resultado da multiplicação, será o valor da Base de cálculo do ICMS</br>
     * reduzida.</br>
     */
    public static final String BASE_ICMS_REDUZIDA = "BASE_ICMS_REDUZIDA";
     /**
     * DADOS PARA REDF (NF PAULISTA) - Se a empresa utiliza a geração do arquivo REDFNota</br>
     * Fiscal Paulista, a nota fiscal é de saídas e o modelo da nota é 02, informe o Tipo de</br>
     * Receita conforme códigos abaixo:</br>
     * 1 - Revenda de Mercadoria</br>
     * 2 - Venda de Mercadorias Industrializadas pelo Emitente</br>
     * 3 - Venda de Mercadorias sujeitas a Substituição Tributária</br>
     * 4 - Nenhum</br>
     * Se não for a situação acima, informe o código 4.</br>
     */
    public static final String DADOS_REDF = "DADOS_REDF";
     /**
     * NÚMERO DO TOTALIZADOR - Se a empresa utiliza a geração do arquivo EFDEscrituração</br>
     * Fiscal Digital, preencha este campo quando se tratar de NF de Saídas,</br>
     * espécie ECF, CMR e PDV, modelo 2, 2D, 2E, 13, 14, 15 e 16 se para a máquina que está</br>
     * sendo gerado o lançamento de produto existe mais que um totalizador com a situação</br>
     * Tributado ICMS referente a alíquota informada no campo 11.</br>
     * Exemplo: Está sendo gerado um lançamento de produto do Cupom Fiscal referente ao</br>
     * ECF 001, e a alíquota do ICMS informada no campo 11 é 18%. Se no cadastro de Máquina</br>
     * Registradora do sistema, existir para o ECF 001 mais que um totalizador com a situação</br>
     * Tributado ICMS e alíquota 18%, informe neste campo o número do totalizador que se</br>
     * refere o lançamento.</br>
     * Não existindo a situação acima, deixe este campo vazio.</br>
     */
    public static final String NUMERO_TOTALIZADOR = "NUMERO_TOTALIZADOR";
     /**
     * DESCONTO INCONDICIONAL - Se existir valor de desconto (campo 14) se tratar de</br>
     * desconto Incondicional, informe "S", se não existir valor de desconto ou o mesmo não for</br>
     * incondicional, informe "N".</br>
     * Campo Obrigatório.</br>
     */
    public static final String DESCONTO_INCONDICIONAL = "DESCONTO_INCONDICIONAL";
     /**
     * CSOSN - Para os lançamentos de entradas, informe o CSOSN conforme tabela "CSOSN -</br>
     * Simples Nacional." , quando o fornecedor for enquadrado como Simples Nacional (campo</br>
     * 26 do registro E010 como “S”). Para as notas fiscais de saídas, somente preencha esse</br>
     * campo, quando a empresa que irá receber os dados, estiver enquadrada como Simples</br>
     * Nacional.</br>
     */
    public static final String CSONS = "CSONS";
     /**
     * CONTROLE DO SISTEMA - Informe "0" (zero) para controle interno do Sistema E-Fiscal.</br>
     */
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";

    public E222LancamentoProdutosServicos() {
        setName("Folhamatic - Lançamento de Produto ou Serviço");
        
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
        
        FieldDecimalFixedLengthArchetype faip076 = new FieldDecimalFixedLengthArchetype(7, 6);
        faip076.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7, 4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip14 = new FieldDecimalFixedLengthArchetype(14, 0);
        faip14.setAcceptNullable(true);
        
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
        //fef.setFullFiling('N');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E222"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUMERO_ITEM, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP,  new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CODIGO_PRODUTO_SERVICO,  new FieldStringFixedLengthArchetype(12));
        addFieldArchetype(ALIQUOTA_ICMS, faip074);
        addFieldArchetype(QUANTIDADE, faip155);
        addFieldArchetype(VALOR_MERCADORIA_SERVICO, faip142);
        addFieldArchetype(VALOR_DESCONTO, faip142);
        
        addFieldArchetype(BASE_CALCULO_ICMS, faip142);
        addFieldArchetype(BASE_SUBSTITUICAO_TRIBUTARIA, faip142); 
        addFieldArchetype(VALOR_IPI, faip142);
        addFieldArchetype(VALOR_UNITARIO, faip144);
        addFieldArchetype(NUMERO_DI_DSI,new FieldIntegerFixedLengthArchetype(10) );
        addFieldArchetype(BC_IPI,faip142);
        addFieldArchetype(VALOR_ICMS, faip142);
        addFieldArchetype(ISENTOS_ICMS, faip142);
        addFieldArchetype(OUTROS_ICMS,faip142 );
        addFieldArchetype(N_COO, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(ICMS_ST,faip142 );
        addFieldArchetype(MOVIMENTACAO_FISICA_MERCADORIA, fef);
        addFieldArchetype(ISENTOS_IPI, faip142);
        addFieldArchetype(OUTROS_IPI, faip142);
        addFieldArchetype(BASE_ST_ORIGEM_DESTINO, faip142);
        addFieldArchetype(ICMS_ST_A_REPASSAR, faip142);
        addFieldArchetype(ICMS_ST_A_COMPLEMENTAR, faip142);
        addFieldArchetype(ITEM_CANCELADO, fef);
        addFieldArchetype(OPERA_MERC_SUJEITA_REGUIME_ST_SAIDA, fef);
        addFieldArchetype(ISS, fef);
        addFieldArchetype(CODIGO_UNIDADE_COMERCIAL,  new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(CODIGO_NATUREZA_OPERACAO,  new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DESCRICAO_COMPLEMENTAR_PRODUTO,  new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(FATOR_CONVERSAO, faip146);
        addFieldArchetype(ALIQUOTA_ICMS_ST, faip062);
        addFieldArchetype(ST_ICMS_TABELA_A, new FieldStringFixedLengthArchetype(2));// no manual consta 1, mas acredito que são 2
        addFieldArchetype(ST_ICMS_TABELA_B, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ST_IPI,  new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(APURACAO_DISTINTA_IPI,  new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_CONTA, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(FRETE, faip142);
        addFieldArchetype(FRETE_TOTAL_NOTA_FISCAL, fef);
        addFieldArchetype(SEGURO, faip142);
        addFieldArchetype(SEGURO_TOTAL_NOTA_FISCAL, fef);
        addFieldArchetype(DESPESA_ACESSORIA, faip142);
        addFieldArchetype(DESPESA_ACESSORIA_TOTAL_NOTA_FISCAL, fef);
        addFieldArchetype(ACRESCIMO, faip142);
        addFieldArchetype(REDUCAO_BASE_CALCULO_ICMS, faip074);
        addFieldArchetype(VALOR_NAO_TRIBUTADO, faip142);
        
        addFieldArchetype(QUANTIDADE_CANCELADA, faip143);
        addFieldArchetype(BASE_ICMS_REDUZIDA, faip142);
        addFieldArchetype(DADOS_REDF, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_TOTALIZADOR, new FieldStringFixedLengthArchetype(2));
        
        FieldEnumFixedLengthArchetype fefDI = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fefDI.setAcceptNullable(false);
        
        addFieldArchetype(DESCONTO_INCONDICIONAL, fefDI);
        addFieldArchetype(CSONS, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
        
    }
    
}
