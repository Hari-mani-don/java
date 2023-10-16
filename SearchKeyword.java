package hari;

import java.util.Arrays;


public class Abstract {

	public static void main(String[] args) {
		Searchable[] serchable = {new Document("Hi Hari, How are you?", "Hari"), new Webpage("https://www.harimani.com", "Hey Guys welcome to our page", "Hey")};
		for(Searchable serch : serchable) {
			serch.search();
		}
	}

}
interface Searchable{
	void search();
}
class Document implements Searchable {
    String content;
    String keyword;
    
	//Create a constructor
	Document(String content, String keyword){
		this.content = content;
		this.keyword = keyword;
	}
	
	@Override
	public void search( ) {
		System.out.println("The " + keyword + " is "+ content.contains(keyword));
	}
	
}
class Webpage implements Searchable {

	String content;
	String url;
	String keyword;
	//create a constructor
	Webpage(String url, String content, String keyword){
		this.url = url;
		this.content = content;
		this.keyword = keyword;
	}
	@Override
	public void search() {
		System.out.println("The " + keyword + " is "+ content.contains(keyword));
		
	}
	
				
}
