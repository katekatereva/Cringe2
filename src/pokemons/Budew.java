package pokemons;

import moves.Confide;
import moves.EnergyBall;
import ru.ifmo.se.pokemon.*;

public class Budew extends Pokemon {
    public Budew(String name, int level)
    {
        super(name,level);
        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.GRASS, Type.POISON);
        addMove(new Confide());
        addMove(new EnergyBall());
    }
}
