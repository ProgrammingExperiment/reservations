package com.api.controllers;

import com.api.models.Site;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SiteController {

	/**
	 * Add delete method Add update method
	 */

	// this will hold our app's Memory
	private static List<Site> siteRepo = new ArrayList<Site>();

	// we will mimic loading data from a permanent data store (i.e. database)
	public static void recallSiteRepoMemory() {
		// once we load it we will not reload it
		if (siteRepo.isEmpty()) {
			siteRepo.add(new Site(1, "Pekin"));
			siteRepo.add(new Site(2, "Havana"));
			siteRepo.add(new Site(3, "Mar a Lago"));
		}
	}

	// Saving items to the memory
	public static void saveIntoSiteRepo(Site s) {
		recallSiteRepoMemory();
		siteRepo.add(s);
	}

	@RequestMapping(value = "/sites")
	public List<Site> getSites() {
		recallSiteRepoMemory();
		return siteRepo;
	}

	@RequestMapping(value = "/site", method = RequestMethod.GET)
	public ResponseEntity<Site> getLocation(@RequestParam(name = "location") String location) {

		// call out your app memory, so we can remember
		// what we may have done in any past calls to the app
		recallSiteRepoMemory();

		// return the site, if it's found
		for (Site r : siteRepo) {
			if (r.getName().equalsIgnoreCase(location)) {
				return new ResponseEntity<Site>(r, HttpStatus.OK);
			}
		}

		// otherwise return 404 since it wasn't
		return new ResponseEntity<Site>(new Site(), HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/site", method = RequestMethod.POST)
	public List<Site> saveLocation(@RequestBody Site x) {
		saveIntoSiteRepo(x);
		return siteRepo;
	}

}
