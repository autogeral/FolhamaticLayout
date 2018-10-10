package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author lucas.bueno
 * 10/10/2018
 * 
 * Este registro importará informações para o lançamento das notas fiscais de entradas e saídas, botão Informações Complementares/Observações -
 * Chave da NF-e, NFC-e, CT-e e CF-e, portanto, ao importar este registro as notas fiscais de entradas e saídas nele mencionadas já deverão estar
 * lançadas no sistema ou constando nos Registros E200 e E201.
 * 
 * OBS. A chave da NFC-e será importada apenas para os lançamentos das notas de saídas.

 * Neste registro serão importadas informações referentes a Nota Fiscal Eletrônica modelo 55, Nota Fiscal de Consumidor Eletrônica modelo 65,
 * Conhecimento de Transporte Eletrônico modelo 57 e Cupom Fiscal Eletrônico SAT modelo 59.
 *
 * Estas informações serão utilizadas na geração da EFD - Escrituração Fiscal Digital e SINCO/SVA. OBS. Poderá existir apenas um registro E342 por
 * nota fiscal. 
 */
public class E342ChaveDasNotasFiscais extends LineArchetype{
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    /**
     * Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de saída.
     */
    public static final String ENTRADAS_OU_SAIDAS = "ENTRADAS_OU_SAIDAS";
    
    /**
     * Informe a espécie da nota fiscal.
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /**
     * Informe a série da nota fiscal.
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    
    /**
     * Informe a subsérie da nota fiscal.
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    /**
     * Informe o número da nota fiscal
     */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    /**
     * Informe o código do cliente da nota fiscal conforme cadastro do
     * sistema de faturamento.
     * 
     * Exemplo: Se no sistema E-Fiscal o cliente está cadastrado com o código "01" e no sistema
     * de faturamento com código "10", informe "10" neste campo.
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /**
     * Informe a chave da Nota Fiscal Eletrônica, do
     * Conhecimento de Transporte Eletrônico, do Cupom Fiscal Eletrônico ou da Nota Fiscal de
     * Consumidor Eletrônica. Campo obrigatório quando a situação do documento (campo 14 do
     * registro E200) for igual á 00 - Regular e 01 - Extemporâneo, diferente disso, o campo poderá
     * ser preenchido com espaços.
     */
    public static final String CHAVE_NOTA_FISCAL = "CHAVE_NOTA_FISCAL";
    
    /**
     * Se o modelo da nota for 57, informe "0" se Normal, "1" se Complemento de
     * Valores ou "2" se Emitido em hipótese de anulação de débito "3" se CT-e substituto do CT-e
     * anulado. Para nota modelo 55, 59 ou 65, preencha com espaços.
     */
    public static final String TIPO_CTE = "TIPO_CTE";
    
    /**
     * Informe a chave do CT-e de referência cujos valores
     * foram complementados ou cujo débito foi anulado.
     */
    public static final String CHAVE_CTE_REFERENCIA = "CHAVE_CTE_REFERENCIA";
    
    /**
     * Informe "0" (zero) para controle interno do Sistema E-Fiscal.
     */
    public static final String CONTROLE_SITEMA = "CONTROLE_SISTEMA";

    
    
    public E342ChaveDasNotasFiscais() {
        
        setName("Folhamatica - Chaves das Notas NF-E / NFC-E / CT-E / CF-E");
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E342"));
        addFieldArchetype(ENTRADAS_OU_SAIDAS, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CHAVE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(TIPO_CTE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CHAVE_CTE_REFERENCIA, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(CONTROLE_SITEMA, new FieldDefaultArchetype("0"));
    }
}
