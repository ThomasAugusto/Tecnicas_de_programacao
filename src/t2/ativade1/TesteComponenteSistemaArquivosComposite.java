package t2.ativade1;

public class TesteComponenteSistemaArquivosComposite {
    public static void main(String[] args) {
        // Criando arquivos
        Arquivo arquivo1 = new Arquivo("documento.txt", 200);
        Arquivo arquivo2 = new Arquivo("notas.txt", 150);
        Arquivo foto1 = new Arquivo("foto.jpg", 500);
        Arquivo fundo = new Arquivo("fundo.png", 300);

        // Criando diretórios
        Diretorio raiz = new Diretorio("Raiz");
        Diretorio imagens = new Diretorio("Imagens");

        // Adicionando arquivos aos diretórios
        imagens.adicionarArquivo(foto1);
        imagens.adicionarArquivo(fundo);
        raiz.adicionarArquivo(arquivo1);
        raiz.adicionarArquivo(arquivo2);
        raiz.adicionarArquivo(imagens);

        // Criando um diretório que contém outros diretórios
        Diretorios diretorioPrincipal = new Diretorios("MeuSistema");
        diretorioPrincipal.adicionarDiretorio(raiz);

        diretorioPrincipal.listar("");
    }
}
