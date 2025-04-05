
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:45:52
 * @author DAVID.DIAS
 */
public class E207DiferencialAliquotaEC8715Test {

      public E207DiferencialAliquotaEC8715Test() {
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
        E207DiferencialAliquotaEC8715 e = new E207DiferencialAliquotaEC8715();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E207DiferencialAliquotaEC8715.NOME_REGISTRO, "E207");
        lm.setFieldValue(E207DiferencialAliquotaEC8715.TIPO_NOTA_FISCAL, "E"); 
        lm.setFieldValue(E207DiferencialAliquotaEC8715.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E207DiferencialAliquotaEC8715.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E207DiferencialAliquotaEC8715.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E207DiferencialAliquotaEC8715.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E207DiferencialAliquotaEC8715.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E207DiferencialAliquotaEC8715.VALOR_TOTAL_FCP_UF_DESTINO, 999999.99f);
        lm.setFieldValue(E207DiferencialAliquotaEC8715.VALOR_TOTAL_ICMS_UF_DESTINO_TERMINO, 999999.99f);
        lm.setFieldValue(E207DiferencialAliquotaEC8715.VALOR_TOTAL_ICMS_UF_REMET_INICIO, 999999.99f);
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
