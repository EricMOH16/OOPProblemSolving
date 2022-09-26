package ProblemSolving3.ExerciseA;

import javax.swing.*;

//Driver does not have to be call 'Test'
public class TestDate {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date(23,7,2006);

       JOptionPane.showMessageDialog(null,"State of date object date 1 is " +
                date1.getDay() + "-" + date1.getMonth() + "-" + date1.getYear() +
                       "\nState of the new object is" +
               date2.getDay() + "-" + date2.getMonth() + "-" + date2.getYear(),"Date class test results",1);


    }
}
