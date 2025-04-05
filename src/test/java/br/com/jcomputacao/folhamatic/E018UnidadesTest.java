package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 08/01/2017 20:40:10
 * @author murilo
 */
public class E018UnidadesTest {

    public E018UnidadesTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        E018Unidades e = new E018Unidades();
        LineModel lm = e.createModel();
        lm.setFieldValue(E018Unidades.CODIGO, 1l);
        lm.setFieldValue(E018Unidades.DESCRICAO, "UNIDADE");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }

}