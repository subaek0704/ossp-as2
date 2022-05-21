import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("학번을 입력하세요: ");
        int num = sc.nextInt();
        System.out.print("학과를 입력하세요: ");
        String name1 = sc.next();
        System.out.print("대학교를 입력하세요: ");
        String name2 = sc.next();
        sc.close();

        System.out.println();
        System.out.println("<출력>");
        System.out.println("이름: "+name);
        System.out.println("학번: "+num);
        System.out.println("대학교: "+name2);
        System.out.println("학과: "+name1);
    }
}