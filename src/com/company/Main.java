package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        int num7 =0;
        int num17 =0;
        int num23 =0;
        int usernumber;
        boolean exit = true;
        System.out.println("enter the number:");
        int num = sc.nextInt();



        System.out.println("enter the number  count of multiplies:");
        usernumber = sc.nextInt();
       // while(count <= n)
        for(count  = 1; count <= num; count++)

        {

            if ((count % 3 != 0) && (count % 5 != 0))
                System.out.println(count);
            else if ((count % 3 == 0) && (count % 5 == 0))
                System.out.println(" fizzbuzz");
            else if (count % 3 == 0)
                System.out.println(" fizz");
            else if (count % 5 == 0)
                System.out.println(" buzz");
            if(count %7 ==0)
             num7++;
            if(count %17 ==0)
              num17++;
            if(count % 23 == 0)
                num23++;
        }

        System.out.println("number of multiples of 7 in " + num + " : " + num7);
        System.out.println("number of multiples of 17 in " + num + " : " + num17);
        System.out.println("number of multiples of 23 in " + num + " : " + num23);
        System.out.println("number of multiples of "+ usernumber + " in "+num+" : "+usernumber);
    }
}
