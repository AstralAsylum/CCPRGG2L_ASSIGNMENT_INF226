package exercise4;

public class Pet {
    
    String Name;
    double Age;
    Person owner;


    Pet(String petName, int petAge, Person ownerName){

        this.Name = petName;
        this.Age = petAge;
        this.owner = ownerName;




    }

    void showOwner(){
        System.out.println("My name is " + this.Name + ". My onwer is " + owner.name);
    }
}