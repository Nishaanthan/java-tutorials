package testapplication;
class Dog{
    //constructor
    public Dog(){
        System.out.println("Dog created");
    }
    public Dog(String name){
        System.out.println(name+" Created");
    }
    public Dog(String name,String name2){
        System.out.println("Jimmy is a friend of nandu");
    }
    public int legs = 4; // attributes
    public void run(){ // methods
        System.out.println("Running .....");
    }
}
public class TestApplication {
    public static void main(String[] args) {
       Dog puppy = new Dog();
       Dog jimmy = new Dog("jimmy");
       Dog nandu = new Dog("jimmy","nandu");
       puppy.run();

    }
}

