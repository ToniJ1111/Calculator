public class Ops {
    public static void main(String[] args) {

        System.out.println("Pre-method call");
       
        doSomething();

        System.out.println("After method call");

        showSum(float x, float y, int count);

            System.out.println("Back from showSum");

    }

    public static void doSomething() {
        System.out.println("Inside method, Aligned to main");

        System.out.println("Still in there");
    }
    
    public static void showSum(float x, float y, int count) {
        //because sum is a variable its not visible outside showSum method
        showSum(7.5f, 1.4f, 3);
            if(count < 1)
             return;
        
        float sum = x + y; 

        for(int i = 0; i < count; i++)
            System.out.println(sum);
        return;

    }    
}
