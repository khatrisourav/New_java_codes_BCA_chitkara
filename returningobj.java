class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // NON-static method returning object
    Student upgradeMarks() {
        this.marks += 10;
        return this;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class returningobj {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 75);

        // Call method on object
        s1.upgradeMarks();  // returns the same object with updated data

        s1.display(); // Output: Name: Aman, Marks: 85
    }
}

