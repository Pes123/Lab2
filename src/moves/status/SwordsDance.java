package moves.status;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL,0 , 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemom) {
        pokemom.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "Use SwordsDance";
    }
}
