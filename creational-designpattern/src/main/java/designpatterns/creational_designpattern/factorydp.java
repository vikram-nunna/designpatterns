package designpatterns.creational_designpattern;

import java.util.Scanner;


public class factorydp {

	public static void main(String args[])
	{
		
		System.out.println("Enter The mobile Brand");
		Scanner sc=new Scanner(System.in);
		String brandName=sc.next();
		
		phonecostfactory about=new phonecostfactory();
		
		features phonefeatures=about.getData(brandName);
		System.out.print(brandName+" RAM: ");
		phonefeatures.ram();
		System.out.print(brandName+" Camera: ");
		phonefeatures.camera();
		System.out.print(brandName+" Storage: ");
		phonefeatures.storage();		
		System.out.print(brandName+" Cost: ");
		phonefeatures.cost();
		
		sc.close();
	}
}
