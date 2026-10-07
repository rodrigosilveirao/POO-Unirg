import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        int [][] matriz = {
                { 18, 5, 20 },
                { 6, 8, 15 },
        };
        
        for (int[] linha : matriz) {
            for(int coluna : linha){
                System.out.println(coluna);
            }
            System.out.println();
        }
    }
}
