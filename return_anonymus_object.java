class Student {
    void display() {
        System.out.println("Hello, I am an anonymous Student object!");
    }
}

public class return_anonymus_object {
    public static void main(String[] args) {
        // Using anonymous object returned by getStudent()
        getStudent().display();  // No reference stored, just used once
    }

    // This method returns an anonymous Student object
    static Student getStudent() {
        return new Student();  // No variable, returned directly
    }
}

