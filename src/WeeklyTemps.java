/**
 * Rene Sequeira
 * Module 5 Critical Thinking Assignment
 * GitHub Repo: https://github.com/renejsequeira/Module5Assignment.git
 */

//import library for scanner objects and array list methods
import java.util.*;



public class WeeklyTemps {

	public static void main(String[] args) {
		
		//create scanner class object for input
		Scanner day = new Scanner(System.in);
		
		//declare variable to store input
		String choice =  " ";
		
		//declare variable to store total weekly temperature
		int totalTemp = 0;
		
		//use Arraylist class to create two arrays to store week days and daily temperatures
		ArrayList<String> dayOfTheWeek =new ArrayList<String>();
		ArrayList<Integer> dailyTemperature = new ArrayList<Integer>();
		dayOfTheWeek.add("Suday");
		dayOfTheWeek.add("Monday");
		dayOfTheWeek.add("Tuesday");
		dayOfTheWeek.add("Wednesday");
		dayOfTheWeek.add("Thursday");
		dayOfTheWeek.add("Friday");
		dayOfTheWeek.add("Saturday");
		
		dailyTemperature.add(69);
		dailyTemperature.add(79);
		dailyTemperature.add(55);
		dailyTemperature.add(60);
		dailyTemperature.add(70);
		dailyTemperature.add(80);
		dailyTemperature.add(85);
		
		//display prompt
		System.out.println("Please enter day of the week or week for daily temperatures: ");
		
		//assign prompt input to choice variable
		choice =  day.nextLine();
		
		//use switch statement for choice selection
		switch(choice){
		case "Sunday": 
			System.out.println(dayOfTheWeek.get(0) + " " + dailyTemperature.get(0));
			break;
		case "Monday": 
			System.out.println(dayOfTheWeek.get(1) + " " + dailyTemperature.get(1));
			break;
		case "Tuesday": 
			System.out.println(dayOfTheWeek.get(2) + " " + dailyTemperature.get(2));
			break;
		case "Wednesday": 
			System.out.println(dayOfTheWeek.get(3) + " " + dailyTemperature.get(3));
			break;
		case "Thursday": 
			System.out.println(dayOfTheWeek.get(4) + " " + dailyTemperature.get(4));
			break;
		case "Friday": 
			System.out.println(dayOfTheWeek.get(5) + " " + dailyTemperature.get(5));
			break;
		case "Saturday": 
			System.out.println(dayOfTheWeek.get(6) + " " + dailyTemperature.get(6));
			break;
		case "week":
			System.out.println("Daily Temperatures:");
			for(int i =0;i < dailyTemperature.size(); i++) {
				System.out.println(dailyTemperature.get(i));
				totalTemp += dailyTemperature.get(i);
			}
			System.out.println("Week Temperature Average: "+
			totalTemp / dailyTemperature.size());
			
			break;
			
		default:
			System.out.println("Week or Daily Temperature not available.....");
		}
		
		//close scanner object for memory leak prevention
		day.close();
		

	}

}
