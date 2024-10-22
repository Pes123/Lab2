package moves.physical;

import ru.ifmo.se.pokemon.*;

//Quick Attack deals damage and has a priority of +1.

public class QuickAttack extends PhysicalMove{
    public QuickAttack(){
        super(Type.NORMAL, 40, 100, 1,1);
    }
    @Override
    protected String describe(){
        return "Use Quick Attack";
    }


}
