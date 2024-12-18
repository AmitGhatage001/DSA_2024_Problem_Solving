package intermediate_DSA_1;

import java.util.Scanner;

public class Factors {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        long num=sc.nextLong();
//
//        int count=0;
//        //Logic
//        for(int i=1;i<=(num/i);i++){
//            if(i==(num/i)) {
//                count++;
//                break;
//            }
//            if(i*(num/i)==num)
//                count =count+2;
//        }
//        System.out.println("Number of factors are: "+count);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        long number = sc.nextLong();
        int count=0;
//        for(int i=1;i<=number;i++){
//            if(number%i==0)
//                count++;
//        }
        for(int i=1;i<=(number/i);i++){
            if(i==(number/i)){
                count++;
                break;
            }
            if(number%i==0){
                count+=2;
            }
        }
        System.out.println(count);
    }
//    16
//    1-16,2-8,4-4
//    27
//    1-27,3-9
//    9
//    1-9,3-3
//    54
//    1-54,2-27,3-18,6-9
}
