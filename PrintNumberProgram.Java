public class PrintNumberProgram {
    
    public static void main(String[] args) {
        int n = 5;
        int k = 1;    
        printFigure(k,n);
    }
    
    private static void printFigure(int k, int n) {
        for (int i =1; i<=k; i++) {
            System.out.print(i);
        }
        System.out.println();
        if(k!=n) {
            k++;
            printFigure(k,n);
        }
    }
}
