package t2.atividade4;

import java.util.List;

public class Emprestimo {
    private Cliente cliente;
    private List<Livros> livros;

    public Cliente getCliente() {
        return cliente;
    }

    public List<Livros> getLivros() {
        return livros;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }
}
