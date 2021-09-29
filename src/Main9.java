public class Main9 {
    public static void main(String[] args) {
        int[] mas1 = {1,2,3,4};
        int[] mas2 = {4,16,1,2,3,22};
        int k = 2;
        int[] mas3 = new int[mas1.length + mas2.length];
        int count = 0;

        for(int i = 0; i < k; i++) {
                mas3[i] = mas1[i];
                count++;
             }
        for(int j = 0; j < mas2.length; j++) {
            mas3[count++] = mas2[j];
        }
        for(int j = count; j < mas3.length; j++) {
            mas3[count] = mas1[k];
            k++;
            count++;
        }
        for(int i = 0; i <mas3.length; i++)
            System.out.print(mas3[i]+" ");
    }
}
