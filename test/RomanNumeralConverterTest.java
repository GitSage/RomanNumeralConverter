import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTest
{
	@Test
	public void testToRomanNumeral1() throws Exception
	{
		assertEquals("I", RomanNumeralConverter.toRomanNumeral(1));
	}

	@Test
	public void testToRomanNumeral8() throws Exception
	{
		assertEquals("VIII", RomanNumeralConverter.toRomanNumeral(8));
	}

	@Test
	public void testToRomanNumeral9() throws Exception
	{
		assertEquals("IX", RomanNumeralConverter.toRomanNumeral(9));
	}

	@Test
	public void testToRomanNumeral12() throws Exception
	{
		assertEquals("XII", RomanNumeralConverter.toRomanNumeral(12));
	}

	@Test
	public void testToRomanNumeral139() throws Exception
	{
		assertEquals("XXXIX", RomanNumeralConverter.toRomanNumeral(39));
	}

	@Test
	public void testToRomanNumeral50() throws Exception
	{
		assertEquals("L", RomanNumeralConverter.toRomanNumeral(50));
	}

	@Test
	public void testToRomanNumeral88() throws Exception
	{
		assertEquals("LXXXVIII", RomanNumeralConverter.toRomanNumeral(88));
	}

	@Test
	public void testToRomanNumeral101() throws Exception
	{
		assertEquals("CI", RomanNumeralConverter.toRomanNumeral(101));
	}

	@Test
	public void testToRomanNumeral190() throws Exception
	{
		assertEquals("CXC", RomanNumeralConverter.toRomanNumeral(190));
	}

	@Test
	public void testToRomanNumeral220() throws Exception
	{
		assertEquals("CCXX", RomanNumeralConverter.toRomanNumeral(220));
	}

	@Test
	public void testToRomanNumeral255() throws Exception
	{
		assertEquals("CCLV", RomanNumeralConverter.toRomanNumeral(255));
	}
}