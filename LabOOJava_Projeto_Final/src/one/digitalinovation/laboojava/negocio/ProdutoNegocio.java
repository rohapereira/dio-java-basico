package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Produto;
import one.digitalinovation.laboojava.entidade.constantes.Materias;
import one.digitalinovation.laboojava.entidade.Livro;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe para manipular a entidade {@link Produto}.
 * @author thiago leite
 */
public class ProdutoNegocio {

    //{@inheritDoc}.
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter armazenar e ter acesso os produtos
     */
    public ProdutoNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Salva um novo produto(livro ou caderno) na loja.
     * @param novoProduto Livro ou caderno que pode ser vendido
     */
    public void salvar(Produto novoProduto) {

        String codigo = "PR%04d";
        codigo = String.format(codigo, bancoDados.getProdutos().length);
        novoProduto.setCodigo(codigo);

        boolean produtoRepetido = false;
        for (Produto produto: bancoDados.getProdutos()) {
            if (produto.getCodigo().equalsIgnoreCase(codigo)) { //== novoProduto.getCodigo()
                produtoRepetido = true;
                System.out.println("Produto já cadastrado.");
                break;
            }
        }

        if (!produtoRepetido) {
            this.bancoDados.adicionarProduto(novoProduto);
            System.out.println("Produto cadastrado com sucesso.");
        }
    }

    /**
     * Exclui um produto pelo código de cadastro.
     * @param codigo Código de cadastro do produto
     */
    public void excluir(String codigo) {
    	
    	int produtoExclusao = -1;
        for (int i = 0; i < bancoDados.getProdutos().length; i++) {

            Produto produto = bancoDados.getProdutos()[i];
            if (produto.getCodigo().equals(codigo)) {
                produtoExclusao = i;
                break;
            }
        }

        if (produtoExclusao != -1) {
            bancoDados.removerProduto(produtoExclusao);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto inexistente.");
        }
    }

    /**
     * Obtem um produto a partir de seu código de cadastro.
     * @param codigo Código de cadastro do produto
     * @return Optional indicando a existência ou não do Produto
     */
    public Optional<Produto> consultar(String codigo) {

        for (Produto produto: bancoDados.getProdutos()) {

            if (produto.getCodigo().equalsIgnoreCase(codigo)) {
                return  Optional.of(produto);
            }
        }

        return Optional.empty();
    }

    //Lista todos os produtos cadastrados.
    public void listarTodos() {

        if (bancoDados.getProdutos().length == 0) {
            System.out.println("Não existem produtos cadastrados");
        } else {

            for (Produto produto: bancoDados.getProdutos()) {
                System.out.println(produto.toString());
            }
        }
    }
    
    public List<Produto> buscarPorNome(String nome) {
        return Arrays.stream(bancoDados.getProdutos()) // Converte o array em um stream
                     .filter(produto -> produto instanceof Livro) // Filtra apenas os livros
                     .filter(produto -> produto.getNome().equalsIgnoreCase(nome))
                     .collect(Collectors.toList()); // Converte o stream em uma lista
    }
    
    public List<Produto> buscarPorMateria(String materiaCaderno) {
        Materias materiaEnum;
        try {
            materiaEnum = Materias.valueOf(materiaCaderno.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Materia não encontrada.");
            return List.of();  // Retorna lista vazia se a materia não existe
        }

        return bancoDados.getListaProdutos().stream()
                         .filter(produto -> produto.getMateria() == materiaEnum)
                         .collect(Collectors.toList());
    }
}
