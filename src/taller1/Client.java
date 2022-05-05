package taller1;

public class Client 
{
	private String user;
	private String password;
	private int credit;
	private String mail;
	
	public Client(String user, String password, int balance, String mail)
	{
		this.user = user;
		this.password = password;
		this.credit = balance;
		this.mail = mail;
	}
	public String getUser()
	{
		return user;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public int getCredit()
	{
		return credit;
	}
	public void setCredit(int credit) 
	{
		this.credit = credit;
	}
	public String getMail() 
	{
		return mail;
	}
	public void setMail(String mail) 
	{
		this.mail = mail;
	}
	@Override
	public String toString() 
	{
		return "Client [user=" + user + ", password=" + password + ", credit=" + credit + ", mail=" + mail + "]";
	}
	
}
