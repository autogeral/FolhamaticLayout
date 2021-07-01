package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro importará informações para o lançamento das notas fiscais de
 * saídas, botão Dados Transporte - Itens da NF de Transporte, portanto, ao
 * importar este registro as notas fiscais de saídas nele mencionadas já deverão
 * estar lançadas no sistema ou constando nos Registros E200 e E201.  
 * Este registro tem por objetivo informar os itens das notas fiscais de
 * serviços de transporte para fins de geração da EFD - Escrituração Fiscal
 * Digital.  
 * 
 * Gere este registro para notas fiscais de transporte modelo 07.  
 * OBS. Poderão existir vários registros E305 por nota fiscal.
 *
 * @author robson.costa
 */
public class E305DadosTransporteItensDaNFTransporte extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";

    public static final String ESPECIE_NF = "ESPECIE_NF";
    public static final String SERIE_NF = "SERIE_NF";
    public static final String SUBSERIE_NF = "SUBSERIE_NF";
    public static final String NUMERO_NF = "NUMERO_NF";
    public static final String CODIGO_DO_CLIENTE = "CODIGO_DO_CLIENTE";

    public static final String NUM_ITEM = "NUM_ITEM";
    
    public static final String CODIGO_DO_PRODUTO = "CODIGO_DO_PRODUTO";
    public static final String VALOR_DO_SERVICO = "VALOR_DO_SERVICO";
    public static final String OUTROS_VALORES = "OUTROS_VALORES";

    public E305DadosTransporteItensDaNFTransporte() {
        setName("Folhamatica - E305 DADOS DO TRANSPORTE - ITENS DA NOTA FISCAL DE TRANSPORTE");

        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldDecimalFixedLengthArchetype faip084 = new FieldDecimalFixedLengthArchetype(8, 4);
        faip084.setAcceptNullable(true);

        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);

        FieldDecimalFixedLengthArchetype faip140 = new FieldDecimalFixedLengthArchetype(14, 0);
        faip140.setAcceptNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E305"));

        addFieldArchetype(ESPECIE_NF, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NF, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NF, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_DO_CLIENTE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUM_ITEM, new FieldIntegerFixedLengthArchetype(3));
        
        addFieldArchetype(CODIGO_DO_PRODUTO, faip140);
        addFieldArchetype(VALOR_DO_SERVICO, faip142);
        
        addFieldArchetype(OUTROS_VALORES, faip140);
    }
    
    
}
