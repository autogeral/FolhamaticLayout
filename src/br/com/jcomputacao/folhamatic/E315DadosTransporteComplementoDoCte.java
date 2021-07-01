package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * Este registro importará informações para o lançamento das notas fiscais de saídas, botão Dados Transporte, opção Itens da NF de TransporteComplemento da NF de Transporte, portanto, ao importar este registro as informações dos Itens da NF de Transporte nele mencionadas já deverão
 * estar lançadas na nota ou constando no Registro E305. 
 * Este registro está ligado as informações do item da nota fiscal de transporte (registro E305) e nele deve ser informado o complemento das Notas
 * Fiscais de Serviços de Transporte com municípios de origem e destino do transporte. 
 * Estas informações serão utilizadas para fins de geração da EFD - Escrituração Fiscal Digital. 
 * Gere este registro para notas fiscais de transporte modelo 07. 
 * OBS. Poderão existir vários registros E315 para cada E305
 * 
 * @author robson.costa
 */
public class E315DadosTransporteComplementoDoCte extends LineArchetype {

    public static final String NOME_REGISTRO = "NOME_REGISTRO";

    public static final String ESPECIE_NF = "ESPECIE_NF";
    public static final String SERIE_NF = "SERIE_NF";
    public static final String SUBSERIE_NF = "SUBSERIE_NF";
    public static final String NUMERO_NF = "NUMERO_NF";
    public static final String CODIGO_DO_CLIENTE = "CODIGO_DO_CLIENTE";

    public static final String NUM_ITEM = "NUM_ITEM";
    public static final String UF_DE_ORIGEM_DO_SERVICO = "UF_DE_ORIGEM_DO_SERVICO";
    public static final String MUNICIPIO_DE_ORIGEM_DO_SERVICO = "MUNICIPIO_DE_ORIGEM_DO_SERVICO";
    public static final String UF_DE_DESTINO_DO_SERVICO = "UF_DE_DESTINO_DO_SERVICO";
    public static final String MUNICIPIO_DE_DESTINO_DO_SERVIÇO = "MUNICIPIO_DE_DESTINO_DO_SERVIÇO";
    public static final String PLACA_DO_VEICULO = "PLACA_DO_VEICULO";
    public static final String UF_DA_PLACA_DO_VEICULO = "UF_DA_PLACA_DO_VEICULO";
    public static final String CONTROLE_DO_SISTEMA = "CONTROLE_DO_SISTEMA";

    public E315DadosTransporteComplementoDoCte() {
        setName("Folhamatica - E315 DADOS DO TRANSPORTE - COMPLEMENTO DA NOTA FISCAL DE TRANSPORTE");

        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);

        FieldDecimalFixedLengthArchetype faip084 = new FieldDecimalFixedLengthArchetype(8, 4);
        faip084.setAcceptNullable(true);

        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);

        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E315"));

        addFieldArchetype(ESPECIE_NF, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NF, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NF, new FieldIntegerFixedLengthArchetype<Long>(10));
        addFieldArchetype(CODIGO_DO_CLIENTE, new FieldStringFixedLengthArchetype(20));
        
        
        addFieldArchetype(NUM_ITEM, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(UF_DE_ORIGEM_DO_SERVICO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MUNICIPIO_DE_ORIGEM_DO_SERVICO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(UF_DE_DESTINO_DO_SERVICO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MUNICIPIO_DE_DESTINO_DO_SERVIÇO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(PLACA_DO_VEICULO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(UF_DA_PLACA_DO_VEICULO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CONTROLE_DO_SISTEMA, new FieldDefaultArchetype("0"));
    }
    
    
}
