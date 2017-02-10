package com.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Membership;

@RestController
@RequestMapping(value = "/api")
public class MembershipController {

	private static List<Membership> membershipRepo = new ArrayList<Membership>();

	public static void recallMemRepoMemory() {
		// once we load it we will not reload it
		if (membershipRepo.isEmpty()) {
			membershipRepo.add(new Membership(1, "Cancun", "Paris"));

		}
	}

	@RequestMapping(value = "/memberships")
	public List<Membership> getMembership1() {
		recallMemRepoMemory();
		return membershipRepo;
	}

	@RequestMapping(value = "/membership", method = RequestMethod.GET)
	public ResponseEntity<Membership> getMembership(@RequestParam(name = "id") Long id) {

		// call out your app memory, so we can remember
		// what we may have done in any past calls to the app
		recallMemRepoMemory();

		// return the site, if it's found
		for (Membership r : membershipRepo) {
			if (r.getId() == id) {
				return new ResponseEntity<Membership>(r, HttpStatus.OK);
			}
		}
		return new ResponseEntity<Membership>(new Membership(), HttpStatus.NOT_FOUND);
	}

	// Saving items to the memory
	public static void saveIntoMemRepo(Membership s) {
		recallMemRepoMemory();
		membershipRepo.add(s);
	}


}
