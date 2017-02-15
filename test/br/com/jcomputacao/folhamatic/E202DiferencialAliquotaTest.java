
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static br.com.jcomputacao.folhamatic.E202DiferencialAliquota.N_LINHA_LANCAMENTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:39:55
 * @author DAVID.DIAS
 */
public class E202DiferencialAliquotaTest {

    public E202DiferencialAliquotaTest() {
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
        E202DiferencialAliquota e = new E202DiferencialAliquota();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E202DiferencialAliquota.NOME_REGISTRO, "E202");
        lm.setFieldValue(E202DiferencialAliquota.ENTRADA_SAIDA, "E"); 
        lm.setFieldValue(E202DiferencialAliquota.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E202DiferencialAliquota.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E202DiferencialAliquota.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E202DiferencialAliquota.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E202DiferencialAliquota.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E202DiferencialAliquota.N_LINHA_LANCAMENTO, 02);
        lm.setFieldValue(E202DiferencialAliquota.BASE_CALCULO,999999.99f);
        lm.setFieldValue(E202DiferencialAliquota.ALIQUOTA_INTERNA, 999.99f);
        lm.setFieldValue(E202DiferencialAliquota.VALOR_IMPOSTO, 999999.99f); 
        lm.setFieldValue(E202DiferencialAliquota.ICMS_A_ESTORNAR, 999999.99f);
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
}
