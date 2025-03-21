package CodeWars;

public class TransportationOnVacation {
    public static int rentalCarCost(int b) {

        final int rentalCarCostPerDay = 40;
        int resultRentalCost;
        
        if (b >= 7) {
            resultRentalCost = b * rentalCarCostPerDay - 50;
        } else if (b >= 3) {
            resultRentalCost = b * rentalCarCostPerDay - 20;
        } else {
            resultRentalCost = b * rentalCarCostPerDay;
        }
        return resultRentalCost;
    }
}
