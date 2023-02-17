package Saim_Practices;

public class Vacation {
    /*
    create a class Vacation
add a main method

declare and assign these variables:
	location, budget, number of stars for hotel, number of travel companions, is paid time off, grade(A, B, C, D, F?)

print all variables

--------------------------------------------------------------------------
     */

    public static void main(String[] args) {
        String location = "Florida" ;
        double budget = 30_000;
        int numberOfStarsForHotel = 5 ;
        int numberOfTravelCompanions = 4 ;
        boolean isPaidTimeOff = true ;
        char grade = 'A';

        System.out.println(location);
        System.out.println(budget);
        System.out.println(numberOfStarsForHotel);
        System.out.println(numberOfTravelCompanions);
        System.out.println(isPaidTimeOff);
        System.out.println(grade);
    }
}
