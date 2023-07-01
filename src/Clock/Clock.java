package Clock;
/**
 * A clock object with hours and minutes.
 */
public class Clock
{
	private int hours;
	private int minutes;
	
	/**
	 * Constructs a clock object with the current local time.
	 */
	public Clock()
	{
		String tiempo = java.time.LocalTime.now().toString();
		this.hours = Integer.parseInt(tiempo.substring(0, 2));
		this.minutes = Integer.parseInt(tiempo.substring(3, 5));
	}

	/**
	 * Retrieves the current hour.
	 * @return The current hour.
	 */
	public int getHours()
	{
		return this.hours;
	}
	
	/**
	 * Retrieves the current minute.
	 * @return The current minute.
	 */
	public int getMinutes()
	{
		return this.minutes;
	}
	
	/**
	 * Retrieves the time in a string format.
	 * @return The time in a string format.
	 */
	public String getTime()
	{
		return this.getHours() + ":" + this.getMinutes();
	}
}
