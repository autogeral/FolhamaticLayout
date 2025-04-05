
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 12:59:55
 * @author DAVID.DIAS
 */
public class E221ChaveLancamentoProdutosServicosTest {

    
    public E221ChaveLancamentoProdutosServicosTest() {
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
        E221ChaveLancamentoProdutosServicos e = new E221ChaveLancamentoProdutosServicos();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.NOME_REGISTRO, "E201");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ENTRADA_SAIDA, "E"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.FRETE, 999999.99f);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.SEGURO, 999999.99f);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.DESPESAS_ACESSORIAS, 999999.99f);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.QUANTIDADE_ITENS_NOTA_FISCAL, 99999); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.PIS_COFINS, 999999.99f);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.PESO_BRUTO, 999999.999f); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.PESO_LIQUIDO, 999999.999f); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.VIA_TRANSPORTE, 1); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.CODIGO_TRANSPORTADOR, "CODIGO_TRANSPORTADOR"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IDENTIFICACAO_VEICULO_PLACA_1, "IDENTIFICACAO_VEICULO_P"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IE_SUBSTITUTO_TRIBUTARIO, "IE_SUBSTITUTO_TRIBUTARIO"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.QUANTIDADE_VOLUMES, 1234); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESPECIE_VOLUMES, "ESPECIE_VOLUMES"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IE_TRANSPORTADOR, "IE_TRANSPORTADOR");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_TRANSPORTADOR, "SP"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_PLACA_VEICULO_1, "SP"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IDENTIFICACAO_VEICULO_PLACA_2, "IDENTIFICACAO_VEIC"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_PLACA_VEICULO_2, "SP"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IDENTIFICACAO_VEICULO_PLACA_3, "IDENTIFICACAO_VEIC");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_PLACA_VEICULO_3, "SP");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.LOCAL_SAIDA_MERCADORIA, 1);
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.CNPJ_CPF_SAIDA_MERCADORIA, "CNPJ_CPF_SAIDA_MERCAD");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_SAIDA_MERCADORIA, "MG");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IE_SAIDA_MERCADORIA, "IE_SAIDA_MERCADORIA"); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.LOCAL_RECEBIMENTO_MERCADORIA, 1); 
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.CNPJ_CPF_RECEBIMENTO_MERCADORIA, "CNPJ_CPF_RECEBIMENTO");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.ESTADO_RECEBIMENTO_MERCADORIA, "SP");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.IE_RECEBIMENTO_MERCADORIA, "IE_RECEBIMENTO_MERCADO");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.UF_TRANSPORTADOR, "SP");
        lm.setFieldValue(E221ChaveLancamentoProdutosServicos.CONTROLE_SISTEMA, 0);
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
