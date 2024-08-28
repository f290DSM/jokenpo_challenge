package domain;

public class Papel extends Algoritmo {
    //TODO: Criar as demais classes para cobrir os 5 algoritmos
    @Override
    public void execute(TipoJogada tipo) {
        switch (tipo) {
            case SPOCK -> System.out.println("Venceu! Papel refuta o Spock.");
            case PEDRA -> System.out.println("Venceu! Papel embrulha a Pedra.");
            case TESOURA -> System.out.println("Perdeu! Tesoura corta o Papel.");
            case LAGARTO -> System.out.println("Perdeu! Lagarto come o Papel.");
            default -> System.out.println("Empatou");
        }
    }
}
