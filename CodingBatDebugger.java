public class CodingBatDebugger {

   /**
   / 1. Paste your code from Codingbat below.
   / 2. Add the 'static' modifier to the method header
   / 3. Insert a breakpoint in the method body and debug
   */
   public static int exampleMethod(String incomingData){
     return 14; // example return value
   }
   
   
   
   /**
   / Invoke the method, passing as input a test case that is
   / not yet producing a correct output.
   */
   public static void main(String[] args) {
    int output = exampleMethod("String that is not working");
    System.out.println(output);
   }
   
}