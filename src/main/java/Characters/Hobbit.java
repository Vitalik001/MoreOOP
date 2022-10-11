package Characters;

public class Hobbit extends Character {
    public Hobbit(){
        super(0, 3);
    }
    @Override
    public void kick(Character c){
        super.kick(c);
        System.out.println("I'm crying");
    }

}
