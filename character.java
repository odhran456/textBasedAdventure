public class character implements peopleInterface{
	
	private headSlot characterHeadSlot;
	private chestSlot characterChestSlot;
	private npc ally;
	private double hp;
	private itemList inventory;
	
	
	public character(headSlot headItem,chestSlot chestItem, double hp ,npc ally, itemList inventory) {
		characterHeadSlot = headItem;
		characterChestSlot = chestItem;
		this.hp = hp;
		this.ally = ally;
		this.inventory = inventory;
		
	}
	
	public String getHeadSlot() {
		return "Item: " + characterHeadSlot.getSlotName() + "\n" + "Stats: \n" + 
				"melee def: " + characterHeadSlot.getMeleeDefence() + "\n" +
				"magic def: " + characterHeadSlot.getMagicDefence() + "\n" +
				"ranged def: " + characterHeadSlot.getRangeDefence() + "\n" +
				"Value: " + characterHeadSlot.getValue();
	}
	
	public String getChestSlot() {
		return "Item: " + characterChestSlot.getSlotName() + "\n" + "Stats: \n" + 
				"melee def: " + characterChestSlot.getMeleeDefence() + "\n" +
				"magic def: " + characterChestSlot.getMagicDefence() + "\n" +
				"ranged def: " + characterChestSlot.getRangeDefence() + "\n" +
				"Value: " + characterChestSlot.getValue();
	}
	
	public double totalMeleeDefence() {
		return characterHeadSlot.getMeleeDefence() + characterChestSlot.getMeleeDefence();
	}
	
	public double totalMagicDefence() {
		return characterHeadSlot.getMagicDefence() + characterChestSlot.getMagicDefence();
	}
	
	public double totalRangeDefence() {
		return characterHeadSlot.getRangeDefence() + characterChestSlot.getRangeDefence();
	}
	
	public double totalFashion() {
		return characterHeadSlot.getFashion() + characterChestSlot.getFashion();
	}
	
	public double totalIntimidating() {
		return characterHeadSlot.getIntimidating() + characterChestSlot.getIntimidating();
	}
	
	public double allyMeleeDefence() {
		return ally.totalMeleeDefence();
	}
	
	public double allyMagicDefence() {
		return ally.totalMagicDefence();
	}
	
	public double allyRangeDefence() {
		return ally.totalRangeDefence();
	}
	
	public double allyFashion() {
		return ally.totalFashion();
	}
	
	public double allyIntimidating() {
		return ally.totalIntimidating();
	}

	public void setAlly(npc ally) {
		this.ally = ally;
	}
	
	/*
	public double hitpoints() {
		return hp;
	}*/
	
	public void setHitpoints(double hp) {
		this.hp = hp;
	}
	
	public double getHitpoints() {
		return this.hp;
	}
	
	
	
	public void setHeadSlot(headSlot item) {
		this.characterHeadSlot = item;
	}
	
	public void setChestSlot (chestSlot item) {
		this.characterChestSlot = item;
	}
	
	public String getAllyFullName() {
		return ally.getFullName();
	}
	
	public String getAllyShortName() {
		return ally.getShortName();
	}
	
	
	
}
