package com.jspiders.multithreading.resource;

public class Tea {
	private int availableTea;
	
	public synchronized void OrderTea (int OrderedTea) {
		
		System.out.println("Trying to order" + OrderedTea + "Tea.");

		if (availableTea < OrderedTea) {
			
			System.out.println(OrderedTea + "Tea not available." + "Please Wait..........");
			
			try {
				this.wait();
			}
				
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableTea -= OrderedTea;
		System.out.println(availableTea + "Tea delivered.");
		System.out.println(availableTea + "Tea available");
	}
	
	public synchronized void makeTea (int makingTea) {
		 
		System.out.println("making" + makingTea + "Tea...");
		
		availableTea += makingTea ;
		
		System.out.println("makingTea" + "makeTea..");
		System.out.println(availableTea + "Tea available");
		
		this.notifyAll();
		
	}
}
				
			
	
			
		
		
	




