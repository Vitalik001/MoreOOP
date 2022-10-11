package Characters;

public class Character {
    private int power=0;
    private int hp;
    public Character(int pow, int hp){
        setPw(pow);
        setHp(hp);
    }
    public void kick(Character c){
        setHp(getHp()-c.getHp());
    }
    public void setPw(int pw){
        power=pw;
    }
    public int getHp(){
        return hp;
    }
    public int getPower(){
        return power;
    }
    public void setHp(int hp){
        if (hp<0){
            hp=0;
        }
        this.hp=hp;
    }
    public boolean isAlive(){
        return getHp()>0;
    }
}
