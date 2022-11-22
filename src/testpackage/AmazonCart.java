package testpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonCart extends Baseclass{
	 
	 
	  @Test(priority=0)
	  public void verfyTitle() {
	 
	  //Get the page title
	  String expectedtitle="Amazon.com. Spend less. Smile more.";
	  System.out.println(driver.getTitle());
	  
	  //Verify the Page Title
	  Assert.assertEquals(driver.getTitle(), expectedtitle);
	  }
	 
	 
	  @Test(priority=1)
	  public void search() {
		  
	   //search for the product
	   driver.findElement(By.xpath(obj.searchbox)).sendKeys(obj.product);
	   driver.findElement(By.xpath(obj.searchsubmit)).click();

	   //Select Price Filter: High to low
	   driver.findElement(By.xpath(obj.filter)).click();
	   driver.findElement(By.xpath(obj.descorder)).click();
	  }
	 
	 
	  @Test(priority=2)
	  public void firstelement() {
		  
		//call search function
		search();
		
		//select first element & add to cart
		driver.findElement(By.xpath("//img[@data-image-index='"+obj.i+"']")).click();
		driver.findElement(By.id(obj.addtocart)).click();
		
		//incrementing by item index
		obj.i=obj.i+1;
	  }
	 
	 
	  @Test(priority=3)
	  public void anotherelement() {
		  
	  //repeat process for second element
	  firstelement();
	  }
	 
	 
	  @Test(priority=4)
	  public void verifycart() {
		  
	  //check the number of items in cart
	  driver.findElement(By.xpath(obj.incart)).click();
	  String check= driver.findElement(By.xpath("//*[@id='sc-subtotal-label-activecart']")).getText();
	  
	  //items count verification
	  Assert.assertEquals(check, "Subtotal (2 items):");
	  System.out.println("Verification Done - Succesful");
	  }
	 
}

