class AssignmentOperator
  {
    public static void main(String args[])
    {
      int num1 = 10;
      int num2 = 20;
      int num3 = num1 + 5;
      System.out.println(num3);
      System.out.println("___assignment operator to shortcut method");
      System.out.println();
      System.out.println("num3 -->"+num3);
      num3 += 5;        //num3 = 20
      System.out.println("num3 --> "+num3);
      
      num3 += 10;
      System.out.println("Addition="+num3);
      
      num3 -= 10;
      System.out.println("Subraction=  :- "+num3);
      
      num3 *= 2;
      System.out.println("Multiplication= :- "+num3);
      
      num3 /= 4;
      System.out.println("Division= :- "+num3);
      
      num3 /= 3.0;
      System.out.println("Division num3 /= 3.0:- "+num3);
      
      num3 %= 4;
      System.out.println("Modulos= :- "+num3);
      
      num3 %= 5;
      
      System.out.println("Modulos num3 %= 5:- "+num3);
      
      
    }
    
  }


            /* OUTPUT

num3 +5 :- 15
___assignment operator to shortcut method

num3 -->15
num3 --> 20
Addition=30
Subraction=  :- 20
Multiplication= :- 40
Division= :- 10
Division num3 /= 3.0:- 3
Modulos= :- 3
Modulos num3 %= 5:- 3

=== Code Execution Successful ===
*/
