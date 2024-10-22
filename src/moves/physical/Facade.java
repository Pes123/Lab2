package moves.physical;

import ru.ifmo.se.pokemon.*;

/*
Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.
*/

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70, 100);
    }
    protected boolean strong_damage;
    //Реализуем урон от статуса как критический удар
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        Status condition = att.getCondition();
        if (condition.equals(Status.POISON) || condition.equals(Status.BURN) || condition.equals(Status.PARALYZE)){
            strong_damage = true;
            return 2.0;
        }
        else return 1.0;
    }

    @Override
    protected String describe() {
        if (strong_damage){
            return "Use Facade и наносит x2 урон";
        }
        else{
            return "Use Facade и наносит обычный урон";
        }
    }
}
