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
        lm.setFieldValue(E020ProdutosServicos.GENERO, "86");
        lm.setFieldValue(E020ProdutosServicos.TIPO, "00");
        lm.setFieldValue(E020ProdutosServicos.TIPO_INVENTARIO, 1l);
        String ncm = "8899.88.99EX99";
        lm.setFieldValue(E020ProdutosServicos.NBM, ncm);
        lm.setFieldValue(E020ProdutosServicos.MARCA_COMERCIAL, "CHITA");
        lm.setFieldValue(E020ProdutosServicos.CODIGO_UNIDADE_ESTOQUE, 1);
        lm.setFieldValue(E020ProdutosServicos.CODIGO_UNIDADE_COMERCIAL, 1);
        lm.setFieldValue(E020ProdutosServicos.IPI_ALIQUOTA, 5d);
        lm.setFieldValue(E020ProdutosServicos.IPI_SITUACAO_TRIBUTARIA, "99");
        lm.setFieldValue(E020ProdutosServicos.ICMS_ALIQUOTA, 18d);
        lm.setFieldValue(E020ProdutosServicos.ICMS_ALIQUOTA_ADICIONAL, 0d);
        lm.setFieldValue(E020ProdutosServicos.CEST, "0199900");
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }

}