interface Car
{
int speed=60;
public void distanceTravelled();
public void name();
}
interface Bus
{
int distance=100;
public void speed();
public void name();
}
public class Vehicle implements Car,Bus
{
int distanceTravelled;
int averageSpeed;
public void distanceTravelled()
{
distanceTravelled=speed*distance;
System.out.println("Total Distance Travelled is : "+distanceTravelled);
}
public void name(){
    System.out.println("The Name is Bad Vehicle");
}
public void speed()
{
int averageSpeed=distanceTravelled/speed;
System.out.println("Average Speed maintained is : "+averageSpeed);
}
public static void main(String args[])
{
Vehicle v1=new Vehicle();
v1.distanceTravelled();
v1.speed();
v1.name();
}
}
