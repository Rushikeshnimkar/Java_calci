package rushi;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            int n = input.nextInt();

            int fibo = num(n);
            System.out.println(fibo);
        }

        public static int num(int n){
            if(n>1){
                return num(n-1)+num(n-2);
            }else if(n ==1 ){
                return 1;
            }
            return 0;
        }

    }


