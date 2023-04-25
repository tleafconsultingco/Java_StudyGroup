package Constructor_0425T;

public class Q10_Test {

    // Output = Developer

    public Q10_Test(){ //!! 2. No-arg constructor
        System.out.println("Developer"); // 3. Print Developer
    }

    // This is a basic custom method and would need to be called by the object, see 4.
    public void Q10_Test(){ //&& NOTE that this method name should not be the same as the class name (constructors are named after the class, so using it for a custom method is confusing)
        System.out.println("SDET");
    }//

    public static void main(String[] args) {
        Q10_Test obj = new Q10_Test();
        // 1. Create new object calling no-arg constructor

        /*
        OUTPUT
        Developer
         */

        System.out.println("-----");

        // 4. Calling the Q10_Test custom method
        obj.Q10_Test();

        /*
        OUTPUT
        Developr
        SDET
         */


    }//main


}
