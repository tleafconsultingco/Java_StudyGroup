package Constructor_0425T;

public class Q05_Test {

    // Output = Compilation fails at line 2

    /*
    // 2. No-arg constructor
    public Q05_Test(){ // line 1
        System.out.println("A");
        this(10); // line 2
        //&& Needs to call the int constructor FIRST
    }
     */

    // 2 alt. No-arg constructor (w/o error)
    public Q05_Test(){ // line 1
        this(10); // line 2
        // 3. Calls int constructor
        System.out.println("A"); // 5. Prints A
    }

    public Q05_Test(int a){
        System.out.println("B"); // line 3
        // 4. Prints B
    }

    public static void main(String[] args) {
        Q05_Test obj = new Q05_Test(); // line 4
        // 1. Create object calling the no-arg constructor

        /*
        OUTPUT
        B
        A
         */

    }


}
