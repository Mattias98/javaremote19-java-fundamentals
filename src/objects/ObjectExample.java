package objects;

public class ObjectExample {
    public String name;
    public int a;
    public ObjectExample(){
        System.out.println("Constructing Object Example..");
        name = "Mattias";
        a = 6;

    }
    // Parameterized Constructor
    public ObjectExample(int age, String name){
        System.out.println(age);
        System.out.println(name);
    }

}
