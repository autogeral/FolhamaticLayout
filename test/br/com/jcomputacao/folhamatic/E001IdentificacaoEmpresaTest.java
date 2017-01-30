package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 06/01/2017 21:53:07
 * @author murilo
 */
public class E001IdentificacaoEmpresaTest {

    public E001IdentificacaoEmpresaTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        System.setProperty("fileGenerator.debug", "true");
        E001IdentificacaoEmpresa e = new E001IdentificacaoEmpresa();
        LineModel lm = e.createModel();
        lm.setFieldValue(E001IdentificacaoEmpresa.NUMERO_EMPRESA, 1l);
        lm.setFieldValue(E001IdentificacaoEmpresa.VERSAO_LAYOUT, "2.0.06");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        assertTrue(line.length() == 15);
        
    }

}