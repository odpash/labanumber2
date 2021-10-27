import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();  // Создаем бой
        teamOne(b);  // собираем первую команду
        teamTwo(b);  // собираем вторую команду
        b.go();  // начинаем поединок
    }

    private static void teamOne(Battle b) {
        Arceus arceus = new Arceus("Толян", 10);
        Budew budew = new Budew("Миха", 15);
        Burmy burmy = new Burmy("Радик", 20);
        b.addAlly(arceus);
        b.addAlly(budew);
        b.addAlly(burmy);
    }

    private static void teamTwo(Battle b) {
        Roselia roselia = new Roselia("Диман", 30);
        Roserade roserade = new Roserade("Саня", 5);
        Wormadam wormadam = new Wormadam("Володя", 10);
        b.addFoe(roselia);
        b.addFoe(roserade);
        b.addFoe(wormadam);
    }
}
