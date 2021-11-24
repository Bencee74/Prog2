public class Calculations {
    public void displayTriangle (int N) {
        int i, j, value = 1;
        int sum = 0;


        for(i = 1; i <= N; i++) {
            for(j = 1; j <= i; j++){
                System.out.print(value + " ");
                sum += value;
                value++;
            }
            if (i < N) System.out.println();
        }
        System.out.print("  " + sum);
    }
}