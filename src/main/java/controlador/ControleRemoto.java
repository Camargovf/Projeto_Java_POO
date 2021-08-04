package treino.java.controlador;


public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;


    private boolean ligado;
    private boolean tocando;


    //Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }
    //Metodos GET SET

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    // Implementa métodos


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume((this.getVolume() + 5));
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume((this.getVolume() - 5));
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) {
            this.setVolume(0);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && (this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar.");
        }

    }
}


