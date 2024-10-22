package pokemons;

import moves.physical.Astonish;
import moves.special.MegaDrain;
import moves.status.Rest;
import ru.ifmo.se.pokemon.*;

public class Sandygast extends Pokemon{
    public Sandygast(String name, int level){
        super(name, level);
        setType(Type.GHOST, Type.GROUND);
        setStats(55,55,80,70,45,15);
        setMove(new Astonish(), new Rest(), new MegaDrain());
    }
}
