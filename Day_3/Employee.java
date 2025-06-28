package Day_3;

class Person {
    String name;
    int age;
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " | Age: " + age + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("sara", 20, 500000);
        emp.display();
    }
}

