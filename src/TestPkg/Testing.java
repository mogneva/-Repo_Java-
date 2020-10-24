package TestPkg;

public class Testing {
    public static void main(String[] args) {
        byte hours = 24;
        System.out.println("It is " + 24 + " Hours in a day");

        short noOfDaysInYear = 365;
        System.out.println( "Days In Year " + noOfDaysInYear );

        short noOfWorkers = 417;
        System.out.println(" Flower Organization Has " + noOfWorkers + " Employees. ");

        long curentPopulation = 43676008L;
        System.out.println( " The Ukraine Population " + curentPopulation);

        float accountBalance = 871.00F;
        System.out.println(" Accout Balance " + accountBalance );

        boolean value = false;
        System.out.println(" Does The Sun Rise from the west ->" + value);

        char initial1 = 'M';
        char initial2 = 'O';
        System.out.println( initial1 +"."+initial2+".");

        char fullName = 'M';
        System.out.println(fullName+"aryna Ognev");









        int miles = 3, km=5;
        double kmInMile = 1.61;
        double milesInKm = miles * kmInMile;
        boolean isTrue = (milesInKm == km);
        System.out.println(" is " + miles + " miles equal to "+ km+"km ->"+ isTrue);
        

    }
}

