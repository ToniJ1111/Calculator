
public class CalcEngine {
    public static void main(String[] args) {
       //Adding Arrays 
       double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
       double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
       char[] opCodes = {'d', 'a', 's', 'm'};
       //will hold the new values
       double[] results = new double [opCodes.length];
        
       //change opCode to perform operations
        /*double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';*/
        //Original switch code
        /*switch(opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2; 
                break; 
            case'm':
                result = value1 * value2;
                break; 
            case 'd':
                //conditional assignment: value2 not = 0 is true, divide value1 by value2, false provide value you want to return = 0.0d
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
        //Use 'default' instead of else with switch statements
        default: 
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }*/

        for(int i = 0; i < opCodes.length; i++) {
        //Switch statements test a value (opCode) against multiple matches; integer and char types only
        switch(opCode[i]) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2; 
                break; 
            case'm':
                result = value1 * value2;
                break; 
            case 'd':
                //conditional assignment: value2 not = 0 is true, divide value1 by value2, false provide value you want to return = 0.0d
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
        //Use 'default' instead of else with switch statements
        default: 
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        } 
    }
        System.out.println(result);
        
        /*if/else chain
        if(opCode == 'a')
            result = value1 + value2;
        else if(opCode == 's')
            result = value1 - value2;  
        else if(opCode == 'm') 
            result = value1 * value2;
        //add code to block statement to include result 
        else if(opCode == 'd'){
        if(value2 != 0)
            result = value1 / value2;
        }
        else{
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        } 
        System.out.println(result);*/
    






    }
}
