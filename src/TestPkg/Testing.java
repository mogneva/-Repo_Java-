package TestPkg;

public class Testing {
    public static void main(String[] args) {

        double fTemp = 72;
        double cTemp =(fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " deg Celsius");

        //  kT(K) = (T(°F) + 459.67)× 5/9
        double oTemp = 97;
        double kTemp =(oTemp + 459.67) * 5/9;
        System.out.println(oTemp + " F is equal to" + kTemp + " deg Kelvin");
        
        //  T(°C) = T(K) - 273.15

        double cTem = 10;
        double kTem =(cTem - 273.15);
        System.out.println(kTem + " K is equal to " + cTem + " deg C ");

        //  T(°F) = T(K) × 9/5 - 459.67
        double kTe = 387;
        double fTe =(kTe * 9/5 -( 459.67));
        System.out.println(fTe + " F is equal to " + kTe + " deg K ");


        // T(°F) = T(°C) × 9/5 + 32
        double cT = 17;
        double fT =((cT * 9/5) + 32);
        System.out.println( cT + " C is equal to " + fT + " deg F ");


        // T(K) = T(°C) + 273.15
        double cTt = 15;
        double kTt =(cTt + 273.15);
        System.out.println(cTt + " C is equal to " + kTt + " deg K");

    }
}

