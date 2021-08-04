package treino.java.contacorrente.banco;

public class Banco extends contacorrente.banco.ContaBanco {

    public static void main(String[] args) {

        contacorrente.banco.ContaBanco Joao = new contacorrente.banco.ContaBanco();
        Joao.setSaldo(980);
        Joao.setNumConta(1111);
        Joao.abrirConta("CC");
        Joao.depositar(100.0);
        Joao.setDono("Joao Bosco de Souza");
        Joao.setTipo("CC");
        Joao.pagarMensal(10.0);


        contacorrente.banco.ContaBanco Maria = new contacorrente.banco.ContaBanco();
        Maria.setDono("Maria Alves");
        Maria.setNumConta(121);
        Maria.abrirConta("CP");
        Maria.depositar(50.0);
        Maria.sacar(10.0);
        Maria.fecharConta();


        Joao.estadoAtual();
        Maria.estadoAtual();





    }

}