package Extras;
class PrintSize {
public static void main(String []args){
System.out.println("Integer = "+Integer.SIZE/8+" Bytes, from "+ Integer.MIN_VALUE + " to "+ Integer.MAX_VALUE);

System.out.println("Char = "+Character.SIZE/8+" Bytes, from "+ Character.MIN_VALUE + " to "+ Character.MAX_VALUE);
System.out.println("Float = "+Float.SIZE/8+" Bytes, from "+ Float.MIN_VALUE + " to "+ Float.MAX_VALUE);
System.out.println("Byte = "+Byte.SIZE/8+" Bytes, from "+ Byte.MIN_VALUE + " to "+ Byte.MAX_VALUE);
System.out.println("Short = "+Short.SIZE/8+" Bytes, from "+ Short.MIN_VALUE + " to "+ Short.MAX_VALUE);
System.out.println("Double = "+Double.SIZE/8+" Bytes, from "+ Double.MIN_VALUE + " to "+ Double.MAX_VALUE);
// System.out.println("Short = "+Short.SIZE);

// System.out.println("Bit = "+Bit.SIZE);
}
}
