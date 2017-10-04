import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = args[0];

		try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			br.readLine();
			String line;
			while((line = br.readLine()) != null)
			{
				String roman = RomanNumeralConverter.toRomanNumeral(Integer.parseInt(line));
				System.out.println(roman);
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("File " + fileName + " could not be found.");
		} catch (IOException e)
		{
			System.out.println("Error reading file");
		} catch (NumberFormatException e)
		{
			System.out.println("File formatted badly");
		} catch (IllegalAccessException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
