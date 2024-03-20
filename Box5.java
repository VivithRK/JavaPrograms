import java.util.Scanner;
class Box {
    double w;
    double h;
    double d;
    double l;
    double b;
    // This is the constructor for Box.
    Box(double w, double h, double d) {
    this.w= w;
    this.h= h;
    this.d = d;
    }
    Box (double l,double b){
        this.l = l;
        this.b=  b;
    }
    // compute and return volume
    double volume() {
    return w* h* d;
    }
    void display(){
        System.out.println("Volume is " + volume());
        System.out.println("Perimeter is " + perimeter());
    }
    void rectDisplay(){
        
        System.out.println("Perimeter is " + periperi());
    }
    double periperi(){
        return 2*(l+b);
    }
    double perimeter(){
        return 2*(w*h+h*d+d*w);
    }
}
    class Box5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
    // declare, allocate, and initialize Box objects
    // double vol
    double l,b;
    Box mybox1 = new Box(10, 20, 15);
    Box mybox2= new Box(3, 6, 9);
    
    // vol = mybox1.volume();
    mybox1.display();
    mybox2.display();

   
// get volume of second box
System.out.println("\n\nRectangle Details:");
System.out.println("Enter the dimensions of the rectangle: ");
    l=s.nextDouble();
    b = s.nextDouble();
    Box rect  = new Box(l,b);
    rect.rectDisplay();
// System.out.println("Volume is " + vol);
}
}
