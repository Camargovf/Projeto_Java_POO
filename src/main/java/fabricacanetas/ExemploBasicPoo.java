package treino.java.fabricacanetas;

import fabricacanetas.Lapis;

public class ExemploBasicPoo {


    public static void main(String[] args) {

        CanetaFabrica canetaconstruida1 = new CanetaFabrica("azul", 0.7);
        canetaconstruida1.verificar();
        canetaconstruida1.rabiscar();
        canetaconstruida1.destampar();

        // Instanciando classes e criando objetos.

        Caneta c1 = new Caneta();
        c1.setCor("Azul");
        c1.setPonta(0.5);
        System.out.println("Caneta c1 é " + c1.getPonta() + " " + c1.getCor());
        c1.tampar();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.setCor("preta");
        c2.destampar();
        c2.rabiscar();
        System.out.println("\nA cor da caneta c2 é " + c2.getCor());

        Caneta c3 = new Caneta();
        c3.status();


        Lapis rebec = new Lapis();
        rebec.modelo = "Grafite premmy";
        rebec.ponta = 0.7;
        System.out.println("\nSou um lápis");
        rebec.escrever();

        Borracha borracha = new Borracha();
        borracha.tamanho = "pequena";
        borracha.formato = "redonda";
        borracha.apagar();
        System.out.println("\nA borracha é " + borracha.tamanho + " e seu formato é " + borracha.formato);

    }

}
