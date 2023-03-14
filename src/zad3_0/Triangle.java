package zad3_0;

public class Triangle {
    public static void main(String[] args) {
        int N =4;

        pascalTriangle(-1);
    }

    private static void pascalTriangle(int N) {
        try {
            if(N < 0) {
                throw new RuntimeException("Number of rows that should be printed are not correct!");
            }
            for (int line = 1; line <= N; line++) {
                for (int j = 0; j <= N - line; j++) {
                    //stands for the spacing in our program, if we want to print 4 rows- in the first line there will be 4 spaces as well
                    System.out.print(" ");
                }

                int k = 1;
                for (int i = 1; i <= line; i++) {
                    System.out.print(k + " ");
                    k = k * (line - i) / i;
                }

                System.out.println();
            }
        }catch (RuntimeException e){
            e.printStackTrace();
    }

}


}
