package HW8;


import java.util.LinkedList;



public class TestLinkedList {

    public static void main(String[] args) {

            String element;

        LinkedList<String> programmingLanguages = new LinkedList<>();

        programmingLanguages.add("Assembly");
        programmingLanguages.add("Fortran");
        programmingLanguages.add("Pascal");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("Kotlin");


        System.out.println("Initial LinkedList = " + programmingLanguages);


        element = programmingLanguages.removeFirst();
        System.out.println("Removed the first element " + element + " => " + programmingLanguages);


        programmingLanguages.addFirst("HTML");
        System.out.println("After add first element (\"HTML\") : " + programmingLanguages);


        programmingLanguages.add(3, "PHP");
        System.out.println("After add(3,(\"PHP\") : " + programmingLanguages);

        // Remove the last element in the LinkedList
       element = programmingLanguages.removeLast();
        System.out.println("Removed the last element " + element + " => " + programmingLanguages);

        programmingLanguages.addLast("Visual Basic");
        System.out.println("After add last element (\"Visual Basic\") : " + programmingLanguages);


          boolean isRemoved = programmingLanguages.remove("C#");

        if(isRemoved) {
            System.out.println("Removed C# => " + programmingLanguages);
        }

        programmingLanguages.clear();
        System.out.println("After Cleared the LinkedList => " + programmingLanguages);
    }
}
