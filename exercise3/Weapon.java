public class Weapon {


    int damage;
    String rarity;
    String name;
    String type;
    String category;
    String skin;
    int added;

    public void sayMyname(){
        System.out.println("Weapon name: " + name);
    }

    public void sayMydamage(){
        System.out.println("Weapon Damage: " + damage);
    }

    public void sayMyrarity(){
        System.out.println("Weapon rarity: " + rarity);
    }

    public void sayMytype(){
        System.out.println("Weapon type: " + type);
    }
    
    public void sayMycategory(){
        System.out.println("Weapon Catergory: " + category);
    }

    public void added (int additionalDamage){

        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from: " + damage + " to " + newDamage);
        this.damage = newDamage;
    }

    String name1(){

        String name1 = ("Weapon and rarity:  " + name + "(" + rarity + ")");
        return name1;
    }
}