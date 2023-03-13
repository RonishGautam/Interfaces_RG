import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//********************************************************************
//  RationalTester.java       Java Foundations
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************

public class RationalTester
{
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(6, 8);
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
        
        // This is for programing 2
        
        
        // This is task 
        Task task1 = new Task("Task 1", Status.NOT_STARTED);
        task1.setPriority(Priority.MED_PRIORITY);

        Task task2 = new Task("Task 2", Status.IN_PROGRESS);
        task2.setPriority(Priority.MIN_PRIORITY);

        Task task3 = new Task("Task 3", Status.COMPLETE);
        task3.setPriority(Priority.MAX_PRIORITY);

        // processes
        System.out.println("\n");
        
        Process process1 = new Process("Process 1");
        process1.setPriority(Priority.MED_PRIORITY);

        Process process2 = new Process("Process 2");
        process2.setPriority(Priority.MIN_PRIORITY);

        Process process3 = new Process("Process 3");
        process3.setPriority(Priority.MAX_PRIORITY);

        //  the tasks and processes in a list
        List<Priority> priorities = new ArrayList<>();
        priorities.add(task1);
        priorities.add(task2);
        priorities.add(task3);
        priorities.add(process1);
        priorities.add(process2);
        priorities.add(process3);


        // Print out the sorted list
        for (Priority p : priorities) {
            System.out.println(p);
        }// end for 

    }// end main
} // end RationalTester 
