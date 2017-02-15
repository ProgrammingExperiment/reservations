package com.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Member;

@RestController
@RequestMapping(value = "/api")
public class MemberController {
	// new
	private static List<Member> MemberRepo = new ArrayList<Member>();

	// we will mimic loading data from a permanent data store (i.e. database)
	public static void LoadMemberRepoMemory() {
		// once we load it we will not reload it
		if (MemberRepo.isEmpty()) {
			MemberRepo.add(new Member(001, "Sophia", "A", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
			MemberRepo.add(new Member(002, "Emilia", "V", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
			MemberRepo.add(new Member(003, "Brianna", "M", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
			MemberRepo.add(new Member(004, "Jimmy", "J", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
			MemberRepo.add(new Member(005, "Rocio", "A", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
			MemberRepo.add(new Member(004, "Luis", "F", "Herrera", "2064 E. Indian Wells dr. chandler AZ",
					"480-555-5552", "480-555-5555", "sample@email.com"));
		}
	}

	public static void SaveIntoMemberRepo(Member s) {
		LoadMemberRepoMemory();
		MemberRepo.add(s);
	}

	@RequestMapping(value = "/Members")
	public List<Member> getMembers() {
		LoadMemberRepoMemory();
		return MemberRepo;
	}

	@RequestMapping(value = "/Member", method = RequestMethod.GET)
	public ResponseEntity<Member> getMember(@RequestParam(name = "Id") long Id) {

		// call out your app memory, so we can remember
		// what we may have done in any past calls to the app
		LoadMemberRepoMemory();

		// return the Member, if it's found
		for (Member r : MemberRepo) {
			if (r.getId() == Id) {
				return new ResponseEntity<Member>(r, HttpStatus.OK);
			}
		}

		// otherwise return 404 since it wasn't
		return new ResponseEntity<Member>(new Member(), HttpStatus.NOT_FOUND);
	}
	 
    public  static  void removeMemberFromRepo(Member s){
        LoadMemberRepoMemory();
        MemberRepo.remove(s);
        //call db and remove
    }
	
	@RequestMapping(value = "/Member", method = RequestMethod.DELETE)
	    public String getMembers(@RequestParam(name = "Id") long id) {
	        LoadMemberRepoMemory();
          for (Member r : MemberRepo) {
	            if (r.getId() == id) {
	                removeMemberFromRepo(r);
	                return "Success";
	            }
	        }
	        return  "Failed!";
	    }
	
}
