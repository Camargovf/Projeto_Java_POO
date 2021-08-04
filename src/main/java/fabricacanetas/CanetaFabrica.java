package treino.java.fabricacanetas;


import fabricacanetas.MetodosCaneta;

public class CanetaFabrica implements MetodosCaneta {

    // Atributos

    public String cor;
    public double ponta;
    public boolean tampada;

    //construtor

    public CanetaFabrica(String c, Double p) {
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.tampada = true;

    }

    /**
     * Demonstração Método Acessores e Modificadores (Get Set)
     * <p>
     * <p>
     * /** Nao utilizado aqui por didática.
     * <p>
     * GETTERS - SETTERS
     * métodos acessores e modificadores: buscam, protegem os privados e criam uma camada a mais,
     * no caso de boolean o termo é 'is' ligado.
     */


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
        if (tampada)
            System.out.println("A caneta está sem tampa!");
        else {
            System.out.println("A caneta está com tampa!");
        }
    }

    @Override
    public void verificar() {

        System.out.println("A Caneta:");
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor: " + cor);

    }
}
