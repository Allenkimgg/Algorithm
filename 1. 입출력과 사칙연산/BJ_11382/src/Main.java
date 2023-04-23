import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();

        System.out.println(num1+num2+num3);

        //문제의 조건이 숫자가 10^12까지이기때문에 int가 아닌 long이 맞다.


    }
}