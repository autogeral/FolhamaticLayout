/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author lucas.bueno
 */
public class E233ValoresPisCofinsItensDaNotaParaEFDTest {
    
     public E233ValoresPisCofinsItensDaNotaParaEFDTest() {
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
    public void verificarSeEstaCorretoTamanhoDoArquivoFml() throws ParseException{
        E233ValoresPisCofinsItensDaNotaParaEFD e233 = new E233ValoresPisCofinsItensDaNotaParaEFD();
        LineModel lm = e233.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("27/09/2018");
        
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.NOME_REGISTRO, "E233");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ENTRADA_SAIDA, "E");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ESPECIE_NOTA_FISCAL, "NF-E");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.SERIE_NOTA_FISCAL, "123");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.SUBSERIE_NOTA_FISCAL, "45");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.NUMERO_NOTA_FISCAL, 1234567890);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.CODIGO_CLIENTE_FORNECEDOR, "Auto Geral");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.NUMERO_ORDEM_ITEM, 789);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.BASE_PIS, 10.40);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ALIQUOTA_PIS, 1.65);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.QUANTIDADE_BASE_PIS, 10.40);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ALIQUOTA_PIS_EM_REAIS, 1.65);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_PIS, 1.89);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.STPIS, "50");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.BASE_COFINS, 50.70);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ALIQUOTA_COFINS, 7.60);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.QUANTIDADE_BASE_COFINS, 80.45);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.ALIQUOTA_COFINS_EM_REAIS, 7.60);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_DA_COFINS, 40.50);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.STCOFINS, "50");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.DATA_APROPRIACAO, data);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_COFINS_VINCULADA_RECEITA_EXPORTACAO, 63.64);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_PIS_VINCULADO_RECEITA_TRIBUTADA_MERCADO_INTERNO, 63.64);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_PIS_VINCULADO_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO, 63.64);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_COFINS_VINCULADA_RECEITA_EXPORTACAO, 73.85);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_COFINS_VINCULADA_RECEITA_TRIBUTADA_MERCADO_INTERNO, 73.85);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.VALOR_COFINS_VINCULADA_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO, 73.85);
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.CONTA_ANALITICA_CONTABIL_PIS, " "); //preencher com espaço
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.CONTA_ANALITICA_CONTABIL_COFINS, " ");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_PIS, " ");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.DESCRICAO_COMPLEMENTAR_DO_DOCUMENTO_OPERACAO_COFINS, " ");
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.TIPO_INCIDENCIA_PIS_COFINS, " "); //espaço = nao cumulativo
        lm.setFieldValue(E233ValoresPisCofinsItensDaNotaParaEFD.NUMERO_COO, 0000000000);

        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }
    
    
}
