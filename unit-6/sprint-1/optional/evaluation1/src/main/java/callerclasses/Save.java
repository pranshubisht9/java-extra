package callerclasses;

import java.util.Scanner;

import com.beanclass.Account;
import com.interfaces.AccountDao;

import InterfaceIMPL.AccountDaoimpl;

public class Save {
	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("enter id to find details");
//		int id = sc.nextInt();
		
		Account acc = new Account(15,"xyz@g.com","delhi",345);
		  
		AccountDao ad = new AccountDaoimpl();
		
		String  ac = ad.save(acc);
		
		
		System.out.println(ac);
		
		
	}
	

}
