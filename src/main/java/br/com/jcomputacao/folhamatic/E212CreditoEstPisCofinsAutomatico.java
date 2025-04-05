package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro deverá ser gerado por empresas que recolham o imposto 
 * PIS/COFINS como não cumulativo (empresas que apuram com base no
 * Lucro Real).
 * As informações deste registro serão utilizadas para o calcular o valor a 
 * descontar ou adicionar no PIS e COFINS e serão importadas para o
 * lançamento das notas fiscais de entradas e saídas, portanto, ao importar 
 * este registro as notas fiscais de entradas e saídas nele mencionadas já
 * deverão estar lançadas no sistema ou constando nos Registros E200 e E201.
 * Poderão existir vários registros E212 por linha de lançamento da nota fiscal, 
 * portanto, a ordem das linhas de lançamento serão apresentadas no
 * sistema conforme a definição do campo 08 deste registro no arquivo.
 * 
 * @author DAVID.DIAS
 */
public class E212CreditoEstPisCofinsAutomatico extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * Preencher com "E" para nota fiscal de entrada ou com "S" quando de saída.
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
    * Informe o número referente a linha de
    * lançamento da nota fiscal.
    * Este campo será utilizado para identificar qual linha de lançamento da nota refere-se as
    * informações deste registro.
    * Exemplo: A nota tem duas linhas de lançamento, portanto, existem dois registros E201
    * referente a ela, um como linha 01 e outro como linha 02 (campo 27 do registro E201),
    * então se deseja importar as informações para a segunda linha, neste campo deve constar 02.
    */
    public static final String N_LINHA_LANCAMENTO = "N_LINHA_LANCAMENTO";
    
    /**
     * Se a nota
     * for de entrada, informe o valor do crédito a descontar de bens que a legislação permite, se
     * a nota for de saídas informe o valor do estorno de créditos a descontar de bens que a
     * legislação permite. Informe o valor do crédito/estorno de crédito sem a multiplicação pela
     * alíquota do crédito, pois, o sistema calculará automaticamente após importado.
     * ATENÇÃO - Preencha este campo somente se na operação existir o crédito de
     * PIS/COFINS, caso contrário informe zeros.
    */
    public static final String CREDITO_DESCONTO_ESTORNO_PIS_COFINS = "CREDITO_DESCONTO_ESTORNO_PIS_COFINS";
    
    /**
    * Informe a alíquota do Crédito a Descontar ou Estorno de Crédito conforme a legislação, as
    * quais serão: 1,65% - Válida a partir de 12/2002 ou 1,15% - Válida de 02/2003 até 07/2004
    * ou 0,58% - Válida a partir de 08/2004 ou 0,99% - Válida a partir de 08/2004, ou alíquota
    * diversificada conforme necessidade.
    * ATENÇÃO - Preencha este campo somente se na operação existir o crédito de PIS, ou
    * seja, se existir informação no campo 09, caso contrário informe zeros.
    * Somente preencha as duas últimas casas decimais com informação diferente de zeros,
    * quando no cadastro da empresa, a opção "Config. Casas Decimais" estiver selecionado a
    * opção 4 casas decimais.
    */
    public static final String ALIQUOTA_CRED_DESCONTO_EST_PIS = "ALIQUOTA_CRED_DESCONTO_EST_PIS";
    
    /**
    * Informe a alíquota do Crédito a Descontar ou Estorno de Crédito conforme a legislação, as
    * quais serão:
    * 7,60% - Válida a partir de 02/2004 ou 6,08% - Válida de 02/2004 até 07/2004 ou 2,66% -
    * Válida a partir de 08/2004 ou 4,56% - Válida a partir de 08/2004, ou alíquota diversificada
    * conforme necessidade.
    * ATENÇÃO - Preencha este campo somente se na operação existir o crédito de COFINS,
    * ou seja, se existir informação no campo 09, caso contrário informe zeros.
    * Somente preencha as duas últimas casas decimais com informação diferente de zeros,
    * quando no cadastro da empresa, a opção "Config. Casas Decimais" estiver selecionado a
    * opção 4 casas decimais.
    */
    public static final String ALIQUOTA_CRED_DESCONTO_EST_COFINS = "ALIQUOTA_CRED_DESCONTO_EST_COFINS";
    
   
    public E212CreditoEstPisCofinsAutomatico() {
        
        setName("Folhamatic - Créditos e Est. Créditos p/PIS/COFINS Automático");
        
        FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7,4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E212"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(N_LINHA_LANCAMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CREDITO_DESCONTO_ESTORNO_PIS_COFINS, faip142);
        addFieldArchetype(ALIQUOTA_CRED_DESCONTO_EST_PIS, faip074);
        addFieldArchetype(ALIQUOTA_CRED_DESCONTO_EST_COFINS, faip074);
        
    }
    
}
