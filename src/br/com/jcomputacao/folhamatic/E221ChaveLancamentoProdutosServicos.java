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
 * @author DAVID.DIAS
 */
public class E221ChaveLancamentoProdutosServicos extends LineArchetype{
    
    /**
     * NOME DO REGISTRO - Informe E221</br>    
     */
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    /**
     * ENTRADAS OU SAÍDAS - Informe "E" para nota fiscal de entrada ou "S" para nota fiscal de</br>
     * saída.</br>    
     */
    public static final String ENTRADA_SAIDA = "ENTRADA_SAIDA";
    
    /**
     * ESPÉCIE N.F.- Informe a espécie da nota fiscal.</br>    
     */
    public static final String ESPECIE_NOTA_FISCAL = "ESPECIE_NOTA_FISCAL";
    
    /**
     * SÉRIE N.F. - Informe a série da nota fiscal.</br>   
     */
    public static final String SERIE_NOTA_FISCAL = "SERIE_NOTA_FISCAL";
    
    /**
     * SUBSÉRIE N.F.- Informe a subsérie da nota fiscal.</br>    
     */
    public static final String SUBSERIE_NOTA_FISCAL = "SUBSERIE_NOTA_FISCAL";
    
    /**
     * NÚMERO N.F. - Informe o número da nota fiscal.</br>    
     */
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    
    /**
     * CÓDIGO DO CLIENTE/FORNECEDOR - Informe o código do cliente ou fornecedor da nota</br>
     * fiscal conforme cadastro do sistema de faturamento.</br>
     * Exemplo: Se no sistema E-Fiscal o cliente/fornecedor está cadastrado com o código "01" e</br>
     * no sistema de faturamento com código "10", informe "10" neste campo.</br>    
     */
    public static final String CODIGO_CLIENTE_FORNECEDOR = "CODIGO_CLIENTE_FORNECEDOR";
    
    /**
     * FRETE - Informe o valor do frete da nota fiscal. Quando se tratar de cupom fiscal, zerar</br>
     * este campo.</br>    
     */
    public static final String FRETE = "FRETE";
    
    /**
     * SEGURO - Informe o valor do seguro da nota fiscal. Quando se tratar de cupom fiscal,</br>
     * zerar este campo.</br>    
     */
    public static final String SEGURO = "SEGURO";
    
    /**
     * DESPESAS ACESSÓRIAS - Informe o valor de outras despesas acessórias da nota fiscal.</br>
     * Quando se tratar de cupom fiscal, zerar este campo.</br>    
     */
    public static final String DESPESAS_ACESSORIAS = "DESPESAS_ACESSORIAS";
    
    /**
     * QUANTIDADE DE ITENS DA N.F. - Informe a quantidade de itens lançado na nota fiscal.</br>
     * Campo Obrigatório.</br>   
     */
    public static final String QUANTIDADE_ITENS_NOTA_FISCAL = "QUANTIDADE_ITENS_NOTA_FISCAL";
    
    /**
     * QUANTIDADE DE ITENS DA N.F. - Informe o valor de Pis e Cofins retido anteriormente (valor destacado na nota fiscal). Quando se tratar de cupom fiscal, zerar este campo.</br>
     * Campo Obrigatório.</br>    
     */
    public static final String PIS_COFINS = "PIS_COFINS";
    
    /**
     * PESO BRUTO - Informe o Peso Bruto das mercadorias (em quilogramas). Quando se tratar</br>
     * de cupom fiscal, zerar este campo.</br>    
     */
    public static final String PESO_BRUTO = "PESO_BRUTO";
    
    /**
     * PESO LÍQUIDO - Informe o Peso Líquido das mercadorias (em quilogramas). Quando se</br>
     * tratar de cupom fiscal, zerar este campo.</br>    
     */
    public static final String PESO_LIQUIDO = "PESO_LIQUIDO";
    
    /**
     * VIA DE TRANSPORTE - Informe a via de transporte da mercadoria, utilize os códigos</br>
     * abaixo:</br>
     * 0 - nennhum</br>
     * 1 - para via de transporte Rodoviário,</br>
     * 2 - para via de transporte Ferroviário,</br>
     * 3 - para via de transporte Rodo-Ferroviário,</br>
     * 4 - para via de transporte Aquaviário,</br>
     * 5 - para via de transporte Dutoviário,</br>
     * 6 - para via de transporte Aéreo</br>
     * 7 - para Outro.</br>
     * Quando se tratar de Cupom Fiscal, preencher com zero.</br>    
     */
    public static final String VIA_TRANSPORTE = "VIA_TRANSPORTE";
    
    /**
     * CÓDIGO DO TRANSPORTADOR - Informe o código do transportador conforme cadastro</br>
     * do sistema de faturamento.</br>
     * Exemplo: Se no sistema E-Fiscal o transportador está cadastrado com o código "01" e no</br>
     * sistema de faturamento com código "10", informe "10" neste campo.</br>
     * Esse campo deverá ser informado quando nenhum produto da nota (Registro E222) for</br>
     * combustível/Solvente, ou se algum produto da nota for combustível/solvente e possuir</br>
     * movimentação física.</br>
     * Se os produtos que forem combustível/solvente não possuírem movimentação física, e</br>
     * quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String CODIGO_TRANSPORTADOR = "CODIGO_TRANSPORTADOR";
    
    /**
     * IDENTIFICAÇÃO DO VEÍCULO (PLACA 1) - Informe a identificação do Veículo (ex. Placa</br>
     * (no formato AAANNNN), prefixo). Quando se tratar de cupom fiscal, preencher com</br>
     * espaços.</br>    
     */
    public static final String IDENTIFICACAO_VEICULO_PLACA_1 = "IDENTIFICACAO_VEICULO_PLACA_1";
    
    /**
     * I.E. DO SUBSTITUTO TRIBUTÁRIO - Informe a Inscrição Estadual do Substituto Tributário</br>
     * no Estado de destino da mercadoria. Quando se tratar de cupom fiscal, preencher com</br>
     * espaços.</br>       
     */
    public static final String IE_SUBSTITUTO_TRIBUTARIO = "IE_SUBSTITUTO_TRIBUTARIO";
    
    /**
     * QTDE DE VOLUMES - Informe a quantidade de Volumes da nota fiscal. Quando se tratar</br>
     * de cupom fiscal, zerar este campo.</br>  
     */
    public static final String QUANTIDADE_VOLUMES = "QUANTIDADE_VOLUMES";
    
    /**
     * ESPÉCIE DOS VOLUMES - Informe a espécie de volume da nota fiscal, exemplo: caixa.</br>
     * Quando se tratar de cupom fiscal, preencha este campo com espaços.</br>       
     */
    public static final String ESPECIE_VOLUMES = "ESPECIE_VOLUMES";
    
    /**
     * I.E. DO TRANSPORTADOR - Informe a Inscrição Estadual do Transportador caso a nota</br>
     * possua produto classificado como Combustível/Solvente e se Houve Movimentação Física</br>
     * da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>   
     */
    public static final String IE_TRANSPORTADOR = "IE_TRANSPORTADOR";
    
    /**
     * ESTADO DO TRANSPORTADOR - Informe o Estado do transportador caso a nota possua</br>
     * produto classificado como Combustível/Solvente e se Houve Movimentação Física da</br>
     * Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>   
     */
    public static final String ESTADO_TRANSPORTADOR = "ESTADO_TRANSPORTADOR";
    
    /**
     * ESTADO DA PLACA DO VEÍCULO (PLACA 1) - Informe o Estado da Placa do Veículo</br>
     * (estado da placa informada no campo 17). Se a nota possuir produto classificado como</br>
     * Combustível/Solvente, este campo somente deverá ser informado se a Via de transporte</br>
     * for Rodoviário ou Rodo-Ferroviário e se Houve Movimentação Física da Mercadoria, caso</br>
     * contrário, preencher com espaços.</br>
     * OBS. Se a empresa utiliza a geração da EFD - Escrituração Fiscal Digital, este campo deve</br>
     * ser informado também quando a nota NÃO possuir produto classificado como</br>
     * Combustível/Solvente.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>  
     */
    public static final String ESTADO_PLACA_VEICULO_1 = "ESTADO_PLACA_VEICULO_1";
    
    /**
     * IDENTIFICAÇÃO DO VEÍCULO (PLACA 2) Informe a placa 2 do veículo (no formato</br>
     * AAANNNN) quando for utilizado veículo semi-reboque ou reboque. Este campo deverá ser</br>
     * informado se a via de transporte for Rodoviário ou Rodo-Ferroviário, se a nota possuir</br>
     * produto classificado como combustível/Solvente e se houve movimentação física da</br>
     * mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String IDENTIFICACAO_VEICULO_PLACA_2 = "IDENTIFICACAO_VEICULO_PLACA_2";
    
    /**
     * ESTADO DA PLACA DO VEÍCULO (PLACA 2) - Informe o Estado da Placa 2 do veículo</br>
     * quando for utilizado veículo semi-reboque ou reboque. Este campo deverá ser informado</br>
     * se a Via de transporte for Rodoviário ou Rodo-Ferroviário, se a nota possuir produto</br>
     * classificado como Combustível/Solvente e se Houve Movimentação Física da Mercadoria,</br>
     * caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String ESTADO_PLACA_VEICULO_2 = "ESTADO_PLACA_VEICULO_2";
    
    /**
     * IDENTIFICAÇÃO DO VEÍCULO (PLACA 3) Informe a placa 3 do veículo (no formato</br>
     * AAANNNN) quando for utilizado veículo semi-reboque ou reboque. Este campo deverá ser</br>
     * informado se a via de transporte for Rodoviário ou Rodo-Ferroviário, se a nota possuir</br>
     * produto classificado como combustível/Solvente e se houve movimentação física da</br>
     * mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String IDENTIFICACAO_VEICULO_PLACA_3 = "IDENTIFICACAO_VEICULO_PLACA_3";
    
    /**
     * ESTADO DA PLACA DO VEÍCULO (PLACA 3) - Informe o Estado da Placa 3 do veículo</br>
     * quando for utilizado veículo semi-reboque ou reboque. Este campo deverá ser informado</br>
     * se a Via de transporte for Rodoviário ou Rodo-Ferroviário, se a nota possuir produto</br>
     * classificado como Combustível/Solvente e se Houve Movimentação Física da Mercadoria,</br>
     * caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String ESTADO_PLACA_VEICULO_3 = "ESTADO_PLACA_VEICULO_3";
    
    /**
     * LOCAL DE SAÍDA DA MERCADORIA - Informe "1" se a saída física da mercadoria</br>
     * aconteceu no estabelecimento do Emitente, e "2" se em outro estabelecimento. Este</br>
     * campo deverá ser informado caso a nota possua produto classificado como</br>
     * Combustível/Solvente e se Houve Movimentação Física da Mercadoria, caso contrário,</br>
     * preencher com zero.</br>
     * Quando se tratar de cupom fiscal, preencher com zero.</br>    
     */
    public static final String LOCAL_SAIDA_MERCADORIA = "LOCAL_SAIDA_MERCADORIA";
    
    /**
     * CNPJ/CPF DA SAÍDA DA MERCADORIA - Informe o CNPJ/CPF do estabelecimento em</br>
     * que houve a saída física da mercadoria. Este campo deverá ser informado caso a nota</br>
     * possua produto classificado como Combustível/Solvente e se Houve Movimentação Física</br>
     * da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String CNPJ_CPF_SAIDA_MERCADORIA = "CNPJ_CPF_SAIDA_MERCADORIA";
    
    /**
     * ESTADO DA SAÍDA DA MERCADORIA - Informe o Estado do estabelecimento em que</br>
     * houve a saída física da mercadoria. Este campo deverá ser informado caso a nota possua</br>
     * produto classificado como Combustível/Solvente e se Houve Movimentação Física da</br>
     * Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String ESTADO_SAIDA_MERCADORIA = "ESTADO_SAIDA_MERCADORIA";
    
    /**
     * I.E. DA SAÍDA DA MERCADORIA - Informe a Inscrição Estadual do estabelecimento em</br>
     * que houve a saída física da mercadoria. Este campo deverá ser informado caso a nota</br>
     * possua produto classificado como Combustível/Solvente e se Houve Movimentação Física</br>
     * da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String IE_SAIDA_MERCADORIA = "IE_SAIDA_MERCADORIA";
    
    /**
     * LOCAL DE RECEBIMENTO DA MERCADORIA - Informe "1" se o recebimento físico da</br>
     * mercadoria aconteceu no estabelecimento do Destinatário, e "2" se em outro</br>
     * estabelecimento. Este campo deverá ser informado caso a nota possua produto</br>
     * classificado como Combustível/Solvente e se Houve Movimentação Física da Mercadoria,</br>
     * caso contrário, preencher com zero.</br>
     * Quando se tratar de cupom fiscal, preencher com zero.</br>    
     */
    public static final String LOCAL_RECEBIMENTO_MERCADORIA = "LOCAL_RECEBIMENTO_MERCADORIA";
    
    /**
     * CNPJ/CPF DO RECEBIMENTO DA MERCADORIA - Informe o CNPJ/CPF do</br>
     * estabelecimento em que houve o recebimento físico da mercadoria. Este campo deverá ser</br>
     * informado caso a nota possua produto classificado como Combustível/Solvente e se Houve</br>
     * Movimentação Física da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String CNPJ_CPF_RECEBIMENTO_MERCADORIA = "CNPJ_CPF_RECEBIMENTO_MERCADORIA";
    
    /**
     * ESTADO DO RECEBIMENTO DA MERCADORIA - Informe o Estado do estabelecimento</br>
     * em que houve o recebimento físico da mercadoria. Este campo deverá ser informado</br>
     * caso a nota possua produto classificado como Combustível/Solvente e se Houve</br>
     * Movimentação Física da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String ESTADO_RECEBIMENTO_MERCADORIA = "ESTADO_RECEBIMENTO_MERCADORIA";
    
    /**
     * I.E. DO RECEBIMENTO DA MERCADORIA - Informe a Inscrição Estadual do</br>
     * estabelecimento em que houve o recebimento físico da mercadoria. Este campo deverá ser</br>
     * informado caso a nota possua produto classificado como Combustível/Solvente e se Houve</br>
     * Movimentação Física da Mercadoria, caso contrário, preencher com espaços.</br>
     * Quando se tratar de cupom fiscal, preencher com espaços.</br>    
     */
    public static final String IE_RECEBIMENTO_MERCADORIA = "IE_RECEBIMENTO_MERCADORIA";
    
    /**
     * UF DO TRANSPORTADOR - Informe a UF do transportador. Esse campo, somente deverá</br>
     * ser informado se na nota fiscal houver algum produto Combustível/Solvente e que tenha</br>
     * movimentação física, caso contrário, preencha com espaços.</br>    
     */
    public static final String UF_TRANSPORTADOR = "UF_TRANSPORTADOR";
    
    /**
     * CONTROLE DO SISTEMA - Informe "0" (zero) para controle interno do Sistema E-Fiscal.</br>    
     */
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";


    public E221ChaveLancamentoProdutosServicos() {
        
        setName("Folhamatic - Chave de Lançamento de Produto ou Serviço");
        
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
        
        // N
        FieldDecimalFixedLengthArchetype faip062 = new FieldDecimalFixedLengthArchetype(6, 2);
        faip062.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip076 = new FieldDecimalFixedLengthArchetype(7, 6);
        faip076.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip074 = new FieldDecimalFixedLengthArchetype(7, 4);
        faip074.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip14 = new FieldDecimalFixedLengthArchetype(14, 0);
        faip14.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip133 = new FieldDecimalFixedLengthArchetype(13, 3);
        faip133.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip142nn = new FieldDecimalFixedLengthArchetype(14, 2);
        
        FieldDecimalFixedLengthArchetype faip143 = new FieldDecimalFixedLengthArchetype(14, 3);
        faip143.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip144 = new FieldDecimalFixedLengthArchetype(14, 4);
        faip144.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip146 = new FieldDecimalFixedLengthArchetype(14, 6);
        faip146.setAcceptNullable(true);
        
        FieldDecimalFixedLengthArchetype faip155 = new FieldDecimalFixedLengthArchetype(15, 5);
        faip155.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling('N');
        
        // D
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E221"));
        addFieldArchetype(ENTRADA_SAIDA, fef);
        addFieldArchetype(ESPECIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SUBSERIE_NOTA_FISCAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_CLIENTE_FORNECEDOR, new FieldStringFixedLengthArchetype(20));

        addFieldArchetype(FRETE, faip142);
        addFieldArchetype(SEGURO, faip142);
        addFieldArchetype(DESPESAS_ACESSORIAS, faip142);
        addFieldArchetype(QUANTIDADE_ITENS_NOTA_FISCAL, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(PIS_COFINS, faip142nn);
        addFieldArchetype(PESO_BRUTO, faip133);
        addFieldArchetype(PESO_LIQUIDO, faip133);
        addFieldArchetype(VIA_TRANSPORTE, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_TRANSPORTADOR, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(IDENTIFICACAO_VEICULO_PLACA_1, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(IE_SUBSTITUTO_TRIBUTARIO, new FieldStringFixedLengthArchetype(18));
        addFieldArchetype(QUANTIDADE_VOLUMES,  new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(ESPECIE_VOLUMES, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(IE_TRANSPORTADOR, new FieldStringFixedLengthArchetype(18));
        addFieldArchetype(ESTADO_TRANSPORTADOR, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ESTADO_PLACA_VEICULO_1, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IDENTIFICACAO_VEICULO_PLACA_2, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(ESTADO_PLACA_VEICULO_2, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IDENTIFICACAO_VEICULO_PLACA_3, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(ESTADO_PLACA_VEICULO_3, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(LOCAL_SAIDA_MERCADORIA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CNPJ_CPF_SAIDA_MERCADORIA, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(ESTADO_SAIDA_MERCADORIA, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE_SAIDA_MERCADORIA, new FieldStringFixedLengthArchetype(18));
        addFieldArchetype(LOCAL_RECEBIMENTO_MERCADORIA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CNPJ_CPF_RECEBIMENTO_MERCADORIA, new FieldStringFixedLengthArchetype(14));
        addFieldArchetype(ESTADO_RECEBIMENTO_MERCADORIA, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE_RECEBIMENTO_MERCADORIA, new FieldStringFixedLengthArchetype(18));
        addFieldArchetype(UF_TRANSPORTADOR, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CONTROLE_SISTEMA, new FieldIntegerFixedLengthArchetype(1));
    }
    
    
    
    
}
