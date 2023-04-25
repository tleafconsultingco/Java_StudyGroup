package Constructor_0425T;

public class Q07_Test {


    // Output = Compilation fails at line 3


    public Q07_Test(){ //!! 2. No-arg constructor
        System.out.println("A"); // 3. Print A
    }//no-arg constructor

    public Q07_Test(int a){
        this(); // line 1
        System.out.println("B");
    }

    public Q07_Test(String str){
        this(); // line 2
        // this(100); // line 3
        // Cannot call more than 1 constructor within a constructor
        System.out.println("str");
    }

    public static void main(String[] args) {
        Q07_Test obj = new Q07_Test(); // line 4
        // 1. Create object calling no-arg constructor

        /*
        OUTPUT
        A
         */

    }


}
