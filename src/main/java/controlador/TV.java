package treino.java.controlador;

public class TV {
    public static void main(String[] args) {
        ControleRemoto controleremoto = new ControleRemoto();
        controleremoto.ligar();
        controleremoto.maisVolume();
        controleremoto.play();
        controleremoto.pause();
        controleremoto.abrirMenu();
        controleremoto.fecharMenu();

    }
}
