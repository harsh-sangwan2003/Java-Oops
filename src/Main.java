import java.util.Arrays;

public class Main {

    // Class is a template and doesn't occupy space in the memory
    // Class is a named group of properties and functions
    class Student{

        // These are called instance variables
        int rno;
        String names;
        float marks;

        // Constructor is
    }

    public static void main(String[] args) {

        // Store 5 roll no's
        int[] roll = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Reference variable
        // Current value is null
        // new allocates memory at run time
        // dynamically means memory is allocated at run time
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
    }
}