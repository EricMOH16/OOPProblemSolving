package ProblemSolving6FirstOOPCA;

public class TestLibrary {
    public static void main(String[] args) {

        Author a1 = new Author("Harvey","Deitel");
        Author a2 = new Author("Brian","Kernighan");
        Author a3 = new Author("Robert","Martin");
        Author a4 = new Author("Quentin","Charatan");
        Author a5 = new Author("Paul","Deitel");
        Author a6 = new Author("Aaron","Kans");
        Author a7 = new Author("C. Thomas","Wu");
        Author a8 = new Author("Jeffrey","Listfield");
        Author a9 = new Author("Dennis","Ritchie");
        Author a10 = new Author("Bjarne","Stroustrup");

       Book b1 = new Book( "0131103628", "The C Programming Language", "Prentice Hall", new Author[]{a2, a9}, 6);

       Book b2 = new Book( "0132350884", "Clean Code", "Prentice Hall", new Author[]{a3}, 5);

       Book b3 = new Book("3319994190", "Java in Two Semesters", "Springer", new Author[]{a4,a6}, 8);

       Book b4 = new Book("0132222205", "C#: How to Program", "Pearson", new Author[]{a1,a5,a8}, 6);

       Book b5 = new Book( "0073523305", "An Introduction to Object Oriented Programming with Java", "McGraw-Hill",
               new Author[]{a7},3);

       Book[] allBooks = new Book[100];

       allBooks[0] = b1;
       allBooks[1] = b2;
       allBooks[2] = b2;
       allBooks[3] = b2;
       allBooks[4] = b2;

    }
}
