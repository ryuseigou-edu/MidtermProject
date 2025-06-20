public abstract class Character implements Creature {
    String name;
    int hp;

    Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public abstract void attack(Character target);

    public final boolean isAlive(){
        return hp > 0;
    }
    public void showStatus(){
        System.out.println(name+"：HP "+hp);
    }
}
