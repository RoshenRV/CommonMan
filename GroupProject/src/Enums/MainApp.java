package Enums;

import java.util.Scanner;

/**
 * Demonstrates the use of a simple enum to store seasons of the year.
 * 
 * Why are enums so useful? 
 * They restrict the choices that the user can make. 
 * If we use a primitive data type (e.g. a string)
 * to store our season (e.g. "winter", "summer") then...
 * 		- We would need to validate the string to see if it matches one of the four choices
 * 		- It's wasteful because each string takes more space than the enum (e.g. "winter" == 6 bytes for each character + 2 for "\0")
 *      - How do we sort by seasons if we use a string? The order would be lexicographical (i.e. "Autumn", "Spring", "Summer", "Winter")
 * 
 * If we used a byte we would have to validate the byte value also so that the user cannot enter
 * an invalid number (e.g. -18, 56, 7) 
 *      
 * @author NMCG
 * @version
 *
 */
public class MainApp 
{
	
	public static void main(String[] args) 
	{
		MainApp theApp = new MainApp();
		theApp.start();
	}

	private void start() 
	{
		//how we can intialise the value of an enum
                Scanner keyboard = new Scanner(System.in);
                
                String season = keyboard.next();
		Season mySeason = Season.valueOf(season);
		
		//printing an enum to screen
		System.out.println("Season is " + Season.Autumn);
		
		//accessing the position of the choice using ordinal()
		System.out.println("Position of choice is " + mySeason.ordinal());
		
		//how we can pass an enum value to a method
		doTaskBySeason(mySeason);
		
		//testing for equality
		Season yourSeason = Season.Summer;
		if(mySeason.equals(yourSeason))
		{
			System.out.println("We both like the same season!");
		}
		else
		{
			System.out.println("Do you like a different season? Weird.");
		}
		
		//comparing two seasons using Enum::compareTo()
		int resultA = mySeason.compareTo(yourSeason);
		System.out.println("Comparison result A: " + resultA);
		
		//using compareTo() is the same as doing this
		int resultB = mySeason.ordinal() - yourSeason.ordinal();
		System.out.println("Comparison result B: " + resultB);
	}
	
	public void doTaskBySeason(Season season)
	{
		if(season == Season.Spring)
		{
			System.out.println("It's Spring!");
			//do spring specific tasks...
		}
		else if(season == Season.Summer)
		{
			System.out.println("It's Summer!");
			//do spring specific tasks...
		}
		if(season == Season.Autumn)
		{
			System.out.println("It's Autumn!");
			//do spring specific tasks...
		}
		if(season == Season.Winter)
		{
			System.out.println("It's Winter!");
			//do spring specific tasks...
		}
	}
}
