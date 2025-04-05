package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author DAVID.DIAS
 */
public class E202DiferencialAliquota extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de
     * saída.
     */
    public static final String ENTRADA_SAIDA = "ENTRADA_SAIDA";
     /**
     * ESPÉCIE N.F.- Informe a espécie da nota fiscal.
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
        /**
     * SÉRIE N.F. - Informe a série da nota fiscal.
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
     /**
     * SUBSÉRIE N.F.- Informe a subsérie da nota fiscal.
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
     /**
     * NÚMERO N.F. - Informe o número da nota fiscal.</br>
     */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    /**
    *     Informe o código do cliente ou fornecedor da nota
    * fiscal conforme cadastro do sistema de faturamento.</br>
    * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e
    * no sistema de faturamento com código "10", informe "10" neste campo.</br>
    */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /**
    *     Informe o número referente a linha de
    * lançamento da nota fiscal.</br>
    * Este campo será utilizado para identificar qual linha de lançamento da nota refere-se as
    * informações deste registro.</br>
    * Exemplo: A nota tem duas linhas de lançamento, portanto, existem dois registros E201
    * referente a ela, um como linha 01 e outro como linha 02 (campo 27 do registro E201),
    * então se deseja importar as informações para a segunda linha, neste campo deve constar 02.</br>
    */
    public static final String N_LINHA_LANCAMENTO = "N_LINHA_LANCAMENTO";
    
    /**
    * Informe o valor da base de cálculo ref. compra interestadual. </br>Não
    * havendo informação para este campo ou para notas fiscais de saídas, este campo deve ser
    * preenchido com zeros.</br>
    */
    public static final String BASE_CALCULO = "BASE_CALCULO";
    
    /**
    * Informe a alíquota interna ref. o produto. Não havendo informação
    * para este campo ou para notas fiscais de saídas, este campo deve ser preenchido com
    * zeros.</br>
    */
    public static final String ALIQUOTA_INTERNA = "ALIQUOTA_INTERNA";
    
    /**
    * Informe o valor do imposto destacado na nota fiscal. Não havendo
    * informação para este campo ou para notas fiscais de saídas, este campo deve ser
    * preenchido com zeros.</br>
    */
    public static final String VALOR_IMPOSTO = "VALOR_IMPOSTO";
    
    /**
    * Informe o valor do estorno (ICMS) ref. a nota fiscal devolução
    * compra interestadual. Não havendo informação para este campo ou para notas fiscais de
    * entradas, este campo deve ser preenchido com zeros.</br>
    */
    public static final String ICMS_A_ESTORNAR = "ICMS_A_ESTORNAR";

    public E202DiferencialAliquota() {
        
        setName("Folhamatic - Diferencial de Alíquotas");
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip052 = new FieldDecimalFixedLengthArchetype(5, 2);
        faip052.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E202"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(N_LINHA_LANCAMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(BASE_CALCULO, faip142);
        addFieldArchetype(ALIQUOTA_INTERNA, faip052);
        addFieldArchetype(VALOR_IMPOSTO, faip142);
        addFieldArchetype(ICMS_A_ESTORNAR, faip142);
        
    }
    
}
