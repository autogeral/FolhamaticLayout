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
public class E342ChaveDasNotasFiscaisTest {

    public E342ChaveDasNotasFiscaisTest() {
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
    public void verificarSeEstaCorretoTamanhoDoArquivoFml() throws ParseException {
        E342ChaveDasNotasFiscais e342 = new E342ChaveDasNotasFiscais();
        LineModel lm = e342.createModel();
        
        lm.setFieldValue(E342ChaveDasNotasFiscais.NOME_REGISTRO, "E342");
        lm.setFieldValue(E342ChaveDasNotasFiscais.ENTRADAS_OU_SAIDAS, "E");
        lm.setFieldValue(E342ChaveDasNotasFiscais.ESPECIE_NOTA_FISCAL, "NF-E");
        lm.setFieldValue(E342ChaveDasNotasFiscais.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E342ChaveDasNotasFiscais.SUBSERIE_NOTA_FISCAL, "45");
        lm.setFieldValue(E342ChaveDasNotasFiscais.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E342ChaveDasNotasFiscais.CODIGO_CLIENTE_FORNECEDOR, "Auto Geral");
        lm.setFieldValue(E342ChaveDasNotasFiscais.CHAVE_NOTA_FISCAL, "354451518616189416165165165165");
        lm.setFieldValue(E342ChaveDasNotasFiscais.TIPO_CTE, "C");
        lm.setFieldValue(E342ChaveDasNotasFiscais.CHAVE_CTE_REFERENCIA, "999999999999999999999999999");
        lm.setFieldValue(E342ChaveDasNotasFiscais.CONTROLE_SITEMA, "0");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }

}
