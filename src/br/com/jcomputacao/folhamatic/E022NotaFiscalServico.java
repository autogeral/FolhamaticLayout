package br.com.jcomputacao.folhamatic;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldEnumFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * <br>**** Quais registros gerar? ****</br>
 * <br>Se você possui esta dúvida, consulte o contador para saber quais registros devem ser gerados em cada empresa para atender suas obrigações fiscais perante o estado, o município, a legislação federal, comercial e contábil.
 * <br>Exemplo:</br>
 * <br>Para uma nota fiscal de venda, seria necessário gerar no mínimo os registros</br>
 * <br>IDENTICAÇÃO DA EMPRESA (sempre obrigatório) CADASTRO DE CLIENTES/FORNECEDORES CADASTRO DE PRODUTOS/SERVIÇOS</br>
 * <br>NOTAS FISCAIS (cabeçalho)</br>
 * <br>LANÇAMENTOS DE IMPOSTOS DAS NOTAS FISCAIS (exemplo: um registro para cada alíquota de ICMS, para cada CFOP) CHAVE DO LANÇAMENTO PRODUTOS</br>
 * <br>LANÇAMENTO DOS PRODUTOS/SERVIÇOS</br>
 * <br>E016 CONTAS REDUZIDAS</br>
 * <br>Se tem obrigações com DIPAM gerar também:</br>
 * <br>E203 DIPAM</br>
 * <br>Se é uma empresa transportadora, deverá gerar:</br>
 * <br>E220 REGISTRO DADOS DO TRANSPORTE - INFORMAÇÕES DA CARGA</br>
 * 
 * <br>05/02/2017 13:20:34</br>
 * <br>@author murilo</br>
 */

public class E022NotaFiscalServico extends LineArchetype {
    
    /**
     * E022
     */
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    /**
     * Informe o código de serviços
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICOS";
    
    /**
     * Informe a descrição do Serviço
     */
    public static final String DESCRICAO = "DESCRICAO";
    
    /**
     * <br> Informe a Data de Inclusão ou alteração</br>
     * <br> no formato AAAAMMDD dos dados do Serviço no cadastro.</br>
     */
    public static final String DATA_INCLUSAO_ALTERACAO = "DATA_INCLUSAO_ALTERACAO";
    
    /**
     * <br> LC 116/03 Campo a ser utilizado para período a partir de 01/2011 por empresas.</br>
     * <br> obrigadas a EFD - PIS/COFINS.</br>
     * <br> Informe o código do serviço conforme Tabela de Serviços da Lei Complementa.</br>
     * <br> informando ponto no código. Para os códigos com tamanho menor, deixar espaços à direita.</br>
     * <br> Exemplo: 1.01.</br>
     */
    public static final String SERVICO = "SERVICOS";
    
    /**
     * <br> Campo a ser utilizado para período a partir de 01/2011 por empresas.</br>
     * <br> obrigadas a EFD - PIS/COFINS.</br>
     * <br> Informe o código de unidade de estoque classificado no</br>
     * <br> campo 02 do registro E018 ou cadastrado no sistema no Menu Arquivos
     * <br> opção Cadastros - Cadastro de Unidades de Medida.</br>
     */
    public static final String CODIGO_UNIDADE_ESTOQUE = "CODIGO_UNIDADE_ESTOQUE";
    
    /**
     * <br> Campo a ser utilizado para período a partir de 01/2011 por empresas.</br>
     * <br> obrigadas a EFD - PIS/COFINS.</br>
     * <br> Informe o código da Conta Analítica.</br> 
     * <br> Exemplos: custo de serviços prestados por pessoa jurídica</br>
     * <br> receita da prestação de serviços,</br> 
     * <br> receitas da atividade, serviços contratados, etc</br>
     * <br> Deve ser a conta credora ou devedora principal.</br>
     */
     public static final String CONTA_ANALITICA_CONTABIL = "CONTA_ANALITICA_CONTABIL";
     
    /**
     * <br>Campo a ser utilizado para período a partir de 01/2011 por empresas.</br>
     * <br>obrigadas a EFD - PIS/COFINS.</br>
     * <br>Informe o código da Situação Tributária referente ao PIS</br>
     * <br>conforme Tabela da Situação Tributária do PIS.</br>
     */
     public static final String SITUACAO_TRIBUTARIA_PIS = "SITUACAO_TRIBUTARIA_PIS";
     
    /**
     * <br>Campo a ser utilizado para período a partir de 01/2011 por empresas.</br>
     * <br>obrigadas a EFD - PIS/COFINS.</br>
     * <br>Informe o código da Situação Tributária referente ao PIS</br>
     * <br>conforme Tabela da Situação Tributária da COFINS</br>
     */
     public static final String SITUACAO_TRIBUTARIA_COFINS = "SITUACAO_TRIBUTARIA_COFINS";
     
    /**
     * <br>Campo a ser utilizado para período a partir de 01/2011 por empresas</br> 
     * <br>obrigadas a EFD - PIS/COFINS.</br>
     * <br>Informe "1" se o produto pertence à Incidência Cumulativa</br> 
     * <br>ou "2" se o produto pertence a Incidência Não Cumulativa de PIS/COFINS. Somente</br> 
     * <br>preencha este campo, quando sua empresa se tratar de Empresa Mista (cadastro da</br> 
     * <br>empresa, com opção "Incidência nos Regimes Cumulativo e Não Cumulativo" no botão</br> 
     * <br>Configurações EFD PIS/COFINS). Caso sua empresa não se enquadre nesta condição,</br> 
     * <br>preencha o campo com espaço.</br>
     */
     public static final String TIPO_INCIDENCIA = "TIPO_INCIDENCIA";
     
    /**
     * <br>Informe "0" (zero) para controle interno do Sistema E-Fiscal</br> 
     */
      public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";
      
      public E022NotaFiscalServico(){
          setName("Folhamatic - Nota Fiscal Servico");
           
        FieldDecimalFixedLengthArchetype faip = new FieldDecimalFixedLengthArchetype(7, 4);
        faip.setAcceptNullable(true);
        
        FieldEnumFixedLengthArchetype fef = new FieldEnumFixedLengthArchetype(1, FieldEnumFixedLengthArchetype.EnumType.STRING);
        fef.setAcceptNullable(true);
        fef.setFullFillingNullable(true);
        fef.setFullFiling('S');
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        FieldDateFixedLengthArchetype faann = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faann.setFullFiling(' ');
        
        FieldDecimalFixedLengthArchetype faip142 = new FieldDecimalFixedLengthArchetype(14, 2);
        faip142.setAcceptNullable(true);
        
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(20);
        fa.setAcceptNullable(true);
        fa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E022"));
        addFieldArchetype(CODIGO_SERVICO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DESCRICAO, new FieldStringFixedLengthArchetype(45));
        
        addFieldArchetype(DATA_INCLUSAO_ALTERACAO, faa);
        addFieldArchetype(SERVICO, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_UNIDADE_ESTOQUE, new FieldStringFixedLengthArchetype(6));
        
        addFieldArchetype(CONTA_ANALITICA_CONTABIL, new FieldStringFixedLengthArchetype(60));
        addFieldArchetype(SITUACAO_TRIBUTARIA_PIS, new FieldIntegerFixedLengthArchetype<Long>(2));
        addFieldArchetype(SITUACAO_TRIBUTARIA_COFINS, new FieldIntegerFixedLengthArchetype<Long>(2));
        
        addFieldArchetype(TIPO_INCIDENCIA, fef);
        addFieldArchetype(CONTROLE_SISTEMA, new FieldIntegerFixedLengthArchetype<Long>(1));
        
          
      }
}
