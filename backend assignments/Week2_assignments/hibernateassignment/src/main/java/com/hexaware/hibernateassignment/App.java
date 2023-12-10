package com.hexaware.hibernateassignment;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.hexaware.hibernateassignment.Entity.User;
import com.hexaware.hibernateassignment.Services.IUserServicesImp;



@Component
public class App 
{
    public static void main( String[] args )
    {
    	IUserServicesImp ip = new IUserServicesImp();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome to USER ");
			System.out.println("1. REGISTER NEW USER");
			System.out.println("2. UPDATE EXISTING USER DETAILS");
			System.out.println("3. DELETE ANY USERACCOUNT");
			System.out.println("4. GET TO KNOW USER");
			System.out.println("5. SHOW ALL THE USER ");
			System.out.println("0. EXIT");
			
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter User firstname");
				scanner.nextLine(); // to handle enter key
				String fname1 = scanner.nextLine();
				System.out.println("Enter user lastname");
				String lname1 = scanner.nextLine();
				System.out.println("Enter Mobilenumber");
				scanner.nextInt(); // to handle enter key
				int mnumber1 = scanner.nextInt();
				System.out.println("Enter User type");
				String type1 = scanner.nextLine();
			
				User u1 = new User();
				u1.setFirstname(fname1);
				u1.setLastname(lname1);
				u1.setMobilenumber(mnumber1);
				u1.setUsertype(type1);
				System.out.println(u1);
			    ip.createUser(u1);
			    
			    System.out.println("User Registered Successfully");
			    break;
			    
			case 2:
				System.out.println("Enter User Id");
				int id2 = scanner.nextInt();// to handle enter key
				System.out.println("Enter User firstname");
				scanner.nextLine();
				String fname2 = scanner.nextLine();
				System.out.println("Enter user lastname");
				scanner.nextLine();
				String lname2 = scanner.nextLine();
				System.out.println("Enter Mobilenumber");
				int mnumber2=scanner.nextInt();
				scanner.nextInt(); // to handle enter key
				System.out.println("Enter User type");
				String type2=scanner.nextLine();
			
				User u2 = new User();
				u2.setUser_id(id2);
				u2.setFirstname(fname2);
				u2.setLastname(lname2);
				u2.setMobilenumber(mnumber2);
				u2.setUsertype(type2);
				System.out.println(u2);
			    ip.updateUser(u2);
			    
			    System.out.println("User Updated Successfully");

				break;
			case 3:

				System.out.println("Enter User Id");
				User u3 = new User();
				u3.setUser_id(scanner.nextInt());
				ip.deleteUser(u3);
				System.out.println("User Deleted Successfully");

				break;
				
			case 4:
				System.out.println("Enter User Id");
				int id4 = scanner.nextInt();
				User u4 = ip.getUserById(id4);
				System.out.println(u4);
				break;

			case 5:
				List<User> list = ip.getAllUser();
				for (User u5 : list) 
				{
					System.out.println(u5);

				}
				break;
				
			case 0:
				flag = false;
				break;
				
				
			default:
				System.err.println("Invalid User Input");
				break;
			}
		}
    }
}
			   
		
