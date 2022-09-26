package ProblemSolving3.ExerciseA;
//Date is an instantiable class
public class Date {

   private int day;   //without a keyword attributes have package access - better to be private - prevents logical errors(inconsistent state)
   private int month;
   private int year; //preforming information hiding - cannot be accessed directly driver

    /*create no-argument constructor for building the object.
    always has the same name as class its defined in
    will never return anything
    has no return type
     */
   public  Date(){
       //all initialised with a default value
       day = 1;
       month = 1;
       year = 1900;
   }
    //create multi-argument constructor
    public Date(int day,int month,int year){

        setDay(day);
        setMonth(month); // conventional to give attributes same name as arguments
        setYear(year);

    }
   //create 3 accessors
   public int getDay(){
       return day;
   }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day; //this. is a java keyword - short for "this object" - a pointer or reference to new object
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){

    }
}
