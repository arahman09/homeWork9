package HW8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

    public static void main(String[] args) {

        int noOfLandMark;

        List<String> landMarksOfNY = new ArrayList<>();
        Scanner keyboard= new Scanner(System.in);

        System.out.print("How many name you do you want to put :");
        noOfLandMark = keyboard.nextInt();

        System.out.println("Please Enter "+noOfLandMark+" Land Mark's name:");

        for (int index=0; index<= noOfLandMark; index++) {

            landMarksOfNY.add(keyboard.nextLine());
        }

        System.out.println();
        System.out.println("The Land mark(s) you have entered are: ");

        Iterator var = landMarksOfNY.listIterator();  // var= variable

        while (var.hasNext()) {
            System.out.println(var.next());
        }

    }

}
