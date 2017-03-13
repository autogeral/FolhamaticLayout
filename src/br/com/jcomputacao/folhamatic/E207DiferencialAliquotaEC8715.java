package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro importará informações para o lançamento das notas fiscais de entradas e saídas, no botão Informações
 * Complementares/Observações, opção Diferencial de Alíquotas - EC 87/15, portanto, ao importar este registro as notas fiscais de entradas e
 * saídas nele mencionadas já deverão estar lançadas no sistema ou constando nos Registros E200 e E201.</br>
 * Poderá existir apenas um registro por documento fiscal.</br>
 * Estas informações serão utilizadas na geração da EFD - Escrituração Fiscal Digital e geração da DeSTDA, para período a partir de 01/2016.</br>
 * Gere este registro para notas fiscais modelo 55 ou 57.</br>
 * Este registro tem por objetivo receber as informações correspondentes ao ICMS devido para a Unidade da Federação de Origem/Destino, nas
 * operações interestaduais de venda para consumidor final não contribuinte, atendendo as definições da Emenda Constitucional 87/2015.</br>
 * 
 * @author DAVID.DIAS
 */
public class E207DiferencialAliquotaEC8715 extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    /**
     * Preencher com "E" para nota fiscal de entrada ou com "S" quando de saída.
     */
    public static final String TIPO_NOTA_FISCAL = "TIPO_NOTA_FISCAL";
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
    * VALOR TOTAL RELATIVO AO FUNDO DE COMBATE À POBREZA (FCP) DA UF DE
    * DESTINO.
    */
    public static final String VALOR_TOTAL_FCP_UF_DESTINO = "VALOR_TOTAL_FCP_UF_DESTINO";
    
    /**
     * VALOR TOTAL DO ICMS INTERESTADUAL PARA A UF DE DESTINO OU UF DE
     * TÉRMINO DO SERVIÇO DE TRANSPORTE.
    */
    public static final String VALOR_TOTAL_ICMS_UF_DESTINO_TERMINO = "VALOR_TOTAL_ICMS_UF_DESTINO_TERMINO";
    
    /**
    * VALOR TOTAL DO ICMS INTERESTADUAL PARA A UF DO REMETENTE OU UF DE
    * INÍCIO DO SERVIÇO DE TRANSPORTE
    */
    public static final String VALOR_TOTAL_ICMS_UF_REMET_INICIO = "VALOR_TOTAL_ICMS_UF_REMET_INICIO";
    
   
    public E207DiferencialAliquotaEC8715() {
        
        setName("Folhamatic - Diferencial de Alíquotas - EC 87/15");
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E207"));
        addFieldArchetype(TIPO_NOTA_FISCAL, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(VALOR_TOTAL_FCP_UF_DESTINO, faip142);
        addFieldArchetype(VALOR_TOTAL_ICMS_UF_DESTINO_TERMINO, faip142);
        addFieldArchetype(VALOR_TOTAL_ICMS_UF_REMET_INICIO, faip142);
        
    }
    
}
