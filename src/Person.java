public class Person {
    String name = "Gulnar";
    String surname = "Naghiyeva";
    String university = "Baku State University";
    int age = 21;


    public void display(){
        System.out.println("name: "+name);
        System.out.println("surname: "+surname);
        System.out.println("university: "+university);
        System.out.println("age: "+age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();
    }
}
