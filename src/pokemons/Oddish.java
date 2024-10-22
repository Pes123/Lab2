package pokemons;

import moves.physical.Facade;
import moves.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(45, 50,55,75,65,30);
        setMove(new Facade(), new SwordsDance());
    }
}
