package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/01/2017 17:05:16
 * @author murilo
 */
public class E010Cadastros extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    public static final String CODIGO = "CODIGO_CLIENTE_FORNECEDOR";
    public static final String NOME = "NOME";
    public static final String DATA_INCLUSAO = "DATA_INCLUSAO";
    public static final String TIPO_LOGRADOURO = "TIPO_LOGRADOURO";
    public static final String LOGRADOURO = "LOGRADOURO";
    public static final String NUMERO_LOGRADOURO = "NUMERO_LOGRADOURO";
    public static final String COMPLEMENTO_LOGRADOURO = "COMPLEMENTO_LOGRADOURO";
    public static final String BAIRRO = "BAIRRO";
    public static final String ESTADO = "ESTADO";
    /**
     * O codigo da cidade pelo IBGE
     * Campo 11 posicoes de 340 a 346
     */
    public static final String CIDADE_IBGE = "CIDADE_IBGE";
    public static final String CEP = "CEP";
    public static final String PAIS = "PAIS";
    /**
     * CNPJ/CPF - Informe o CNPJ/CPF do cliente/fornecedor.</br>
     * No caso de informação de CPF deixar espaços à direita até o complemento do tamanho.</br>
     * OBS.: Para CPF, a quantidade mínima de números é 11.</br>
     * Este campo não será obrigatório quando o campo país for diferente de Brasil</br>
     * caso contrário será obrigatório.</br>
     * Não poderá existir CNPJ/CPF duplicado, mesmo que o código do cliente/fornecedor seja diferente.</br>
     */
    public static final String CPF_CNPJ = "CPF_CNPJ";
    public static final String IE = "IE";
    public static final String IM = "IM";
    public static final String INSCRICAO_SUFRAMA = "INSCRICAO_SUFRAMA";
    public static final String CONTATO = "CONTATO";
    public static final String TELEFONE = "TELEFONE";
    public static final String FAX = "FAX";
    /**
     * DATA DA ALTERAÇÃO CADASTRAL NO SISTEMA E-FISCAL</br>
     * Informe este campo apenas quando o cadastro do cliente/fornecedor</br>
     * sofreu alterações cadastrais (ex: mudou de endereço).</br>
     * Neste caso, preencha com a data em que o cadastro foi alterado.</br>
     * Quando se tratar de uma alteração ortográfica ou inclusão de novo cadastro</br>
     * não preencher este campo.</br>
     * Fique atento quanto as instruções no início do registro.</br>
     */
    public static final String DATA_ALTERACAO_CADASTRAL_E_FISCAL = "DATA_ALTERACAO_CADASTRAL_E_FISCAL";
    public static final String CLIENTE = "CLIENTE";
    public static final String FORNECEDOR = "FORNECEDOR";
    public static final String PRODUTOR_RURAL = "PRODUTOR_RURAL";
    public static final String FORNECEDOR_SUBSTITO_TRIBUTARIO = "FORNECEDOR_SUBSTITO_TRIBUTARIO";
    public static final String SIMPLES_NACIONAL = "SIMPLES_NACIONAL";
    public static final String INSCRITO_MUNICIPIO = "INSCRITO_MUNICIPIO";
    public static final String EMAIL_CONTATO = "EMAIL_CONTATO";
    public static final String WEB_SITE = "WEB_SITE";
    /**
     * Hospedagem de sites e banco de dados</br>
     * Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal,</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de hospedagem de sites ou banco de dados</br>
     * para o referido cliente/Fornecedor, caso contrário informe “N”.</br>
     */
    public static final String HOSPEDAGE_SITE = "HOSPEDAGE_SITE";
    /**
     * Endereço IP do site - Preencha este campo somente se o campo 30 for igual a “S”.</br>
     * Informe o endereço de IP do site do Cliente/Fornecedor.</br>
     */
    public static final String HOSPEDAGE_SITE_ENDERECO_IP = "HOSPEDAGE_SITE_ENDERECO_IP";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String HOSPEDAGE_SITE_URL = "HOSPEDAGE_SITE_URL";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String HOSPEDAGE_SITE_INICIO_CONTRATO = "HOSPEDAGE_SITE_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String HOSPEDAGE_SITE_FINAL_CONTRATO = "HOSPEDAGE_SITE_FINAL_CONTRATO";
    /**
     * Gateway de pagamentos - Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal,</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de gateway de pagamentos para o referido cliente/Fornecedor</br>
     * caso contrário informe “N”.</br>
     */
    public static final String GATEWAY_PAGAMENTO = "GATEWAY_PAGAMENTO";
    /**
     * Preecher somente se o campo GATEWAY_PAGAMENTO for S.
     */
    public static final String GATEWAY_PAGAMENTO_INICIO_CONTRATO = "GATEWAY_PAGAMENTO_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo GATEWAY_PAGAMENTO for S.
     */
    public static final String GATEWAY_PAGAMENTO_FINAL_CONTRATO = "GATEWAY_PAGAMENTO_FINAL_CONTRATO";
    /**
     * Provimentos de soluções p/ abertura e/ou gerenciamento de lojas virtuais</br>
     * Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de provimento de soluções para abertura e/ou</br>
     * gerenciamento de lojas virtuais para o referido cliente/Fornecedor</br>
     * caso contrário informe “N”.
     */
    public static final String LOJA_VIRTUAL = "LOJA_VIRTUAL";
    /**
     * Endereço IP do site - Preencha este campo somente se o campo 30 for igual a “S”.</br>
     * Informe o endereço de IP do site do Cliente/Fornecedor.</br>
     */
    public static final String LOJA_VIRTUAL_ENDERECO_IP = "LOJA_VIRTUAL_ENDERECO_IP";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String LOJA_VIRTUAL_ENDERECO_WEB = "LOJA_VIRTUAL_ENDERECO_WEB";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String LOJA_VIRTUAL_INICIO_CONTRATO = "LOJA_VIRTUAL_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    public static final String LOJA_VIRTUAL_FINAL_CONTRATO = "LOJA_VIRTUAL_FINAL_CONTRATO";
    
    public E010Cadastros() {
        setName("Folhamatic - Cadastros");
        
        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E001"));
        addFieldArchetype(CODIGO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        addFieldArchetype(DATA_INCLUSAO, faa);
        addFieldArchetype(TIPO_LOGRADOURO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(NUMERO_LOGRADOURO, new FieldStringFixedLengthArchetype(10));
        
        addFieldArchetype(COMPLEMENTO_LOGRADOURO, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(ESTADO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CIDADE_IBGE, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(PAIS, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CPF_CNPJ, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(IE, new FieldStringFixedLengthArchetype(18));
        addFieldArchetype(IM, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(INSCRICAO_SUFRAMA, new FieldStringFixedLengthArchetype(9));
        addFieldArchetype(CONTATO, new FieldStringFixedLengthArchetype(35));
        addFieldArchetype(TELEFONE, new FieldStringFixedLengthArchetype(16));
        addFieldArchetype(FAX, new FieldStringFixedLengthArchetype(16));
        addFieldArchetype(DATA_ALTERACAO_CADASTRAL_E_FISCAL, faa);
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling('N');
        //fef.setNullableRepresentation("00");
        addFieldArchetype(CLIENTE, fef);
        addFieldArchetype(FORNECEDOR, fef);
        addFieldArchetype(PRODUTOR_RURAL, fef);
        addFieldArchetype(FORNECEDOR_SUBSTITO_TRIBUTARIO, fef);
        addFieldArchetype(SIMPLES_NACIONAL, fef);
        addFieldArchetype(INSCRITO_MUNICIPIO, fef);
        addFieldArchetype(EMAIL_CONTATO, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(WEB_SITE, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(HOSPEDAGE_SITE, fef);
        addFieldArchetype(HOSPEDAGE_SITE_ENDERECO_IP, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(HOSPEDAGE_SITE_URL, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(HOSPEDAGE_SITE_INICIO_CONTRATO, faa);
        addFieldArchetype(HOSPEDAGE_SITE_FINAL_CONTRATO, faa);
        addFieldArchetype(GATEWAY_PAGAMENTO, fef);
        addFieldArchetype(GATEWAY_PAGAMENTO_INICIO_CONTRATO, faa);
        addFieldArchetype(GATEWAY_PAGAMENTO_FINAL_CONTRATO, faa);
        addFieldArchetype(LOJA_VIRTUAL, fef);
        addFieldArchetype(LOJA_VIRTUAL_ENDERECO_IP, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(LOJA_VIRTUAL_ENDERECO_WEB, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(LOJA_VIRTUAL_INICIO_CONTRATO, faa);
        addFieldArchetype(LOJA_VIRTUAL_FINAL_CONTRATO, faa);
    }

}
