package exercise4;

public class Person {
    String name;
    int age;
    public String friend;


    Person(String personName, int personAge){

        this.name = personName;
        this.age = personAge;

    }

    void Addfriend(Person friend){

        System.out.println(this.name + " is friends with " + friend.name);

    
    }
    
    void addClassmate(Person Classmate){
        
        System.out.println(this.name + " is friends with " + Classmate.name);
    }
}