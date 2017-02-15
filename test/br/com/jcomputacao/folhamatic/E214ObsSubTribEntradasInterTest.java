
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:51:35
 * @author DAVID.DIAS
 */
public class E214ObsSubTribEntradasInterTest {

    public E214ObsSubTribEntradasInterTest() {
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
        E214ObsSubTribEntradasInter e = new E214ObsSubTribEntradasInter();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E214ObsSubTribEntradasInter.NOME_REGISTRO, "E201");
        lm.setFieldValue(E214ObsSubTribEntradasInter.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E214ObsSubTribEntradasInter.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E214ObsSubTribEntradasInter.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E214ObsSubTribEntradasInter.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E214ObsSubTribEntradasInter.CODIGO_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E214ObsSubTribEntradasInter.BASE_CALCULO_OPERACAO_PROPRIA, 999999.99f);
        lm.setFieldValue(E214ObsSubTribEntradasInter.ICMS_ANTECIPADO, 999999.99f);
        lm.setFieldValue(E214ObsSubTribEntradasInter.BASE_CALCULO_OPERACAO_SUB_ST, 999999.99f);
        lm.setFieldValue(E214ObsSubTribEntradasInter.ICMS_ST, 999999.99f); 
        lm.setFieldValue(E214ObsSubTribEntradasInter.DATA_RECOLHIMENTO, new Date());
        lm.setFieldValue(E214ObsSubTribEntradasInter.VALOR_RECOLHIMENTO, 999999.99f); 
        lm.setFieldValue(E214ObsSubTribEntradasInter.CODIGO_RECEITA, "0123456"); 
        lm.setFieldValue(E214ObsSubTribEntradasInter.ICMS_DESTACADO_NF, 999999.99f); 
       
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
