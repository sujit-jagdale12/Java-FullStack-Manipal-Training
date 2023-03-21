package com.arrays;

class Items{
	int id;
	String name;
	String city;
	public Items(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
public class PrintArrayInTableFormat {

	public static void main(String[] args) {
		Items []list=new Items[4];
		
		list[0]=new  Items(1, "Shoes", "Pune");
		list[1]=new  Items(2, "pants", "Dharashiv");
		list[2]=new  Items(3, "shirt", "Mumbai");
		list[3]=new  Items(4, "mobile", "Sambhajinagar");
		
	
		 System.out.printf("%-10s %-10s %-10s\n\n", "ItemId", "ItemName","City");
		 
		 for (int i = 0; i < list.length; i++) {
			System.out.printf("%-10s %-10s %-10s\n",list[i].id,list[i].name,list[i].city);
		}
	}
}
