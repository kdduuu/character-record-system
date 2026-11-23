package br.com.demonslayer;

public class Hashira extends CacadorDeOnis {

    public Hashira() {
        super();
    }

    public Hashira(String nome) {
        super(nome);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Categoria: Hashira");
    }
}