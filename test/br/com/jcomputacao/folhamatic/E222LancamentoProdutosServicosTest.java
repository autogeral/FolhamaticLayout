
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 15/02/2017 13:12:10
 * @author DAVID.DIAS
 */
public class E222LancamentoProdutosServicosTest {

    
    public E222LancamentoProdutosServicosTest() {
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
        E222LancamentoProdutosServicos e = new E222LancamentoProdutosServicos();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E222LancamentoProdutosServicos.NOME_REGISTRO, "E201");
        lm.setFieldValue(E222LancamentoProdutosServicos.ENTRADA_SAIDA, "E"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E222LancamentoProdutosServicos.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E222LancamentoProdutosServicos.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E222LancamentoProdutosServicos.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E222LancamentoProdutosServicos.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E222LancamentoProdutosServicos.N_ITEM, 123);
        lm.setFieldValue(E222LancamentoProdutosServicos.CFOP, "1000");
        lm.setFieldValue(E222LancamentoProdutosServicos.CODIGO_PRODUTO_SERVICO, "0234423321");
        lm.setFieldValue(E222LancamentoProdutosServicos.ALIQUOTA_ICMS, 444.4444); 
        lm.setFieldValue(E222LancamentoProdutosServicos.QUANTIDADE, 143.43585f);
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_MERCADORIA_SERVICO, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_DESCONTO, 999999.99f);
        
        lm.setFieldValue(E222LancamentoProdutosServicos.BASE_CALCULO_ICMS, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.BASE_SUBSTITUICAO_TRIBUTARIA, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_IPI, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_UNITARIO, 999999.9999f);
        lm.setFieldValue(E222LancamentoProdutosServicos.NUMERO_DI_DSI, 999999);
        lm.setFieldValue(E222LancamentoProdutosServicos.BC_IPI, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_ICMS, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ISENTOS_ICMS, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.OUTROS_ICMS, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.N_COO, 999999); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ICMS_ST, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.MOVIMENTACAO_FISICA_MERCADORIA, "S");
        lm.setFieldValue(E222LancamentoProdutosServicos.ISENTOS_IPI, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ISENTOS_IPI, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.BASE_ST_ORIGEM_DESTINO, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ICMS_ST_A_REPASSAR, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.ICMS_ST_A_COMPLEMENTAR, 999999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.ITEM_CANCELADO, "N");
        lm.setFieldValue(E222LancamentoProdutosServicos.OPERA_MERC_SUJEITA_REGUIME_ST_SAIDA, "N");
        lm.setFieldValue(E222LancamentoProdutosServicos.ISS, "N");
        lm.setFieldValue(E222LancamentoProdutosServicos.CODIGO_UNIDADE_COMERCIAL, "SDJFN"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.CODIGO_NATUREZA_OPERACAO, "234EJIFFG"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.DESCRICAO_COMPLEMENTAR_PRODUTO, "DESCRICAO_COMPLEMENTAR_PRODUTODESCRICAO_COMPLEMENTAR_PRODUTO");
        lm.setFieldValue(E222LancamentoProdutosServicos.FATOR_CONVERSAO, 999999.99999f);
        lm.setFieldValue(E222LancamentoProdutosServicos.ALIQUOTA_ICMS_ST, 9999.99f);
        lm.setFieldValue(E222LancamentoProdutosServicos.ST_ICMS_TABELA_A, "07");
        lm.setFieldValue(E222LancamentoProdutosServicos.ST_ICMS_TABELA_B, "27");
        lm.setFieldValue(E222LancamentoProdutosServicos.ST_IPI, "01");
        lm.setFieldValue(E222LancamentoProdutosServicos.APURACAO_DISTINTA_IPI, "M");
        lm.setFieldValue(E222LancamentoProdutosServicos.CODIGO_CONTA, "999999.999999"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.FRETE, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.FRETE_TOTAL_NOTA_FISCAL, "S"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.SEGURO, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.SEGURO_TOTAL_NOTA_FISCAL, "S"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.DESPESA_ACESSORIA, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.DESPESA_ACESSORIA_TOTAL_NOTA_FISCAL, "S"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.ACRESCIMO, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.REDUCAO_BASE_CALCULO_ICMS, 999.9999f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.VALOR_NAO_TRIBUTADO, 999999.99f); 
        
        lm.setFieldValue(E222LancamentoProdutosServicos.QUANTIDADE_CANCELADA, 999999.999f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.BASE_ICMS_REDUZIDA, 999999.99f); 
        lm.setFieldValue(E222LancamentoProdutosServicos.DADOS_REDF, 4); 
        lm.setFieldValue(E222LancamentoProdutosServicos.NUMERO_TOTALIZADOR, "A1"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.DESCONTO_INCONDICIONAL, "N"); 
        lm.setFieldValue(E222LancamentoProdutosServicos.CSONS, "ABC");
        
        lm.setFieldValue(E222LancamentoProdutosServicos.CONTROLE_SISTEMA, 0);
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
