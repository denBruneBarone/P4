package Tests.HelloWorld;
class QuickStart {
    public static void main (String[] args) {
        System.out.println("Hello, World.");
        SexyClass hej = new SexyClass(4);
        System.out.println(hej.toString());
        System.out.println(SexyClass.veryStatic());
    }
}