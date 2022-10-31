package moves;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(){
        super(Type.POISON, 80, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.POISON));
    }
    @Override
    protected String describe() {
        return "use PoisonJab";
    }
}
