package com.suresh;

import java.util.ArrayList;
class Student123 
{ 
	public int roll_no; 
	public String name; 
	Student123(int roll_no, String name) 
	{ 
		this.roll_no = roll_no; 
		this.name = name; 
	} 
} 

public class Demo1 {
	public static void main (String[] args) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add("name");
		arrayList.add(900000.00);
		System.out.println(arrayList);
		for(Object o:arrayList) {
			System.out.println(o);
		}
		arrayList.forEach(x->System.out.println(x));




		Student123[] arr; 
		arr = new Student123[5]; 
		arr[0] = new Student123(1,"aman"); 
		arr[1] = new Student123(2,"vaibhav"); 
		arr[2] = new Student123(3,"shikar"); 
		arr[3] = new Student123(4,"dharmesh"); 
		arr[4] = new Student123(5,"mohit"); 

		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name); 
	} 

}

