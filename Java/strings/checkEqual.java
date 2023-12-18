public class checkEqual {
    public static void main(String[] args) {
        String str = "num";
        String str1 = "num";
        String str2 = new String("num");
        if (str1 == str) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if (str == str2) { // this is check object wise
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        if (str.equals(str2)) { // this function check value wise
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
