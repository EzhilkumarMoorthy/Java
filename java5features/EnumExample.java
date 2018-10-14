package java5features;

public class EnumExample {

	enum Weekdays
	{
		SUNDAY(0,"Today is holiday"),MONDAY(1,"Starting of the week"),TUESDAY(12),WEDNESDAY(13),THURSDAY(14),FRIDAY(15),SATURDAY(16);

		private int dayId;
		private String dayDesc;
		
		private Weekdays(int dayId)
		{
			this(dayId," ");
		}
		private Weekdays(int dayId,String dayDesc)
		{
			this.dayId = dayId;
			this.dayDesc = dayDesc;
		}
	}
	
	
	/**
	 * @param args
	 * Enum is the data type which contains fixed set of constants.
	 * 1) Enum can be traversed. During compilation values() method will be added to enum.  
	 * 2) This can be used in switch
	 * 3) Enum can have fields, constructor and methods
	 * 4) It can implement many interfaces, but cannot extend any class as it is extends enum class internally 
	 */
	public static void main(String[] args) {

		System.out.println(EnumSeasonExample.SUMMER);
		
		for(Weekdays day : Weekdays.values())
		{
			switch(day)
			{
				
				case SUNDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] SUNDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]"); 	break;}
				case MONDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] MONDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]"); 	break;}
				case TUESDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] TUESDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]");	break;}
				case WEDNESDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] WEDNESDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]");  break;}
				case THURSDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] THURSDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]"); 	break;}
				case FRIDAY 	:{ System.out.println("ordinal["+day.ordinal()+"] FRIDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]"); 	break;}
				case SATURDAY	:{ System.out.println("ordinal["+day.ordinal()+"] SATURDAY["+day.dayId+"] DayDesc["+day.dayDesc+"]");	break;}
			}
		}
	}

}
