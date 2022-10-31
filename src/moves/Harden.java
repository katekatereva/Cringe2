package moves;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(){
        super(Type.FIGHTING, 0, 1);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.DEFENSE, 1));
    }
    @Override
    protected String describe() {
        return "use Harden";
    }
}
