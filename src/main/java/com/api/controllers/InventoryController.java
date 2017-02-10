package com.api.controllers;

import com.api.models.Inventory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class InventoryController {

	@RequestMapping("/inventory")
	public List<Inventory> showInventory() {

		List<Inventory> inv = new ArrayList<Inventory>();

		inv.add(new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux"));
		inv.add(new Inventory(1, "1 Bedroom", "1BR1", "Delux Suite"));

		return inv;

	}
}
