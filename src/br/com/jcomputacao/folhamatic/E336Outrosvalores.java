package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author lucas.bueno 
 * 09/10/2018
 *
 * Este registro importará informações para o lançamento das notas fiscais de
 * entradas e saídas, botão Informações Complementares/Observações - Outros
 * Valores, portanto, ao importar este registro as notas fiscais de entradas e
 * saídas, nele mencionadas já deverão estar lançadas no sistema ou constando
 * nos Registros E200 e E201.
 *
 * Estas informações serão utilizadas na geração da EFD - Escrituração Fiscal
 * Digital.
 *
 * Gere este registro para notas fiscais modelo 01, 1B, 02, 04, 06, 07, 08, 8B,
 * 09, 10, 11, 18, 21, 22, 26, 27, 28, 55 e 57. Modelo 29 e 59 para notas de
 * saídas.
 *
 * Importante: Os campos CI, Base, Alíquota e Valor do PIS e Base, Alíquota e
 * Valor da COFINS, poderão ser importados sempre, independente da regra citada
 * anteriormente.
 *
 * OBS. Poderá existir apenas um registro E336 por nota fiscal.
 */
public class E336Outrosvalores extends LineArchetype{
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    
    /**
     * Preencher com "E" para nota fiscal de entrada ou com "S" quando de saída.
     */
    public static final String TIPO_NOTA_FISCAL = "TIPO_NOTA_FISCAL";
    
    /**
     * Informe a espécie da nota fiscal.
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /**
     * Informe a série da nota fiscal
     */
    public static final String SERIE_NOTA_FISCAl = "SERIE_NOTA_FISCAL";
    
    /**
     * Informe a subsérie da nota fiscal.
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    /**
     * Informe o número da nota fiscal. 
     */
    public static final String NUMERO_NOTA_FISCAl = "NUMERO_NOTA_FISCAL";
    
    /**
     * Informe o código do cliente ou fornecedor da nota
     * fiscal conforme cadastro do sistema de faturamento.
     * 
     * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e
     * no sistema de faturamento com código "10", informe "10" neste campo.
     */
  
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /**
     *  Informe o valor total do desconto. Quando se tratar de
     *  ECF, CMR e PDV, ou não haja valor de desconto, informe zeros. 
     */
    public static final String VALOR_TOTAL_DESCONTO = "VALOR_TOTAL_DESCONTO";
    
    /**
     * Informe o valor do abatimento não
     * tributado e não comercial da nota fiscal, caso haja. (Exemplo - Desconto ICMS nas remessas
     * para ZFM).
     */
    public static final String ABATIMENTO_NAO_TRIBUTADO_E_NAO_COMERCIAL = "ABATIMENTO_NAO_TRIBUTADO_E_NAO_COMERCIAL";
    
    /**
     * Informe o valor do frete.
     */
    public static final String VALOR_FRETE = "VALOR_FRETE";
    
    /**
     * Informe o valor do seguro.
     */
    public static final String VALOR_SEGURO = "VALOR_SEGURO";
    
    /**
     * Informe o valor de outras despesas ou despesas acessórias.
     */
    public static final String VALOR_OUTRAS_DESPESAS_ACESSORIAS = "VALOR_OUTRAS_DESPESAS_ACESSORIAS";
    
    /**
     * Informe a Base do PIS.
     */
    public static final String BASE_PIS = "BASE_PIS";
    
    /**
     * Informe a alíquota do PIS. 
     */
    
    /**
     * Informe a alíquota do PIS
     */
    public static final String ALIQUOTA_PIS = "ALIQUOTA_PIS";
    
    /**
     * Informe o valor do PIS. Quando se tratar de ECF, CMR e PDV, informe zeros.
     */
    public static final String VALOR_PIS = "VALOR_PIS";
    
    /**
     * Informe a Base da COFINS
     */
    public static final String BASE_COFINS = "BASE_COFINS";
    
    /**
     * Informe a alíquota da COFINS
     */
    public static final String ALIQUOTA_COFINS = "ALIQUOTA_COFINS";
    
    /**
     * Informe o valor da COFINS. Quando se tratar de ECF, CMR e PDV,
     * informe zeros.
     */
    public static final String VALOR_COFINS = "VALOR_COFINS";
    
    /**
     * Informe o Código de integração caso utilize a integração dos valores de PIS
     * e COFINS por nota fiscal.
     */
    public static final String CI_PIS_COFINS = "CI_PIS_COFINS";
    
    /**
     * Informe "0" (zero) para controle interno do Sistema E-Fiscal.
     */
    public static final String CONTROLE_SITEMA = "CONTROLE_SISTEMA";

    public E336Outrosvalores() {
        
        
        setName("Folhamatic - Outros Valores");
        
        //X
        FieldStringFixedLengthArchetype f14 = new FieldStringFixedLengthArchetype(14);
        f14.setAcceptNullable(true);
        f14.setFullFiling(' ');
        
        FieldStringFixedLengthArchetype f2 = new FieldStringFixedLengthArchetype(2);
        f2.setAcceptNullable(true);
        
        FieldStringFixedLengthArchetype f4 = new FieldStringFixedLengthArchetype(4);
        f4.setAcceptNullable(true);
        f4.setFullFiling(' ');
        
        FieldStringFixedLengthArchetype f9 = new FieldStringFixedLengthArchetype(9);
        f9.setAcceptNullable(true);
        f9.setFullFiling(' ');
        
        //N
        FieldDecimalFixedLengthArchetype faip052 = new FieldDecimalFixedLengthArchetype(5, 2);
        faip052.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip062 = new FieldDecimalFixedLengthArchetype(6, 2);
        faip062.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip076 = new FieldDecimalFixedLengthArchetype(7, 6);
        faip076.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7, 4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip14 = new FieldDecimalFixedLengthArchetype(14, 0);
        faip14.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip143 = new FieldDecimalFixedLengthArchetype(14, 3);
        faip143.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip144 = new FieldDecimalFixedLengthArchetype(14, 4);
        faip144.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip146 = new FieldDecimalFixedLengthArchetype(14, 6);
        faip146.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip155 = new FieldDecimalFixedLengthArchetype(15, 5);
        faip155.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip154 = new FieldDecimalFixedLengthArchetype(15, 4);
        faip154.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E336"));
        addFieldArchetype(TIPO_NOTA_FISCAL, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAl, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAl, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(VALOR_TOTAL_DESCONTO, faip142);
        addFieldArchetype(ABATIMENTO_NAO_TRIBUTADO_E_NAO_COMERCIAL, faip142);
        addFieldArchetype(VALOR_FRETE, faip142);
        addFieldArchetype(VALOR_SEGURO, faip142);
        addFieldArchetype(VALOR_OUTRAS_DESPESAS_ACESSORIAS, faip142);
        addFieldArchetype(BASE_PIS, faip142);
        addFieldArchetype(ALIQUOTA_PIS, faip052);
        addFieldArchetype(VALOR_PIS, faip142);
        addFieldArchetype(BASE_COFINS, faip142);
        addFieldArchetype(ALIQUOTA_COFINS, faip052);
        addFieldArchetype(VALOR_COFINS, faip142);
        addFieldArchetype(CI_PIS_COFINS, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CONTROLE_SITEMA, new FieldDefaultArchetype("0"));
    }
}
