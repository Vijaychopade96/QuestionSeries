package ProgrammingQ3;

public class Q5FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,8,9,4,3,9,5,4,3,2,1,2};

        for (int i=0;i< arr.length;i++){
            boolean count=false;
            for (int j=0;j< arr.length;j++){
                if (arr[i]==arr[j] && i!=j){
                    count=true;
                    break;

                }
            }
            if (!count){
                System.out.println(arr[i]);
            }
        }
    }
}
