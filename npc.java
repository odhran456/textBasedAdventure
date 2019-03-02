public class npc implements peopleInterface{
	
	private headSlot characterHeadSlot;
	private chestSlot characterChestSlot;
	private double hp;
	private String nameFull;
	private String nameShort;
	
	
	public npc(headSlot headItem,chestSlot chestItem, double hp, String nameFull, String nameShort) {
		characterHeadSlot = headItem;
		characterChestSlot = chestItem;
		this.hp = hp;
		this.nameFull = nameFull;
		this.nameShort = nameShort;
		
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
	/*
	public double hitpoints() {
		return hp;
	}*/
	
	public double getHitpoints() {
		return this.hp;
	}
	
	public void setHitpoints(double hp) {
		this.hp = hp;
	}
	
	public void setHeadSlot(headSlot item) {
		this.characterHeadSlot = item;
	}
	
	public void setChestSlot (chestSlot item) {
		this.characterChestSlot = item;
	}
	
	public String getFullName() {
		return nameFull;
	}
	
	public String getShortName() {
		return nameShort;
	}
	
}
