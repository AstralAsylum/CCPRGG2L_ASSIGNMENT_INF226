public class App {
    public static void main(String[] args) throws Exception {

        Person me = new Person();

        me.setname("Kael");
        
        System.out.println(me.getname());

        Son ako = new Son();

        System.out.println(ako.surname);

        ako.showSurname();
    }
}
