package hotel_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelReservations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("+========================================================+");
		System.out.println("||\t\t   Welcome To MyHotel  \t\t\t||");
		System.out.println("+========================================================+");
		System.out.println("||\t\t1. Holet Reservation :\t\t\t||");
		System.out.println("||\t\t2. Update Reservation : \t\t||");
		System.out.println("||\t\t3. Delete Reservation :\t\t\t||");
		System.out.println("||\t\t4. View Reservation :\t\t\t||");
		System.out.println("||\t\t5. Get Room Number : \t\t\t||");
		System.out.println("||\t\t6. Name Coustoumer : \t\t\t||");
		System.out.println("||\t\t7. Phone Number of Costumer : \t\t||");
		System.out.println("||\t\t8. Create Database Of Customer : \t||");
		System.out.println("||\t\t9. Create Database Of Hotel : \t\t||");
		System.out.println("||\t\t10. Create Database Of Employee :\t||");
		System.out.println("||\t\t11. How many Costumer in hotel now :\t||");
		System.out.println("||\t\t12. Exit : \t\t\t\t||");
		System.out.println("+========================================================+");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:try {
				System.out.println("Enter yours the Details of Costumer");
						System.out.println("==========================================================");
				
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
						
						new Reservation(rommNum, name, phoneNum, gamil, id, checkInDate, checkOutDate).InserData();				
						break;
			} catch (InputMismatchException e) {
				System.out.println("To match length od room number");
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Again Try");
			}
				
		case 8 :new CreateDBCustomerTable().createCoustomerTable();
				break;
				
		case 11 : new AllCostumerDetails().getDataAll();
		}
		sc.close();
	}

}
