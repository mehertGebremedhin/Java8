/**
 * Greetings.java
 *
 * @author g106108 (Garrett Griffin)
 * @since 6/15/18
 */


public class Greetings {
    public static void main(String args[]) {

        MyLamda add = () -> System.out.println("hello lamda");

}

    interface  MyLamda {
        void foo();
    }
}
