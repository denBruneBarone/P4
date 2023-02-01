package Topic0;

import java.util.Collection;
import java.util.Collections;

public class StringToObjects {
   public static void main (String[] args) {
      StringToObjects sto = new StringToObjects("a + n * 1");
      sto.print();
   }
   public String objectString;
   public Collection<String> c = Collections.EMPTY_LIST; 

   public StringToObjects(String objectString) {
      this.objectString = objectString;
   }

   public void print () {
      String[] objects = objectString.split(" ");
      for (String string : objects) {
         System.out.println(string);
      }
   }
}
