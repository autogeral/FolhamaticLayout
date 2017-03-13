package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murilo
 */
public class E200NotaFiscalTest {
    
    public E200NotaFiscalTest() {
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
        E200NotaFiscal e200 = new E200NotaFiscal();
        LineModel lm = e200.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("01/01/2017");
        
        lm.setFieldValue(E200NotaFiscal.ENTRADA_OU_SAIDA, data);
        lm.setFieldValue(E200NotaFiscal.ESPECIE_NOTA_FISCAL, "NFe");
        lm.setFieldValue(E200NotaFiscal.SERIE_NOTA_FISCAL, "01");
        
        lm.setFieldValue(E200NotaFiscal.SUBSERIE_NOTA_FISCAL, "99");
        lm.setFieldValue(E200NotaFiscal.NUMERO_INICIAL_NOTA_FISCAL, 9876543210l);
        lm.setFieldValue(E200NotaFiscal.NUMERO_FINAL_NOTA_FISCAL, 9876543210l);
        
        lm.setFieldValue(E200NotaFiscal.CODIGO_CLIENTE_FORNECEDOR, "101");        
        lm.setFieldValue(E200NotaFiscal.DATA_EMISSAO, data);
        
        data = sdf.parse("02/01/2017");
        lm.setFieldValue(E200NotaFiscal.DATA_ENTRADA_SAIDA, data);
        lm.setFieldValue(E200NotaFiscal.UF, "SP");
        lm.setFieldValue(E200NotaFiscal.MODELO, "55");
        lm.setFieldValue(E200NotaFiscal.EMITENTE, "T");
        lm.setFieldValue(E200NotaFiscal.SITUACAO, 0);
        lm.setFieldValue(E200NotaFiscal.JUSTIFICATIVA_CANCELAMENTO, null);
        lm.setFieldValue(E200NotaFiscal.HORA_EMISSAO_NOTA_FISCAL, null);
        lm.setFieldValue(E200NotaFiscal.HORA_ENTRADA_SAIDA_NOTA_FISCAL, null);
        lm.setFieldValue(E200NotaFiscal.FRETE_TIPO, 1);
        lm.setFieldValue(E200NotaFiscal.VALOR_CONTABIL, null);
        lm.setFieldValue(E200NotaFiscal.CODIGO_INTEGRACAO_CONTABIL_IMPOSTOS_RETIDOS, null);
        lm.setFieldValue(E200NotaFiscal.CODIGO_CONTA, null);
        lm.setFieldValue(E200NotaFiscal.NOTA_FISCAL_CONJUGADA, null);
        lm.setFieldValue(E200NotaFiscal.NUMERO_LINHAS_LANCAMENTO, 1);
        lm.setFieldValue(E200NotaFiscal.DATA_LANCAMENTO_SISTEMA, null);
        
        StringBuffer sb = lm.getRepresentation();
        assertNotNull(sb);
        System.out.println(sb.toString());
    }
    
}
