package HW8;

import java.util.Scanner;

public class TestArray {


    public static void main(String[] args) {

        int numberOfExam;
        int [] exam;

         Scanner keyboard = new Scanner(System.in);

         System.out.print("How many Exams have you done: ");
         numberOfExam=keyboard.nextInt();

         exam= new int[numberOfExam];

         for (int index =0; index< exam.length; index++) {

             System.out.print("Enter exam score [" + (index+1) + "]: ");
                exam [index]  = keyboard.nextInt();
        }

         System.out.println();
         System.out.print("The scores you have entered: ");

        for (int variable: exam)  {

            System.out.print(variable+ "  " );

        }

    }

}