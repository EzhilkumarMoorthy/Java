package java8features;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		String[] strArr = new String[6];
		strArr[0] = "AAA";
		strArr[1] = "BBB";
		strArr[2] = "CCC";
		strArr[3] = "DDD";
		strArr[4] = "EEE";
		strArr[5] = "FFF";
		
		StringJoiner strJoiner = new StringJoiner("|");
		
		for(String str : strArr)
		{
			strJoiner.add(str);
		}
		System.out.println(strJoiner);


	}

}
