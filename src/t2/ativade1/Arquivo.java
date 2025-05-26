package t2.ativade1;

public class Arquivo implements ComponenteSistemaArquivos{
    private String nomeArquivo;
    private long tamanhoArquivo;

    public Arquivo(String nomeArquivo, long tamanhoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void listar(String indentacao) {
        System.out.printf(indentacao + "%s      - Arquivo: %s (%d bytes)\n"
                                , indentacao, nomeArquivo, obterTamanhoBytes());
    }

    @Override
    public long obterTamanhoBytes() {
        return tamanhoArquivo;
    }
}
