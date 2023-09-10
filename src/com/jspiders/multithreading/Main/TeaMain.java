package com.jspiders.multithreading.Main;

import com.jspiders.multithreading.resource.Tea;

import com.jspiders.multithreading.thread.Friends;
import com.jspiders.multithreading.thread1.YewaleTea;


public class TeaMain {
	
	public static void main(String[] args) {
		
		Tea tea =new Tea();
		Friends friends = new Friends (tea);
		YewaleTea yewaleTea = new YewaleTea (tea);
		
		friends.start();
		yewaleTea.start();
		
		
		
		
	}

}
