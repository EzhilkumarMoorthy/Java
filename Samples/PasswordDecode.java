import java.io.*;

public class PasswordDecode {
  public static void main(String[] args)  throws IOException {
   
   try
   {
	   //String a = decode("mjkk","Y");
	   String a = decode("536)?*1","YYYZZZ");
	   System.out.println(a); 
   }
   catch(Exception e)
   {
	   
   }
    System.exit(0);
  }
  
  
  public static String decode(String inpStr, String key) throws Exception
  {
      int length;
      int index;
      int character;
      int interValue1, interValue2;
      int temp;
      String tempStr;

      length = key.length();

      tempStr = inpStr;

      for (index = 1; index <= inpStr.length(); index++)
      {
          interValue1 = (index % length);
          interValue2 = interValue1 - length * (interValue1 == 0 ? -1 : 0);
          character = (key.substring(interValue2 - 1, interValue2)).charAt(0);

          if ((inpStr.substring(index - 1, index)).charAt(0) != character)
          {

              int keyAsc = (inpStr.substring(index - 1, index)).charAt(0);

              temp = (keyAsc ^ character);

              tempStr = replaceString(tempStr, inpStr.substring(index - 1, index), (char)temp , true);
          }

      }

      return tempStr;

  }
  
  
  public static String replaceString(String inputStr, String old, char replacement, boolean firstOccOnly) throws Exception
  {

      int index = inputStr.indexOf(old);

      StringBuffer replaceBuff = new StringBuffer();

      if (index == -1)
          return inputStr;

      replaceBuff.append(inputStr.substring(0, index) + replacement);

      if (firstOccOnly == true)
      {
          StringBuffer sec = new StringBuffer();
          sec.append(inputStr.substring(index + 1, inputStr.length()));
          return (replaceBuff.toString().concat(sec.toString()));
      }

      if (index + 1 < inputStr.length())
          replaceBuff.append(replaceString(inputStr.substring(index + 1, inputStr.length()), old, replacement, firstOccOnly));

      return replaceBuff.toString();
  }
}