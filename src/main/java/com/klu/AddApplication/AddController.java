package com.klu.AddApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController 
{
	@GetMapping("/addservice/{a}/{b}")
	public String add(@PathVariable int  a,@PathVariable int b)
	{
		return "The sum is:"+(a+b);
	}
	@GetMapping("/addservice")
	public String add1(@RequestParam int  a, @RequestParam int b)
	{
		return "the sum is:"+(a+b);
	}
	

}