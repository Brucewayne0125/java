import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        // creating user-defined class objects
        Student s1 = new Student(101, "Prasad", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Mahesh", 25);

        ArrayList<Student> al = new ArrayList<Student>(); // creating ArrayList

        al.add(s1); // adding Student class object
        al.add(s2);
        al.add(s3);

        Iterator<Student> itr = al.iterator();

        // Traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}



