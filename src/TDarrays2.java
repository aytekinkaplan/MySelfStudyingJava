public class TDarrays2 {
    public static void main(String[] args) {
        int[][] grades =new int[3][4];
        grades[0][0]=57;
        grades[0][1]=89;
        grades[0][2]=90;
        grades[0][3]=78;

        grades[1][0]=50;
        grades[1][1]=80;
        grades[1][2]=95;
        grades[1][3]=70;

        grades[2][0]=45;
        grades[2][1]=67;
        grades[2][2]=89;
        grades[2][3]=71;

        for (int i = 0; i < grades.length; i++) {
         switch (i){
             case 0:
                 System.out.print("\tHarry Potter: ");break;
             case 1:
                 System.out.print("\tRon Wisley: ");break;
             case 2:
                 System.out.print("\tHermione Gringer: ");break;
         }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
