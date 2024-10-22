import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Meloetta("Ally1",25);
        Pokemon p2 = new Oddish("Ally2",15);
        Pokemon p3 = new Vileplume("Foe1",10);
        Pokemon p4 = new Palossand("Foe2", 11);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.go();
    }
}
