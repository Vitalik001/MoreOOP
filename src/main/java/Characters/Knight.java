package Characters;

import java.util.Random;

public class Knight extends Character {

    public Knight(){
        super(new Random().nextInt(10)+5,new Random().nextInt(10)+5);
    }
    @Override
    public void kick(Character c){
        c.setHp(getHp()-new Random().nextInt(c.getPower()));
    }
}
