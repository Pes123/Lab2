package pokemons;

import moves.physical.Astonish;
import moves.special.MegaDrain;
import moves.special.SludgeBomb;
import moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Palossand extends Sandygast {
    public Palossand(String name, int level){
        super(name, level);
        setType(Type.GHOST, Type.GROUND);
        setStats(85,75,110,100,75,35);
        setMove(new SludgeBomb());
    }
}
