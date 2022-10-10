package ProblemSolving5.ExerciseA;

public class TestClass {
    public static void main(String[] args) {


        Time time1 = new Time(12, 34, 67);

        System.out.println(time1);

        time1.setHour(-12);

        System.out.println(time1);

        Class class1 = new Class("OOP","T106",40,new Time(11,0,0),
                new Time(13,0,0));

        Class class2 = new Class("Yoga for Beginners","Community Centre, Ballyheigue",23,new Time(19,30,00),
                new Time(20,45,00));


        System.out.println("\n\nClass 1\n\n" + class1 + "\n\nClass 2\n\n" + class2);

    }
}