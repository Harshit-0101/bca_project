import java.sql.SQLOutput;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your cource = ");
//        String course = sc.next();

        teacher bca_teacher = new teacher();
        student bca_student = new student();
        // subject ~
        subject bca_sub = new subject();
        System.out.println("-----------------------------All subject---------------------------------------");
        System.out.print("1.");
        System.out.println(bca_sub.sub1 = "Maths");
        System.out.print("2.");
        System.out.println(bca_sub.sub2 = "Computer organisation");
        System.out.print("3.");
        System.out.println(bca_sub.sub3 = "Desktop publishing & design");
        System.out.print("4.");
        System.out.println(bca_sub.sub4 = "OOPs with c++");
        System.out.print("5.");
        System.out.println(bca_sub.sub5 = "Bussiness");
        System.out.println("-------------------------------Enter subject----------------------------------");
        System.out.print("Enter subject [1-5] = ");
        int select_sub = sc.nextInt();
        // Functioning ~



            System.out.println("------------------------SUBJECT DETAIL-----------------------------------");
            System.out.println();

            if (select_sub == 1) {
                System.out.println("Subject name = Maths");
                System.out.println();
                System.out.println("------------------------STUDENT DETAIL-----------------------------------");
                bca_student.student1();
                System.out.println();
                bca_student.student2();
                System.out.println("------------------------TEACHER DETAIL-----------------------------------");
                System.out.print("Maths teacher name is = ");
                bca_teacher.teacher4();

            } else if (select_sub == 2) {
                System.out.println("Subject name = Computer Organisation");
                System.out.println();
                System.out.println("------------------------STUDENT DETAIL-----------------------------------");
                bca_student.student1();
                System.out.println();
                bca_student.student2();
                System.out.println("------------------------TEACHER DETAIL-----------------------------------");
                System.out.print("Computer Organisation teacher name is = ");
                bca_teacher.teacher1();

            } else if (select_sub == 3) {
                System.out.println("Subject name = Desktop Publishing & Design");
                System.out.println();
                System.out.println("------------------------STUDENT DETAIL-----------------------------------");
                bca_student.student1();
                System.out.println();
                bca_student.student2();
                System.out.println("------------------------TEACHER DETAIL-----------------------------------");
                System.out.print("Desktop Publishing & Design teacher name is = ");
                bca_teacher.teacher3();

            } else if (select_sub == 4) {
                System.out.println("Subject name = OOPs with C++");
                System.out.println();
                System.out.println("------------------------STUDENT DETAIL-----------------------------------");
                bca_student.student1();
                System.out.println();
                bca_student.student2();
                System.out.println("------------------------TEACHER DETAIL-----------------------------------");
                System.out.print("OOPs with C++ teacher name is = ");
                bca_teacher.teacher2();

            } else if (select_sub == 5) {
                System.out.println("Subject name = Business");
                System.out.println();
                System.out.println("------------------------STUDENT DETAIL-----------------------------------");
                bca_student.student1();
                System.out.println();
                bca_student.student2();
                System.out.println("------------------------TEACHER DETAIL-----------------------------------");
                System.out.print("Business teacher name is = ");
                bca_teacher.teacher5();

            } else {
                System.out.println("Invalid subject");
            }
    }
}
