package domain;

public class Jokenpo {
    private Algoritmo algoritmo;

    public Jokenpo setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
        return this;
    }

    public void jogar(TipoJogada tipo) {
        this.algoritmo.execute(tipo);
    }
}
