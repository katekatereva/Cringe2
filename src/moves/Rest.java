package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.SLEEP).turns(2));
    }
    @Override
    protected String describe() {
        return "use Rest";
    }
}
