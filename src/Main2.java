public class Main2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;

        double result;
        double temp;

        temp = 2 * a;

        if (temp != 0){
            result = b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))/temp - Math.pow(a, 3) * c + Math.pow(b, -2);

        }
        else {
            System.out.println("Знаменатель равен нулю.");
            result = Double.NaN;
        }

    }
}

