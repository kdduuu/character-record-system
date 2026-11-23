package br.com.demonslayer;

public class DozeKizuki extends Oni {

    private int posicao;

    public DozeKizuki() {
        super();
    }

    public DozeKizuki(String nome) {
        super(nome);
    }

    public DozeKizuki(String nome, int posicao) {
        super(nome);
        setPosicao(posicao);
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        if (posicao < 1 || posicao > 6) {
            throw new IllegalArgumentException(
                    "A posição deve estar entre 1 e 6."
            );
        }

        this.posicao = posicao;
    }
}
