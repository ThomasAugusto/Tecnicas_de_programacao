package t2.atividade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private static final int LIMITE_LIVROS_EMPRESTADOS = 3;
    
    private final List<Emprestimo> emprestimosRealizados;
    private final List<Cliente> clientesCadastrados;
    private final List<Livros> livrosDisponiveis;

    public Biblioteca() {
        this.emprestimosRealizados = new ArrayList<>();
        this.clientesCadastrados = new ArrayList<>();
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void cadastrarCliente(String nome) {
        validarNome(nome);
        if (buscarClientePorNome(nome).isPresent()) {
            throw new IllegalStateException("Cliente já cadastrado");
        }
        clientesCadastrados.add(new Cliente(nome));
    }

    public void cadastrarLivro(String titulo) {
        validarTitulo(titulo);
        livrosDisponiveis.add(new Livros(titulo));
    }

    public void emprestarLivro(String nomeCliente) {
        Cliente cliente = buscarClientePorNome(nomeCliente)
            .orElseThrow(() -> new IllegalArgumentException("Cliente não cadastrado"));

        if (!podePegarEmprestado(cliente)) {
            throw new IllegalStateException("Cliente atingiu limite de empréstimos");
        }

        List<Livros> livrosDisponiveis = listarLivrosDisponiveis();
        if (livrosDisponiveis.isEmpty()) {
            throw new IllegalStateException("Não há livros disponíveis");
        }


        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivros(Collections.singletonList(livrosDisponiveis.get(0)));
        
        cliente.setNumLivrosEmprestados(cliente.getNumLivrosEmprestados() + 1);
        livrosDisponiveis.get(0).setDisponivel(false);
        emprestimosRealizados.add(emprestimo);
    }

    public List<Livros> listarLivrosDisponiveis() {
        return livrosDisponiveis.stream()
                .filter(Livros::isDisponivel)
                .toList();
    }

    public List<Emprestimo> listarEmprestimos() {
        return new ArrayList<>(emprestimosRealizados);
    }

    private boolean podePegarEmprestado(Cliente cliente) {
        return cliente.getNumLivrosEmprestados() < LIMITE_LIVROS_EMPRESTADOS;
    }

    private Optional<Cliente> buscarClientePorNome(String nome) {
        return clientesCadastrados.stream()
                .filter(cliente -> cliente.getNome().equals(nome))
                .findFirst();
    }

    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
    }

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio");
        }
    }
}