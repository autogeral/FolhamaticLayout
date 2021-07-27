/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class E338ContaEnergiaEletrica extends LineArchetype {
    
    /**
     * E338
     */
     public static final String NOME_REGISTRO = "NOME_REGISTRO";
     
     /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de saída.
     */
    public static final String TIPO_NOTA_FISCAL = "TIPO_NOTA_FISCAL";
    
     /**
     * ESPÉCIE N.F. - Informe a espécie da nota fiscal.</br>
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
     /**
     * SÉRIE N.F. - Informe a série da nota fiscal.</br>
     */
     public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
     
     /**
     * SUBSÉRIE N.F. - Informe a subsérie da nota fiscal.</br>
     */
     public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
     
     /**
     * NÚMERO N.F. - Informe o número da nota fiscal.</br>
     */
     public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
     
     /**
     * CÓDIGO DO CLIENTE - Informe o código do cliente da nota fiscal conforme cadastro do 
     * sistema de faturamento.  
     * Exemplo: Se no sistema E-Fiscal o cliente está cadastrado com o código "01" e no sistema 
     * de faturamento com código "10", informe "10" neste campo.
     */
     public static final String CODIGO_CLIENTE = "CODIGO_CLIENTE";
     
     /**
     * TIPO DE NOTA - Informe "E" se Energia Elétrica "G" se Gás Canalizado e "A" se Água 
     * Canalizada/br>
     */
     public static final String TIPO_NOTA = "TIPO_NOTA";
     
     /**
     * Quando se tratar de Energia Elétrica informe o 
     * código conforme Tabela - Faixa de Consumo de Energia Elétrica, para lançamentos com 
     * períodos a partir de 01/2010 conforme tabela Faixa de Consumo de Energia Elétrica (a partir 
     * de 2010) quando se tratar de Gás Canalizado conforme Tabela - Classes de Consumo de 
     * Gás Canalizado e quando se tratar de Água Canalizada conforme Tabela - Código de Classe 
     * de Consumo - Água Canalizada. 
     * Quando se tratar de notas de saídas, informe este campo para que não ocorram erros no 
     * Validador da EFD
     */
     public static final String CODIGO_CLASSE_CONSUMO = "CODIGO_CLASSE_CONSUMO";
     
    /**
     * Informe o valor total fornecido/consumido. 
     * Atenção: Informe o valor total fornecido/consumido para que não ocorra erros no Validador 
     * da EFD
     */
     public static final String VALOR_TOTAL_FORNECIDO_CONSUMIDO = "VALOR_TOTAL_FORNECIDO_CONSUMIDO";
     
    /**
     * SERVIÇOS NÃO-TRIBUTADOS PELO ICMS - Informe o valor dos serviços não tributados 
     * pelo ICMS.
     */
     public static final String SERVICO_NAO_TRIBUTADOS_ICMS = "SERVICO_NAO_TRIBUTADOS_ICMS";
     
     /**
     * VALOR TOTAL COBRADO EM NOME DE TERCEIROS - Informe o valor total cobrado em 
     * nome de terceiros.
     */
     public static final String VALOR_TOTAL_COBRADO_NOME_TERCEIRO = "VALOR_TOTAL_COBRADO_NOME_TERCEIRO";
     
    /**
     * DOCUMENTO ABRANGIDO PELO CONVÊNIO ICMS 115/03 - Informe "S" se o documento 
     * fiscal estiver previsto no Convênio ICMS 115/03, caso contrário informe "N". Para empresas 
     * não obrigadas aos arquivos previstos no Convênio ICMS 115/03, e para notas fiscais modelo 
     * 28 e 29 informe "N"
     */
     public static final String DOCUMENTO_ABRANGIDO_CONVENIO_ICMS = "DOCUMENTO_ABRANGIDO_CONVENIO_ICMS";
     
    /**
     * MUNICÍPIO DOS PONTOS DE CONSUMO - Informe o código do município dos Pontos de 
     * Consumo conforme Tabela de Municípios-IBGE. 
     * Informe este campo para que não ocorram erros no Validador da EFD. 
     * Este campo somente deverá ser preenchido se o campo 13 - "Documento Abrangido pelo 
     * Convênio ICMS 115/03" for igual a "N". Caso contrário, preencha o campo com espaços
     */
     public static final String MUNICIPIO_PONTOS_CONSUMO = "MUNICIPIO_PONTOS_CONSUMO";
     
     /**
     * CONSUMO TOTAL, EM KWH - Informe o total de consumo em kWh. 
     * Informe este campo para que não ocorram erros no Validador da EFD. 
     * Este campo somente deverá ser preenchido se o campo 13 - "Documento Abrangido pelo 
     * Convênio ICMS 115/03" for igual a "N". Caso contrário, preencha o campo com zeros
     */
     public static final String CONSUMO_TOTAL_KWH = "CONSUMO_TOTAL_KWH";
     
    /**
     * Informe o nome do volume do arquivo mestre de 
     * documento fiscal, conforme item 4.5 do Anexo Único (Manual de Orientação) Convênio ICMS 
     * 115/03. 
     * Informe este campo para que não ocorram erros no Validador da EFD. 
     * Este campo somente deverá ser preenchido para documentos abrangidos no Convênio ICMS 
     * 115/03, ou seja, se o campo 13 desse registro for igual a "S". Caso contrário, preencha o 
     * campo com espaços.
     */
     public static final String NOME_ARQUIVO_MESTRE = "NOME_ARQUIVO_MESTRE";
     
    /**
     * Informe a chave de codificação digital do arquivo mestre 
     * de documento fiscal, conforme Parágrafo Único da Cláusula Segunda do Convênio ICMS 
     * 115/2003. 
     * Informe este campo para que não ocorram erros no Validador da EFD. 
     * Este campo somente deverá ser preenchido para documentos abrangidos no Convênio ICMS 
     * 115/03, ou seja, se o campo 13 desse registro for igual a "S". Caso contrário, preencha o 
     * campo com espaços.
     */
     public static final String CHAVE_ARQUIVO_MESTRE = "CHAVE_ARQUIVO_MESTRE";
     
    /**
     * Informe o código de Tipo de ligação, conforme tabela 
     * "Código de Tipo de Ligação" quando se tratar de operação Energia Elétrica. Caso não haja 
     * informação, preencha o campo com espaços
     */
     public static final String CODIGO_TIPO_LIGACAO = "CODIGO_TIPO_LIGACAO";
     
    /**
     * Informe o código de Grupo de Tensão, conforme tabela 
     * "Código de Grupo de Tensão", quando se tratar de operação Energia Elétrica. Caso não haja 
     * informação, preencha o campo com espaços.
     */
     public static final String CODIGO_GRUPO_TENSAO = "CODIGO_GRUPO_TENSAO";
     
    /**
     * Informe "0" (zero) para controle interno do Sistema E-Fiscal
     */
     public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
     
     public E338ContaEnergiaEletrica() {
        setName("Folhamatic - Conta Energia Eletrica");
        
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
        
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(2);
        fa.setAcceptNullable(true);
        fa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E338"));
        addFieldArchetype(TIPO_NOTA_FISCAL,new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        f2.setAcceptNullable(true);
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, f2);
        
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_CLIENTE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(TIPO_NOTA, fef);
        addFieldArchetype(CODIGO_CLASSE_CONSUMO, fa);
        
        addFieldArchetype(VALOR_TOTAL_FORNECIDO_CONSUMIDO, new FieldIntegerFixedLengthArchetype<Long>(14));
        addFieldArchetype(SERVICO_NAO_TRIBUTADOS_ICMS, new FieldIntegerFixedLengthArchetype<Long>(14));
        addFieldArchetype(VALOR_TOTAL_COBRADO_NOME_TERCEIRO, new FieldIntegerFixedLengthArchetype<Long>(14));
        
        addFieldArchetype(DOCUMENTO_ABRANGIDO_CONVENIO_ICMS, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(MUNICIPIO_PONTOS_CONSUMO, new FieldIntegerFixedLengthArchetype<Long>(7));
        addFieldArchetype(CONSUMO_TOTAL_KWH, new FieldIntegerFixedLengthArchetype<Long>(14));
        addFieldArchetype(NOME_ARQUIVO_MESTRE, new FieldStringFixedLengthArchetype(33));
        addFieldArchetype(CHAVE_ARQUIVO_MESTRE, new FieldStringFixedLengthArchetype(32));
        
        addFieldArchetype(CODIGO_TIPO_LIGACAO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_GRUPO_TENSAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldStringFixedLengthArchetype(1));
     }
}
