package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RegisterDao;
//import com.example.demo.dao.RegisterInterface;
import com.example.demo.dao.RegisterInterface;
import com.example.demo.pojos.Details;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private RegisterInterface dao;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertDetails(@RequestBody Details user, Model model) throws Exception {
		System.out.println(user.toString());
		if (checkData(user)) {
			try {
				dao.insertDetailsPkg(user);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/show")
	public ResponseEntity<?> showDetails() throws Exception {
		try {
			List<Details> totalList = new ArrayList<>();
			totalList = dao.getAllDetailsPkg();
			System.out.println(totalList);
			return new ResponseEntity<List<Details>>(totalList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/singleUser")
    public ResponseEntity<?> showDetailsByUser(@RequestBody Integer id) throws Exception {
        try {
        	System.out.println(id);
            Details user = dao.getUserById(id);
            return new ResponseEntity<Details>(user, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PostMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestBody Integer id) throws Exception {
        try {
        	System.out.println(id);
            dao.deleteUser(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
	@PostMapping("/update")
	public ResponseEntity<?> updateDetails(@RequestBody Details user) throws Exception {
		System.out.println(user.toString());
		if (checkData(user)) {
			try {
				dao.updateDetails(user);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	private boolean checkData(Details det) {
		if (det.getDob() != null && det.getName() != null && det.getPan() != null && det.getAddress() != null) {
			return true;
		}
		return false;
	}
}
