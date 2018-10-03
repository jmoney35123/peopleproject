package classwork;

public class person{
        private String firstName = null;
        private String lastName  = null;
        private int    birthYear = 0;

        public person(String first,
                        String last,
                        int    year   ) {

            firstName = first;
            lastName  = last;
            birthYear = year;
        }

        public person(String first, String last){
            this(first, last,);
        }
}
