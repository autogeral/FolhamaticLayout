/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author guilherme.martins
 */
public class E338ContaEnergiaEletricaTest {
    
    public E338ContaEnergiaEletricaTest() {
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
     public void testSomeMethod() throws ParseException {
         E338ContaEnergiaEletrica e338 = new E338ContaEnergiaEletrica();
         LineModel lm = e338.createModel();
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("01/01/2017");
        
        lm.setFieldValue(E338ContaEnergiaEletrica.TIPO_NOTA_FISCAL, " ");
        lm.setFieldValue(E338ContaEnergiaEletrica.ESPECIE_NOTA_FISCAL, "NFCEE");
        lm.setFieldValue(E338ContaEnergiaEletrica.SERIE_NOTA_FISCAL, " C ");
        
        lm.setFieldValue(E338ContaEnergiaEletrica.SUBSERIE_NOTA_FISCAL, "  ");
        lm.setFieldValue(E338ContaEnergiaEletrica.NUMERO_NOTA_FISCAL, 987654321);
        lm.setFieldValue(E338ContaEnergiaEletrica.CODIGO_CLIENTE, "   ");
        lm.setFieldValue(E338ContaEnergiaEletrica.TIPO_NOTA, null);
        
        lm.setFieldValue(E338ContaEnergiaEletrica.CODIGO_CLASSE_CONSUMO, null);
        lm.setFieldValue(E338ContaEnergiaEletrica.VALOR_TOTAL_FORNECIDO_CONSUMIDO,     987654321);
        lm.setFieldValue(E338ContaEnergiaEletrica.SERVICO_NAO_TRIBUTADOS_ICMS,     987654321);
        lm.setFieldValue(E338ContaEnergiaEletrica.VALOR_TOTAL_COBRADO_NOME_TERCEIRO,     987654321);
        lm.setFieldValue(E338ContaEnergiaEletrica.DOCUMENTO_ABRANGIDO_CONVENIO_ICMS, " ");
        lm.setFieldValue(E338ContaEnergiaEletrica.MUNICIPIO_PONTOS_CONSUMO, 654321);
         
        lm.setFieldValue(E338ContaEnergiaEletrica.CONSUMO_TOTAL_KWH,    987654321);
        lm.setFieldValue(E338ContaEnergiaEletrica.NOME_ARQUIVO_MESTRE, "                                 ");
        lm.setFieldValue(E338ContaEnergiaEletrica.CHAVE_ARQUIVO_MESTRE, "                                ");
        lm.setFieldValue(E338ContaEnergiaEletrica.CODIGO_TIPO_LIGACAO, " ");
        lm.setFieldValue(E338ContaEnergiaEletrica.CODIGO_GRUPO_TENSAO, "  ");
        lm.setFieldValue(E338ContaEnergiaEletrica.CONTROLE_SISTEMA, "0");
        
        StringBuffer sb = lm.getRepresentation();
        assertNotNull(sb);
        System.out.println(sb.toString());
        
     }
}
