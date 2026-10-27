package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private Color color;
	
	private static final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private static final boolean DEFAULT_AVAILABLE=true;
	private static final Color DEFAULT_COLOR = Color.UNKNOWN;
	
	private final int MIN_LENGTH = 6;
	private final int MAX_LENGTH = 18;

	
	public CampusVehicle() 
	{

		this(DEFAULT_ID, DEFAULT_LOCATION, DEFAULT_AVAILABLE);
		
	}
	
	
	public CampusVehicle(String id, String location, boolean available) 
	{
		this(id, location, available, DEFAULT_COLOR);
	}
	
	
	public CampusVehicle(String id, String location, boolean available, Color color)
	{
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
		if(id == null || id.length() == 0 || id.length() < MIN_LENGTH || id.length() > MAX_LENGTH || id.toUpperCase().startsWith("MU") == false)
		{
			this.id = DEFAULT_ID;
		}
		else
		{
			this.id = id.toLowerCase();
		}
		
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		
		if(location == null || location.length() == 0)
		{
			this.location = DEFAULT_LOCATION;
		}
		else
		{
			String upperCaseLocation = location.toUpperCase();

			if(upperCaseLocation.equals("LIBRARY") || upperCaseLocation.equals("UNIVERSITY BLUFFS") || upperCaseLocation.equals("PARKING LOT") || upperCaseLocation.equals("SPRUCE HALL") || upperCaseLocation.equals("LAUREL HALL"))
			{
				this.location = location.toLowerCase();
			}
			else
			{
				this.location = DEFAULT_LOCATION;
			}
			
		}
		
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		
		if(available == true)
		{
			available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}
	
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public Color getColor()
	{
		return color;
	}
	

}
