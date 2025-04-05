package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author murilo
 */
public class E017InventariosTiposTest {
    
    public E017InventariosTiposTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testSomeMethod() {
        E017InventariosTipos e = new E017InventariosTipos();
        LineModel lm = e.createModel();
        lm.setFieldValue(E018Unidades.CODIGO, 1l);
        lm.setFieldValue(E018Unidades.DESCRICAO, "MERCADORIAS");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }
    
}
