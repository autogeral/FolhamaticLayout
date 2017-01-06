package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import java.io.Serializable;

/**
 * 06/01/2017 17:05:16
 * @author murilo
 */
public class E010Cadastros extends LineArchetype {

    private static final String NOME_REGISTRO = "NOME_REGISTRO";
    private static final String CODIGO = "CODIGO_CLIENTE_FORNECEDOR";
    private static final String NOME = "NOME";
    private static final String DATA_INCLUSAO = "DATA_INCLUSAO";
    private static final String TIPO_LOGRADOURO = "TIPO_LOGRADOURO";
    private static final String LOGRADOURO = "LOGRADOURO";
    private static final String NUMERO_LOGRADOURO = "NUMERO_LOGRADOURO";
    
    public E010Cadastros() {
        setName("Folhamatic - Identificacao da Empresa");
        
        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E001"));
        addFieldArchetype(CODIGO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(DATA_INCLUSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(TIPO_LOGRADOURO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(100));
        addFieldArchetype(NUMERO_LOGRADOURO, new FieldStringFixedLengthArchetype(10));
        
    }

}
