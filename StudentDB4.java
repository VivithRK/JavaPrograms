import java.util.Scanner;

public class StudentDB4 {
    int roll_no;
    // String SubName;  
    String name;
    static String cname = "REVA";
    Scanner s = new Scanner(System.in);

  StudentDB4() {
        name = s.nextLine();
        roll_no = s.nextInt();
        s.nextLine(); // Consume the newline character
    }

    // StudentDB4() {
    //     SubName = "JAVA";
    // }

    void display() {
        System.out.print("Student roll number=" + roll_no + ", ");
        System.out.print("Student name=" + name + ", ");
        // System.out.print("Subject name=" + SubName + ", ");
        System.out.print("College name=" + cname + "\n");
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = s.nextInt();
        s.nextLine(); // Consume the newline character
        StudentDB4 a[] = new StudentDB4[n];
        for (int i = 0; i < n; i++) {
            a[i] = new StudentDB4();
            System.out.println("Enter name and srn of student: " + (i + 1));
            // a[i].read();
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Student " + (i + 1) + ":");
            a[i].display();
        }
    }
}
