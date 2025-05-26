package t2.ativade1;

import java.util.ArrayList;

public class Diretorios implements ComponenteSistemaArquivos{
    private String nomeDiretorioPai;
    private ArrayList<Diretorio> diretoriosFilhos;

    public Diretorios(String nomeDiretorioPai) {
        this.nomeDiretorioPai = nomeDiretorioPai;
        this.diretoriosFilhos = new ArrayList<Diretorio>();
    }

    public void adicionarDiretorio(Diretorio diretorio) {
        diretoriosFilhos.add(diretorio);
    }

    public void removerDiretorio(Diretorio diretorio) {
        diretoriosFilhos.remove(diretorio);
    }

    @Override
    public void listar(String indentacao) {
        System.out.printf("%s- Diretorio: %s (%d bytes)\n"
                , indentacao, nomeDiretorioPai, obterTamanhoBytes());
        for (Diretorio filho : diretoriosFilhos) {
            filho.listar(indentacao);
        }
    }

    @Override
    public long obterTamanhoBytes() {
        long tamanhoDiretorioPai = 0;
        for (Diretorio diretorio : diretoriosFilhos) {
            tamanhoDiretorioPai += diretorio.obterTamanhoBytes();
        }
        return tamanhoDiretorioPai;
    }
}
