package pokemons;

import moves.physical.QuickAttack;
import moves.special.Thunder;
import moves.status.DoubleTeam;
import moves.status.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Meloetta extends Pokemon {
    public Meloetta(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.PSYCHIC);
        setStats(100, 77, 77, 128, 128, 90);
        setMove(new ThunderWave(), new QuickAttack(), new Thunder(), new DoubleTeam());
    }

}
