package ProgrammingQ3;

public class Q4Plaimdrome {
    public static void main(String[] args) {
        String str="Vijay";
//        String str="nayan";
        String revSTr="";

        for (int i=str.length()-1;i>=0;i--){
            revSTr=revSTr+str.charAt(i);

        }
        if (str.equalsIgnoreCase(revSTr)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not A Palindrome String");
        }
    }
}
