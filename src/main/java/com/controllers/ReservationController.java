package com.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Reservation;
import com.Site;
import com.Inventory;

@RestController
public class ReservationController {
   
    @RequestMapping("/reservation")
    public Reservation reservation() {
    		Reservation res =  new Reservation(
			1,
			"2017/12/12",
			"2017/12/12",
			"LKSJDLKJ",
			new Site(1,"Puerto Vallarta"),
			new Inventory(1,"Penthouse","PNT1", "Penthouse Villa Delux")
			);
		return res;
    }
    
    @RequestMapping("/reservations")
    public List<Reservation> reservations(){
    		List<Reservation> list = new ArrayList<Reservation>();
    			
    		list.add( new Reservation(2,"2017/12/12","2017/12/12","LKSJDLKJ",
    				new Site(2,"Pekin"),
    				new Inventory(1,"Penthouse","PNT1", "Penthouse Villa Delux")
    				)
    			);
    		list.add( new Reservation(
    				3,
    				"2017/12/12",
    				"2017/12/12",
    				"LKSJDLKJ",
    				new Site(3,"Havana"),
    				new Inventory(1,"Penthouse","PNT1", "Penthouse Villa Delux")
    				)
    			);
    		list.add( new Reservation(
    				4,
    				"2017/12/12",
    				"2017/12/12",
    				"LKSJDLKJ",
    				new Site(4,"Mexico"),
    				new Inventory(1,"Penthouse","PNT1", "Penthouse Villa Delux")
    				)
    			);
    		
    		
    		return list; 
    }
}