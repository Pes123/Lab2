package moves.status;

/*
  User sleeps for 2 turns, but user is fully healed
 */

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0, 0);
    }

    //можно ли оставить restore?

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(effect);

    }

    @Override
    protected String describe() {
        return "Use Rest";
    }
}
