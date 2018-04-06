import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P5_PayProgram {

 public static void main(String[] args) {
  Scanner input = new Scanner( System.in );
  
  System.out.println("Enter your hourly rate: ");
  double hourlyRate = input.nextDouble();
  
  System.out.println("Enter the number of hours you worked this week: ");
  int numOfHoursWorked = input.nextInt();
  
  double out; 
  out = computePay( hourlyRate, numOfHoursWorked);
  System.out.println(out);
  
  

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