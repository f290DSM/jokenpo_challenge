package domain;

import java.util.Arrays;

public enum TipoJogada {
    PAPEL(1),
    TESOURA(2),
    PEDRA(3),
    LAGARTO(4),
    SPOCK(5);

    private int id;

    public int getId() {
        return id;
    }

    TipoJogada(Integer id) {
        this.id = id;
    }

    public static TipoJogada getTipo(int id) {
        return Arrays.stream(TipoJogada.values())
                .filter(t -> t.id == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Id inválido. ID: " + id));
    }
}
