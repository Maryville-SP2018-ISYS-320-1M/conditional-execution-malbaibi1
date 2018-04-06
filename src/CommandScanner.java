import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/

public class CommandScanner {

 public static void main(String[] args) {
  Scanner input = new Scanner( System.in );
  
  System.out.println("Enter your user speech text:");
  String strOrig = input.nextLine();
  
  
      int intIndex1 = strOrig.toLowerCase().indexOf("alexa");                // for finding alexa word
      int intIndex2 = strOrig.toLowerCase().indexOf("cancel");               // for finding cancel word
      
      if(intIndex2 == - 1) {
      if(intIndex1 == - 1) {
         System.out.println("No Command: alexa not found");
      } else {
         System.out.println("Command:" + strOrig.substring(intIndex1 + 5));
      }
      } else {
        System.out.println("Command CANCELLED");
      }
  

 }
       public static double computePay(double money, int hours) {
    double pay;
    if (hours<9)
      pay = money*hours;
    else
      pay = money*8 + money*1.5*(hours-8);
    return pay;

}

}