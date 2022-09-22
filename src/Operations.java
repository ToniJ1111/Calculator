import javax.lang.model.util.ElementScanner14;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class Operations {
    
 
     
    public static void main(String[] args) {

        /*
          change opCode to perform operations
         double value1 = 100.0d;
         double value2 = 50.0d;
         double result = 0.0d;
         char opCode = 'd';
          
         if(opCode == 'a')
          result = value1 + value2;
         else if(opCode == 's')
         result = value1 - value2;
         else if(opCode == 'm')
          result = value1 * value2;
          else if(opCode == 'd')
          result = value1 / value2;
          else
          result = 0.0d;
          
          System.out.println(result);
         */

        /*
          Logical Operators
         //If the condition is true the request prints.
         
         int a = 20, b = 14, c = 5;
          
          if(a > b & b > c)
          
          System.out.println("a is greater than c");
         */

        /*
          boolean done = false;
          
          // Using negation operator
          
          if(!done)
          System.out.println("Keep Going!");
         */

        /* 
          //Conditional Operators; And = &&: Executes only when right side is true, Or
          = ||: Executes Only when the left side is false
          int students = 150;
          int rooms = 0;
          //rooms = 0 = error; using '&' still = error, && let's progam complete
          if(rooms != 0 && students / rooms > 30)
          System.out.println("Crowded");
         
          
          System.out.println();
          System.out.println("***End of Program***");
         */

        /*
          //Block Statements
          
          int v1 = 10, v2 = 4;
          
          final int diff;
          
          if(v1 > v2){
          diff = v1 - v2;
          System.out.println("v1 is bigger than v2, diff = " + diff);
          }
          //not associated with if; group with block statement; {} must be used to
          create block statement
          else {
          diff = v2 - v1;
          System.out.println("v1 is not bigger than v2, diff = " + diff);
          }
         */

        /*
          //Block Statement & Variable Scope
          double students = 30.0d, rooms = 4.0d;
          
          if(rooms > 0.0d) {
          System.out.println(students);
         System.out.println(rooms);
          //declare variable inside block
          double avg = students / rooms;
          System.out.println(avg);
          }
         */
        /*
          
          //while Loop
          int someValue = 4;
          int factorial = 1;
          //someValue inital value = 4, someValue is > 1, proceeds to body of loop
          while(someValue >1) {
          //factorial inital value = 1, multiply by 4
          factorial *= someValue;
          //result = 4, stored back into someValue; repeats until statement is false
          someValue--;
          }
          //output displays factorial of false someValue
         System.out.println(factorial);
         */

        // Do While Loop; Condition is checked at the end of the loop.
        /*
          int iVal = 80; //iVal = 80 will run once and break loop: 80 * 2 = 160
          //running multiple statemens within loops requires brackets
          do {
          System.out.print(iVal); //iVal = 5: * 2 = 10; still < 25 run next loop
          
          System.out.print(" * 2 = "); //iVal = 5: 10 * 2 = 20; still < 25 run next
          loop
          
          iVal *= 2; //iVal = 5: 20 * 2 = 40; break loop...40 > 25
         
          System.out.println(iVal);
          
         } while(iVal < 25);
         */

        /*
          //For Loop: simpler notation than while loop
          
          for(int i = 1; i < 100; i *= 2)
          System.out.println(i);
         */

        /*
          //Arrays: Provide an ordered collection of elements
          float[] theVals = new float [3]; //each element accessed via index; range
          from 0 to number of elements -1;
          theVals[0] = 10.0f;
          theVals[1] = 20.0f;
          theVals[2] = 15.0f;
          float sum = 0.0f; //variable to hold sum of array values
          //use loop to get a value of elements within the array;
          //set int to 1st index to access; add control condition (keep running as long
          as index is less than length of array; at end of pass, increment to next
          index)
          for(int index = 0; index < theVals.length; index++)
          //add value of each array element to sum variable
          sum += theVals[index];
          System.err.println(sum);//set index to 0;0< than length of array;0 is less
          than 3;add 10 t0 sum;update index from 0 to 1; 1<3 add 20 = 30 (10+20);
          //index from 1 to 2;2<3, add 15 + 30 = 45; 3<3 is false; exit loop and print
          previous sum = 45.
         */
        
          //initialize array shorthand; for-each loop
          float[] theVals = {10.0f, 20.0f, 15.0f};
          float sum = 0.0f;
          
          for(float currentVal : theVals)
         sum += currentVal; // first pass currentVal = 10, 2nd = 20, 3rd = 15
         
         System.out.println(sum); // = 45
         
        
        
     
    

                                        

    






    }
    
}

