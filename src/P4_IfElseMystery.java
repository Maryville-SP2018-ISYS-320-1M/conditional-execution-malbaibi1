/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

/*
 Your expected results after the input is provided:
 
 1. Nothing         //as it skip the print statement
 2. Nothing         //as it skip the print statement
 3. 3 4
 4. 29 30
  
 */
public class P4_IfElseMystery {

 public static void main(String[] args) {
  // Put your call to ifElseMyster2 here
  ifElseMystery(10, 30); 

 }
 
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }

}