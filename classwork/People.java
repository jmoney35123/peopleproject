package classwork;

public class People {
    private String firstName = null;
    private String lastName  = null;
    private int    birthYear = 0;

    public People(String first,
                  String last,
                  int    year   ) {

        firstName = first;
        lastName  = last;
        birthYear = year;
    }



    public People(String first, String last){
        this(first, last,);
}



    public int getBirthYear() {
        return birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

