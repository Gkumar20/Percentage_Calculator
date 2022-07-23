import java.util.Scanner;

public class CBSE_Mark_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum mark of subject : ");
        byte total = sc.nextByte();

        System.out.println("Enter mark of 5 subjects respectively");
        Byte sub1 = sc.nextByte();
        Byte sub2 = sc.nextByte();
        Byte sub3 = sc.nextByte();
        Byte sub4 = sc.nextByte();
        Byte sub5 = sc.nextByte();

        int percentage = (sub1+sub2+sub3+sub4+sub5)*100/(5*total);
        System.out.print("Final mark In % is ");
        System.out.println(percentage);
    }
}
