public class Main5 {
    public static void main(String[] args) {
        int[] ar = new int[3];

        ar[0] = 2;
        ar[1] = 0;
        ar[2] = -2;
        for (int i=0; i<ar.length; i++){
            if (ar[i] >= 0){
                double m = Math.pow(ar[i], 2);
                System.out.println(m);
                }
            else {
                double n = Math.pow(ar[i], 4);
                System.out.println(n);
            }

        }


    }
}
