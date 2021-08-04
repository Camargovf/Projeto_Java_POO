package contacorrente.banco;

public class ContaBanco {

    // Atributos da Conta

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    //METODO CONSTRUTOR

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }


    /**
     * Sobre os Métodos
     * SUPER CLASSE -
     * Nesse caso o ideal seria que de acordo com o code clean, uma classe faça apenas uma coisa
     * a solucão poderia ser criar uma interface com métodos e puxar ela para a Conta Banco,
     * mas por conta de uma prática...
     * vou utilizar mais de um método aqui, a transformando em uma SUPERCLASSE!
     **/

    // Métodos
    public void estadoAtual() {
        System.out.println("-----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);

        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");

    }

    public void fecharConta() {

        if (saldo > 0) {
            System.out.println("Conta com dinheiro - não pode fechar");
        } else if (saldo < 0) {
            System.out.println("Conta com dívida - não pode fechar");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }

    public void depositar(Double v) {
        if (status = true) {
            setSaldo(getSaldo() + v);
            System.out.println("Déposito realizado ");
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(Double v) {

        if (status = saldo >= v) {
            setSaldo(getSaldo() - v);
            System.out.println("Valor sacado! ");
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(double v) {
        v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga ");
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }

    // Métodos de Acesso e Modificador GET SET


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() { //is
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}