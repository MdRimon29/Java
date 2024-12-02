class Person {
    // Encapsulating the name and age
    // only approachable and used using methods defined
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}
// Driver Class
public class Encapsulation {
    // main function
    public static void main(String[] args)
    {
        // person object created
        Person obj = new Person();
        obj.setName("John");
        obj.setAge(30);

        // Using methods to get the values from the variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}