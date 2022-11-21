package com.prowing.customexception;

public class CustomException {
	public static void main(String[] args)throws AgeInvalidException {
		System.out.println("main method is started...");
		 Voter v1=new Voter(1,"Ram",17,"INDIA");
		 String res=null;
		 
		 try {
			 res=isValidVoter(v1)?"Valid voter":"inValid voter";
			
		} catch (AgeInvalidException e) {
			System.out.println("Some issue in your age !!");
			System.out.println("====="+e.getMessage());
			e.printStackTrace();
			
		}
		 System.out.println("main method is ended..");
	}

	private static boolean isValidVoter(Voter v1) throws AgeInvalidException {
		if(v1.vAge>=18)
		return true;
		else
			throw new AgeInvalidException("invalid Age");
	}

}
