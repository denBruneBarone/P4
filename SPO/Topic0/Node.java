package Topic0;

public class Node {
   public static void main (String[] args) {
      // ned -> op
   Node a = new Node(" a");
   Node n = new Node("n");

   Node varLeft = new Node("Var", a);
   Node varRight = new Node("Var", n);
   Node one = new Node(" 1");

   Node plus = new Node("Plus", varLeft, varRight);
   Node lnt = new Node("lnt", one);     

   Node times = new Node("Times", plus, lnt);
   times.depthFirstPrint();
  }
   public Node left;
   public Node right;
   public String title;

   public Node(String title, Node left, Node right) {
      this.title = title;
      this.left = left;
      this.right = right;
   }
   
   public Node(String title, Node left) {
      this.left = left;
      this.title = title;
   }
   
   public Node(String title) {
      this.title = title;
   }

   public void depthFirstPrint() {
    if (left != null) left.depthFirstPrint();
    if (right != null) right.depthFirstPrint();
      System.out.println(title);
   }
}
