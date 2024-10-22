package moves.special;

import ru.ifmo.se.pokemon.*;

/*
Absorb deals damage and the user will recover 50% of the HP drained.
 */

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }
    //так как покемон должен хилиться после нанесия урона сделаем это как отрицательный урон по себе
    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) Math.round(-damage*0.5));
    }

    @Override
    protected String describe() {
        return "Use Absorb";
    }
}