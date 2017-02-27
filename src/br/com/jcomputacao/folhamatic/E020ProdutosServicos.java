package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/01/2017 17:05:44
 * @author murilo
 */
public class E020ProdutosServicos extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * 02 - Tipo X Tamanho 14</br>
     * CÓDIGO DO PRODUTO/SERVIÇO - Informe o código do produto ou serviço.</br>
     * Campo obrigatório.</br>
     * Atenção ao especificar este campo, pois como nos exemplos abaixo,</br>
     * serão importados dois produtos/serviços diferentes:</br>
     * (0000000000001=Gasolina) contem 13 caracteres</br>
     * (00000000000001=Gasolina) contem 14 caracteres.</br>
     * OBS: Códigos de produtos/serviços excluídos</br>
     * não devem ser utilizados para novos produtos/serviços.</br>
     */
    public static final String CODIGO_PRODUTO_SERVICO = "CODIGO_PRODUTO_SERVICO";
    /**
     * 03 - Tipo X Tamanho 60</br>
     * DESCRIÇÃO DO PRODUTO/SERVIÇO - Informe a descrição do produto ou serviço.</br>
     * Campo obrigatório.</br>
     */
    public static final String DESCRICAO = "DESCRICAO";
    /**
     * <br>04 - Tipo D Tamanho 8</br>
     * <br>DATA DA INCLUSÃO DO PRODUTO/SERVIÇO</br>
     * <br>Informe a Data de Inclusão no formato AAAAMMDD</br>
     * <br>dos dados do produto/serviço no cadastro.</br>
     * <br>Campo obrigatório.</br>
     */
    public static final String DATA_INCLUSAO = "DATA_INCLUSAO";
    /**
     * 05 - Tipo D Tamanho 8</br>
     * DATA DA ALTERAÇÃO CADASTRAL NA DESCRIÇÃO</br>
     * Informe este campo "APENAS" quando</br>
     * o cadastro do produto/serviço sofreu alteração "EM SUA DESCRIÇÃO"</br>
     * caso contrário, não preencher este campo.</br>
     * Neste caso, verifique a data da primeira NF</br>
     * recebida ou emitida com a nova descrição</br>
     * e informe neste campo um dia anterior a data da NF.</br>
     * Exemplo:</br>
     * O produto Refrigerante mudou a descrição para Refrigerante 600 ml.</br>
     * A primeira NF recebida com a descrição Refrigerante 600 ml</br>
     * foi em 20/04/2009, então informar neste campo 19/04/2009.</br>
     * Preencha este campo no formato AAAAMMDD.</br>
     */
    public static final String DATA_ALTERACAO_DESCRICAO = "DATA_ALTERACAO_DESCRICAO";
    /**
     * 06 - Tipo D Tamanho 8</br>
     * PERÍODO INICIAL DE UTILIZAÇÃO DO PRODUTO/SERVIÇO</br>
     * Informe a data que o produto/serviço iniciou</br>
     * as informações no formato AAAAMMDD.</br>
     * Campo obrigatório.</br>
     * Fique atento quanto as instruções no início do registro.</br>
     */
    public static final String PERIODO_INICIAL_UTILIZACAO_PRODUTO_SERVICO = "PERIODO_INICIAL_UTILIZACAO_PRODUTO_SERVICO";
    /**
     * 07 - Tipo D Tamanho 8</br>
     * PERÍODO FINAL DE UTILIZAÇÃO DO PRODUTO/SERVIÇO</br>
     * Preencha este campo apenas quando o cadastro do produto/serviço</br>
     * sofreu alterações cadastrais (independente do campo alterado)</br>
     * caso contrário, não preencher este campo.</br>
     * Informe a data que o produto/serviço finalizou</br>
     * as informações anteriores no formato AAAAMMDD.</br>
     * Quando se tratar de uma alteração ortográfica</br>
     * ou inclusão de novo cadastro, não preencher este campo.</br>
     * Fique atento quanto as instruções no início do registro.</br>
     * OBS: Quando a alteração cadastral for na descrição do produto/serviço</br>
     * (campo 05-Data da Alteração Cadastral na Descrição preenchido)</br>
     * o preenchimento deste campo é obrigatório.</br>
     */
    public static final String PERIODO_FINAL_UTILIZACAO_PRODUTO_SERVICO = "PERIODO_FINAL_UTILIZACAO_PRODUTO_SERVICO";
    /**
     * 08 - Tipo x Tamanho 14</br>
     * CÓDIGO ANTERIOR</br>
     * Informe o código que este produto/serviço</br>
     * estava cadastrado anteriormente, caso exista.</br>
     */
    public static final String CODIGO_ANTERIOR = "CODIGO_ANTERIOR";
    /**
     * 09 - Tipo A Tamanho 2</br>
     * GÊNERO DO ITEM - Informe o código do gênero do item</br>
     * conforme Tabela Códigos de Gênero do Item.</br>
     * Confome tabela de Gênero dos produtos, tabela 4.2.1 do manual:</br>
     * <a href="https://www.fazenda.sp.gov.br/sped/downloads/GUIA_PRATICO_EFD_Versao_2_0_6.pdf">GRIA_PRATICO_EFD_Versao_2_0_6.pdf</a></br>
     */
    public static final String GENERO = "GENERO";
    /**
     * 10 - Tipo A Tamanho 2</br>
     * TIPO DO PRODUTO</br>
     * Informe o código do tipo do produto</br>
     * conforme Tabela Tipos de Produtos na pagina 17 do manual :</br>
     * <a href="https://www.fazenda.sp.gov.br/sped/downloads/GUIA_PRATICO_EFD_Versao_2_0_6.pdf">GRIA_PRATICO_EFD_Versao_2_0_6.pdf</a></br>
     * Tipo do item – Atividades Industriais, Comerciais e</br>
     * Serviços:</br>
     * 00 – Mercadoria para Revenda;</br>
     * 01 – Matéria-Prima;</br>
     * 02 – Embalagem;</br>
     * 03 – Produto em Processo;</br>
     * 04 – Produto Acabado;</br>
     * 05 – Subproduto;</br>
     * 06 – Produto Intermediário;</br>
     * 07 – Material de Uso e Consumo;</br>
     * 08 – Ativo Imobilizado;</br>
     * 09 – Serviços;</br>
     * 10 – Outros insumos;</br>
     * 99 – Outras </br>
     */
    public static final String TIPO = "TIPO";
    /**
     * 11 - Tipo N Tamanho 4</br>
     * TIPO PARA O INVENTÁRIO</br>
     * Informe o código do tipo de inventário</br>
     * classificado no campo 02 do registro E017</br>
     * ou cadastrado no sistema no Menu Arquivos</br>
     * opção Inventário - Tipos.</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços</br>
     * informe zeros neste campo.</br>
     */
    public static final String TIPO_INVENTARIO = "TIPO_INVENTARIO";
    /**
     * 12 - Tipo X Tamanho 15</br>
     * NBM/SH - Informe o código da NBM/SH (classificação fiscal do
     * produto)</br>
     * no formato 9999.99.99, colocando sinal de ponto na 5a e na 8a
     * posição</br>
     * preenchendo as posições restantes com espaços.</br>
     * Caso o produto tenha EX, informe no seguinte formato:
     * 9999.99.99EX999.</br>
     * OBS: Este campo deve ser preenchido por empresas industriais ou
     * equiparadas</br>
     * mas apenas para os produtos correspondentes à atividade fim</br>
     * ou quando gerarem créditos e débitos de IPI.</br>
     * Para as demais empresas, deve ser informado para os produtos
     * importados</br>
     * exportados ou, no caso de substituição tributária,</br>
     * para os produtos sujeitos à substituição, quando houver a retenção do
     * ICMS.</br>
     * Quando o campo 10 - Tipo do Produto for 09-Serviços, este campo deve ser
     * preenchido com espaços.</br>
     * Quando o campo 10 - Tipo do Produto for um dos abaixo, este campo pode
     * ser preenchido com espaços:</br>
     * 07 - Material de Uso e Consumo 08 - Ativo Imobilizado</br>
     * 10 - Outros insumos</br>
     * 99 - Outras</br>
     */
    public static final String NBM = "NBM";
    /**
     * 13 - Tipo X Tamanho 100</br>
     * CÓDIGO DE BARRAS</br>
     * Informe o código de barra do produto.</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços</br>
     * preencha este campo com espaços.</br>
     */
    public static final String CODIGO_BARRAS = "CODIGO_BARRAS";
    /**
     * 14 - Tipo A Tamanho 1</br>
     * COMBUSTÍVEL/SOLVENTE</br>
     * Informe "S" se o produto for Combustível/Solvente</br>
     * caso contrário informe "N".</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços, informe "N".</br>
     */
    public static final String COMBUSTIVEL_SOLVENTE = "COMBUSTIVEL_SOLVENTE";
    /**
     * 15 - Tipo A Tamanho 4</br>
     * CÓDIGO SEFAZ - Se o produto for combustível/solvente</br>
     * é obrigatório a informação neste campo do código SEFAZ</br>
     * conforme Tabela de Códigos SEFAZ, caso contrário</br>
     * preencha com espaços.</br>
     * Esta informação será utilizada na geração</br>
     * do arquivo de combustíveis (GRF- CBT/SP).</br>
     */
    public static final String CODIGO_SEFAZ = "CODIGO_SEFAZ";
    /**
     * 16 - Tipo A Tamanho 9</br>
     * CÓDIGO ANP</br>
     * Se o produto for combustível, informe neste campo o código</br>
     * do combustível conforme Tabela Agência Nacional de Petróleo (ANP).</br>
     * Esta informação será utilizada na geração do arquivo EFD - Escrituração Fiscal Digital.</br>
     */
    public static final String CODIGO_ANP = "CODIGO_ANP";
    /**
     * 17 - Tipo X Tamanho 6</br>
     * CÓD.UNID.COMERCIAL</br>
     * Informe o código de unidade comercial classificado</br>
     * no campo 02 do registro E018 ou cadastrado no sistema</br>
     * no Menu Arquivos, opção Cadastros - Cadastro de Unidades de Medida.</br>
     */
    public static final String CODIGO_UNIDADE_COMERCIAL = "CODIGO_UNIDADE_COMERCIAL";
    /**
     * 18 - Tipo X Tamanho 6</br>
     * CÓD. UNID. ESTOQUE</br>
     * Informe o código de unidade de estoque classificado</br>
     * no campo 02 do registro E018 ou cadastrado no sistema</br>
     * no Menu Arquivos, opção Cadastros - Cadastro de Unidades de Medida.</br>
     * O preenchimento deste campo é obrigatório quando</br>
     * o Tipo do Produto (campo 10) é diferente de Serviços.</br>
     */
    public static final String CODIGO_UNIDADE_ESTOQUE = "CODIGO_UNIDADE_ESTOQUE";
    /**
     * 19 - Tipo N Tamanho 14</br>
     * FATOR DE CONVERSÃO</br>
     * Informe o fator utilizado para converter (multiplicar)</br>
     * a unidade a ser convertida na unidade adotada no inventário.</br>
     * Somente preencha este campo quando a informação</br>
     * do campo 18 - Cód. Unid.Estoque for diferente da informação</br>
     * do campo 17 - Cód. Unid.Comercial.</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços</br>
     * informe zeros neste campo.</br>
     */
    public static final String FATOR_CONVERSAO = "FATOR_CONVERSAO";
    /**
     * 20 - Tipo N Tamanho 3</br>
     * CÓDIGO DO PRODUTO (DNF)</br>
     * Informar este campo se a empresa entrega DNF</br>
     * e apenas se o produto for válido para DNF</br>
     * conforme tabela de produtos do Anexo I e II</br>
     * (o qual consta na TABELA DE CÓDIGOS DOS PRODUTOS PARA DNF A PARTIR DE 09/2004)</br>
     * neste caso, o preenchimento deste campo é obrigatório.</br>
     * Não sendo esta situação, informe zeros.</br>
     * Para identificar corretamente este código</br>
     * verifique primeiramente na TABELA DE GRUPOS PARA DNF A PARTIR DE 09/2004</br>
     * a qual grupo o NBM/SH do produto pertence.</br>
     * Depois verifique na TABELA DE CÓDIGOS DOS PRODUTOS PARA DNF A PARTIR DE 09/2004</br>
     * em qual código o produto se enquadra, de acordo com o grupo.</br>
     * Exemplo:</br>
     * Tabela de Grupos a partir de 09/2004:</br>
     * 01 - 3923.30.00 Garrafas...</br>
     * Tabela de Códigos dos Produtos a partir de 09/2004: 01 - 170</br>
     * grupo Código do produto</br>
     * 01- (170) Garrafas...</br>
     * OBS: Este campo deverá ser preenchido para geração da DNF a partir de 09/2004.</br>
     */
    public static final String CODIGO_PRODUTO_DNF = "CODIGO_PRODUTO_DNF";
    /**
     * 21 - Tipo N Tamanho 14,3</br>
     * FATOR DE CONV. PARA A UNID. MED. EST. (DNF)</br>
     * Informar este campo se a empresa entrega DNF</br>
     * e apenas se o produto for válido para DNF conforme tabela de produtos</br>
     * do Anexo I e II (o qual consta na TABELA DE GRUPOS PARA DNF A PARTIR DE 09/2004)</br>
     * neste caso, o preenchimento deste campo é obrigatório.</br>
     * Não sendo esta situação, informe zeros.</br>
     * Informe o Fator de Conversão da un. de med. utilizada p/ a un. estatística.</br>
     * OBS: Este campo deverá ser preenchido para geração da DNF a partir de 09/2004.</br>
     */
    public static final String FATOR_CONVERSAO_UNIDADE_MEDIDA_ESTOQUE_DNF = "FATOR_CONVERSAO_UNIDADE_MEDIDA_ESTOQUE_DNF";
    /**
     * 22 - Tipo N Tamanho 5</br>
     * CAPACIDADE VOLUMÉTRICA (ML) - (DNF)</br>
     * Este campo deve ser preenchido apenas se a empresa entrega DNF</br>
     * e se o NBM/SH for: 3923.21.10, 3923.21.90, 3923.30.00, 4811.51.22</br>
     * 4811.59.23, 7010.90.11, 7010.90.21, 7010.90.90, 7310.21.10, 7310.29.10 </br>
     * e 7612.90.19, neste caso, o preenchimento deste campo é obrigatório.</br>
     * Não sendo esta situação, informe zeros.</br>
     * Informe a capacidade volumétrica (ml) do produto.</br>
     * OBS: Este campo deverá ser preenchido para geração da DNF a partir de 09/2004.</br>
     */
    public static final String CAPACIDADE_VOLUMETRICA_DNF = "CAPACIDADE_VOLUMETRICA_DNF";
    /**
     * 23 - Tipo N Tamanho 5,2</br>
     * IPI_ALIQUOTA</br>
     * Informe a alíquota de IPI do produto.</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços</br>
     * informe zeros neste campo</br>
     */
    public static final String IPI_ALIQUOTA = "IPI_ALIQUOTA";
    /**
     * 24 - Tipo N Tamanho 5,2</br>
     * IPI_SITUACAO_TRIBUTARIA</br>
     * Informe o código da Situação Tributária referente ao IPI</br>
     * conforme Tabela da Situação Tributária do IPI.</br>
     * Quando o Tipo do Produto (campo 10) for 09-Serviços</br>
     * preencha este campo com espaços.</br>
     */
    public static final String IPI_SITUACAO_TRIBUTARIA = "IPI_SITUACAO_TRIBUTARIA";
    /**
     * 25 - Tipo X Tamanho 5</br>
     * Quando o tipo do produto (campo 10) for 09-Serviços</br>
     * informe o código do serviço conforme Tabela de Serviços da LC 116/2003</br>
     * informando ponto no código.</br>
     * Para os códigos com tamanho menor, deixar espaços à direita.</br>
     * Exemplo: 1.01</br>
     */
    public static final String SERVICOS_LC116_03 = "SERVICOS_LC_116_03";
    /**
     * 26 - Tipo X Tamanho 50</br>
     * CONTA ANALÍTICA CONTÁBIL</br>
     * Informe a conta analítica contábil do produto/serviço.</br>
     */
    public static final String CONTA_ANALITICA_CONTABIL = "CONTA_ANALITICA_CONTABIL";
    /**
     * 27 - Tipo N Tamanho 7,4</br>
     * Informe a Alíquota do ICMS aplicável</br>
     * a mercadoria ou serviço nas operações ou prestações internas.</br>
     */
    public static final String ICMS_ALIQUOTA = "ICMS_ALIQUOTA";
    /**
     * 28 - Tipo N Tamanho 7,4</br>
     * Informe a Alíquota do ICMS aplicável a mercadoria</br>
     * ou serviço nas operações ou prestações internas.</br>
     */
    public static final String ICMS_ALIQUOTA_ADICIONAL = "ICMS_ALIQUOTA_ADICIONAL";
    /**
     * 29 - Tipo FolhamatricSimNao</br>
     * ADICIONAL ALÍQ. ICMS (RJ)</br>
     * Informe "S" se a empresa for do estado do Rio de Janeiro</br>
     * e houver adicional de ICMS na alíquota referente</br>
     * ao Fundo de Combate a Pobreza, caso contrário informe "N".</br>
     */
    public static final String ICMS_ALIQUOTA_ADICIONAL_RJ = "ICMS_ALIQUOTA_ADICIONAL_RJ";
    /**
     * 30 - Tipo N Tamanho 7,4</br>
     * % RED. BASE CÁLC. ICMS</br>
     * Informe o percentual de redução na base de</br>
     * cálculo do ICMS nas operações internas.</br>
     */
    public static final String ICMS_BASE_CALCULO_REDUCAO = "ICMS_BASE_CALCULO_REDUCAO";
    /**
     * 31 - Tipo N Tamanho 14,2</br> 
     * UNIT. BASE ICMS ST</br>
     * Informe o valor unitário da base de cálculo</br>
     * do ICMS na substituição tributária.</br>
     */
    public static final String ICMS_BASE_VALOR_UNITARIO = "ICMS_BASE_VALOR_UNITARIO";
    /**
     * 32 - Tipo A Tamanho 1</br> 
     * SIT.TRIB. ICMS TAB. A - Informe o código da Situação Tributária referente ao ICMS conforme Tabela A - Situação Tributária do ICMS. Quando for CSOSN, preencher este campo com espaço.
     */
    public static final String ICMS_SITUACAO_TRIBUTARIA_TABELA_A = "ICMS_SITUACAO_TRIBUTARIA_TABELA_A";
    /**
     * 33 - Tipo A Tamanho 2</br> 
     * SIT.TRIB. ICMS TAB. B</br>
     * Informe o código da Situação Tributária referente ao ICMS</br>
     * conforme Tabela B - Situação Tributária do ICMS.</br>
     * Quando for CSOSN, preencher este campo com espaços.</br>
     */
    public static final String ICMS_SITUACAO_TRIBUTARIA_TABELA_B = "ICMS_SITUACAO_TRIBUTARIA_TABELA_B";
    /**
     * 34 - Tipo A Tamanho 2</br> 
     * SIT. TRIB. PIS</br>
     * Informe o código da Situação Tributária referente ao PIS</br>
     * conforme Tabela da Situação Tributária do PIS.</br>
     */
    public static final String PIS_SITUACAO_TRIBUTARIA = "PIS_SITUACAO_TRIBUTARIA";
    /**
     * 35 - Tipo A Tamanho 2</br> 
     * SIT. TRIB. COFINS</br>
     * Informe o código da Situação Tributária referente ao COFINS</br>
     * conforme Tabela da Situação Tributária da COFINS.</br>
     */
    public static final String COFINS_SITUACAO_TRIBUTARIA = "COFINS_SITUACAO_TRIBUTARIA";
    /**
     * 36 - Tipo A Tamanho 1</br> 
     * TIPO DE INCIDÊNCIA</br>
     * Informe “1” se o produto pertence à Incidência Cumulativa ou</br>
     * “2” se o produto pertence a Incidência Não Cumulativa de PIS/COFINS.</br>
     * Somente preencha este campo, quando sua empresa</br>
     * se tratar de Empresa Mista (cadastro da empresa</br>
     * com opção “Incidência nos Regimes Cumulativo e Não Cumulativo”</br>
     * no botão Configurações EFD PIS/COFINS).</br>
     * Caso sua empresa não se enquadre nesta condição</br>
     * preencha o campo com espaço.</br>
     */
    public static final String PIS_COFINS_TIPO_INCIDENCIA = "PIS_COFINS_TIPO_INCIDENCIA";
    /**
     * 37 - Tipo A Tamanho 3</br> 
     * TABELA (BEBIDAS FRIAS - ANEXO III)</br> 
     * Informe a tabela que ser refere o produto.</br> 
     * Somente preencha este campo, quando sua empresa</br> 
     * estiver enquadrada no Regime Especial de Apuração</br> 
     * (cadastro da empresa, com opção “Regime Especial de Apuração”</br>
     * selecionada no botão Configurações EFD PIS/COFINS).</br>
     * Caso sua empresa não se enquadre nesta condição,</br> 
     * preencha o campo com espaços.</br> 
     * Importante: A informação inserida neste campo</br> 
     * deverá existir no menu Arquivos, Tabelas “Bebidas Frias - Anexo III”.</br> 
     */
    public static final String PIS_COFINS_TABELA_BEBIDAS_FRIAS = "PIS_COFINS_TABELA_BEBIDAS_FRIAS";
    /**
     * 38 - Tipo A Tamanho 2</br> 
     * CÓDIGO DO GRUPO</br>
     * Informe o código de grupo que ser refere o produto.</br>
     * Somente preencha este campo, quando sua empresa estiver</br>
     * enquadrada no Regime Especial de Apuração</br>
     * (cadastro da empresa, com opção “Regime Especial de Apuração”</br>
     * selecionada no botão Configurações EFD PIS/COFINS).</br>
     * Se houver informação no campo 37, esse campo torna-se obrigatório.</br>
     * Caso sua empresa não se enquadre nesta condição</br>
     * preencha o campo com espaços.</br>
     * Importante: A informação inserida neste campo deverá</br>
     * existir no menu Arquivos, Tabelas “Bebidas Frias - Anexo III”.</br>
     */
    public static final String GRUPO_REGIME_ESPECIAL = "GRUPO_REGIME_ESPECIAL";
    /**
     * 39 - Tipo A Tamanho 60</br> 
     * MARCA COMERCIAL</br>
     * Informe a marca comercial que ser refere o produto.</br>
     * Somente preencha este campo, quando sua empresa</br>
     * estiver enquadrada no Regime Especial de Apuração</br>
     * (cadastro da empresa, com opção “Regime Especial de Apuração”</br>
     * selecionada no botão Configurações EFD PIS/COFINS).</br>
     * Se houver informação no campo 37, esse campo torna-se obrigatório.</br>
     * Caso sua empresa não se enquadre nesta condição,</br>
     * preencha o campo com espaços.</br>
     * Importante: A informação inserida neste campo deverá existir</br>
     * no menu Arquivos, Tabelas “Bebidas Frias - Anexo III”.</br>
     */
    public static final String MARCA = "MARCA";
    /**
     * 40 - Tipo A Tamanho 5</br> 
     * CÓDIGO SEFAZ - MG</br>
     * Para o Estado de MG, se sua empresa entrega o arquivo magnético GAM57-CBT</br>
     * para o produto combustível, é obrigatória a informação do código SEFAZ</br>
     * conforme tabela “Códigos de Combustível da SEFAZ - MG”</br>
     * caso contrário preencha este campo com espaços.</br>
     */
    public static final String CODIGO_SEFAZ_MG = "CODIGO_SEFAZ_MG";
    /**
     * 41
     * CONTROLE DO SISTEMA</br> 
     * Informe "0" (zero) para controle interno do Sistema E-Fiscal.</br> 
     */
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";

    public E020ProdutosServicos() {
        setName("Folhamatic - Produto ou Serviço");
        
        FieldDecimalFixedLengthArchetype faip = new FieldDecimalFixedLengthArchetype(7, 4);
        faip.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling('N');
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');

        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E020"));
        addFieldArchetype(CODIGO_PRODUTO_SERVICO, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(DESCRICAO, new FieldStringFixedLengthArchetype(60));

        addFieldArchetype(DATA_INCLUSAO, faa);
        addFieldArchetype(DATA_ALTERACAO_DESCRICAO, faa);
        addFieldArchetype(PERIODO_INICIAL_UTILIZACAO_PRODUTO_SERVICO, faa);
        addFieldArchetype(PERIODO_FINAL_UTILIZACAO_PRODUTO_SERVICO, faa);
        
        FieldStringFixedLengthArchetype f = new FieldStringFixedLengthArchetype(14);
        f.setAcceptNullable(true);
        addFieldArchetype(CODIGO_ANTERIOR, f);
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        f2.setAcceptNullable(true);
        
        addFieldArchetype(GENERO,f2);
        addFieldArchetype(TIPO, f2);
        addFieldArchetype(TIPO_INVENTARIO, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(NBM, new FieldStringFixedLengthArchetype(15));
        
        FieldStringFixedLengthArchetype f100 = new FieldStringFixedLengthArchetype(100);
        f100.setAcceptNullable(true);
        f100.setFullFiling(' ');
        addFieldArchetype(CODIGO_BARRAS, f100);
        addFieldArchetype(COMBUSTIVEL_SOLVENTE, fef);
        
        FieldStringFixedLengthArchetype f4 = new FieldStringFixedLengthArchetype(4);
        f4.setAcceptNullable(true);
        f4.setFullFiling(' ');
        addFieldArchetype(CODIGO_SEFAZ, f4);
        
        FieldStringFixedLengthArchetype f9 = new FieldStringFixedLengthArchetype(9);
        f9.setAcceptNullable(true);
        f9.setFullFiling(' ');
        addFieldArchetype(CODIGO_ANP, f9);
        FieldIntegerFixedLengthArchetype fi6 = new FieldIntegerFixedLengthArchetype(6);
        addFieldArchetype(CODIGO_UNIDADE_COMERCIAL, fi6);
        addFieldArchetype(CODIGO_UNIDADE_ESTOQUE, fi6);
        FieldDecimalFixedLengthArchetype fd = new FieldDecimalFixedLengthArchetype(14, 6);
        fd.setAcceptNullable(true);
        addFieldArchetype(FATOR_CONVERSAO, fd);
        
        FieldIntegerFixedLengthArchetype fi = new FieldIntegerFixedLengthArchetype(3);
        fi.setAcceptNullable(true);
        addFieldArchetype(CODIGO_PRODUTO_DNF, fi);
        
        FieldDecimalFixedLengthArchetype fca = new FieldDecimalFixedLengthArchetype(14, 3);
        fca.setAcceptNullable(true);
        addFieldArchetype(FATOR_CONVERSAO_UNIDADE_MEDIDA_ESTOQUE_DNF, fca);
        
        FieldIntegerFixedLengthArchetype fi5 = new FieldIntegerFixedLengthArchetype(5);
        fi5.setAcceptNullable(true);
        addFieldArchetype(CAPACIDADE_VOLUMETRICA_DNF, fi5);
        
        FieldDecimalFixedLengthArchetype fd52 = new FieldDecimalFixedLengthArchetype(5, 2);
        fd.setAcceptNullable(true);
        addFieldArchetype(IPI_ALIQUOTA, fd52);
        
        addFieldArchetype(IPI_SITUACAO_TRIBUTARIA, new FieldStringFixedLengthArchetype(2));
        
        FieldStringFixedLengthArchetype f5 = new FieldStringFixedLengthArchetype(5);
        f5.setAcceptNullable(true);
        addFieldArchetype(SERVICOS_LC116_03, f5);
        
        FieldStringFixedLengthArchetype f50 = new FieldStringFixedLengthArchetype(50);
        f50.setAcceptNullable(true);
        addFieldArchetype(CONTA_ANALITICA_CONTABIL, f50);
        
        addFieldArchetype(ICMS_ALIQUOTA, faip);
        addFieldArchetype(ICMS_ALIQUOTA_ADICIONAL, faip);
        addFieldArchetype(ICMS_ALIQUOTA_ADICIONAL_RJ, fef);
        addFieldArchetype(ICMS_BASE_CALCULO_REDUCAO, faip);
        
        FieldDecimalFixedLengthArchetype fd14_2 = new FieldDecimalFixedLengthArchetype(14,2);
        fd14_2.setAcceptNullable(true);
        addFieldArchetype(ICMS_BASE_VALOR_UNITARIO, fd14_2);
        
        FieldStringFixedLengthArchetype f1 = new FieldStringFixedLengthArchetype(1);
        f1.setAcceptNullable(true);
        addFieldArchetype(ICMS_SITUACAO_TRIBUTARIA_TABELA_A, f1);
        
        addFieldArchetype(ICMS_SITUACAO_TRIBUTARIA_TABELA_B, f2);
        addFieldArchetype(PIS_SITUACAO_TRIBUTARIA, f2);
        addFieldArchetype(COFINS_SITUACAO_TRIBUTARIA, f2);
        addFieldArchetype(PIS_COFINS_TIPO_INCIDENCIA, f1);
        
        FieldStringFixedLengthArchetype f3 = new FieldStringFixedLengthArchetype(3);
        f3.setAcceptNullable(true);
        addFieldArchetype(PIS_COFINS_TABELA_BEBIDAS_FRIAS, f3);
        
        addFieldArchetype(GRUPO_REGIME_ESPECIAL, f2);
        
        f = new FieldStringFixedLengthArchetype(60);
        f.setAcceptNullable(true);
        addFieldArchetype(MARCA, f);
        
        addFieldArchetype(CODIGO_SEFAZ_MG, f5);
        
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }

}
