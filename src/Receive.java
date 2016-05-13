
public class Receive implements Runner{
	
	
	public String decryption(String message)
	{
		for(int i = 0; i < message.length(); i++)
		{
			if(message.substring(i,i+1) == Transmit.encryption(message).substring(i,i+1))
			{
				message = Transmit.encryption(message);
			}
		}
		return message;
	}
	
}
