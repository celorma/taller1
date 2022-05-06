package taller1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String name = null, password = null, mail = null;
		String option = null;
		String answer;
		String block;
		int size = 100;
		
		ClientList clientList = new ClientList(size);
		ProductList productList = new ProductList(size);
		SaleList saleList = new SaleList(size);
		ProductList cart = new ProductList(size);
		
		// lectura y los introduce en las clases
		readClients(clientList);
		readProducts(productList);
		readSales(saleList);
		
		name = input("Ingrese su nombre de usuario: ");
		password = input("Ingrese su contrase�a: ");
		Client client = clientList.searchClient(name);		
		if (client == null ) 
		 
		{
			System.out.println();
	    	option = input("�Desea registrarse? (SI/NO): ");
	    	
	    	if (option.contentEquals("SI")) 
	    	{
		    	name = input("Ingrese su nombre de usuario: ");
		    	password = input("Ingrese su contrase�a: ");
		    	mail = input("Ingrese correo electr�nico: ");
		    	client = new Client(name,password,0,mail);
				clientList.enterClient(client);
	    	}
		}	
		division();
		//menu admin
		if (name.equals("ADMIN")&& password.equals("NYAXIO")) 
		{
			System.out.println("que desea hacer?");
			System.out.println();
			System.out.println("1 Bloquear usuario: ");
			System.out.println("2 Ver historial de compras: ");
			System.out.println("3 Agregar producto: ");
			System.out.println("4 Agregar stock: ");
			System.out.println("5 Actualizar datos: ");
			answer = input("ingrese opcion: ");
			while (!answer.equals("-1"))
			{
				if (answer.equals("1"))
				{
					block = input("ingrese usuario el cual deseas bloquear:");
					clientList.delete(block);
					clientList.print();
					
				}
				answer = input("ingrese opcion: ");
			}
		}
		//creacion de menu
		else
		{
			System.out.println("Qu� desea hacer?");
			System.out.println();
			System.out.println("1.Elegir un producto");
			System.out.println("2.Cambiar contrase�a");
			System.out.println("3.Ver cat�logo de productos");
			System.out.println("4.Ver saldo");
			System.out.println("5.Recargar saldo");
			System.out.println("6.Ver carrito");
			System.out.println("7.Quitar del carrito");
			System.out.println("8.Pagar carrito");
			System.out.println();
			option = input("Ingrese una opci�n: ");
			division();	
			while (!option.equals("-1"))
			{
				if (option.equals("1"))
				{
					System.out.println("Su saldo actual es: "+client.getCredit());
				}
				else if (option.equals("2"))
				{
					password = input("ingrese su contrase�a ACTUAL: ");
					int numberOfCharacters = password.length();

					if (client.getPassword().equals(password)) 
					{
						String newPassword;
						newPassword = input("ingresa nueva contrase�a ");
						int newPasword = newPassword.length();
						
						if (numberOfCharacters <= newPasword && newPasword < 10) 
							{
								client.setPassword(newPassword);
								
								System.out.println(client.getPassword());
							}
					}
				}
				else if (option.equals("5"))
				{
					int lastCredit = client.getCredit();
					int newCredit = Integer.parseInt(input("Ingrese la cantidad de saldo que desea agregar: "));
					newCredit = newCredit + lastCredit;
					client.setCredit(newCredit);
					System.out.println(client.getCredit()); 
				}
				option = input("Ingrese una opci�n: ");
				clientList.print();
				
			}	
		}
		
		productList.printCatalogue();

	}
	
	public static void readClients(ClientList clientList) throws FileNotFoundException
	{
		File file = new File("Clientes.txt");
		Scanner arch = new Scanner(file);
		
		while (arch.hasNextLine())
		{
			String[] parts= arch.nextLine().split(",");
			Client client = new Client(parts[0], parts[1], Integer.parseInt(parts[2]),parts[3]);
			clientList.enterClient(client);
		}
	}
	
	public static void readProducts(ProductList productList) throws FileNotFoundException
	{
		File file = new File("Productos.txt");
		Scanner arch = new Scanner(file);
		
		while (arch.hasNextLine())
		{
			String[] parts= arch.nextLine().split(",");
			Product product = new Product(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
			productList.enterProduct(product);
		}
	}
	
	public static void readSales(SaleList saleList) throws FileNotFoundException
	{
		File file = new File("Ventas.txt");
		Scanner arch = new Scanner(file);
		
		while (arch.hasNextLine())
		{
			String[] parts= arch.nextLine().split(",");
			Sale sale = new Sale(parts[0],Integer.parseInt(parts[1]));
			saleList.enterSale(sale);
		}
	}
	
	private static void division() 
	{
		System.out.println();
		System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
		System.out.println();
	}
	private static String input(String text) 
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print(text);
		String variable = scanner.nextLine();
		return variable;
	}
	public static void stuck(ProductList productList, SaleList saleList)
	{
		for (int i = 0; i< saleList.length ;i++) {
			int aux = saleList[i].getAmountSales();
			
		}
	}

}
