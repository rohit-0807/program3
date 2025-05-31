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

class Employee extends Person {
    int empId;
    Double salary;

    Employee(String name, int age, int empId, Double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void show1() {
        super.show1();
        System.out.println("Employee ID: " + empId + "\salary: " + salary);
    }
}

public class Date {
    public static void main(String[] args) {
        Employee e = new Employee("Rohit", 21, 101, 50000.0);
        e.show1();
    }
}
