package ProgrammingQ3;

public class Q2PatternProgramm {
    public static void main(String[] args) {
        int star=1;
        int line=5;
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if (i%2==0){
                    System.out.print("*");
                }else {
                    System.out.print("@");
                }
            }
            System.out.println();
            star++;
        }
    }
}
