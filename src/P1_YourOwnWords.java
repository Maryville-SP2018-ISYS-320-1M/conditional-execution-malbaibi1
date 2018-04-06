import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/

/*  EXAMPLE
-- Your conditional expression
x < y
-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y >= 0
-- Your test values for x, y, z and do you expect true or false?
0, 2, 0 -> TRUE
0, -1, 0 -> FALSE
*/

/* 2. 
-- Your conditional expression
x != 0
-- Your test values for x, y, z and do you expect true or false?
1, 0, 0 -> TRUE
0, 0, 0 -> FALSE
*/

/* 3.  
-- Your conditional expression
(y * z) % 2 != 0 
-- Your test values for x, y, z and do you expect true or false?
0, 1, 3 -> TRUE
0, 1, 2 -> FALSE
*/

/* 4.  
-- Your conditional expression
y >= (z + x)
-- Your test values for x, y, z and do you expect true or false?
1, 3, 2 -> TRUE
1, 2, 2 -> FALSE
*/

public class P1_YourOwnWords {

 public static void main(String[] args) {
  Scanner input = new Scanner( System.in );
  
  System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
  double x = input.nextDouble();
  double y = input.nextDouble();
  double z = input.nextDouble();
  
  // Replace the conditional test, x < y below with your conditional expression to verify it is correct
  // using your test values
  if( y >= (z + x) ) {
   System.out.println("The test was TRUE");
  } else {
   System.out.println("The test was FALSE");
  }

 }

}