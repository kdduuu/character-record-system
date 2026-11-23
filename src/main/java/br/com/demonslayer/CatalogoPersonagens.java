package br.com.demonslayer;

import java.util.ArrayList;

public class CatalogoPersonagens {

    private ArrayList<Personagem> personagens = new ArrayList<>();

    public void adicionar(Personagem personagem) {
        personagens.add(personagem);
    }

    public void listar() {
        for (Personagem personagem : personagens) {
            System.out.println("--------------------");
            personagem.exibirInformacoes();
        }
    }
}
