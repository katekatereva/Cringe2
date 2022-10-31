import pokemons.Ninjask;
import pokemons.Roselia;
import ru.ifmo.se.pokemon.*;

public class Pam {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Ninjask("Чужой", 1);
        Pokemon p2 = new Roselia("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
