class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show1() {
        System.out.println("Person Name: " + name + "\nAge: " + age);
    }
}

public class Date {
    public static void main(String[] args) {
        Person p = new Person("Rohit", 21);
        p.show1();
    }
}
