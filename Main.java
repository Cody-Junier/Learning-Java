public class Main {
    public static void main(String[] args){
        final String hello = "Hello World!";
        int perfect = 28;
        int x = 1, y = 5, z= 20; 
        float j = 3.14f;
        perfect = 28 + 28;
        System.out.println(hello);
        System.out.print("Is this on the same line? ");
        System.out.println("No, it's not");
        System.out.println(perfect);
        System.out.println(perfect + perfect); //single line comment
       /* multi-line
        comment */
        System.out.println(hello + " What is "+ j + " times " + z + "? It's "+ j*z + "!");
    }
}