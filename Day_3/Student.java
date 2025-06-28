package Day_3;

class Student {
    String name;
    int id;
    int marks;

    Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student("Karthik", 101, 85);
        s.display();
    }
}

