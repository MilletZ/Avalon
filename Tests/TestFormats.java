import java.util.Date;
public class TestFormats{
  public static void main(String[] args) {
    String s = String.format("%,d", 100000000);
    String s1 = String.format("I hava %.2f bugs to fix.", 476578.09876);
    System.out.println(s);
    System.out.println(s1);

    Date d = new Date();
    String s2 = String.format("%tc",d);
    String s3 = String.format("%tr",d);
    String s4 = String.format("%tA,%tB,%td",d,d,d);
    String s5 = String.format("%tA,%<tB,%<td",d);


    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);

  }
}
