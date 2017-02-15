
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:48:58
 * @author DAVID.DIAS
 */
public class E212CreditoEstPisCofinsAutomaticoTest {

      public E212CreditoEstPisCofinsAutomaticoTest() {
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
        E212CreditoEstPisCofinsAutomatico e = new E212CreditoEstPisCofinsAutomatico();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.NOME_REGISTRO, "E201");
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.ENTRADA_SAIDA, "E"); 
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.N_LINHA_LANCAMENTO, 02);
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.CREDITO_DESCONTO_ESTORNO_PIS_COFINS, 999999.99f);
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.ALIQUOTA_CRED_DESCONTO_EST_PIS, 999.9999f);
        lm.setFieldValue(E212CreditoEstPisCofinsAutomatico.ALIQUOTA_CRED_DESCONTO_EST_COFINS, 999.9999f); 
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
