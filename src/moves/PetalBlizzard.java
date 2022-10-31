package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PetalBlizzard extends PhysicalMove {
    public PetalBlizzard(){
        super(Type.GRASS, 90, 1);
    }
    @Override
    protected String describe() {
        return "use PetalBlizzard";
    }
}
