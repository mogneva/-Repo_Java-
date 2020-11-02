package TestPkg;
import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

    /** String myName = "Maryna Ognev";
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

**/






             /** 1. Create an ArrayList variable, which can store Integer type data at each index
         * 2. Ask user how many values they want to enter/add in the arrayList, that will become length/size of your arrayList
                *      using scanner, take int value from user
         * 3. Run a loop, so that user can add values in arrayList (using scanner)
                *      BUT stop the user as soon user enters the total values

        4. print the arrayList
              **/

        ArrayList<String> arr1 = new ArrayList<>();


            // String[] arr1 = {"20","25","27","18","17","30"};
        arr1.add("20");
        arr1.add("25");
        arr1.add("27");
        arr1.add("18");
        arr1.add("17");
        arr1.add("30");
              System.out.println("Lenghth off arr: " + arr1.size());
               Scanner scan = new Scanner(System.in);
                System.out.println("Please enter the total num value:");

              String userValue = scan. nextLine();

               System.out.print("num" + userValue);

               for (int i = 0; i < arr1.size();i++) {
              System.out.println(arr1.get(i));
              }
              for (int i = 0; i < arr1.size();i+=2) {
              System.out.println(arr1.get(i));
              }
    }
}

