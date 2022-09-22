

public class Methods {
    
    public static void main(String[] args) {
        
       //Declaring Methods; cannot call variable outside of methods
       System.out.println("before method call");
        //method needs to be outside of class
       doSomething();

       System.out.println("after method call");
        
    }
    //Adding Arrays 
    double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    
    //will hold the new values
    double[] results = new double [opCodes.length];
    
    
    //void returns no value
    public static void doSomething() {

        System.out.println("Inside method");

        System.out.println("Still inside");
       }
       
       /* 
        showSum(7.5, 1.4, 3);
        static void showSum(float x, float y, int count) {
    
        float sum = x + y
        }
            
        float sum = x + y;  
    
            for(int i = 0, i < count; i++)
       
                System.out.println(sum);}*/




    }







