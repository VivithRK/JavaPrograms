class Box {
    double w;
    double h;
    double d;
    // This is the constructor for Box.
    Box(double w, double h, double d) {
    this.w= w;
    this.h= h;
    this.d = d;
    }
    // compute and return volume
    double volume() {
    return w* h* d;
    }
    void display(){
        System.out.println("Volume is " + volume());
        System.out.println("Perimeter is " + perimeter());
    }
    double perimeter(){
        return 2*(w*h+h*d+d*w);
    }
}
    class Box5 {
    public static void main(String args[]) {
    // declare, allocate, and initialize Box objects
    Box mybox1 = new Box(10, 20, 15);
    Box mybox2= new Box(3, 6, 9);
    double vol;
    // vol = mybox1.volume();
    mybox1.display();
// get volume of second box
    mybox2.display();
// System.out.println("Volume is " + vol);
}
}
