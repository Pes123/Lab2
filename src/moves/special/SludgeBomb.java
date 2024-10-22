package moves.special;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if ((!pokemon.hasType(Type.POISON)) || (!pokemon.hasType(Type.STEEL))) {
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.POISON));
        }
    }

    @Override
    protected String describe() {
        return "Use Sludge Bomb";
    }
}
