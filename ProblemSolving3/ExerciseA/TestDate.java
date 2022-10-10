package ProblemSolving3.ExerciseA;

import javax.swing.*;

//Driver does not have to be call 'Test'
public class TestDate {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date(23,7,2006);

        boolean result = date1.equals(date2);

       JOptionPane.showMessageDialog(null,"State of date object date 1 is " +
                date1  + "\nState of the new object is " + date2 ,"Date class test results" + "\nChecking the equals method on the two " +
               " date objects created." +"the result is " + result,1);


    }
}
