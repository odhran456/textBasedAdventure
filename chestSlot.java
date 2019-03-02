public class chestSlot extends armour{
	private String chestSlotName;
	private String examine;
	
	public chestSlot (String chestSlotName, double meleeDefence, double magicDefence,
			double rangeDefence, double fashion, double intimidating, double value, String examine) {
		this.chestSlotName = chestSlotName;
		this.meleeDefence = meleeDefence;
		this.magicDefence = magicDefence;
		this.rangeDefence = rangeDefence;
		this.fashion = fashion;
		this.intimidating = intimidating;
		this.value = value;
		this.examine = examine;
	}
	
	public String getSlotName() {
		return chestSlotName;
	}
	
	public String getItemName() {
		return chestSlotName;
	}
	
	public String getDetails() {
		return "Item:	" + getSlotName() + "\n" + "Stats:" + 
				"	melee def: " + getMeleeDefence() + "\n" +
				"	magic def: " + getMagicDefence() + "\n" +
				"	ranged def: " + getRangeDefence() + "\n" +
				"	Value: " + getValue();
	}
	
	public String getExamine() {
		return examine;
	}
	
}
