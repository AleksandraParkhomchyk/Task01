public class Main1 {
    public static void main(String[] args) {
        int a = 1001;
        String line = String.valueOf(a);
        char result1 = line.charAt(0);
        char result2 = line.charAt(1);
        char result3 = line.charAt(2);
        char result4 = line.charAt(3);

        if ((result1 + result2 == result3 + result4) == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
