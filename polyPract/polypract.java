package polyPract;
class car
{
    public void engine()
    {
        System.out.println("Car engine prototype");
    }
}
class suzukiErtiga extends car 
{
    @Override
    public void engine()
    {
        System.out.println("1200 cc engine");
    }
    public void numberofSeats()
    {
        System.out.println("4");
    }
}
public class polypract {
    public static void main(String[] args) {
        car c = new suzukiErtiga();
        c.engine();
        System.out.println(c instanceof car);
    }
}
