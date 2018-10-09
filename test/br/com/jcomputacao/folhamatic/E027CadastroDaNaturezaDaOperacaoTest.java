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
public class E027CadastroDaNaturezaDaOperacaoTest {

    public E027CadastroDaNaturezaDaOperacaoTest() {
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
        
        E027CadastroDaNaturezaDaOperacao e027 = new E027CadastroDaNaturezaDaOperacao();
        LineModel lm =  e027.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("01/10/2018");
        
        lm.setFieldValue(E027CadastroDaNaturezaDaOperacao.NOME_REGISTRO, "E027");
        lm.setFieldValue(E027CadastroDaNaturezaDaOperacao.CODIGO_NATUREZA_OPERACAO, "1234567890");
        lm.setFieldValue(E027CadastroDaNaturezaDaOperacao.DESCRICAO_CODIGO_NATUREZA_OPERACAO, " ");
        lm.setFieldValue(E027CadastroDaNaturezaDaOperacao.DATA_INCLUSAO_ALTERACAO, data);
        lm.setFieldValue(E027CadastroDaNaturezaDaOperacao.CONTROLE_SISTEMA, "0");
        
        String line = lm.getRepresentation().toString();
        System.out.println("\"" + line + "\"");
    }
}
