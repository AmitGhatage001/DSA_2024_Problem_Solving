package intermediate_DSA_1;

import java.util.Scanner;

public class FloorSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        //num
        //i*i<=num
        //50
        //1*1=1,2*2=4,3*3=9,4*4=16,5*5=25,6*6=36,7*7=49,8*8=64
        // if(i*i<=num)
        //else return i break
        int num=sc.nextInt();
        int i=1;
        while(i*i<=num){
            if(i*i<=num){
                i++;
            }
            else{
                break;
            }

        }

        System.out.println("Answer is:"+(i-1));
        //iterations (N+1)
    }

}
