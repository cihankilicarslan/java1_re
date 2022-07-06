package day2;

import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        float number1=0;
        float number2=0;
        float st;
        Scanner contact=new Scanner(System.in);
        System.out.println("Put number1:");
        number1=contact.nextFloat();

        System.out.println("Put number2:");
        number2=contact.nextFloat();

        System.out.println("Select 1 for +:\nSelect 2 for -:\nSelect 3 for /:\nSelect 4 for *:");
        st=contact.nextFloat();

        if (st==1){

            System.out.println("resualt:"+number1+number2);
        }
        else if (st==2){

            System.out.println("resualt:"+(number1-number2));
        }
        else if (st==3){

            System.out.println("resualt:%3f"+number1/number2);
        }
        else if(st==4){

            System.out.println("resualt:"+number1*number2);
        }

        else{

            System.out.println("error");
        }









    }
}
