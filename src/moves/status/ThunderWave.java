package moves.status;

//Thunder Wave paralyzes the opponent. Paralyzed Pokémon have a 25% chance of not being able to attack, and their Speed is decreased by 50%

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC,0 , 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            pokemon.setCondition(new Effect().condition(Status.PARALYZE));
        }
    }

    @Override
    protected String describe(){
        return "Use ThunderWave";
    }


}
