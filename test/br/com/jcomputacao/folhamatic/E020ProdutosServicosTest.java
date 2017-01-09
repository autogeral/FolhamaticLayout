package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 09/01/2017 12:16:58
 * @author murilo
 */
public class E020ProdutosServicosTest {

    public E020ProdutosServicosTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        E020ProdutosServicos e = new E020ProdutosServicos();
        LineModel lm = e.createModel();
        lm.setFieldValue(E020ProdutosServicos.CODIGO_PRODUTO_SERVICO, "000001A");
        lm.setFieldValue(E020ProdutosServicos.DESCRICAO, "Produto Bananinha");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }

}