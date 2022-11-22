package testpackage;

public class Repository {

	//Locator Repository and Initialization Section
	String URL="https://www.amazon.com/";
	String addtocart="add-to-cart-button";
	String incart="//*[@class='a-button-text' and @href='/gp/cart/view.html?ref_=ewc_gtc']";
	String searchbox="//input[@id='twotabsearchtextbox' and @type='text']";
	String product="selenium hardcover book";
	String searchsubmit="//input[@id='nav-search-submit-button']";
	String filter="//span[@class='a-button-text a-declarative']//child::span[contains(text(),'Sort by:')]";
	String descorder="//li/a[contains(text(), 'Price: High to Low') and @id='s-result-sort-select_2']";
	int i=1;
}
