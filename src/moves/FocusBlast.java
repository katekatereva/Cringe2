package moves;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120, 0.7);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1));
    }
    @Override
    protected String describe() {
        return "use FocusBlast";
    }
}
