package ProblemSolving6FirstOOPCA;

public class Author {
    private static int authorID;
    private int authorNumber;
    private String firstname;
    private String surname;

    public Author(String firstname,String surname) {
        this.authorNumber = ++authorID;
        setFirstname(firstname);
        setSurname(surname);
    }


    public int getAuthorNumber() {
        return authorNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author - Number: "  + getAuthorNumber() + " Name: " + getFirstname() + " " + getSurname();
    }
}
