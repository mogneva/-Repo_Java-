package TestPkg;

public class Testing {
    public static void main(String[] args) {

     String myName = "Maryna Ognev";
     System.out.println(myName);

     int myNameLength = myName.length();
     System.out.println("Length of "+ myName + " is "+ myNameLength);

     char charAtIndex11 = myName.charAt(11);
     System.out.println(" In " + myName + " last index 12 is: " + charAtIndex11);

     boolean myNameStartsWith_K = myName.startsWith("K");
     System.out.println(" Dose " + myName + " start with 'K'?" + myNameStartsWith_K);

     boolean myNameEndsWith_M = myName.endsWith("M");
     System.out.println( " Dose " + myName + " end with 'M'?" + myNameEndsWith_M);


     String myFirstStatment = "I am a good programmer";
     System.out.println( myFirstStatment);
     int myFirstStatmentLength = myFirstStatment.length();
     System.out.println("Length of "+ myFirstStatment + " is "+ myFirstStatmentLength);
    

    }
}

