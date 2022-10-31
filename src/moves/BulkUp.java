package moves;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(){
        super(Type.FIGHTING, 0, 1);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.DEFENSE, 1).stat(Stat.ATTACK, 1));
    }
    @Override
    protected String describe() {
        return "use BulkUp";
    }
}
