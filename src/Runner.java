
public interface Runner {

	public abstract void encryption();
	public abstract void decryption();
	String message = "";
	String key = "";
	public String getMessage();
	public String getKey();
	public void setM(String message);
	public void setK(String key);
	

}
