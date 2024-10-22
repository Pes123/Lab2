package moves.special;

import ru.ifmo.se.pokemon.*;

/*
Energy Ball deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
 */

public class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double flip = Math.random();
        if (flip <= 0.3) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "Use Energy Ball";
    }
}
