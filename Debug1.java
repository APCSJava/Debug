/***
* Demonstration code -- MAY INTENTIONALLY CONTAIN ERRORS
*
* Intent of code:
* - create an instance of the class
* - invoke capitalize to ensure initial letter of name is uppercase
*
* Instructions:
* Use the debugger to determine whether the code works as intended
*/

public class Debug1 {

   private String name;
  
   public Debug1(String s) {
      String name = s;
   }
    
   public void capitalize() {
      String firstLetter = name.substring(0, 1);
      String cap = firstLetter.toUpperCase();
      name = cap + name.substring(1);
   }
    
   public static void main(String[] args) {
      Debug1 instance = new Debug1("harvey");
      instance.capitalize();
   }

}