package Characters;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.stream.Collectors;

public class CharacterFactory {

    Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Random rd = new Random();
        Reflections reflections = new Reflections("Characters");
        var type =
                reflections.getSubTypesOf(Character.class).stream().collect(Collectors.toList());
//        System.out.println(type);
        int idx = rd.nextInt(type.size());
        return type.get(idx).getDeclaredConstructor().newInstance();

    }
}
