package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController		
public class ProductDetails {

	

	@GetMapping("/name")
	public String getname()
	{	
		return "SamsungMobile";
	}
	
	
	  @GetMapping("/price/{price}")
	  public float getPrice(@PathVariable("price") float price) {
	  return price;
	  }
	 

	  @GetMapping("/bill/{quantity}/{price}")
	  public float billamount(@PathVariable("quantity") int quantity,@PathVariable("price") float price)
	  {		  
		  return(quantity*price);
	  }
	  
	  
	  @GetMapping("/tax/{price}/{taxpercent}")
	  public float tax(@PathVariable("price") float price,@PathVariable("taxpercent")float taxpercent)
	   {
		  return(price*(taxpercent/100));
		  
	  }
}
