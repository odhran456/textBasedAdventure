//This is the player's inventory!! itemList is a sucky name but it's an ArrayList
//of the thins under the items interface, so it made sense :/

import java.util.ArrayList;
import java.util.Arrays;

public class itemList {
	
	
	private ArrayList<item> items;

	public itemList() {
		items = new ArrayList<item>(); 	
	}
	
	public void add(item item){
		items.add(item);
	}
	
	public String printItems() {
		String inventory = "";
		for (int i=0; i < items.size(); i++) {
			inventory += items.get(i).getItemName()+ "	";
			//System.out.println(items.get(i).getItemName() + "\n");	
		}
		return inventory;
	}
	
	public String printStatsItem() {
		String statsInventory = "";
		for (int i=0; i < items.size(); i++) {
			statsInventory += items.get(i).getDetails() + "\n"; 
		}
		return statsInventory;
	}
	
	
}
