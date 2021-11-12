package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import static br.com.jcomputacao.folhamatic.E020ProdutosServicos.CONTROLE_SISTEMA;

/**
 *
 * Estas informações serão importadas para tela de lançamento do Inventário.
 *
 * @author robson.costa
 */
public class E400LancamentoInventario extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";

    public static final String CODIGO_DO_PRODUTO = "CODIGO_DO_PRODUTO";
    public static final String DATA_DO_INVENTÁRIO = "DATA_DO_INVENTÁRIO";
    public static final String VALOR_BRUTO = "VALOR_BRUTO";
    public static final String MARG_DE_LUCRO = "MARG_DE_LUCRO";
    public static final String VALOR_UNITARIO = "VALOR_UNITARIO";
    public static final String QUANTIDADE = "QUANTIDADE ";
    public static final String VALOR_DA_MERCADORIA = "VALOR_DA_MERCADORIA";
    public static final String ALIQ_ICMS = "ALIQ_ICMS ";
    public static final String ALIQ_INTERNA = "ALIQ_INTERNA";
    public static final String SUBSTITUICAO_TRIBUTARIA = "SUBSTITUICAO_TRIBUTARIA";
    public static final String CONTA_ANALITICA_CONTABIL = "CONTA_ANALITICA_CONTABIL";
    public static final String CODIGO_DE_POSSE_DAS_MERCADORIAS = "CODIGO_DE_POSSE_DAS_MERCADORIAS";
    public static final String DADOS_DO_POSSUIDOR_PROPRIETÁRIO_DA_MERCADORIA = "DADOS_DO_POSSUIDOR_PROPRIETÁRIO_DA_MERCADORIA";
    public static final String DESCRICAO_COMPLEMENTAR = "DESCRICAO_COMPLEMENTAR";
    public static final String ALIQ_PIS = "ALIQ_PIS";
    public static final String ALIQ_COFINS = "ALIQ_COFINS";
    public static final String CONTROLE_DO_SISTEMA = "CONTROLE_DO_SISTEMA";

    // ====================================================================
    // ====================================================================

    public E400LancamentoInventario() {
        setName("Folhamatic - E400 - LANÇAMENTO DE INVENTÁRIO ");

        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldDecimalFixedLengthArchetype fd146 = new FieldDecimalFixedLengthArchetype(14, 6);
        fd146.setAcceptNullable(true);

        FieldDecimalFixedLengthArchetype fd142 = new FieldDecimalFixedLengthArchetype(14, 2);
        fd142.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype fd42 = new FieldDecimalFixedLengthArchetype(4, 4);
        fd42.setAcceptNullable(true);
//        fd42.setFullFiling(' ');

        FieldDecimalFixedLengthArchetype fd74 = new FieldDecimalFixedLengthArchetype(7, 4);
        fd74.setAcceptNullable(true);
//        FieldDecimalFixedLengthArchetype fd42 = new FieldDecimalFixedLengthArchetype(4, 2);
//        fd42.setAcceptNullable(true);

        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');

        FieldStringFixedLengthArchetype fs50 = new FieldStringFixedLengthArchetype(50);
        fs50.setAcceptNullable(true);
        
        FieldStringFixedLengthArchetype fs20 = new FieldStringFixedLengthArchetype(20);
        fs20.setAcceptNullable(true);
        fs20.setFullFillingNullable(true);
        fs20.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E400"));
        addFieldArchetype(CODIGO_DO_PRODUTO, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(DATA_DO_INVENTÁRIO, faa);
        addFieldArchetype(VALOR_BRUTO, fd146);
        addFieldArchetype(MARG_DE_LUCRO, fd42);         // fd42
//        addFieldArchetype(MARG_DE_LUCRO, new FieldDecimalFixedLengthArchetype(4, 2));         // fd42
        addFieldArchetype(VALOR_UNITARIO, new FieldDecimalFixedLengthArchetype(15, 6));
        addFieldArchetype(QUANTIDADE, new FieldDecimalFixedLengthArchetype(11, 3));
        addFieldArchetype(VALOR_DA_MERCADORIA, fd142);
        addFieldArchetype(ALIQ_ICMS, fd74);
        addFieldArchetype(ALIQ_INTERNA, fd74);
        addFieldArchetype(SUBSTITUICAO_TRIBUTARIA, fd142);
        addFieldArchetype(CONTA_ANALITICA_CONTABIL, fs50);
        addFieldArchetype(CODIGO_DE_POSSE_DAS_MERCADORIAS, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DADOS_DO_POSSUIDOR_PROPRIETÁRIO_DA_MERCADORIA, fs20);
        addFieldArchetype(DESCRICAO_COMPLEMENTAR, new FieldStringFixedLengthArchetype(254));
        addFieldArchetype(ALIQ_PIS, fd42);
        addFieldArchetype(ALIQ_COFINS, fd42);
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }
    
}
