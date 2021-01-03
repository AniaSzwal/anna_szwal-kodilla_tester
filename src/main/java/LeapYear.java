public class LeapYear {
    public static void main(String[] args) {
        int year = 2004;
        boolean leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (leap = true) {
            System.out.println("To jest rok nieprzestępny");
        }else {
            System.out.println("To jest rok przestępny");
        }
    }
}

//jak wypluc "rok przestepny", jesli leap=true