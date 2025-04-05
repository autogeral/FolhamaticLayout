
package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 14/02/2017 16:30:17
 * @author DAVID.DIAS
 */
public class E201LancamentoImpostoNotaFiscalTest {

    public E201LancamentoImpostoNotaFiscalTest() {
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
        E201LancamentoImpostoNotaFiscal e = new E201LancamentoImpostoNotaFiscal();
        LineModel lm = e.createModel();
        
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.NOME_REGISTRO, "E201");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ENTRADA_SAIDA, "E"); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ESPECIE_NOTA_FISCAL, "12345");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.SUBSERIE_NOTA_FISCAL, "12");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CODIGO_CLIENTE_FORNECEDOR, "J. Computação ltda");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CFOP, 1000);
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CI, "01");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.TIPO_PAGAMENTO, 1);
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.BC_ICMS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CODIGO_TURBO, 123);
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.REDUCAO_BASE_CALCULO_ICMS, 999.999f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ALIQUOTA_ICMS, 444.4444); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.VALOR_ICMS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ISENTOS_ICMS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.OUTRAS_ICMS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ICMS_ST, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.BASE_ST, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.BC_IPI, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CODIGO_TURBO_IPI, "4");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.VALOR_IPI, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ISENTOS_IPI, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.OUTRAS_IPI, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CONTRIBUENTE_ICMS, "S"); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.OBSERVACAO_LINHA_LANCAMENTO, "OBSERVACAO_LINHA_LANCAMENTO");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.N_SEQUENCIAL_LANCAMENTO, 01);
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.TIPO_ANTECIPACAO_TRIBUTARIA, "1");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ANULACAO_SERVICO_TRANSPORTE, "P");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.APURACOES_DISTINTAS_IPI, "M");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.VALOR_REDUZIDO_BASE_CALC_PIS_COFINS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.EXCLUIDAS, 999999.99f); 
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.VENDA_ENTREGA_FUTURA, "N");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.OPER_PREST_MERC_SUJ_REGIME_ST_SAIDA, "S");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.NUMERO_TOTALIZADOR, "2D");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ST_ICMS_TABELA_A, "07");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ST_ICMS_TABELA_B, "27");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.ST_IPI_CTIPI, "01");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CIAP_SAIDA_TRIBUTADA, "S");
        lm.setFieldValue(E201LancamentoImpostoNotaFiscal.CONTROLE_SISTEMA, "0");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
        
    }
    
}
