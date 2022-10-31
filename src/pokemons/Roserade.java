package pokemons;

import moves.PoisonJab;

public class Roserade extends Roselia {
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60, 70, 65, 125,105, 90);
        addMove(new PoisonJab());
    }
}
