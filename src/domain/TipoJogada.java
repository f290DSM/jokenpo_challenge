package domain;

import java.util.Arrays;

public enum TipoJogada {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4), SPOCK(5);

    private final Integer id;

    TipoJogada(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static TipoJogada getTipo(Integer id) {
        return Arrays.stream(values())
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Id inválido"));
    }
}
