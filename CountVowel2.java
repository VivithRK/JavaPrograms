import java.util.Scanner;

public class CountVowel2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        // String str = s.nextLine();

    int vCount = 0, cCount = 0, dCount = 0 , spCount = 0,special=0;
    String str = "Reva University Bang 123@65";
    System.out.println(str);
    str = str.toLowerCase( );
   
    for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    vCount++;
    }
    else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
    cCount++;
    } else if(str.charAt(i) >= '0' && str.charAt(i)<='9'){dCount++;}
    else if(str.charAt(i) == ' '){spCount++;}
    else{special++;}
}
System.out.println("Number of vowels: " + vCount);
System.out.println("Number of consonants: " + cCount);
System.out.println("Number of Digits: " + dCount);
System.out.println("Number of Space Chars: " +spCount);
System.out.println("Number of Special Chars: " +special);
}
} 