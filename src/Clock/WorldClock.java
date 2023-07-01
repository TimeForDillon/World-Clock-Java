package Clock;

/**
 * A WorldClock class that finds a time in an offset timezone.
 */
public class WorldClock extends Clock
{
	private int offset;
	
	/**
	 * Constructs a WorldClock object with a given offset.
	 * @param offset Timezone difference.
	 */
	public WorldClock(int offset)
	{
		super();
		this.offset = offset;
	}
	
	/**
	 * Retrieves the current hour.
	 * @return The current hour.
	 */
	public int getHours()
	{
		if(super.getHours()+offset>24)
		return super.getHours()+offset-24;
		else return super.getHours()+offset;
	}
}
