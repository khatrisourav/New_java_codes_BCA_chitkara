#######---------Shallow copy


class StudentData {
int roll_no;
String name ;

StudentData (int roll_no, String name ) {
this.name = name;
this.roll_no = roll_no;
}
StudentData ( StudentData obj ) {
this.name= obj.name;
this.roll_no = obj.roll_no;
}
void show () {
System.out.println("Name of the student is " +this.name + " " + "and marks of the student is " + " "+ this.roll_no);
}

}


public class copyconstructor {
public  static void main (String [] args ) {
StudentData student1 = new StudentData (123, "Sourav");
student1.show();

StudentData student2 = new StudentData(student1);

student2.show();
student2.name= "aman";
student1.show();
student2.show();



}
}
