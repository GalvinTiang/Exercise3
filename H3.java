
import java.util.Random;
import java.util.Scanner;

public class H3{
   public static void main (String[] args){
   

	     //Q1
        String object1 = "1st way to create new object";
        String object2 = new String("2nd way to create new object");

        //Q2
        String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","),7));       

        //Q3
        Random rd = new Random();
        System.out.println(rd.nextInt(41) + 10);
        //Output is the sum of a random integer generated in the range of 0-40 and 10

        //Q4
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int largest = Math.max(num1,num2);
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        System.out.println("Larger value: "+ largest);

        //Q5
        //a
        String test = "abc";
        test = test + test;
        System.out.println(test);

        //b
        Random random = new Random();
        double d = Math.round ( 2.5 + random.nextInt(1) );
        System.out.println("The value is " + d);

        //Q6
        //a
        Scanner input = new Scanner(System.in);
        //b
        System.out.println("Enter 2 integer: ");
        int x = input.nextInt();
        int y = input.nextInt();
        //c
        System.out.println("Product of " + x + " and "+ y + ": " + Math.multiplyExact(x,y));

        //Q7
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";
        //a
        System.out.println("Length of \"" + text1 + "\" : " + text1.length());
        System.out.println("Length of \"" + text2 + "\" : " + text2.length());
        System.out.println("Length of \"" + text3 + "\" : " + text3.length());
        System.out.println("Total length: " + (text1.length()+text2.length()+text3.length()));
        //b
        System.out.println(text2.substring(0,20) + text1.substring(10,19));
    }
}

   
   
   
   
   
