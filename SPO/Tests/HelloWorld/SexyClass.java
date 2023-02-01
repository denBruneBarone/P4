package Tests.HelloWorld;
/**
 * HelloWorld
 */
public class SexyClass {
   public int number = 4;

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public SexyClass(int number) {
      this.number = number;
   }

   public static String veryStatic() {
      return "hejsa";
   }

   @Override
   public String toString() {
      return "SexyClass [number=" + number + "]";
   }
   
}