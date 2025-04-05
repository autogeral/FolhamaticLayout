package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/01/2017 17:05:29
 * @author murilo
 */
public class E018Unidades extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    public static final String CODIGO = "CODIGO";
    public static final String DESCRICAO = "DESCRICAO";
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
    
    public E018Unidades() {
        setName("Folhamatic - Unidades de medida");
        
        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E018"));
        addFieldArchetype(CODIGO, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(DESCRICAO, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }

}
