public class headSlot extends armour{
	private String headSlotName;
	private String examine;
	
	public headSlot (String headSlotName, double meleeDefence, double magicDefence,
			double rangeDefence, double fashion, double intimidating, double value, String examine) {
		this.headSlotName = headSlotName;
		this.meleeDefence = meleeDefence;
		this.magicDefence = magicDefence;
		this.rangeDefence = rangeDefence;
		this.fashion = fashion;
		this.intimidating = intimidating;
		this.value = value;
		this.examine = examine;
	}
	
	public String getSlotName() {
		return headSlotName;
	}
	
	public String getItemName() {
		return headSlotName;
	}
	
	
	public String getDetails() {
		return "Item:	" + headSlotName + "\n" + "Stats:" + 
				"	melee def: " + getMeleeDefence() + "\n" +
				"	magic def: " + getMagicDefence() + "\n" +
				"	ranged def: " + getRangeDefence() + "\n" +
				"	Value: " + getValue();
	}
	
	public String examine() {
		return examine;
	}
	
}
