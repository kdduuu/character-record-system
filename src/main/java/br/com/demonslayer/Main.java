package br.com.demonslayer;

public class Main {

    public static void main(String[] args) {
        System.out.println("DEMON SLAYER RECORD SYSTEM");

        CatalogoPersonagens catalogo = new CatalogoPersonagens();

        Respiracao agua = new Respiracao("Água", "Sol");

        CacadorDeOnis tanjiro = new CacadorDeOnis("Tanjiro Kamado");
        tanjiro.setRespiracao(agua);

        Hashira giyu = new Hashira("Giyu Tomioka");
        giyu.setRespiracao(agua);

        LuaSuperior akaza = new LuaSuperior("Akaza", 3);
        LuaInferior enmu = new LuaInferior("Enmu", 1);

        catalogo.adicionar(tanjiro);
        catalogo.adicionar(giyu);
        catalogo.adicionar(akaza);
        catalogo.adicionar(enmu);

        catalogo.listar();
    }
}
