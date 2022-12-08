public class GroupStudy1 {
    /*Please reverse the given String by using as many as different methods*/
    public static void main(String[] args) {

        System.out.println("Hello Group-7. Get Better Together!");
        System.out.println("***********************************");

        reverseMethod1("CYDEO School");

        reverseMethod2("Software Development Engineer in Test-SDET");

        reverseMethod3("Hello Group-7. Get Better Together!");
    }

    public static void reverseMethod1(String str) {

    }

    public static void reverseMethod2(String str) {

    }

    public static void reverseMethod3(String str) {
        /*StringBuffer is a peer class of String that provides much of the functionality of strings.
        * StringBuffer class is used to create mutable (modifiable) string.
        * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed. */
        StringBuffer temp = new StringBuffer(str);
        System.out.println(temp.reverse());

    }

}
