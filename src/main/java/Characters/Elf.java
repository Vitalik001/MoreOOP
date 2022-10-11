package Characters;

public class Elf extends Character {
    public Elf(){
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        if (GetHp()<c.GetHp()){
            c.SetHp(0);
        }
        else{
            SetPw(GetPower()-1);
        }
    }
}
