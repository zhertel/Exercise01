package com.hertel.exercise01;
/*
Zach Hertel
1/18/18
Exercise01
*/
public class Main {

    public static void main(String[] args) {
	String city = "Columbus";
	int zip = 43215;
	int[] avgHighTemps = {32, 25, 27, 40, 45};
	float avg = 0;

	for (int i = 0; i < 5; i++) {
	    avg += avgHighTemps[i];
    }

    avg /= 5;

    System.out.println("City: " + city);
	System.out.println("Zip: " + zip);
	System.out.println("Average High Temperature: " + avg);
    }
}
