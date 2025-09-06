package com.nt.upi;

import java.util.Random;

public class UPIPayment {
	
	public String doUPIPayment(String upiid,double amount) {
		return "Upi payment for the amount::"+amount+"is done";
	}
	public double checkBalance(String upid) {
		return new Random().nextInt(1200000);
	}
}
