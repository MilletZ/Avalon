import java.util.Calendar;

public class TestCalendar{

  public static void main(String [] args){
    Calendar c = Calendar.getInstance();
    c.set(2004,1,7,15,40);
    System.out.println(c.getTime());
    long day1 = c.getTimeInMillis();
    day1 += 1000*60*60;
    c.setTimeInMillis(day1);
    System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
    c.add(c.DATE,31);
    System.out.println("add 31 days " + c.getTime());
    c.roll(c.DATE,32);
    System.out.println("roll 32 days " + c.getTime());
    c.set(c.DATE,1);
    System.out.println(c.getTime());
  }
}
