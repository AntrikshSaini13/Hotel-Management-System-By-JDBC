package hotel_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelReservations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("+========================================================+");
		System.out.println("||\t\t   Welcome To MyHotel  \t\t\t||");
		System.out.println("+========================================================+");
		System.out.println("||\t1. Holet Reservation :\t\t\t\t||");
		System.out.println("||\t2. Update Reservation : \t\t\t||");
		System.out.println("||\t3. Delete Reservation :\t\t\t\t||");
		System.out.println("||\t4. View Reservation :\t\t\t\t||");
		System.out.println("||\t5. Get Room Number : \t\t\t\t||");
		System.out.println("||\t6. Name Coustoumer : \t\t\t\t||");
		System.out.println("||\t7. Phone Number of Costumer : \t\t\t||");
		System.out.println("||\t8. Create Database Of Customer : \t\t||");
		System.out.println("||\t9. Create Database Of Hotel : \t\t\t||");
		System.out.println("||\t10. Create Database Of Employee :\t\t||");
		System.out.println("||\t11. How many Costumer in hotel now :\t\t||");
		System.out.println("||\t12. Exit : \t\t\t\t\t||");
		System.out.print("+========================================================+");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: try {
						System.out.println("+========================================================+");
						System.out.println("||\tEnter yours the Details of Costumer\t\t||");
						System.out.println("+========================================================+");
				
						System.out.print("Enter the avialable room number in hotel : ");
						long rommNum = sc.nextInt();
						
						System.out.print("Enter Costumer name : ");
						String name = sc.nextLine();
						name = sc.nextLine();
						
						System.out.print("Enter Costumer phone number : ");
						String phoneNum = sc.nextLine();
						
						System.out.print("Enter Costumer gamil : ");
						String gamil = sc.nextLine();
						
						System.out.print("Enter Costumer id : ");				
						String id = sc.nextLine();
						
						System.out.print("Enter Costumer CheckIn Date : ");				
						String checkInDate = sc.nextLine();
						
						System.out.print("Enter Costumer CheckOut Date : ");
						String checkOutDate = sc.nextLine();
						System.out.println("==========================================================");
						
						new Reservation(rommNum, name, phoneNum, gamil, id, checkInDate, checkOutDate).InserData();		
						
						System.out.println("Go back main menu enter yes/no");
						String data = sc.nextLine();
						if(data.equalsIgnoreCase("yes"))
							main(null);
						else
							System.out.println("Thanku for Vesiting");
						
				} catch (InputMismatchException e) {
					System.out.println("To match length od room number");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Again Try");
				}
				break;
				
		case 2 : System.out.println("");	
				 System.out.println("Go back main menu enter yes/no");
				 String data2 = sc.nextLine();
				 data2 = sc.nextLine();
				 if(data2.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				 break;
		case 3 : System.out.println("");	
				 System.out.println("Go back main menu enter yes/no");
				 String data3 = sc.nextLine();
				 data3 = sc.nextLine();
				 if(data3.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
			     break;
		
		case 4 : System.out.println("");
				 System.out.println("Go back main menu enter yes/no");
				 String data4 = sc.nextLine();
				 data4 = sc.nextLine();
				 if(data4.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				 break;
		
		case 5 : System.out.println("");	
				 System.out.println("Go back main menu enter yes/no");
				 String data5 = sc.nextLine();
				 data5 = sc.nextLine();
				 if(data5.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				 break;
		
		case 6 : System.out.println("");
				 System.out.println("Go back main menu enter yes/no");
				 String data6 = sc.nextLine();
				 data6 = sc.nextLine();
				 if(data6.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				 break;
		
		case 7 : System.out.println("");		
				 System.out.println("Go back main menu enter yes/no");
				 String data7 = sc.nextLine();
				 data7 = sc.nextLine();
				 if(data7.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
		  		 break;
		
		case 8 : new CreateDBCustomerTable().createCoustomerTable();
				 System.out.println("Go back main menu enter yes/no");
				 String data8 = sc.nextLine();
				 data8 = sc.nextLine();
				 if(data8.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				 break;
				
		case 9 : System.out.println("");	
				 System.out.println("Go back main menu enter yes/no");
				 String data9 = sc.nextLine();
				 data9 = sc.nextLine();
				 if(data9.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
 		 		 break;		 
		case 10 : System.out.println("");	
				 System.out.println("Go back main menu enter yes/no");
				 String data10 = sc.nextLine();
				 data10 = sc.nextLine();
				 if(data10.equalsIgnoreCase("yes"))
					 main(null);
				 else
					 System.out.println("Thanku for Vesiting");
				  break;		 
		
		case 11 : new AllCostumerDetails().getDataAll();
				  System.out.println("Go back main menu enter yes/no");
				  String data11 = sc.nextLine();
				  data11 = sc.nextLine();		
				 
				  if(data11.equalsIgnoreCase("yes")) {
					  main(null);
				  }					  
				  else {
					  System.out.println("Thanku for Vesiting");
				  }
				  break;				
				
		case 12 : System.out.println("Thanku for Commig");
				  break;
		}
		sc.close();
	}

}
