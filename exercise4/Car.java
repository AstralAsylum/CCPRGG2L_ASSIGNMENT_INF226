package exercise4;

public class Car {
    
    String name;
    Person owner;

    Car(String carName, Person carOwner){

        this.name = carName;
        this.owner = carOwner;
    }

    void carOwner(){

        System.out.println("This " + this.name + " is owned by " + owner.name);
    }
}