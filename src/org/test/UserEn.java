package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserEn {

	public static void main(String[] args) {
		
		BankingEn a = new BankingEn();
		a.setName("Srijith");
		a.setMobNumber(9940682419l);
		
		Set<BankingEn> s = new HashSet<>();
		
		s.add(a);
		
		for (BankingEn bankingEn : s) {
			String name = bankingEn.getName();
			System.out.println(name);
			
			long mobNumber = bankingEn.getMobNumber();
			System.out.println(mobNumber);
		}
			
			
		
		
	}
		
	
}
