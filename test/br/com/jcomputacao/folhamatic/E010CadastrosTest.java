/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author murilo
 */
public class E010CadastrosTest {

    public E010CadastrosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        E010Cadastros e = new E010Cadastros();
        LineModel lm = e.createModel();
        lm.setFieldValue(E010Cadastros.NOME, "J. Computacao LTDA");
        lm.setFieldValue(E010Cadastros.CODIGO, "CODIGO_CLIENTE_FORNECEDOR");
        lm.setFieldValue(E010Cadastros.DATA_INCLUSAO, new Date());
        lm.setFieldValue(E010Cadastros.TIPO_LOGRADOURO, "Rua");
        lm.setFieldValue(E010Cadastros.LOGRADOURO, "Marechal Deodoro");
        lm.setFieldValue(E010Cadastros.NUMERO_LOGRADOURO, "505");
        lm.setFieldValue(E010Cadastros.COMPLEMENTO_LOGRADOURO, "Apto 132");
        lm.setFieldValue(E010Cadastros.BAIRRO, "BAIRRO");
        lm.setFieldValue(E010Cadastros.ESTADO, "ESTADO");
        lm.setFieldValue(E010Cadastros.CIDADE_IBGE, 1111);
        lm.setFieldValue(E010Cadastros.CEP, 13300110);
        lm.setFieldValue(E010Cadastros.PAIS, 1038);
        lm.setFieldValue(E010Cadastros.CPF_CNPJ, "09.346.052/0001-99");
        lm.setFieldValue(E010Cadastros.IE, "IE");
        lm.setFieldValue(E010Cadastros.IM, "IM");
        lm.setFieldValue(E010Cadastros.INSCRICAO_SUFRAMA, "INSCRICAO_SUFRAMA");
        lm.setFieldValue(E010Cadastros.CONTATO, "CONTATO");
        lm.setFieldValue(E010Cadastros.TELEFONE, "TELEFONE");
        lm.setFieldValue(E010Cadastros.FAX, "FAX");
        //lm.setFieldValue(E010Cadastros.DATA_ALTERACAO_CADASTRAL_E_FISCAL, "DATA_ALTERACAO_CADASTRAL_E_FISCAL");
        lm.setFieldValue(E010Cadastros.CLIENTE, "CLIENTE");
        lm.setFieldValue(E010Cadastros.FORNECEDOR, "FORNECEDOR");
        lm.setFieldValue(E010Cadastros.PRODUTOR_RURAL, "PRODUTOR_RURAL");
        lm.setFieldValue(E010Cadastros.FORNECEDOR_SUBSTITO_TRIBUTARIO, "FORNECEDOR_SUBSTITO_TRIBUTARIO");
        lm.setFieldValue(E010Cadastros.SIMPLES_NACIONAL, "SIMPLES_NACIONAL");
        lm.setFieldValue(E010Cadastros.INSCRITO_MUNICIPIO, "INSCRITO_MUNICIPIO");
        lm.setFieldValue(E010Cadastros.EMAIL_CONTATO, "EMAIL_CONTATO");
        lm.setFieldValue(E010Cadastros.WEB_SITE, "WEB_SITE");
        lm.setFieldValue(E010Cadastros.HOSPEDAGE_SITE, "HOSPEDAGE_SITE");
        lm.setFieldValue(E010Cadastros.HOSPEDAGE_SITE_ENDERECO_IP, "HOSPEDAGE_SITE_ENDERECO_IP");
        lm.setFieldValue(E010Cadastros.HOSPEDAGE_SITE_URL, "HOSPEDAGE_SITE_URL");
//        lm.setFieldValue(E010Cadastros.HOSPEDAGE_SITE_INICIO_CONTRATO, "HOSPEDAGE_SITE_INICIO_CONTRATO");
//        lm.setFieldValue(E010Cadastros.HOSPEDAGE_SITE_FINAL_CONTRATO, "HOSPEDAGE_SITE_FINAL_CONTRATO");
        lm.setFieldValue(E010Cadastros.GATEWAY_PAGAMENTO, "GATEWAY_PAGAMENTO");
//        lm.setFieldValue(E010Cadastros.GATEWAY_PAGAMENTO_INICIO_CONTRATO, "GATEWAY_PAGAMENTO_INICIO_CONTRATO");
//        lm.setFieldValue(E010Cadastros.GATEWAY_PAGAMENTO_FINAL_CONTRATO, "GATEWAY_PAGAMENTO_FINAL_CONTRATO");
        lm.setFieldValue(E010Cadastros.LOJA_VIRTUAL, "LOJA_VIRTUAL");
        lm.setFieldValue(E010Cadastros.LOJA_VIRTUAL_ENDERECO_IP, "LOJA_VIRTUAL_ENDERECO_IP");
        lm.setFieldValue(E010Cadastros.LOJA_VIRTUAL_ENDERECO_WEB, "LOJA_VIRTUAL_ENDERECO_WEB");
//        lm.setFieldValue(E010Cadastros.LOJA_VIRTUAL_INICIO_CONTRATO, "LOJA_VIRTUAL_INICIO_CONTRATO");
//        lm.setFieldValue(E010Cadastros.LOJA_VIRTUAL_FINAL_CONTRATO, "LOJA_VIRTUAL_FINAL_CONTRATO");

        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }

}
