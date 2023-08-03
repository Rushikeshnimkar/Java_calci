package rushi;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dataType = input.next();
        switch(dataType){
            case "Integer":
                System.out.println("4");
                break;
            case "Long":
                System.out.println("8");
                break;
            case "Float":
                System.out.println("4");
                break;
            case "Double":
                System.out.println("8");
                break;
            case "Character":
                System.out.println("1");
                break;
            default:
                System.out.println("enter valid datatype");


        }
    }
}
