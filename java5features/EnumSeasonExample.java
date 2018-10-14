package java5features;

/*Enum is used without creation of class */

public enum EnumSeasonExample {
	
	SUMMER(1),SPRING,WINTER,FALL;
	
	public int a =0;
	
	
	EnumSeasonExample()
	{
		
	}
	EnumSeasonExample(int a)
	{
		this.a = a;
	}
}
