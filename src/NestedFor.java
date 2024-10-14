public class NestedFor {
    public static void main(String[] args) {
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 5; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int r = 0; r < 5 ; r++) { // in for ";" is while
            //for(int c = 0 ; c < 10 ; c++) {
            //  System.out.printf("%3d", r * c );}
            //System.out.println();}
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
