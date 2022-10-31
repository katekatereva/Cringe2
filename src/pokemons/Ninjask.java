package pokemons;

import moves.Slash;

public class Ninjask extends Nincada {
    public Ninjask(String name, int level){
        super(name, level);
        setStats(61, 90, 45, 50, 50, 160);
        addMove(new Slash());
    }
}
