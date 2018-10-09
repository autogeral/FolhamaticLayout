package br.com.jcomputacao.folhamatic;

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
public class E336Outrosvalores {
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    
    /*
    Preencher com "E" para nota fiscal de entrada ou com "S" quando de saída.
    */
    public static final String TIPO_NOTA_FISCAL = "TIPO_NOTA_FISCAL";
    
    /*
    Informe a espécie da nota fiscal.
    */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /*
    Informe a série da nota fiscal
    */
    
    
}
