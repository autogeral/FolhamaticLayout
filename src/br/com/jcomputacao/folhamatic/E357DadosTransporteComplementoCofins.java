package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro importará informações para o Dados do Transporte, opção
 * Complemento do Documento do Transporte - COFINS das notas fiscais de
 * entradas. Sendo assim, as notas fiscais já deverão estar lançadas no sistema
 * ou nos registros E200 e E201. Estas informações serão utilizadas na geração
 * da EFD - PIS/COFINS.  *
 * Gere este registro para notas fiscais de entradas modelo 07, 08, 8B, 09, 10,
 * 11, 26, 27 e 57.  *
 * OBS. Poderão existir vários registros E357 por nota fiscal.
 *
 *
 * @author robson.costa
 */
public class E357DadosTransporteComplementoCofins extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";

    public static final String TIPO_DE_NF = "TIPO_DE_NF";
    public static final String ESPECIE_NF = "ESPECIE_NF";
    public static final String SERIE_NF = "SERIE_NF";
    public static final String SUBSERIE_NF = "SUBSERIE_NF";
    public static final String NUMERO_NF = "NUMERO_NF";
    public static final String CODIGO_DO_FORNECEDOR = "CODIGO_DO_FORNECEDOR";
    public static final String NATUREZA_DO_FRETE = "NATUREZA_DO_FRETE";
    public static final String VALOR_TOTAL_DOS_ITENS = "VALOR_TOTAL_DOS_ITENS";
    public static final String SIT_TRIB_COFINS = "SIT_TRIB_COFINS";
    public static final String CODIGO_DA_BASE_DE_CALCULO_DO_CREDITO = "CODIGO_DA_BASE_DE_CALCULO_DO_CREDITO";
    public static final String BASE_DE_CALCULO_COFINS = "BASE_DE_CALCULO_PIS_PASEP";
    public static final String ALIQUOTA_COFINS = "ALIQUOTA_PIS_PASEP";
    public static final String VALOR_COFINS = "VALOR_DO_PIS_PASEP";
    public static final String CONTA_ANALITICA_CONTABIL = "CONTA_ANALITICA_CONTABIL";
    public static final String CONTROLE_DO_SISTEMA = "CONTROLE_DO_SISTEMA";

    public E357DadosTransporteComplementoCofins() {
        setName("Folhamatica - E357 DADOS DO TRANSPORTE - COMPLEMENTO DO DOCUMENTO - COFINS");

        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldDecimalFixedLengthArchetype faip084 = new FieldDecimalFixedLengthArchetype(8, 4);
        faip084.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E357"));

        addFieldArchetype(TIPO_DE_NF, new FieldDefaultArchetype("E"));
        addFieldArchetype(ESPECIE_NF, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NF, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NF, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_DO_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NATUREZA_DO_FRETE, new FieldDefaultArchetype("2"));
        addFieldArchetype(VALOR_TOTAL_DOS_ITENS, faip142);
        addFieldArchetype(SIT_TRIB_COFINS, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_DA_BASE_DE_CALCULO_DO_CREDITO, new FieldDefaultArchetype("14"));
        addFieldArchetype(BASE_DE_CALCULO_COFINS, faip142);
        addFieldArchetype(ALIQUOTA_COFINS, faip084);
        addFieldArchetype(VALOR_COFINS, faip142);
        addFieldArchetype(CONTA_ANALITICA_CONTABIL, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(CONTROLE_DO_SISTEMA, new FieldDefaultArchetype("0"));
    }

}
