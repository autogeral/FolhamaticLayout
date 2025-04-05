
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:55:23
 * @author DAVID.DIAS
 */
public class E216IrrfSeguroSocialImpostoRetidoNfEntradasTest {

    
    public E216IrrfSeguroSocialImpostoRetidoNfEntradasTest() {
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
        E216IrrfSeguroSocialImpostoRetidoNfEntradas e = new E216IrrfSeguroSocialImpostoRetidoNfEntradas();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.NOME_REGISTRO, "E201");
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.CODIGO_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.BASE_CALCULO_IRRF, 999999.99f);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ALIQUOTA_IRRF, 99.99f);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.IRRF, 999999.99f);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.BASE_CALCULO_SEGURO_SOCIAL, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.SEGURO_SOCIAL, 999999.99f);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.BASE_SEGURO_SOCIAL_S_PROD_RURAL_SR, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ALIQUOTA_SEGURO_SOC_S_PROD_RURAL_SR, 999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.SEGURO_SOCIAL_S_PRODUCAO_SR, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.BASE_CALCULO_RETENCAO, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ALIQUOTA_PIS, 99.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.PIS, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ALIQUOTA_COFINS, 99.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.COFINS, 999999.99f); 
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.ALIQUOTA_CSLL, 99.99f);
        lm.setFieldValue(E216IrrfSeguroSocialImpostoRetidoNfEntradas.CSLL, 999999.99f); 
        
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
