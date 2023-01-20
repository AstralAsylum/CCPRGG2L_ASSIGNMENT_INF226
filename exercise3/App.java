import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int sel1, sel2, sel3, sel4; 
    
        
        System.out.print("Select a character: ");
        sel1 = scan.nextInt();

        System.out.print("Select a Primary: ");
        sel2 = scan.nextInt();


        System.out.print("Select a Secondary: ");
        sel3 = scan.nextInt();
       
        
        
        System.out.print("Select a meelee: ");
        sel4 = scan.nextInt();

            
        switch (sel1) {
            case 1:
            Character soldier1 = new Character();

            soldier1.strength = 10;
            soldier1.agility = 5;
            soldier1.intelligence = 0;
            soldier1.name = "Capt. Chen";
            System.out.println("\n ------------------------------ \n");
            soldier1.sayMyName();
            
                break;
            
            case 2:
            Character soldier2 = new Character();
                soldier2.strength = 10;
                soldier2.agility = 5;
                soldier2.intelligence = 0;
                soldier2.name = "General. Xing";
                soldier2.sayMyName();
                break;
            case 3:
            Character soldier3 = new Character();
                soldier3.strength = 10;
                soldier3.agility = 5;
                soldier3.intelligence = 0;
                soldier3.name = "Pvt. Xian";
                System.out.println("\n ------------------------------ \n");
                soldier3.sayMyName();
                
                
                break;
            default:
                
                break;
        }
        System.out.println("My weapons are: ");

        switch (sel2) {
            case 1:
            Weapon w1 = new Weapon();

            w1.damage = 60;
            w1.rarity = "Epic"; 
            w1.name = "AR15";
            w1.type = "Rifle";
            w1.category = "Primary";
            System.out.println("\n ------------------------------ ");
            System.out.println("PRIMARY WEAPON");
            System.out.println(" ------------------------------ \n");
            w1.sayMyname();
            w1.sayMydamage();
            w1.sayMyrarity();
            w1.sayMytype();
            w1.sayMycategory();
            w1.added(5);
            w1.added(10);
            w1.name1();
            String name1 = w1.name1();
            System.out.println(name1);
            System.out.println("\n ------------------------------ ");
                break;
            case 2:
            Weapon primary = new Weapon();

            primary.damage = 60;
            primary.rarity = "Legendary"; 
            primary.name = "AK47";
            primary.type = "Rifle";
            primary.category = "Primary";
            System.out.println("PRIMARY WEAPON");
            System.out.println(" ------------------------------ \n");
            primary.sayMyname();
            primary.sayMydamage();
            primary.sayMyrarity();
            primary.sayMytype();
            primary.sayMycategory();
            primary.added(5);
            primary.added(10);
            primary.name1();
            primary.name1();
            System.out.println("\n ------------------------------ ");
                break;
            default:
                break;
        }

        switch (sel3) {
            case 1:
            Weapon w2 = new Weapon();

            w2.damage = 60;
            w2.rarity = "Rare"; 
            w2.name = "Gloc 9";
            w2.type = "Pistol";
            w2.category = "Secondary";
            System.out.println("SECONDARY WEAPON");
            System.out.println(" ------------------------------ \n");
            w2.sayMyname();
            w2.sayMydamage();
            w2.sayMyrarity();
            w2.sayMytype();
            w2.sayMycategory();
            w2.added(5);
            w2.added(10);
            System.out.println();
            System.out.println("\n ------------------------------ ");
                break;
            case 2:
            Weapon secondary = new Weapon();

           
            secondary.rarity = "Rare"; 
            secondary.name = "Desert eagle";
            secondary.type = "Pistol";
            secondary.category = "Secondary";
            System.out.println("SECONDARY WEAPON");
            System.out.println("------------------------------ \n");
            secondary.sayMyname();
            secondary.sayMydamage();
            secondary.sayMyrarity();
            secondary.sayMytype();
            secondary.sayMycategory();
            secondary.added(5);
            secondary.added(10);
            String name1 = secondary.name1();
            System.out.println(name1);
            System.out.println("\n ------------------------------ ");
        
                break;
            default:
                break;
        }
           
        
        if (sel4 == 1) {
            Weapon w3 = new Weapon();

            w3.damage = 60;
            w3.rarity = "Rare"; 
            w3.name = "Samurai";
            w3.type = "Katana";
            w3.category = "Meelee";
            System.out.println("MEELEE WEAPON");
            System.out.println(" ------------------------------ \n");
            w3.sayMyname();
            w3.sayMydamage();
            w3.sayMyrarity();
            w3.sayMytype();
            w3.sayMycategory();
            w3.added(5);
            w3.added(10);
            String name1 = w3.name1();
            System.out.println(name1);
            
            System.out.println("\n ------------------------------ \n");

        }
    }
}



