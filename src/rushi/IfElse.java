package rushi;

public class IfElse {
        public static String compareIfElse(int a, int b) {
            String val ="";
            if (a==b)
            {
                System.out.println("equal");
            }
            else if (a<b){
                System.out.println("smaller");
            }
            else{
                System.out.println("greater");
            }
            return val;
        }

    }

