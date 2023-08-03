package rushi;

public class SwitchCaseStement {

    public static double areaSwitchCase(int ch, double []a) {

        double ans = 0.0;
        switch(ch){
            case 1: ans = Math.PI*a[0]*a[0]*100000d/100000d;
                break;
            case 2: ans = a[0]*a[1]*100000d/100000d;
                break;
        }
        return ans;
        // Write your code here
    }
}

