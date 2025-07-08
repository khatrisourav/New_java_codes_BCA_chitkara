class Student {
    String name;
    int marks;

    // ✅ 1. Use of `this` to refer instance variables
    Student(String name, int marks) {
        this.name = name;      // 'this' helps distinguish instance vs parameter
        this.marks = marks;
    }

    // ✅ 2. Use of `this()` to call another constructor (Constructor chaining)
    Student(String name) {
        this(name, 0);  // Calls the constructor above
    }

    // ✅ 3. Use of `this` to pass current object as method argument
    void printDetails(Student s) {
        System.out.println("👉 Passed Student Name: " + s.name + ", Marks: " + s.marks);
    }

    void callPrintDetails() {
        this.printDetails(this);  // Passing current object
    }

    // ✅ 4. Use of `this` to return current object (Method chaining)
    Student updateMarks(int m) {
        this.marks = m;
        return this;
    }

    Student updateName(String n) {
        this.name = n;
        return this;
    }

    void show() {
        System.out.println("🎓 Name: " + name + ", Marks: " + marks);
    }

    // ✅ 5. Use of `this` in inner class to refer outer class object
   
    
}

public class fullexample {
    public static void main(String[] args) {

        // 1️⃣ Using `this` to assign values
        Student s1 = new Student("Sourabh", 85);
        s1.show();

        // 2️⃣ Using `this()` to call another constructor
        Student s2 = new Student("Rohit");
        s2.show();

        // 3️⃣ Using `this` to pass current object
        s1.callPrintDetails();

        // 4️⃣ Using `this` to return current object and chain methods
        s1.updateMarks(95).updateName("Sourabh Batra").show();

       
    }
}

