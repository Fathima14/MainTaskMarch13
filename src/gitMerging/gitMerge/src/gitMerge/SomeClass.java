package gitMerge;

import java.util.ArrayList;

public class SomeClass {
	private ArrayList<String> events = new ArrayList<String>();
	
	public void createEvents(){
		events.add("We are going to movie today");
		events.add(" I am at house on sunday");
	}
	
	public void thoughtForTheDay(){
		System.out.println("Welcome");
	}
	public void upcomingEvents(){
		System.out.println("Upcoming Events");

		for(String event:events)
		{
			System.out.println(event);
		}

	}
	public static void main(String[] args){
		SomeClass sc = new SomeClass();
		sc.thoughtForTheDay();
		sc.createEvents();
		sc.upcomingEvents();
	}

}
