package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lucas.bueno
 * 10/10/2018
 */
public class E336OutrosValoresTest {

    public E336OutrosValoresTest() {
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
    public void verificarSeEstaCorretoTamanhoDoArquivoFml() throws ParseException{
        E336Outrosvalores e333 = new E336Outrosvalores();
        LineModel lm = e333.createModel();
        
        lm.setFieldValue(E336Outrosvalores.NOME_REGISTRO, "E336");
        lm.setFieldValue(E336Outrosvalores.TIPO_NOTA_FISCAL, "E");
        lm.setFieldValue(E336Outrosvalores.ESPECIE_NOTA_FISCAL, "NF-E");
        lm.setFieldValue(E336Outrosvalores.SERIE_NOTA_FISCAl, "123");
        lm.setFieldValue(E336Outrosvalores.SUBSERIE_NOTA_FISCAL, "45");
        lm.setFieldValue(E336Outrosvalores.NUMERO_NOTA_FISCAl, 1234567890);
        lm.setFieldValue(E336Outrosvalores.CODIGO_CLIENTE_FORNECEDOR, "Auto Geral");
        lm.setFieldValue(E336Outrosvalores.VALOR_TOTAL_DESCONTO, 10.50);
        lm.setFieldValue(E336Outrosvalores.ABATIMENTO_NAO_TRIBUTADO_E_NAO_COMERCIAL, 9.50);
        lm.setFieldValue(E336Outrosvalores.VALOR_FRETE, 25.50);
        lm.setFieldValue(E336Outrosvalores.VALOR_SEGURO, 15.50);
        lm.setFieldValue(E336Outrosvalores.VALOR_OUTRAS_DESPESAS_ACESSORIAS, 10.50);
        lm.setFieldValue(E336Outrosvalores.BASE_PIS, 8.50);
        lm.setFieldValue(E336Outrosvalores.ALIQUOTA_PIS, 1.65);
        lm.setFieldValue(E336Outrosvalores.VALOR_PIS, 3.50 );
        lm.setFieldValue(E336Outrosvalores.BASE_COFINS, 8.50);
        lm.setFieldValue(E336Outrosvalores.ALIQUOTA_COFINS, 7.60);
        lm.setFieldValue(E336Outrosvalores.VALOR_COFINS, 3.50);
        lm.setFieldValue(E336Outrosvalores.CI_PIS_COFINS, "12");
        //lm.setFieldValue(E336Outrosvalores.CONTROLE_SITEMA, "0");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }
}
