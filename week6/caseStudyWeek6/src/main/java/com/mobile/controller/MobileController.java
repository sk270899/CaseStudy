package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@PostMapping("/addMobile")
	public Mobile addMobile(@RequestBody Mobile mob) {
		//http://localhost:7890/mobile/addMobile
		return service.addMobile(mob);
	}
	
	@PutMapping("/updateMobile")
	public Mobile updateMobile(@RequestBody Mobile mob) {
		//http://localhost:7890/mobile/updateMobile
		return service.updateMobile(mob);
	}
	
	@GetMapping("/getMobile/{mid}")
	public Optional<Mobile> getMobile(@PathVariable("mid") int mobId) {
		//http://localhost:7890/mobile/getMobile/mid
		return service.getMobile(mobId);
	}
	
	@GetMapping("/getAllMobile")
	public Iterable<Mobile> getAllMobiles() {
		//http://localhost:7890/mobile/getAllMobile
		return service.getAllMobiles();
	}
	
	@DeleteMapping("/deleteMobile/{mid}")
	public void deleteMobile(@PathVariable("mid") int mobId) {
		//http://localhost:7890/mobile/deleteMobile/mid
		service.deleteMobile(mobId);
	}
}
