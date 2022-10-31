package moves;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.NORMAL, 18, 0.8);
    }
    int x = (int)((Math.random() * 7 + 1) + 1);

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (x <= 3){
            super.applyOppDamage(pokemon, v);
            super.applyOppDamage(pokemon, v);
        }else{
            if (x <= 6){
                super.applyOppDamage(pokemon, v);
                super.applyOppDamage(pokemon, v);
                super.applyOppDamage(pokemon, v);
            }else{
                if (x == 7) {
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                }else{
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                    super.applyOppDamage(pokemon, v);
                }
            }
        }
    }
    @Override
    protected String describe() {
        return "use FurySwipes";
    }
}
