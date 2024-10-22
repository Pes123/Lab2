package pokemons;

import moves.physical.Facade;
import moves.special.Absorb;
import moves.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish {
    public Gloom(String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(60,65,70,85,75,40);
        setMove(new Absorb());
    }
}

