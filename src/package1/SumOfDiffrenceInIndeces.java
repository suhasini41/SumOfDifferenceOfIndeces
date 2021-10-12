package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfDiffrenceInIndeces {

	private int sumOfDifferencesInIndex(int[] n) {
		int x1=0, x2= 0;
		int sum = 0;
		String s = "";
		List<Character> al = new ArrayList<>();
		for(int i=0;i<n.length;i++)
		{
			s = s + Integer.toString(n[i]);
		}
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(!al.contains(s.charAt(i)))
			{
				al.add(s.charAt(i));
				x1 = i;
				System.out.println("x1 : "+x1);
				for(int j=s.length()-1;j>=0;j--)
				{
					if(s.charAt(j)==s.charAt(i))
					{
						x2 = j;
						System.out.println("x2 : "+x2);
						break;
					}
				}
				sum = sum + (x2 - x1);
				
			}
		}
		return sum;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {1,2,3,3,2};
		Assert.assertEquals(sumOfDifferencesInIndex(n), 4);
	}
	
	@Test
	public void testCase2()
	{
		int[] n = {1,2,1,3,5,2};
		Assert.assertEquals(sumOfDifferencesInIndex(n), 6);
	}
	
	@Test
	public void testCase3()
	{
		int[] n = {1,1,1,1,1,1};
		Assert.assertEquals(sumOfDifferencesInIndex(n), 5);
	}
	
	@Test
	public void testCase4()
	{
		int[] n = {1,2,3,4,5};
		Assert.assertEquals(sumOfDifferencesInIndex(n), 0);
	}

}
