package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Este registro deverá ser gerado por empresas do estado de São Paulo, atacadistas ou varejistas, 
 * que recolheram o ICMS por Antecipação
 * Tributária conforme artigo 426-A do RICMS/SP.
 * Somente deverá ser gerado este registro por empresas substituídas e para notas fiscais de entradas 
 * interestaduais (CFOP´s início 2).
 * As informações deste registro serão importadas para o lançamento das notas fiscais de entradas,
 * portanto, ao importar este registro, as notas
 * fiscais nele mencionadas já deverão estar lançadas no sistema ou constando nos Registros E200 e E201.
 * Após importado, as informações serão demonstradas no livro de entradas conforme artigo 277 do RICMS/SP.
 * OBS: Poderão existir vários registros E214 por nota fiscal.
 *
 * @author DAVID.DIAS
 */
public class E214ObsSubTribEntradasInter extends LineArchetype{

    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
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
    *     Informe o código do fornecedor da nota
    * fiscal conforme cadastro do sistema de faturamento.</br>
    * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e
    * no sistema de faturamento com código "10", informe "10" neste campo.</br>
    */
    public static final String CODIGO_FORNECEDOR = "CODIGO_FORNECEDOR";
    
     /**
    * Conforme artigos 277 e 426-A do RICMS-SP,
    * informe o valor da base de cálculo do imposto incidente sobre operação própria de saída
    * da mercadoria.
    */
    public static final String BASE_CALCULO_OPERACAO_PROPRIA = "BASE_CALCULO_OPERACAO_PROPRIA";
    
     /**
    * Conforme artigos 277 e 426-A do RICMS-SP, informe o valor do
    * imposto pago antecipadamente a título de imposto devido pela própria operação de saída
    * da mercadoria.
    * Se a empresa for Varejista, para notas recebidas com valor de ICMS destacado na NF, é
    * importante observar:
    * Se você optar lançar o ICMS antecipado sem a dedução do ICMS destacado na NF, faça o
    * mesmo nas demais notas do mês. O mesmo vale se você optar lançar o valor já deduzido
    * do ICMS destacado na NF.
    * Se a opção for lançar o ICMS Antecipado sem a dedução do ICMS destacado na NF, é
    * aconselhável lançar o valor do crédito do lançamento desta nota (campo 15-Valor do ICMS
    * do registro E201).
    */
    public static final String ICMS_ANTECIPADO = "ICMS_ANTECIPADO";
    
    /**
    * Conforme artigos 277 e 426-A do
    * RICMS-SP, informe o valor da base de cálculo do imposto incidente sobre as operações
    * subsequentes, ou seja, a base de cálculo estabelecida para a substituição tributária (IVAST
    * ou preço final ao consumidor).
    * No caso de empresas RPA, este campo deve ser preenchido somente por empresas
    * Atacadistas, portanto, se a empresa for RPA e Varejista, preencha este campo com zeros.
    */
    public static final String BASE_CALCULO_OPERACAO_SUB_ST = "BASE_CALCULO_OPERACAO_SUB_ST";
    
    /**
     * Conforme artigos 277 e 426-A do RICMS-SP, informe o valor do imposto retido
     * incidente sobre as operações subsequentes, na condição de sujeito passivo por
     * substituição.
     * No caso de empresas RPA, este campo deve ser preenchido somente por empresas
     * Atacadistas, portanto, se a empresa for RPA e Varejista, preencha este campo com zeros.
    */
    public static final String ICMS_ST = "ICMS_ST";
    
    /**
    * Conforme artigo 277 do RICMS-SP, informe a data que a GARE
    * -ICMS ou GNRE foi recolhida no formato AAAAMMDD
    */
    public static final String DATA_RECOLHIMENTO = "DATA_RECOLHIMENTO";
    
    /**
    * Conforme artigo 277 do RICMS-SP, informe o valor do ICMS
    * recolhido na GARE-ICMS ou na GNRE.
    */
    public static final String VALOR_RECOLHIMENTO = "VALOR_RECOLHIMENTO";
        
    /**
    * Conforme artigo 277 do RICMS-SP, informe o código da GARE-ICMS
    * ou GNRE recolhida.
    */
    public static final String CODIGO_RECEITA = "CODIGO_RECEITA";
        
    /**
    * Este campo será utilizado para fins de apuração do ICMS, e
    * somente deverá ser informado:
    * - Se a empresa for RPA
    * - Se existir valor no campo Valor do ICMS (campo 15-Valor do ICMS do registro E201) da
    * nota que receberá as informações deste registro.
    * - Se a empresa utiliza o transporte automático dos valores do ICMS Antecipado para o
    * menu Arquivos, Outros Valores, Créditos/Débitos.
    * Na condição acima, informe neste campo o valor do ICMS destacado na nota, e se neste
    * valor constar mercadorias que não são sujeitas ao regime de substituição tributária,
    * informe apenas o valor das mercadorias sujeitas ao regime de substituição tributária.
    * Se a empresa não for RPA, ou não lançar a nota com Valor de ICMS, ou não utilizar o
    * transporte automático do sistema, informe zeros neste campo.
    */
    public static final String ICMS_DESTACADO_NF = "ICMS_DESTACADO_NF";
    
   
    public E214ObsSubTribEntradasInter() {
        
        setName("Folhamatic - Obs. Sub. Trib. - Entradas Inter. Art. 277 RICMS/SP");
        
        FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7,4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E214"));
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_FORNECEDOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(BASE_CALCULO_OPERACAO_PROPRIA, faip142);
        addFieldArchetype(ICMS_ANTECIPADO, faip142);
        addFieldArchetype(BASE_CALCULO_OPERACAO_SUB_ST, faip142);
        addFieldArchetype(ICMS_ST, faip142);
        addFieldArchetype(DATA_RECOLHIMENTO, faa);
        addFieldArchetype(VALOR_RECOLHIMENTO, faip142);
        addFieldArchetype(CODIGO_RECEITA, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(ICMS_DESTACADO_NF, faip142);
    }
    
}
