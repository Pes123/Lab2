package moves.physical;

import ru.ifmo.se.pokemon.*;

/*
 Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).
 */

public class Astonish extends PhysicalMove{
    public Astonish(){
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Use Astonish";
    }
}
