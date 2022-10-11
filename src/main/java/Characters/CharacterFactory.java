package Characters;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class CharacterFactory {

    Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Random rd = new Random();
        Reflections reflections = new Reflections("Characters");
        var type =
                reflections.getSubTypesOf(Character.class).stream().toList();
//        System.out.println(type);
        int idx = rd.nextInt(type.size());
        return type.get(idx).getDeclaredConstructor().newInstance();

    }
}
