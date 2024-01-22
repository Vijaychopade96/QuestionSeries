package ProgrammingQ3;

import java.util.Scanner;

public class Q3FindNo {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,3,6,9,6,7};
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter position you want upto:"+arr.length);
        int position= sc1.nextInt();
        for (int i=0;i< arr.length;i++){
            if (position<= arr.length){
                System.out.println(arr[position]);
                break;
            }else {
                System.out.println("Enter position upto"+arr.length);
            }
        }
    }
}
