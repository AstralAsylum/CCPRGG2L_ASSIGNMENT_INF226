package exercise4;

public class App {
    
    public static void main(String [] args){

        Person Me = new Person ("Kael", 19);

        Person Friend = new Person ("Alex", 20);
        
        Me.Addfriend(Friend);


        Pet dog = new Pet("Milo", 1, Me);

        dog.showOwner();


        Person Classmate1 = new Person ("Ella", 23);
        Person Classmate2 = new Person ("Deni", 29);
        Person Classmate3 = new Person ("Jayps", 19);

        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        
        Car sportscar = new Car("Nissan GTR Skyline R34", Me);
        Car familycar = new Car("Ford Transit", Me);
        sportscar.carOwner();
        familycar.carOwner();
    }
}
