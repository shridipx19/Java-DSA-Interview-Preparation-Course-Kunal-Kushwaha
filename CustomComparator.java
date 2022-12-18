import java.util.Comparator;
import java.util.Arrays;

class MyComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
        }
}
class Student {
    int rollNo;
    String name;
        Student(int rollNo, String name) {
            rollNo = rollNo;
            this.name = name;
        }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Yash");
        arr[1] = new Student(2, "Shridip");
        arr[2] = new Student(3, "Thomas");
        Arrays.sort(arr, new MyComparator());
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].rollNo + " " + arr[i].name);
        }
    }
}

