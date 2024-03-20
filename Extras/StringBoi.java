public class StringBoi {
    public static void main(String [] args){
        
        String strr = "This is a representation of a new String.";
        System.out.println("Number of Chars: "+ strr.length());
        System.out.println("Upper Case: "+ strr.toUpperCase());
        System.out.println("Extraction: "+ strr.substring(10, 24));   
        System.out.println("Number of Length in SubString: "+strr.substring(10, 24).length());
        System.out.println("Index of 'is': " + strr.indexOf("is"));        
        System.out.println("Replacement: " +strr.replace(" ", "_")); 
        System.out.println("Index of 'is': " + strr.lastIndexOf("is"));        
        
        System.out.println("Split of ' ': " );        
        String []spl = strr.split(" ");
        for (String s: spl){
            System.out.println(s);
        }
    }
}