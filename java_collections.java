//You need to import the java utilities to use collections.
import java.util.*;

public class java_collections {
	/*
	 * HashMap example coding.
	 * The first step creates a HashMap and names is ScrubDoctors
	 * The first value in the <> is the key to call and associate the information.
	 * This video helped with writing this code... https://www.youtube.com/watch?v=j442WG8YzM4
	 */
	static HashMap<String, String> scrubsDoctors = new HashMap<>();
	public static void main(String[] args) {
		//HashMaps --------------------------------------------------------------------------
		//These lines of code below put values into the hashMap, in this case three doctors.
		scrubsDoctors.put("JD", "Chief Resident");
		scrubsDoctors.put("Turk", "Chief of Surgery");
		scrubsDoctors.put("Elliot", "Private Physician");
		scrubsDoctors.put("Cox", "Chief of Medicine");
		//NOTE: If you mark a double, it needs to be a double. If it is an int, then it needs to be an int!
		
		//the "Set" word is used to set a call for the keys if you need them.
		Set keys = scrubsDoctors.keySet();
		
		//next we will get the values from the hashMap using the .get method and print out the values using the keys.
		System.out.println(scrubsDoctors.get("JD"));
		//The following line returns a string of the hashMap
		System.out.println(scrubsDoctors.toString());

		//you can use the iterator to print the keys and the associated values.
		//Question, how do you get the keys to append???
		//using just I will cause the values to print null because it cannot access the actual key. 
		//The iterator is using a number value instead of the string so it can't call it!
		for (Iterator i = keys.iterator(); i.hasNext();) {
			String doctorName = (String) i.next();
			String occupation = (String) scrubsDoctors.get(i);
			System.out.println(doctorName + " is a " + occupation);
		}
		//End of HashMaps -----------------------------------------------------------------------
		/*
		 * TreeMap example coding.
		 */
		//This first example will take a user input and count the string amount. Start by building a scanner to read human text.
		System.out.print("Welcome to the Program! Please enter a complete sentence: ");
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		
		//Next we will split the words up by the spaces.
		String[] wordCount = inputText.split(" ");
		//By adding \n\t\r,.!? for some reason it won't split all the strings.
		//If you use () {} or [] in the split you will get a runtime error and it won't finish.
		
		//Then we establish the TreeMap that takes in strings.
		TreeMap<String, Integer> userName = new TreeMap<String, Integer>();
		//Now we will use a for loop to insert the words into the TreeMap!
		for (int i = 0; i < wordCount.length; i++) {
			
			String treeKey = wordCount[i].toLowerCase();
			
			//This if will make sure the word count is the right size.
			if (wordCount[i].length() > 1) {//This will start the data entry if you haven't done anything
				
				if (userName.get(treeKey) == null) {
					userName.put(treeKey, 1);
				}

				else { //This will add values if values already exist in the key.
					int value = userName.get(treeKey).intValue();
					value++;
					userName.put(treeKey, value);
				}
				
			}	
		}
		System.out.println("Here is the TreeMap of your entry " + userName);
		//END OF TREEMAP -----------------------------------------------------------------------
		
		/*
		 * List example coding.
		 * The list interface allows you to store information in an ordered/sequenced way.
		 * Arraylist and Linkedlist are two classes that use the interface.
		 */
		//You declare the list by using the word "List" and then the data type you want to store.
		List<String> classItems = new ArrayList<String>();
		//This list holds items needed for the class and we will put them in using .add
		classItems.add("Java Collections");
		classItems.add("Threads and Executors");
		classItems.add("Use Case Documents and Diagrams");
		//Now you can print it out using a foreach loop, which will print each item on a different line.
		for (String eachItem : classItems) {
			System.out.println(eachItem);
		}
		//You can also use a traditional for loop with the .size() ability to print it out.
		for (int no = 0; no < classItems.size(); ++no) {
			System.out.println(classItems.get(no));
		}
		//They print out in the order you entered them in.
		//You can use the get keyword to retrieve information as well. The index used is a number with 0 being the item in the first position.
		System.out.println(classItems.get(0));
		System.out.println(classItems.get(2)); //This will print the last item.
		//End of List example -------------------------------------------------------------
		
		/*
		 * Set example coding.
		 * Sets only hold unique elements. They can hold anything, in this example we will use strings but they can hold objects.
		 */
		Set<String> saiyans = new HashSet<String>(); //This set of Saiyans is used with the HashSet
		//You can add items to a Set just like you would in a List:
		saiyans.add("Kakarot"); //Note add cannot add multiple items.
		saiyans.add("Vegeta");
		saiyans.add("Nappa");
		saiyans.add("Bardock");
		saiyans.add("Broly");
		saiyans.add("Gohan");
		saiyans.add("Goten");
		saiyans.add("Trunks");
		//You can print sets out easily:
		System.out.println(saiyans);
		//if you try to add another item that is already in the list, it won't add in! One difference than a list!
		saiyans.add("Vegeta");
		System.out.println(saiyans); //Note these items do not follow an order, they will print as they will. Another different than a list!
		
		//LinkedHashSet will remember item order. Check out the new set.
		Set<String> dragonBallZHeroes = new LinkedHashSet<String>();
		dragonBallZHeroes.add("Kakarot");
		dragonBallZHeroes.add("Vegeta");
		dragonBallZHeroes.add("Gohan");
		dragonBallZHeroes.add("Trunks");
		dragonBallZHeroes.add("Goten");
		System.out.println(dragonBallZHeroes); //Just liked HashSets you cannot add another item.
		
		//TreeSets sorts by a natural order - or alphabetical by string. Integers 0 and up. etc.
		Set<String> dragonBallZVillians = new TreeSet<String>();
		dragonBallZVillians.add("Raditz");
		dragonBallZVillians.add("Nappa");
		dragonBallZVillians.add("Freeza");
		dragonBallZVillians.add("Broly");
		dragonBallZVillians.add("Cell");
		dragonBallZVillians.add("Buu");
		System.out.println(dragonBallZVillians); //A lot of the printing methods talked about earlier work for Sets as well.
		//Did you know you can search a set for a given item??? You would use .contains
		if (dragonBallZVillians.contains("Ginyu")) {
			System.out.println("Ginyu has traded bodies!!!");
		} else if (dragonBallZVillians.contains("Saibamen")) {
			System.out.println("HAH! Saibamen are as week as Raditz!");
		} else if (dragonBallZVillians.contains("Buu")) { //This will be the line that prints out.
			System.out.println("We can stop Buu! We need a Spirit Bomb!");
		} else {
			System.out.println("Huh, Earth is at Peace? That's nice...");
		}
		
		//You can also check to see if the set is empty and print if needed. It works with all sets. Use .isEmpty
		Set<Integer> dragonBallsCollected = new HashSet<Integer>();
		if (dragonBallsCollected.isEmpty()) {
			System.out.println("We need to find the Dragon Balls!");
		} else {
			System.out.println(dragonBallsCollected);
		}
		
		//You can use Intersection to see where two different sets have the same information.
		//You start by creating a copy of a set so you don't mess them up!
		Set<String> intersectionExample = new HashSet<String>(saiyans); //You pass in the original set when copying it.
		System.out.println(intersectionExample); //This is used for comparision of the next line.
		intersectionExample.retainAll(dragonBallZVillians); //This code should take the intersectionExample set and keep only the same items from dragonBallZVillians
		//If you try to print out the above line with "System.out.println" it will return "true" instead of the variables. I am not really sure why though...
		System.out.println(intersectionExample);
		
		//You can also find differences by using .removeAll()
		Set<String> differenceExample = new HashSet<String>(saiyans);
		differenceExample.removeAll(dragonBallZVillians);
		System.out.println(differenceExample);
		//End of Set example ----------------------------------------------------------------
	}
	
}
