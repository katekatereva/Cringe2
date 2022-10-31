package pokemons;

import moves.BulkUp;
import moves.FocusBlast;
import moves.PoisonJab;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sawk extends Pokemon {
    public Sawk(String name, int level)
    {
        super(name,level);
        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.FIGHTING);
        addMove(new Rest());
        addMove(new BulkUp());
        addMove(new PoisonJab());
        addMove(new FocusBlast());
    }
}
