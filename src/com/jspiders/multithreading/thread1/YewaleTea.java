package com.jspiders.multithreading.thread1;

import com.jspiders.multithreading.resource.Tea;

public class YewaleTea extends Thread {
	
	private Tea tea;
	
	public YewaleTea (Tea tea) {
		this.tea=tea;
	}
	
	  @Override
	  
	  public void run() {
		  tea.makeTea(5);
	  }

}
