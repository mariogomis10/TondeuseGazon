package fr.mario.com.web;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mario.com.model.PayloadEntree;
import fr.mario.com.model.PayloadSortie;
import fr.mario.com.service.TondeuseService;

@RestController
@RequestMapping("tondeuse")
public class TondeuseController {
	
	private final TondeuseService tondeuseService;
	
	 public TondeuseController(TondeuseService tondeuseService) {
		this.tondeuseService = tondeuseService;
	}

	 
	 @PostMapping(path = "/deplacer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public PayloadSortie deplacer(@RequestBody PayloadEntree payloadEntree) {
		 return tondeuseService.deplacements(payloadEntree);
	 }

}
