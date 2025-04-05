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
 * 01/10/2018
 * 
 * Este registro importará os dados para o Cadastro da Natureza da Operação do
 * sistema, o qual consta no Menu Arquivos - Cadastros.
 *
 * Este cadastro será utilizado nos Lançamentos dos Produtos das notas fiscais
 * de entradas e saídas, registrados no sistema ou importados através dos
 * registros E221 e E222.
 *
 * As informações importadas através deste registro serão utilizadas na geração
 * EFD - Escrituração Fiscal Digital e SINCO.
 *
 */
public class E027CadastroDaNaturezaDaOperacao extends LineArchetype{
    
    public static final String NOME_REGISTRO = "NOME_REGISTRO";
    
    
    /*
    Informe o código da natureza da operação. Este
    código é de livre atribuição do estabelecimento e não poderá ser utilizado em duplicidade.
    Campo obrigatório
     */
    public static final String CODIGO_NATUREZA_OPERACAO = "CODIGO_NATUREZA_OPERACAO";
    
    /*
    Informe a descrição da
    natureza da operação. Não poderá ser cadastrado mais que uma vez a mesma descrição da
    natureza da operação mesmo que os códigos sejam diferentes.

    Exemplo:
    Código 01 - Venda de Mercadorias
    Código 02 - Venda de Mercadorias

    OBS: O preenchimento deste campo é obrigatório.
     */
    public static final String DESCRICAO_CODIGO_NATUREZA_OPERACAO = "DESCRICAO_CODIGO_NATUREZA_OPERACAO";
    
    /*
    Informe a Data de Inclusão ou Alteração no formato
    AAAAMMDD dos dados da Natureza da Operação no cadastro. Esta informação será
    utilizada para fins da geração do SINCO
     */
    public static final String DATA_INCLUSAO_ALTERACAO = "DATA_INCLUSAO_ALTERACAO";
    
    /*
    Informe "0" (zero) para controle interno do Sistema E-Fiscal
     */
    public static final String CONTROLE_SISTEMA = "CONTROLE_SISTEMA";

    
    
    public E027CadastroDaNaturezaDaOperacao() {
       
        setName("Folhamatic - Cadastro da Natureza da Operação");
        
        FieldDateFixedLengthArchetype faa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        faa.setAcceptNullable(true);
        faa.setFullFillingNullable(true);
        faa.setFullFiling(' ');
        
        addFieldArchetype(NOME_REGISTRO, new FieldDefaultArchetype("E027"));
        addFieldArchetype(CODIGO_NATUREZA_OPERACAO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DESCRICAO_CODIGO_NATUREZA_OPERACAO, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(DATA_INCLUSAO_ALTERACAO, faa);
        addFieldArchetype(CONTROLE_SISTEMA, new FieldDefaultArchetype("0"));
    }
}
