import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // Write your code here
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("1");

            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("0");

            } else {
                System.out.println("-1");
            }

        }


}
