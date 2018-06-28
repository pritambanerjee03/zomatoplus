package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.Item;
import com.thinkxfactor.zomatoplus.model.Resturent;
//import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomztoplus.repository.ItemsRepository;
import com.thinkxfactor.zomztoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomztoplus.repository.UserRepository;

@RestController
@RequestMapping("/restaurant")

public class RestaurantController {
	
	
	
	@Autowired
	private RestaurantRepository resturentRepository;
	
	@PostMapping("/add")
	public Resturent addrestaurant(@RequestBody Resturent user) {
		
		Resturent persistedUser=resturentRepository.save(user);
		
		
		return persistedUser;
	}
	
	
	@GetMapping("/getAll")
	public List<Resturent> getAll() {
		List<Resturent> listofrestaurant=resturentRepository.findAll();
		return listofrestaurant;
	}
	
	@Autowired
	private ItemsRepository itemRepository;
	
	@PostMapping("/item")
	public Item addItems(@RequestBody Item user) {
		
		Item persistedUser=itemRepository.save(user);
		
		
		return persistedUser;
	}
	
	
	/*@PostMapping("/create")
	public Resturent CreateResturent(@RequestBody Resturent res) {
		System.out.println(res.toString());
		
		return res;
		
	}
	
	@GetMapping("/getall")
	public List<Resturent> userList(){
		List<Resturent> res=new ArrayList<>();
		Resturent res1,res2,res3;
		res1=new Resturent("Snehasis","12345", null, 0);
		res2=new Resturent("buBAN","3454", null, 0);
		res3=new Resturent("kOLEY","546", null, 0);
		res.add(res1);
		res.add(res2);
		res.add(res3);
		
		return res;
	}
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item item) {
		System.out.println(item.toString());
		
		return item;
		
	}*/
	

}
