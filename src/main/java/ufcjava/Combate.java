package treino.java.ufcjava;

public class Combate {
    public static void main(String[] args) {

        Lutador lutador[] = new Lutador[6];
        // nome, nacionalidade, idade, altura, peso, vitoria, derrota e empate.

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador[1] = new Lutador("Barack Obama", "Brasil", 31, 1.68, 57.8, 14, 2, 3);
        lutador[2] = new Lutador("Tio Pangaré", "França", 34, 1.65, 80.9, 13, 3, 1);
        lutador[3] = new Lutador("Patinho", "Eua", 22, 1.90, 110.2, 2, 30, 1);
        lutador[4] = new Lutador("Joao", "Brasil", 34, 1.83, 95.2, 90, 2, 23);
        lutador[5] = new Lutador("Rikaie", "Alemanhã", 19, 1.99, 90.2, 10, 0, 1);


        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[4], lutador[5]);
        UFC01.lutar();
        lutador[4].status();
        lutador[5].status();

//        lutador[0].apresentar();
//        lutador[0].status();
//        lutador[5].setPeso(10.3);
//        lutador[5].status();
//        lutador[5].setPeso(93.2);
//        lutador[5].apresentar();
//        lutador[5].status();


    }
}
