
public class NumberToText 
{

	public static void main(String[] args) 
	{
		String inputNumber="1024";// 1 to 9999
		int inputLength=inputNumber.length();
		int units=0;
		int tens=0;
		int hundreds=0;
		int thousands=0;
		
		String txtThousands = "";
		String txtHundreds = "";
		String txtTens  = "";
		String txtUnits = "";
		String text="";
		if(inputLength==1)
		{
			units=Integer.parseInt(inputNumber);
		}
		else if(inputLength==2)
		{
			tens  = Integer.parseInt(inputNumber.substring(0, 1));
			units = Integer.parseInt(inputNumber.substring(1, 2));
		}
		else if(inputLength==3)
		{
			hundreds = Integer.parseInt(inputNumber.substring(0, 1));
			tens     = Integer.parseInt(inputNumber.substring(1, 2));
			units    = Integer.parseInt(inputNumber.substring(2, 3));
		}
		else if(inputLength==4)
		{
			thousands = Integer.parseInt(inputNumber.substring(0, 1));
			hundreds  = Integer.parseInt(inputNumber.substring(1, 2));
			tens      = Integer.parseInt(inputNumber.substring(2, 3));
			units	  = Integer.parseInt(inputNumber.substring(3, 4));
		}
		if(thousands!=0)
		{
			switch(thousands)
			{
				case 1:
						txtThousands="One thousand";
						break;
				case 2:
						txtThousands="Two thousand";
						break;
				case 3:
						txtThousands="Three thousand";
						break;
				case 4:
						txtThousands="Four thousand";
						break;
				case 5:
						txtThousands="Five thousand";
						break;
				case 6:
						txtThousands="Six thousand";
						break;
				case 7:
						txtThousands="Seven thousand";
						break;
				case 8:
						txtThousands="Eight thousand";
						break;
				case 9:
						txtThousands="Nine thousand";
						break;
			}
		}
		if(hundreds!=0)
		{
			switch(hundreds)
			{
				case 1:
					   txtHundreds="One hundred";
					   break;

				case 2:
					   txtHundreds="Two hundred";
					   break;

				case 3:
					   txtHundreds="Three hundred";
					   break;

				case 4:
					   txtHundreds="Four hundred";
					   break;

				case 5:
					   txtHundreds="Five hundred";
					   break;
				case 6:
					   txtHundreds="Six hundred";
					   break;
				case 7:
					   txtHundreds="Seven hundred";
					   break;
				case 8:
					   txtHundreds="Eight hundred";
					   break;
				case 9:
					   txtHundreds="Nine hundred";
					   break;
			}
		}
		if(tens>1)
		{
			switch(tens)
			{
				case 2:
					   txtTens="Twenty";
					   break;

				case 3:
						txtTens="Thirty";
					    break;

				case 4:
						txtTens="Forty";
					    break;

				case 5:
						txtTens="Fifty";
					    break;

				case 6:
						txtTens="Sixty";
					    break;
				case 7:
						txtTens="Seventy";
					    break;
				case 8:
						txtTens="Eighty";
					    break;
				case 9:
						txtTens="Ninety";
					    break;
			 }
	     }
		if(tens==1)
		{
			int temp= tens*10+units;
			switch(temp)
			{
				case 10:
						txtTens="Ten";
					    break;
				case 11:
						txtTens="Eleven";
					    break;
				case 12:
						txtTens="Twelve";
						break;
				case 13:
						txtTens="Thirteen";
						break;
				case 14:
						txtTens="Fourteen";
						break;
				case 15:
						txtTens="Fifteen";
						break;
				case 16:
						txtTens="Sixteen";
						break;
				case 17:
						txtTens="Seventeen";
						break;
				case 18:
						txtTens="Eighteen";
						break;
				case 19:
						txtTens="Nineteen";
						break;
			}
		}
		if(tens!=1)
		{
			switch(units)
			{
				case 1:
						txtUnits="One";
						break;
				case 2:
						txtUnits="Two";
						break;
				case 3:
						txtUnits="Three";
						break;
				case 4:
						txtUnits="Four";
						break;
				case 5:
						txtUnits="Five";
						break;
				case 6:
						txtUnits="Six";
						break;
				case 7:
						txtUnits="Seven";
						break;
				case 8:
						txtUnits="Eight";
						break;
				case 9:
						txtUnits="Nine";
						break;
			}
		}
		if(txtThousands.length()>0 && !txtThousands.trim().equals(""))
		{
			text+=txtThousands;
			if(hundreds!=0 || tens!=0 || units!=0)
			{
				text+=" ";
			}
		}
		if(txtHundreds.length()>0 && !txtHundreds.trim().equals(""))
		{
			text+=txtHundreds;
			if(tens!=0 || units!=0)
			{
				text+=" and";
			}
		}
		if(txtTens.length()>0 && !txtTens.trim().equals(""))
		{
			text+=" "+txtTens;
		}
		if(txtUnits.length()>0 && !txtUnits.trim().equals(""))
		{
			text+=" "+txtUnits;
		}
		System.out.println("Input::"+inputNumber);
		System.out.println("Output::"+text);
	}
}


