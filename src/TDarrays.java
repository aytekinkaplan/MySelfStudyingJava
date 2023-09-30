import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
int[][] grades ={{78,67,90,68},{90,69,50,89},{67,78,89,100}};
        System.out.println("1. DİZİN: ");
        for (int i = 0; i < grades[0].length; i++) {
            System.out.println(grades[0][i]+" ");
        }
        System.out.println("\n");
        System.out.println("2. DİZİN: ");
        for (int i = 0; i < grades[1].length; i++) {
            System.out.println(grades[1][i]+" ");
        }
        System.out.println("\n");
        System.out.println("3. DİZİN: ");
        for (int i = 0; i < grades[2].length; i++) {
            System.out.println(grades[2][i]+" ");
        }
    }
}
