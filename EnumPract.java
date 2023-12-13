enum check
{
  MONDAY(1),
  TUESDAY(2),   
  WEDNESDAY(3);
  
  public int x;

  private check(int value)
  {
    this.x  =  value;
  }
  
   
}
public class EnumPract {
    public static void main(String[] args) {
        System.out.println(check.TUESDAY);
        System.out.println(check.MONDAY.x);
    }
}
