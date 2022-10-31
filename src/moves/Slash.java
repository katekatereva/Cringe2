package moves;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL, 70, 1);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        Effect e = (new Effect()).chance(1).turns(0);
        e.stat(Stat.SPEED, (int) (att.getStat(Stat.SPEED) * 3));
        att.setCondition(e);
        return super.calcCriticalHit(att, def);
    }

    @Override
    protected String describe() {
        return "use Slash";
    }
}
