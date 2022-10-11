package Characters;

public class Elf extends Character {
    public Elf(){
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        if (getHp()>c.getHp()){
            c.setHp(0);
        }
        else{
            setPw(getPower()-1);
        }
    }
}
