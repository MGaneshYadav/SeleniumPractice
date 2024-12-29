package testNG;

import org.testng.annotations.Test;

public class LearningTestNG {
	
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	
	@Test()
	public void books()
	{
		System.out.println("Books Test case");
	}
	
	@Test
	public void giftCards()
	{
		System.out.println("GiftCards Test case");
	}
	
	@Test
	public void electronics()
	{
		System.out.println("Electronics Test case");
	}

}
