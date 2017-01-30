package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Inventory;

@RestController
public class InventoryController {
	
	@RequestMapping("/inventory")
    public List<Inventory> showInventory(){
		
		List<Inventory> inv = new ArrayList<Inventory>();
		 
		inv.add(new Inventory(1,"Penthouse","PNT1", "Penthouse Villa Delux"));
		inv.add(new Inventory(1,"1 Bedroom","1BR1", "Delux Suite"));
		
		return inv;
		
	}
}
