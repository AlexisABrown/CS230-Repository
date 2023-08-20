package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance.
		GameService service = GameService.getInstance(); // Replaced null with a call to getInstance method. 
		/**
		 * This prevents multiple instances of the same game from starting. 
		 *  It is called from the GameService file to ensure the entire program is referencing the same instances. 
		 *  Preventing duplicates is a big reason singleton patterns are used. 
		 */
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		//Team members should be added here with their ID
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		//Team members should be added here with their ID
		System.out.println(game2);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
