package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro importará informações para o lançamento das notas 
 * fiscais de entradas, botão Impostos Retidos, portanto, ao importar este registro
 * as notas fiscais de saídas nele mencionadas já deverão estar lançadas 
 * no sistema ou constando nos Registros E200 e E201.
 * OBS: Poderá existir apenas um registro E216 por nota fiscal.
 * 
 * @author DAVID.DIAS
 */
public class E216IrrfSeguroSocialImpostoRetidoNfEntradas  extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    public static final String CODIGO_FORNECEDOR = "CODIGO_FORNECEDOR";
    
    public static final String BASE_CALCULO_IRRF = "BASE_CALCULO_IRRF";
    
    public static final String ALIQUOTA_IRRF = "ALIQUOTA_IRRF";
    
    public static final String IRRF = "IRRF";
    
    public static final String BASE_CALCULO_SEGURO_SOCIAL = "BASE_CALCULO_SEGURO_SOCIAL";
    
    public static final String SEGURO_SOCIAL = "SEGURO_SOCIAL";
    
    /**
     * Informe a base do seguro
     * social s/ produção rural sub-rogação, quando nota fiscal de emissão própria.
     */
    public static final String BASE_SEGURO_SOCIAL_S_PROD_RURAL_SR = "BASE_SEGURO_SOCIAL_S_PROD_RURAL_SR";
    
    /**
     * Informe a alíquota
     * do seguro social s/ produção rural sub-rogação, quando nota fiscal de emissão própria.
     */
    public static final String ALIQUOTA_SEGURO_SOC_S_PROD_RURAL_SR = "ALIQUOTA_SEGURO_SOC_S_PROD_RURAL_SR";
    
    /**
     * Informe o seguro social s/
     * produção rural sub-rogação, quando nota fiscal de emissão própria.
     */
    public static final String SEGURO_SOCIAL_S_PRODUCAO_SR = "SEGURO_SOCIAL_S_PRODUCAO_SR";
    
    /**
     * BASE DE CÁLCULO DA RETENÇÃO (PIS, COFINS E CSLL RETIDOS NA FONTE) -
     * Informe a base de cálculo da retenção do PIS, COFINS e CSLL.
     */
    public static final String BASE_CALCULO_RETENCAO = "BASE_CALCULO_RETENCAO";
    
    public static final String ALIQUOTA_PIS = "ALIQUOTA_PIS";
    
    public static final String PIS = "PIS";
    
    public static final String ALIQUOTA_COFINS = "ALIQUOTA_COFINS";
    
    public static final String COFINS = "COFINS";
    
    public static final String ALIQUOTA_CSLL = "ALIQUOTA_CSLL";
    
    public static final String CSLL = "CSLL";

    public E216IrrfSeguroSocialImpostoRetidoNfEntradas() {
        
        setName("Folhamatic - IRRF/Seguro Social/Impostos Retidos - NF Entradas");
        
        FieldDecimalFixedLengthArchetype faip052 = new FieldDecimalFixedLengthArchetype(5,2);
        faip052.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip042 = new FieldDecimalFixedLengthArchetype(4,2);
        faip042.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E216"));
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(BASE_CALCULO_IRRF, faip142);
        addFieldArchetype(ALIQUOTA_IRRF, faip042);
        addFieldArchetype(IRRF, faip142);
        addFieldArchetype(BASE_CALCULO_SEGURO_SOCIAL, faip142);
        addFieldArchetype(SEGURO_SOCIAL, faip142);
        addFieldArchetype(BASE_SEGURO_SOCIAL_S_PROD_RURAL_SR, faip142);
        addFieldArchetype(ALIQUOTA_SEGURO_SOC_S_PROD_RURAL_SR, faip052);
        addFieldArchetype(SEGURO_SOCIAL_S_PRODUCAO_SR, faip142);
        addFieldArchetype(BASE_CALCULO_RETENCAO, faip142);
        addFieldArchetype(ALIQUOTA_PIS, faip042);
        addFieldArchetype(PIS, faip142);
        addFieldArchetype(ALIQUOTA_COFINS, faip042);
        addFieldArchetype(COFINS, faip142);
        addFieldArchetype(ALIQUOTA_CSLL, faip042);
        addFieldArchetype(CSLL, faip142);
    }
    
    
    
}
