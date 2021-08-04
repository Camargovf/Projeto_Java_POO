package fabricacanetas;


//interface sem corpo
//apenas assinatura
//default permite assinatura mas usará como padrão sempre que puder.

public interface MetodosCaneta {


    default void rabiscar() {
        System.out.println("risc risc risc");
    }

    void status();

    void tampar();

    void destampar();

    void verificar();

}

