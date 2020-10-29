/***
* Demonstration code -- INTENTIONALLY CONTAINS ERRORS
* Intent of code:
* - create an instance of the class
* - invoke fixClassName to ensure initial letter is uppercase
*
* Use the debugger to identify why this code does not work as intended
*/

public class Debug1 {

   private String name;
  
   public Debug1(String s) {
      String name = s;
   }
    
   public void fixClassName() {
      String firstLetter = name.substring(0, 1);
      String cap = firstLetter.toUpperCase();
      name = cap + name.substring(1);
   }
    
   public static void main(String[] args) {
      Debug1 instance = new Debug1("badClassName");
      instance.fixClassName();
   }

}