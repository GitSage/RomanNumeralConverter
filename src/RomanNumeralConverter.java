import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralConverter
{
	private static Map<Integer, String> romanMap;
	static {
		romanMap = new LinkedHashMap<>();
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(1, "I");
		romanMap = Collections.unmodifiableMap(romanMap);
	}

	/**
	 * Calculates a Roman Numeral from a given int. Operates in constant time.
	 * @param number An int in the range 1 to 255 inclusive
	 * @return
	 */
	public static String toRomanNumeral(int number) throws IllegalAccessException
	{
		if(number > 255 || number < 0)
		{
			throw new IllegalAccessException("Number " + number + " is out of range, must be between 1 and 255 inclusive");
		}

		StringBuilder roman = new StringBuilder();
		for(Map.Entry<Integer, String> entry : romanMap.entrySet()) // happens at most 9 times, so constant time is preserved
		{
			while(number >= entry.getKey()) // loops at most 3 times, so constant time is preserved
			{
				roman.append(entry.getValue());
				number -= entry.getKey();
			}
		}
		return roman.toString();
	}
}
