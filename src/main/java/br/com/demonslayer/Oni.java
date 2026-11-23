package br.com.demonslayer;

public class Oni extends Personagem {

    private Kekkijutsu kekkijutsu;

    public Oni() {
        super();
    }

    public Oni(String nome) {
        super(nome);
    }

    public Kekkijutsu getKekkijutsu() {
        return kekkijutsu;
    }

    public void setKekkijutsu(Kekkijutsu kekkijutsu) {
        this.kekkijutsu = kekkijutsu;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();

        if (kekkijutsu != null) {
            System.out.println("Kekkijutsu: " + kekkijutsu.getNome());
        }
    }
}