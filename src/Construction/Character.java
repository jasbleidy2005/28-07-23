package Construction;

public class Character {
    private String name;
    private int life;
    private int damage;
    private int elifer_cost;

    public Character(String name, int life, int damage, int elifer_cost) {
        this.name = name;
        this.life = life;
        this.damage = damage;
        this.elifer_cost = elifer_cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getElifer_cost() {
        return elifer_cost;
    }

    public void setElifer_cost(int elifer_cost) {
        this.elifer_cost = elifer_cost;
    }
    public void move(){

    }
}
