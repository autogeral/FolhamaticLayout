package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro somente deverá ser informado por empresas que recolhem o imposto PIS/COFINS como não cumulativo (empresas que apuram
 * com base no Lucro Real), para informação manual no sistema, onde será informado o(s) valor(es) dos créditos a descontar, do(s) estorno(s) deste
 * (s) créditos(s), e das despesas e custos de bens que as legislação permite.
 * Estas informações serão importadas para o menu Imposto, Digitações Empresas, opção PIS/COFINS LUCRO REAL, para os respectivos campos
 * deste layout.
 * @author DAVID.DIAS
 */
public class E280CredEstDespeCustosManuaisPisCof extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
     /**
     * MÊS/ANO - Informe o mês e ano dos Créditos, Estorno de Créditos, Despesas e Custos e
     * Valor do Estoque no formato MM/AAAA.
     * O tipo deste campo é alfanumérico, porém neste caso, obrigatoriamente deve estar
     * preenchido como um período válido sem espaço algum.
     * Ex. Mês 02/2003, no arquivo ficará:
     * 02/2003
     * @
     */
    public static final String MES_ANO = "MES_ANO";
    
     /**
     * CRÉDITOS A DESCONTAR (1,65% - 7,6%) - Informe o valor do crédito a descontar a
     * 1,65% para o PIS e 7,6% para a COFINS, de bens que a legislação permite.
     * Informe o valor do crédito sem a multiplicação por 1,65% ou 7,6%, pois o sistema calculará
     * automaticamente após importado.
     * OBS: O crédito a descontar para PIS com alíquota 1,65% é válido a partir de 12/2002 e o
     * crédito a descontar para COFINS com alíquota 7,6% será calculado a partir de 02/2004.
     */
    public static final String CREDITOS_DESCONTAR_1_65_A_7_6 = "CREDITOS_DESCONTAR_1_65_A_7_6";
    
     /**
     * CRÉDITOS A DESCONTAR (1,15% - 6,08%) - Informe o valor do crédito a descontar a
     * 1,15% para o PIS e 6,08% para a COFINS, de bens que a legislação permite.
     * informe o valor do crédito sem a multiplicação por 1,15% ou 6,08%, pois o sistema
     * calculará automaticamente após importado.
     * OBS: O crédito a descontar para PIS com alíquota 1,15% é válido no período de 02/2003
     * até 07/2004 e o crédito a descontar para COFINS com alíquota 6,08% será calculado no
     * período de 02/2004 até 07/2004.   
     */
    public static final String CREDITOS_DESCONTAR_1_15_A_6_08 = "CREDITOS_DESCONTAR_1_15_A_6_08";
    
     /**
     * ESTORNO DE CRÉDITO A DESCONTAR (1,65% - 7,6%) - Informe o valor do estorno de
     * crédito a descontar a 1,65% para o PIS e 7,6% para a COFINS, de bens que a legislação
     * permite.
     * Informe o valor do estorno de crédito sem a multiplicação por 1,65% ou 7,6%, pois o
     * sistema calculará automaticamente após importado.
     * OBS: O estorno de crédito a descontar para PIS com alíquota 1,65% é válido a partir de
     * 12/2002 e o estorno de crédito a descontar para COFINS com alíquota 7,6% será calculado
     * a partir de 02/2004.
     */
    public static final String ESTORNO_CREDITO_DESCONTAR_1_65_A_7_6 = "ESTORNO_CREDITO_DESCONTAR_1_65_A_7_6";
    
     /**
     * ESTORNO DE CRÉDITO A DESCONTAR (1,15% - 6,08%) - Informe o valor do estorno de
     * crédito a descontar a 1,15% para o PIS e 6,08% para a COFINS, de bens que a legislação
     * permite.
     * Informe o valor do estorno de crédito sem a multiplicação por 1,15% ou 6,08%, pois o
     * sistema calculará automaticamente após importado.
     * OBS: O estorno de crédito a descontar para PIS com alíquota 1,15% é válido no período de
     * 02/2003 até 07/2004 e o estorno de crédito a descontar para COFINS com alíquota 6,08%
     * será calculado no período de 02/2004 até 07/2004.    
     */
    public static final String ESTORNO_CREDITO_DESCONTAR_1_15_A_6_08 = "ESTORNO_CREDITO_DESCONTAR_1_15_A_6_08";
    
     /**
     * VALOR DE DESPESAS E CUSTOS - Informe os valores de Despesas e Custos do
     * mês/ano. 
     */
    public static final String VALOR_DESPESAS_CUSTOS = "VALOR_DESPESAS_CUSTOS";
    
     /**
     * VALOR DE ESTOQUE PIS - Informe o valor de estoque de abertura para PIS, caso haja.
     * Informe o valor do estoque para PIS já dividido em 12 meses.  
     */
    public static final String VALOR_ESTOQUE_PIS = "VALOR_ESTOQUE_PIS";
    
     /**
     * VALOR DE ESTOQUE COFINS - Informe o valor de estoque de abertura para COFINS,
     * caso haja.
     * Informe o valor do estoque para COFINS já dividido em 12 meses. 
     */
    public static final String VALOR_ESTOQUE_COFINS = "VALOR_ESTOQUE_COFINS";
    
     /**
     * CRÉDITOS A DESCONTAR (0,99% - 4,56%) - Informe o valor do crédito a descontar a
     * 0,99% para o PIS e 4,56% para a COFINS de bens que a legislação permite.
     * Informe o valor do crédito sem a multiplicação por 0,99% ou 4,56%, pois o sistema
     * calculará automaticamente após importado.
     * OBS: O crédito a descontar com estas alíquotas (PIS= 0,99% e COFINS= 4,56%), é válido
     * a partir de 08/2004    
     */
    public static final String CREDITOS_DESCONTAR_0_99_A_4_56 = "CREDITOS_DESCONTAR_0_99_A_4_56";
    
     /**
     * CRÉDITOS A DESCONTAR (0,58% - 2,66%) - Informe o valor do crédito a descontar a
     * 0,58% para o PIS e 2,66% para a COFINS de bens que a legislação permite.
     * Informe o valor do crédito sem a multiplicação por 0,58% ou 2,66%, pois o sistema
     * calculará automaticamente após importado.
     * OBS: O crédito a descontar com estas alíquotas (PIS= 0,58% e COFINS= 2,66%), é válido
     * a partir de 08/2004. 
     */
    public static final String CREDITOS_DESCONTAR_0_58_A_2_66 = "CREDITOS_DESCONTAR_0_58_A_2_66";
    
     /**
     * ESTORNO DE CRÉDITO A DESCONTAR (0,99% - 4,56%) - Informe o valor do estorno de
     * crédito a descontar a 0,99% para o PIS e 4,56% para a COFINS de bens que a legislação
     * permite.
     * Informe o valor do estorno de crédito sem a multiplicação por 0,99% ou 4,56%, pois o
     * sistema calculará automaticamente após importado.
     * OBS: O estorno de crédito a descontar com estas alíquotas (PIS= 0,99% e COFINS=
     * 4,56%), é válido a partir de 08/2004.
     */
    public static final String ESTORNO_CREDITO_DESCONTAR_0_99_A_4_56 = "ESTORNO_CREDITO_DESCONTAR_0_99_A_4_56";
    
     /**
     * ESTORNO DE CRÉDITO A DESCONTAR (0,58% - 2,66%) - Informe o valor do estorno de
     * crédito a descontar a 0,58% para o PIS e 2,66% para a COFINS de bens que a legislação
     * permite.
     * Informe o valor do estorno de crédito sem a multiplicação por 0,58% ou 2,66%, pois o
     * sistema calculará automaticamente após importado.
     * OBS: O estorno de crédito a descontar com estas alíquotas (PIS=0,58% e
     * COFINS=2,66%), é válido a partir de 08/2004. 
     */
    public static final String ESTORNO_CREDITO_DESCONTAR_0_58_A_2_66 = "ESTORNO_CREDITO_DESCONTAR_0_58_A_2_66";

    public E280CredEstDespeCustosManuaisPisCof() {
        setName("Folhamatic - Créditos, Estornos e Despesas/Custos Manuais - PIS/COFINS");
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E280"));
        addFieldArchetype(MES_ANO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(CREDITOS_DESCONTAR_1_65_A_7_6, faip142);
        addFieldArchetype(CREDITOS_DESCONTAR_1_15_A_6_08, faip142);
        addFieldArchetype(ESTORNO_CREDITO_DESCONTAR_1_65_A_7_6, faip142);
        addFieldArchetype(ESTORNO_CREDITO_DESCONTAR_1_15_A_6_08, faip142);
        addFieldArchetype(VALOR_DESPESAS_CUSTOS, faip142);
        addFieldArchetype(VALOR_ESTOQUE_PIS, faip142);
        addFieldArchetype(VALOR_ESTOQUE_COFINS, faip142);
        addFieldArchetype(CREDITOS_DESCONTAR_0_99_A_4_56, faip142);
        addFieldArchetype(CREDITOS_DESCONTAR_0_58_A_2_66, faip142);
        addFieldArchetype(ESTORNO_CREDITO_DESCONTAR_0_99_A_4_56, faip142);
        addFieldArchetype(ESTORNO_CREDITO_DESCONTAR_0_58_A_2_66, faip142);
         
    }
    
    
}
