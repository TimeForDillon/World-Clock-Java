package Clock;
/**
 * A class that tests the Clock and WorldClock classes.
 */
public class ClockTester
{
	public static void main(String[] args)
	{
		Clock myClock = new Clock();
		Clock yourClock = new WorldClock(3);
		System.out.println(myClock.getTime());
		System.out.println(yourClock.getTime());
	}
}