class Student{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display()
    {
        System.out.println(id + " " + name);
    }  
}
public class Parameterized_constructor {
    public static void main(String args[]){  
    //creating objects  
    Student s1=new Student(111, "Alif");  
    Student s2=new Student(153, "Rahim");  
    //displaying values of the object  
    s1.display();  
    s2.display();  
    }  
}