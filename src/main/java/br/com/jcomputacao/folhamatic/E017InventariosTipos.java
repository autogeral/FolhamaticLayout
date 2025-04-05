package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/01/2017 21:13:11
 * @author murilo
 */
public class E017InventariosTipos extends LineArchetype {
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    public static final String CODIGO = "CODIGO";
    public static final String DESCRICAO = "DESCRICAO";
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
    
    public E017InventariosTipos() {
        setName("Folhamatic - Tipos de inventários");

        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E017"));
        addFieldArchetype(CODIGO, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(DESCRICAO, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }

}
