class Overloader {
    Overloader() {
        System.out.println("This is a Zero Parameter Constructor..");
    }

    Overloader(int k) {
        System.out.println("This is a Single With int Parameter Constructor");
    }

    Overloader(float k) {
        System.out.println("This is a Single With Float Parameter Constructor");
    }

    Overloader(byte k) {
        System.out.println("This is a Single With Byte Parameter Constructor");
    }

    Overloader(int k, float j) {
        System.out.println("This is a Two Parameter Constructor with first int second float");
    }

    Overloader(float k, int j) {
        System.out.println("This is a Two Parameter Constructor with first float second int");
    }
}

public class ConstructorOver {
    public static void main(String[] args) {
byte b = 1;
        Overloader s0=new Overloader();
        Overloader s1=new Overloader(b);
        Overloader s2=new Overloader(12);
        Overloader s3=new Overloader(1.5f);
        Overloader s4=new Overloader(1, 3.5f); 
        Overloader s5=new Overloader(1.5f, 3);
    }
}
