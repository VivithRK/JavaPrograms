import java.util.Scanner;

public class ReadAndPrint {
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Size: ");
    int n = s.nextInt();
    int A[] = new int[n];
    System.out.println("Enter the "+ n+" elements: ");
    for(int i=0;i<n;i++){
        A[i] = s.nextInt();
    }
    System.out.println("\nThe Elements are: ");
    for (int i = 0;i<n;i++){
        System.out.print(A[i]+ " " );
    }
    System.err.println();
} 
}
