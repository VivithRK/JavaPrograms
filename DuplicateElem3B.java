import java.util.*;


public class DuplicateElem3B {
    public static void main(String[ ] args) {
        int A[]=new int[10];
        int B[]=new int [10];
        int n, i, j, k = 0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n=s.nextInt( );
        System.out.println( "Enter elements of array : ");
        for (i = 0; i < n; i++)
        A[i]=s.nextInt( );
        for (i = 0; i < n; i++)
        {
        for (j = 0; j < k; j++)
        {
        if (A[i] == B[j])
        break;
        }
        if (j == k)
        {
            B[k] = A[i];
 k++;
 }
 }
 System.out.println( "Elements after deletion : ");
 for (i = 0; i < k; i++){
A[i]=B[i];
 System.out.print( A[i] + " " );
}
}    
}
