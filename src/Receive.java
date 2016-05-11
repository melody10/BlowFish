
public abstract class Receive implements Runner{
	
	public String getMessage()
	{
		return ""; 
	}
	public String getKey()
	{
		return "";
	}
	public void setM(String message)
	{
		
	}
	public void setK(String key)
	{
		
	}
	
	public void encryption()
	{
		String message = "";
		String c = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int w = 0;
		for(int i = 0; i < 13; i++)
		{
			w = (int) Math.random()*c.length();
			message = message + c.charAt(w);
		}
		
	}
	public void decryption()
	{
		
	}
	
}
