package ProgrammingQ3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1PrimeNo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter how many prime no:");
        int num=sc1.nextInt();

        ArrayList<Integer>primeList=new ArrayList<>();
        for (int j=0;j<=100;j++){
            int a=j;
            int count=0;


            for (int i=1;i<=a;i++){
                if (a%i==0){
                    count++;
                }
            }
            if (count==2){
                primeList.add(a);
            }
        }
        for (int i=0;i<num;i++){
            System.out.println(primeList.get(i));
        }
    }
}
