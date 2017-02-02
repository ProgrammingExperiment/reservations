package com.api.controllers;

import com.api.models.Inventory;
import com.api.models.Reservation;
import com.api.models.Site;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ReservationController {

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public Reservation reservation(@RequestParam(value = "id") long id) {
        // find and retrieve the reservation details for the requested
        // reservation
        Reservation res = new Reservation(id, "2017/12/12", "2017/12/12", "LKSJDLKJ", new Site(1, "Puerto Vallarta"),
                new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux"));
        return res;
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public Reservation reservation(@RequestBody Reservation inputReservation) {
        // store in datastore
        if (inputReservation == null) {
            Reservation res = new Reservation(12, "2017/12/12", "2017/12/12", "LKSJDLKJ", new Site(2, "Pekin"),
                    new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux"));
            return res;
        }
        return inputReservation;
    }

    @RequestMapping("/reservations")
    public List<Reservation> reservations() {
        List<Reservation> list = new ArrayList<Reservation>();

        list.add(new Reservation(2, "2017/12/12", "2017/12/12", "LKSJDLKJ", new Site(2, "Pekin"),
                new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux")));
        list.add(new Reservation(3, "2017/12/12", "2017/12/12", "LKSJDLKJ", new Site(3, "Havana"),
                new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux")));
        list.add(new Reservation(4, "2017/12/12", "2017/12/12", "LKSJDLKJ", new Site(4, "Mexico"),
                new Inventory(1, "Penthouse", "PNT1", "Penthouse Villa Delux")));

        return list;
    }
}