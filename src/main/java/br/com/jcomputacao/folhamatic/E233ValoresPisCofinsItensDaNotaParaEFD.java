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
 * @author lucas.bueno
 * 25/09/2018
 * 
 * Este registro deve ser gerado para fornecer
 * informações adicionais dos itens das Notas Fiscais. Estas informações serão
 * utilizadas na geração da EFD - Escrituração Fiscal Digital e SINCO/SVA.
 *
 * Este registro importará informações para o lançamento dos produtos/serviços
 * das notas fiscais de entradas e saídas, botão Lançar Produtos, opção Valores
 * de PIS e Valores de COFINS, portanto, ao importar este registro, as notas
 * fiscais de entradas e saídas nele mencionadas e os respectivos
 * produtos/serviços já deverão estar lançados no sistema ou constando nos
 * Registros E200/E201 e E221/E222.
 *
 * OBS: Poderá existir um E233 para cada item do produto/serviço
 */
public class E233ValoresPisCofinsItensDaNotaParaEFD extends LineArchetype {
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    /*
     ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de
     saída
     */
    public static final String ENTRADA_SAIDA = "ENTRADA_SAIDA";
    
    /*
     Informe a espécie da nota fiscal
    */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /*
     Informe a série da nota fiscal.
    */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
   
    /*
     Informe a subsérie da nota fiscal.
    */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    /*
     Informe o número da nota fiscal
    */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    /*
    Informe o código do cliente ou fornecedor da nota
    fiscal conforme cadastro do sistema de faturamento.
    Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e
    no sistema de faturamento com código "10", informe "10" neste campo.
    */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /*
    Informe o número de ordem do item do produto/serviço para qual
    as informações devem ser importadas. Campo Obrigatório.
    O código informado deverá constar no campo 08 do registro E222.
    */
    public static final String NUMERO_ORDEM_ITEM = "NUMERO_ORDEM_ITEM";
    
    /*
    Informe o valor da base de cálculo do PIS. Esse campo poderá ser
    preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29 ,59
    ou 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou
    2E.
    */
    public static final String BASE_PIS = "BASE_PIS";
    
    /*
    Informe a alíquota do PIS. Esse campo poderá ser preenchido apenas se nota
    fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29, 59 ou 65 apenas para nota
    fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou 2E.
    */
    public static final String ALIQUOTA_PIS = "ALIQUOTA_PIS";
    
    /*
    Informe a quantidade-base de cálculo do PIS (Pré-Formas). Esse
    campo poderá ser preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28
    ou 55; modelo 29, 59 e 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou
    CF-e e modelo 2D ou 2E.
    */
    public static final String QUANTIDADE_BASE_PIS = "QUANTIDADE_BASE_PIS";
    
    /*
    Informe a alíquota do PIS em reais (Pré-Formas). Esse campo
    poderá ser preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55;
    modelo 29, 59 e 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou CF-e e
    modelo 2D ou 2E.
    */
    public static final String ALIQUOTA_PIS_EM_REAIS = "ALIQUOTA_PIS_EM_REAIS";
    
    /*
    Informe o valor do PIS. Esse campo poderá ser preenchido apenas se nota
    fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29, 59 e 65 apenas para nota
    fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou 2E.
    */
    public static final String VALOR_PIS = "VALOR_PIS";
    
    /*
    Informe o código da Situação Tributária referente ao PIS conforme Tabela da
    Situação Tributária do PIS
    */
    public static final String STPIS = "STPIS";
    
    /*
    Informe o valor da base de cálculo da COFINS. Esse campo poderá ser
    preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29, 59
    e 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou 2E
    */
    public static final String BASE_COFINS = "BASE_COFINS";
    
    /*
    Informe a alíquota da COFINS. Esse campo poderá ser preenchido apenas
    se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29, 59 e 65 apenas para
    nota fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou 2E.
    */
    public static final String ALIQUOTA_COFINS = "ALIQUOTA_COFINS";
    
    /*
    Informe a quantidade-base de cálculo da COFINS (Pré-Formas).
    Esse campo poderá ser preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22,
    28 ou 55; modelo 29, 59 e 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV
    ou CF-e e modelo 2D ou 2E.
    */
    public static final String QUANTIDADE_BASE_COFINS = "QUANTIDADE_BASE_COFINS";
    
    /*
    Informe a alíquota da COFINS em reais (Pré-Formas). Esse
    campo poderá ser preenchido apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28
    ou 55; modelo 29, 59 e 65 apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou
    CF-e e modelo 2D ou 2E.
    */
    public static final String ALIQUOTA_COFINS_EM_REAIS = "ALIQUOTA_COFINS_EM_REAIS";
    
    /*
    Informe o valor da COFINS. Esse campo poderá ser preenchido
    apenas se nota fiscal modelos 01, 1B, 02, 04, 06, 21, 22, 28 ou 55; modelo 29, 59 e 65
    apenas para nota fiscal de saída e espécies ECF, CMR, PDV ou CF-e e modelo 2D ou 2E.
    */
    public static final String VALOR_DA_COFINS = "VALOR_DA_COFINS";
    
    /*
    Informe o código da Situação Tributária referente a COFINS conforme Tabela
    da Situação Tributária da COFINS.
    */
    public static final String STCOFINS = "STCOFINS";
    
    /*
    Para fins de geração do SINCO informe a data de apropriação
    da operação para fins de apuração das contribuições. Esse campo é único. Essa informação
    será importada tanto para valores de PIS quanto para Valores de COFINS.
    */
    public static final String DATA_APROPRIACAO = "DATA_APROPRIACAO";
    
    /*
    Para fins de geração do
    SINCO, informe o valor do crédito de PIS/PASEP calculado sobre o item, vinculado à receita
    de exportação. Preencher o campo, apenas quando se tratar de notas fiscais de entradas.
    */
    public static final String VALOR_PIS_VINCULADO_RECEITA_EXPORTACAO =
            "VALOR_PIS_VINCULADO_RECEITA_EXPORTACAO";
    
    /*
    Para fins
    de geração do SINCO, informe o valor do crédito de PIS/PASEP calculado sobre o item,
    vinculado à receita tributada no mercado interno. Preencher o campo, apenas quando se
    tratar de notas fiscais de entradas.
    */
    public static final String VALOR_PIS_VINCULADO_RECEITA_TRIBUTADA_MERCADO_INTERNO = 
            "VALOR_PIS_VINCULADO_RECEITA_TRIBUTADA_MERCADO_INTERNO";
    
    /*
    Para fins de geração do SINCO, informe o Valor do crédito de PIS/PASEP calculado sobre o
    item, vinculado à receita não-tributada no mercado interno. Preencher o campo, apenas
    quando se tratar de notas fiscais de entradas
    */
    public static final String VALOR_PIS_VINCULADO_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO = 
            "VALOR_PIS_VINCULADO_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO";
    
    /*
    Para fins de geração do
    SINCO, informe o valor do crédito da COFINS calculado sobre o item, vinculado à receita de
    exportação. Preencher o campo, apenas quando se tratar de notas fiscais de entradas.
    */
    public static final String VALOR_COFINS_VINCULADA_RECEITA_EXPORTACAO = 
            "VALOR_COFINS_VINCULADA_RECEITA_EXPORTACAO";
    
    /*
    Para fins de geração do SINCO, informe o valor do crédito da COFINS calculado sobre o item,
    vinculado à receita tributada no mercado interno. Preencher o campo, apenas quando se
    tratar de notas fiscais de entradas.
    */
    public static final String VALOR_COFINS_VINCULADA_RECEITA_TRIBUTADA_MERCADO_INTERNO = 
            "VALOR_COFINS_VINCULADA_RECEITA_TRIBUTADA_MERCADO_INTERNO";
    
    /*
    Para fins de geração do SINCO, informe o valor do crédito da COFINS calculado sobre o
    item, vinculado à receita não-tributada no mercado interno. Preencher o campo, apenas
    quando se tratar de notas fiscais de entradas.
    */
    public static final String VALOR_COFINS_VINCULADA_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO = 
            "VALOR_COFINS_VINCULADA_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO";
    
    /*
    Informe a conta analítica contábil do PIS, quando a
    empresa estiver obrigada a entrega da EFD PIS/COFINS. Caso contrário, preencha com
    espaços.
    */
    public static final String CONTA_ANALITICA_CONTABIL_PIS = "CONTA_ANALITICA_CONTABIL_PIS";
    
    /*
    Informe a conta analítica contábil da COFINS,
    quando a empresa estiver obrigada a entrega da EFD PIS/COFINS. Caso contrário,
    preencha com espaços.
    */
    public static final String CONTA_ANALITICA_CONTABIL_COFINS = "CONTA_ANALITICA_CONTABIL_COFINS";
    
    /*
    Informe a Descrição
    Complementar do Documento/Operação, quando a empresa estiver obrigada a entrega da
    EFD PIS/COFINS. Caso contrário, preencha com espaços.
    */
    public static final String DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_PIS = 
            "DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_PIS";
    
    /*
    Informe a Descrição Complementar do Documento/Operação, quando a empresa estiver obrigada a
    entrega da EFD PIS/COFINS. Caso contrário, preencha com espaços.
    */
    public static final String DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_COFINS = 
            "DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_COFINS";
    
    /*
    Para lançamentos de Saídas, Informe "1" se o produto
    pertence a Incidência Cumulativa, "2" se o produto pertence a Incidência Não Cumulativa.
    Somente preencha este campo, quando sua empresa se tratar de Empresa Mista (cadastro
    da empresa, com opção "Incidência nos Regimes Cumulativo e Não Cumulativo" no botão
    Configurações EFD PIS/COFINS). Caso sua empresa não se enquadre nesta condição,
    preencha o campo com espaço.
    */
    public static final String TIPO_INCIDENCIA_PIS_COFINS = "TIPO_INCIDENCIA_PIS_COFINS";
    
    /*
    Quando for notas de saídas e a espécie da nota for ECF e PDV é obrigatório
    informar o número do cupom fiscal (COO-Contador de Ordem de Operação), caso contrário,
    informe zeros. A informação deste campo deverá constar no campo 24 do registro E222.
    */
    public static final String NUMERO_COO = "NUMERO_COO";
    
    //Construtor onde sera iniciado o tamanho dos registros
    public E233ValoresPisCofinsItensDaNotaParaEFD() {
        
        setName("Folhamatic - Valores de Pis e Cofins dos Itens das Notas Fiscais");
        
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
        
        //N
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
        
        FieldDecimalFixedLengthArchetype faip154 = new FieldDecimalFixedLengthArchetype(15, 4);
        faip154.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        //fef.setFullFiling('N');
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E233"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUMERO_ORDEM_ITEM, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(BASE_PIS, faip142);
        addFieldArchetype(ALIQUOTA_PIS, faip074);
        addFieldArchetype(QUANTIDADE_BASE_PIS, faip154);
        addFieldArchetype(ALIQUOTA_PIS_EM_REAIS, faip154);
        addFieldArchetype(VALOR_PIS, faip142);
        addFieldArchetype(STPIS, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(BASE_COFINS, faip142);
        addFieldArchetype(ALIQUOTA_COFINS, faip074);
        addFieldArchetype(QUANTIDADE_BASE_COFINS, faip154);
        addFieldArchetype(ALIQUOTA_COFINS_EM_REAIS, faip154);
        addFieldArchetype(VALOR_DA_COFINS, faip142);
        addFieldArchetype(STCOFINS, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(DATA_APROPRIACAO, faa);
        addFieldArchetype(VALOR_PIS_VINCULADO_RECEITA_EXPORTACAO, faip142);
        addFieldArchetype(VALOR_PIS_VINCULADO_RECEITA_TRIBUTADA_MERCADO_INTERNO, faip142);
        addFieldArchetype(VALOR_PIS_VINCULADO_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO, faip142);
        addFieldArchetype(VALOR_COFINS_VINCULADA_RECEITA_EXPORTACAO, faip142);
        addFieldArchetype(VALOR_COFINS_VINCULADA_RECEITA_TRIBUTADA_MERCADO_INTERNO, faip142);
        addFieldArchetype(VALOR_COFINS_VINCULADA_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO, faip142);
        addFieldArchetype(CONTA_ANALITICA_CONTABIL_PIS, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(CONTA_ANALITICA_CONTABIL_COFINS, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_PIS, new FieldStringFixedLengthArchetype(254));
        addFieldArchetype(DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_COFINS, new FieldStringFixedLengthArchetype(254));
        addFieldArchetype(TIPO_INCIDENCIA_PIS_COFINS, fef);
        addFieldArchetype(NUMERO_COO, new FieldIntegerFixedLengthArchetype(10));
    }
}
