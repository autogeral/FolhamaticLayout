package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * Este registro importará informações para o Dados do Transporte, opção
 * Município Origem/Destino das notas fiscais de entrada. Sendo assim, as notas
 * fiscais já deverão estar lançadas no sistema ou nos registros E200 e E201.
 *
 * Estas informações serão utilizadas na geração da EFD ICMS/IPI.
 *
 * Gere este registro para notas fiscais de entrada modelo 07, 08, 8B, 09, 10,
 * 11, 26, 27, 57 e 67 de período a partir de 01/2018.
 *
 * OBS. Poderá existir apenas um registro E372 por nota fiscal
 *
 * @author robson.costa
 */
public class E372DadosTransporteUfOrigemDestinoEntrada extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";

    public static final String ESPECIE_NF = "ESPECIE_NF";
    public static final String SERIE_NF = "SERIE_NF";
    public static final String SUBSERIE_NF = "SUBSERIE_NF";
    public static final String NUMERO_NF = "NUMERO_NF";
    public static final String CODIGO_DO_CLIENTE = "CODIGO_DO_CLIENTE";

    public static final String UF_DE_ORIGEM_DO_SERVICO = "UF_DE_ORIGEM_DO_SERVICO";
    public static final String MUNICIPIO_DE_ORIGEM_DO_SERVICO = "MUNICIPIO_DE_ORIGEM_DO_SERVICO";
    public static final String UF_DE_DESTINO_DO_SERVICO = "UF_DE_DESTINO_DO_SERVICO";
    public static final String MUNICIPIO_DE_DESTINO_DO_SERVIÇO = "MUNICIPIO_DE_DESTINO_DO_SERVIÇO";
    public static final String CONTROLE_DO_SISTEMA = "CONTROLE_DO_SISTEMA";

    /**
     * Será usada para importas UF origem e Destino das CTEs de ENTRADAS
     */
    public E372DadosTransporteUfOrigemDestinoEntrada() {
        setName("Folhamatica - E372 DADOS DO TRANSPORTE – MUNICÍPIO ORIGEM/DESTINO ENTRADAS");

        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldStringFixedLengthArchetype fsf2 = new FieldStringFixedLengthArchetype(2);
        fsf2.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldStringFixedLengthArchetype fsf7 = new FieldStringFixedLengthArchetype(2);
        fsf7.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E372"));

        addFieldArchetype(ESPECIE_NF, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NF, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NF, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_DO_CLIENTE, new FieldStringFixedLengthArchetype(20));
        
        addFieldArchetype(UF_DE_ORIGEM_DO_SERVICO, fsf2);
        addFieldArchetype(MUNICIPIO_DE_ORIGEM_DO_SERVICO, fsf7);
        addFieldArchetype(UF_DE_DESTINO_DO_SERVICO, fsf2);
        addFieldArchetype(MUNICIPIO_DE_DESTINO_DO_SERVIÇO, fsf7);
        addFieldArchetype(CONTROLE_DO_SISTEMA, new FieldDefaultArchetype("0"));
    }
    
    
}
