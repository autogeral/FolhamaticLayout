package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.io.Serializable;

/**
 * 06/01/2017 17:05:16
 * @author murilo
 */
public class E010Cadastros extends LineArchetype {

    private static final String NOME_REGISTRO = "NOME_REGISTRO";
    private static final String CODIGO = "CODIGO_CLIENTE_FORNECEDOR";
    private static final String NOME = "NOME";
    private static final String DATA_INCLUSAO = "DATA_INCLUSAO";
    private static final String TIPO_LOGRADOURO = "TIPO_LOGRADOURO";
    private static final String LOGRADOURO = "LOGRADOURO";
    private static final String NUMERO_LOGRADOURO = "NUMERO_LOGRADOURO";
    private static final String COMPLEMENTO_LOGRADOURO = "COMPLEMENTO_LOGRADOURO";
    private static final String BAIRRO = "BAIRRO";
    private static final String ESTADO = "ESTADO";
    private static final String CIDADE = "CIDADE";
    private static final String CEP = "CEP";
    private static final String PAIS = "PAIS";
    private static final String CPF_CNPJ = "CPF_CNPJ";
    private static final String IE = "IE";
    private static final String IM = "IM";
    private static final String IS = "IS";
    private static final String CONTATO = "CONTATO";
    private static final String TELEFONE = "TELEFONE";
    private static final String FAX = "FAX";
    private static final String DATA_ALTERACAO_CADASTRAL_E_FISCAL = "DATA_ALTERACAO_CADASTRAL_E_FISCAL";
    private static final String CLIENTE = "CLIENTE";
    private static final String FORNECEDOR = "FORNECEDOR";
    private static final String PRODUTOR_RURAL = "PRODUTOR_RURAL";
    private static final String FORNECEDOR_SUBSTITO_TRIBUTARIO = "FORNECEDOR_SUBSTITO_TRIBUTARIO";
    private static final String SIMPLES_NACIONAL = "SIMPLES_NACIONAL";
    private static final String INSCRITO_MUNICIPIO = "INSCRITO_MUNICIPIO";
    private static final String EMAIL_CONTATO = "EMAIL_CONTATO";
    private static final String WEB_SITE = "WEB_SITE";
    /**
     * Hospedagem de sites e banco de dados</br>
     * Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal,</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de hospedagem de sites ou banco de dados</br>
     * para o referido cliente/Fornecedor, caso contrário informe “N”.</br>
     */
    private static final String HOSPEDAGE_SITE = "HOSPEDAGE_SITE";
    /**
     * Endereço IP do site - Preencha este campo somente se o campo 30 for igual a “S”.</br>
     * Informe o endereço de IP do site do Cliente/Fornecedor.</br>
     */
    private static final String HOSPEDAGE_SITE_ENDERECO_IP = "HOSPEDAGE_SITE_ENDERECO_IP";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String HOSPEDAGE_SITE_URL = "HOSPEDAGE_SITE_URL";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String HOSPEDAGE_SITE_INICIO_CONTRATO = "HOSPEDAGE_SITE_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String HOSPEDAGE_SITE_FINAL_CONTRATO = "HOSPEDAGE_SITE_FINAL_CONTRATO";
    /**
     * Gateway de pagamentos - Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal,</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de gateway de pagamentos para o referido cliente/Fornecedor</br>
     * caso contrário informe “N”.</br>
     */
    private static final String GATEWAY_PAGAMENTO = "GATEWAY_PAGAMENTO";
    /**
     * Preecher somente se o campo GATEWAY_PAGAMENTO for S.
     */
    private static final String GATEWAY_PAGAMENTO_INICIO_CONTRATO = "GATEWAY_PAGAMENTO_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo GATEWAY_PAGAMENTO for S.
     */
    private static final String GATEWAY_PAGAMENTO_FINAL_CONTRATO = "GATEWAY_PAGAMENTO_FINAL_CONTRATO";
    /**
     * Provimentos de soluções p/ abertura e/ou gerenciamento de lojas virtuais</br>
     * Campo a ser utilizado para período a partir de 01/2010 por empresas de São Paulo.</br>
     * Preencher com "S" se no cadastro da empresa, aba Efiscal</br>
     * o campo Arq. Digital - Port. CAT 156/2010 estiver selecionado</br>
     * e a empresa prestar serviços de provimento de soluções para abertura e/ou</br>
     * gerenciamento de lojas virtuais para o referido cliente/Fornecedor</br>
     * caso contrário informe “N”.
     */
    private static final String LOJA_VIRTUAL = "LOJA_VIRTUAL";
    /**
     * Endereço IP do site - Preencha este campo somente se o campo 30 for igual a “S”.</br>
     * Informe o endereço de IP do site do Cliente/Fornecedor.</br>
     */
    private static final String LOJA_VIRTUAL_ENDERECO_IP = "LOJA_VIRTUAL_ENDERECO_IP";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String LOJA_VIRTUAL_ENDERECO_WEB = "LOJA_VIRTUAL_ENDERECO_WEB";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String LOJA_VIRTUAL_INICIO_CONTRATO = "LOJA_VIRTUAL_INICIO_CONTRATO";
    /**
     * Preecher somente se o campo HOSPEDAGEM_SITES for S.
     */
    private static final String LOJA_VIRTUAL_FINAL_CONTRATO = "LOJA_VIRTUAL_FINAL_CONTRATO";
    
    public E010Cadastros() {
        setName("Folhamatic - Cadastros");
        
        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E001"));
        addFieldArchetype(CODIGO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(DATA_INCLUSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(TIPO_LOGRADOURO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(NUMERO_LOGRADOURO, new FieldStringFixedLengthArchetype(10));
        
    }

}
