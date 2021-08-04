package treino.java.fabricacanetas;

import fabricacanetas.MetodosCaneta;

public class Caneta implements MetodosCaneta {

    // Atributos

    private String cor;
    private double ponta;
    public boolean tampada;

    //Demonstração Método Acessores e Modificadores (Get Set)

    /**
     * GETTERS - SETTERS
     * métodos acessores e modificadores: buscam, protegem os privados e criam uma camada a mais,
     * no caso de boolean o termo é 'is' ligado.
     */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }


    //Métodos

    /**
     * Métodos Uma classe deve fazer apenas uma coisa (Responsabilidade Única)
     * A interface serve para criar uma - herança múltipla
     **/


    @Override
    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Não posso rabiscar estando com a tampa da caneta!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    @Override
    public void status() {
        if (tampada)
            System.out.println("A caneta está sem tampa!");
        else {
            System.out.println("A caneta está com tampa!");
        }
    }

    @Override
    public void tampar() {
        System.out.println("tampando caneta... ");
        this.tampada = true;
    }

    @Override
    public void destampar() {
        System.out.println("destampando caneta...");
        this.tampada = false;


    }

    @Override
    public void verificar() {
        System.out.println("A Caneta: ");
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
    }


}





