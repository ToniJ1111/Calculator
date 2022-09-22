public class Calculator {
    
    public static void main(String[] args) {

    //Declaring Methods; cannot call variable outside of methods
      
       System.out.println("before method call");
       //method needs to be outside of main
       
       doSomething();

      System.out.println("after method call");

      //void returns no value
    public static void doSomething() {

        System.out.println("Inside method");

        System.out.println("Still inside");
       }
    
    //Adding Arrays 
    double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    
    //will hold the new values
    double[] results = new double [opCodes.length];
}

    /*//Adding Arrays 
    double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    
    //will hold the new values
    double[] results = new double [opCodes.length];*/

    for(int i = 0; i < opCodes.length; i++) {
        //Switch statements test a value (opCode) against multiple matches; integer and char types only
        switch(opCodes[i]) {
            case 'a':
                results [i] = leftVals[i] + rightVals[i];
                break;
            case 's':
                results [i] = leftVals[i] - rightVals[i]; 
                break; 
            case'm':
                results [i] = leftVals[i] * rightVals[i];
                break; 
            case 'd':
                //conditional assignment: value2 not = 0 is true, divide value1 by value2, false provide value you want to return = 0.0d
                results [i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                break;
        //Use 'default' instead of else with switch statements
        default: 
            System.out.println("Invalid opCode: " + opCodes[i]);
            results[i] = 0.0d;
         }
    }
    //For each loop
    for(double currentResult : results)
    
    System.out.println(currentResult);
}

    /*//void returns no value
    public static void doSomething() {

        System.out.println("Inside method");

        System.out.println("Still inside");
    }  */
    
    


