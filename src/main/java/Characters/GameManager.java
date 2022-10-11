package Characters;

import java.lang.reflect.InvocationTargetException;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println("player 1 kicks player 2");
            c2.kick(c1);
            System.out.println("player 2 kicks player 1");
        }
        if (c1.isAlive()) {
            System.out.println("player 1 wins");
        } else {
            System.out.println("player 2 wins");
        }

    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        CharacterFactory chf = new CharacterFactory();
        Character player1 = chf.createCharacter();
        Character player2 = chf.createCharacter();
        fight(player1, player2);

    }
}
