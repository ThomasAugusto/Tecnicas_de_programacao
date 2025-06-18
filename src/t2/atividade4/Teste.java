package t2.atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("Código Limpo");
        biblioteca.cadastrarLivro("Arquitetura Limpa");
        biblioteca.cadastrarLivro("Padrões de Projeto");
        biblioteca.cadastrarLivro("Refatoração");
        biblioteca.cadastrarLivro("Domain-Driven Design");
        biblioteca.cadastrarLivro("Desenvolvimento orientado a objetos");

        biblioteca.cadastrarCliente("fulano");
        biblioteca.cadastrarCliente("ciclano");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        biblioteca.emprestarLivro(nome);
    }
}
