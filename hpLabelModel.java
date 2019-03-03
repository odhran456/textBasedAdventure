import java.util.*;

import javax.swing.JLabel;

public class hpLabelModel extends JLabel implements Subject {
	private double playersHP;
	headSlot bronzeMedHelm = new headSlot("Bronze Open Faced Helmet",1,0,0,3,0,20,"A rather pathetic excuse for a helmet");
	chestSlot bronzePlateBody = new chestSlot("Bronze Plate Body",3,0,3,0,0,55,"Provides poor protection for the body");
	headSlot beret = new headSlot("White Beret",0,0,0,8,0,65,"A fashionable plain white beret");
	chestSlot womensTunic = new chestSlot("Women's Tunic",0,0,0,5,0,50,"A slim fitting, white button up women's tunic");
	headSlot hatGoggles = new headSlot("Wooly Hat and Goggles",0,0,0,3,2,50,"A practical headpiece for warmth and sunlight protection");
	chestSlot duster = new chestSlot("Duster Coat",0,0,0,6,2,100,"A long brown coat");
	
	
	itemList inventory = new itemList();
	
	npc Holo = new npc(beret,womensTunic,10,"Holo of Yoitsu","Holo");
	npc Kino = new npc(hatGoggles,duster,12,"Kino the Traveller","Kino");
	character me = new character(bronzeMedHelm,bronzePlateBody,10,Holo,inventory);
	
	

	// initially, set time to midnight
	public hpLabelModel() {
		playersHP = me.getHitpoints();
	}
	
	public void updateHpLabelModel() {
		playersHP = me.getHitpoints();
		notifyObservers();
	}

	// OBSERVER PATTERN
	// SUBJECT must be able to register, remove and notify observers
	// list to hold any observers
	private List<Observer> registeredObservers = new LinkedList<Observer>();

	// methods to register, remove and notify observers
	public void registerObserver(Observer obs) {
		registeredObservers.add(obs);
	}

	public void removeObserver(Observer obs) {
		registeredObservers.remove(obs);
	}

	public void notifyObservers() {
		for (Observer obs : registeredObservers)
			obs.update();
	}
}
