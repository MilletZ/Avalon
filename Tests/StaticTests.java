public class StaticTests{
  public static int x1;
  public final static int x2;

  static{
    x1 = 1;
    x2 = 2;
  }

  public void changeX1(){
    x1 = 2;
  }

  public static void main(String [] args){
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);

    StaticTests st = new StaticTests();
    st.changeX1();
    System.out.println("x1 = " + x1);
  }
}
