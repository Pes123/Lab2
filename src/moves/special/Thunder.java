package moves.special;

import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)){
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));

        }
    }
    @Override
    protected String describe() {
        return "Use Thunder";
    }
}
