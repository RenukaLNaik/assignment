package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Tea;

public class Friends  extends Thread {
	private Tea tea;
	
	public Friends (Tea tea) {
		this.tea = tea ;
		
		
	}
	
	  @Override
	  public void run() {
		  tea.OrderTea(5);
	  }
	

}
