package t2.atividade4;

public class Cliente {
    private String nome;
    private int numLivrosEmprestados;

    public Cliente(String nome) {
        this.nome = nome;
        this.numLivrosEmprestados = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumLivrosEmprestados() {
        return numLivrosEmprestados;
    }

    public void setNumLivrosEmprestados(int numLivrosEmprestados) {
        this.numLivrosEmprestados = numLivrosEmprestados;
    }

}
