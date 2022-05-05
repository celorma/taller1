package taller1;

public class ClientList 
{
	private Client[] clientList;
	private int amountClients;
	private int max;

	public ClientList(int max)
	{
		clientList = new Client[max];
		amountClients = 0;
		this.max = max;
	}
	
	public boolean enterClient(Client client)
	{
		if (amountClients<max)
		{
			clientList[amountClients] = client;
			amountClients++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Client searchClient(String clientName)
	{
		for (int i=0;i<amountClients;i++)
		{
			if(clientName.equals(clientList[i].getUser()))
			{
				return clientList[i];
			}
		}
		return null;
	}
	
	public int getAmountClients()
	{
		return amountClients;
	}
	
	public void print()
	{
		for (int i=0;i<amountClients;i++)
		{
			System.out.println(clientList[i]);
		}
	}
}
