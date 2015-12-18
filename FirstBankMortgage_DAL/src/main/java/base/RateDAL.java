package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;
import java.lang.object;
import java.util.Scanner;

public class RateDAL {
	double r;
	double M1;
	double M2;
	double PMT;
	double PV;
	double n;
	double y;
	double p;
	double f;
	boolean t;	
	public double creditScore;
	public static void getInputs(){
		Scanner scnr = new Scanner (System.in);
		System.out.println("Please put in current income");
		double Income = scnr.nextInt();
		System.out.println("Please put in expected future income");
		double FutureIncome = scnr.nextInt();
		System.out.println("Please put in current expense");
		double Expense = scnr.nextInt();
		System.out.println("Please input how many years you plan to work: ");
		double yearsworked = scnr.nextInt();
		// creating new variable
		System.out.println("Please input expected average return on investment: ");
		double expectedReturn = scnr.nextInt();
		// creating new variable
		System.out.println("Please input how long you would like to be retired: ");
		double yearsRetired = scnr.nextInt();
		// creating new variable
		System.out.println("Please input your required income: ");
		double RequiredIncome = scnr.nextInt();
		// creating new variable
		System.out.println("Please input expected SSI: ");
		double SSI = scnr.nextInt();
		// creating new variable
	}
	public static void getPMT(n,y,p,f,t){
		r = (expectedReturn / 12);
		n = (yearsRetired * 12);
		y = (RequiredIncome - SSI);
		f = 0;
		t = false;
		//inputting variable to PV formula
		PV = FinanceLib.pv(r, n, y, f, t);
		// Printing out PV
		System.out.println(PV);
		// Setting up variables for PMT
		r = (.1 / 12);
		n = (yearsworked * 12);
		p = 0;
		f = PV;
		t = false;
		// Inputing variables to PMT formula then printing PMT out
		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
	// End block code
	}
	public static double getMortgagePayment(){
		M1 = Income * .36;
		M2 = (Income + Expenses)*.18;
		if M1 > M2 true{
			System.out.println(M1);
		}	
		ifel M2 > M1{
			System.out.println(M2);
		}
		else{
			System.out.println(M1);
			
		}
	}
	public static double getRate(int GivenCreditScore) {
		//FinalExam - please implement		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		
		//FinalExam - obviously change the return value
		return 0;
	}

}