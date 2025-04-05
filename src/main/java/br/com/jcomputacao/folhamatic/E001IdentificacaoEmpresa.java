package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 06/01/2017 17:05:00
 * @author murilo
 */
public class E001IdentificacaoEmpresa extends LineArchetype {
    
    /**
     * 01
     * CODIGO DO BANCO - DEFAULT 353 / 008 / 033
     * POSICAO 001 003
     */
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    public static final String NUMERO_EMPRESA = "NUMERO_EMPRESA";
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
    
    
    public E001IdentificacaoEmpresa() {
        setName("Folhamatic - Identificacao da Empresa");
        
        //01
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E001"));
        addFieldArchetype(NUMERO_EMPRESA, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(VERSAO_LAYOUT, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }

}
