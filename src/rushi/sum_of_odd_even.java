package rushi;
import java.util.Scanner;

public class sum_of_odd_even {

        public static void main(String[] args) {

            // Write your code here

            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            int evenSum=0;

            int oddSum=0;

            while(n>0){

                if((n%10)%2==0)

                    evenSum+=(n%10);

                else

                    oddSum+=(n%10);

                n/=10;

            }

            System.out.println(evenSum+" "+oddSum);

        }

    }



