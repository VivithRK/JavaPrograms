package Extras;
import java.util.Scanner;

public class Armstrong {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String boi = s.nextLine();
        int bbb = Integer.parseInt(boi) ;
    int j,k=bbb,sum=0;
    for(int i=0;i<boi.length();i++){
        j = k%10;
        sum += Math.pow(j, boi.length());
        k/=10;
    }
    if(sum == bbb){
        System.out.println("It is an armstrong....");
    }
    else{
        System.out.println("It is NOT AN ARMSTRONG....");
    }
}
}