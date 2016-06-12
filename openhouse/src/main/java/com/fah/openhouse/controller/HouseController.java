package com.fah.openhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fah.openhouse.entity.HouseGroup;
import com.fah.openhouse.service.HouseServiceInterface;

@Controller
public class HouseController {
	
	@Autowired
	HouseServiceInterface houseService;
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	@Secured ({"USER"})
	public String home(Model model) {
		//Map<String, Climate> lClimates = new HashMap<String, Climate>();
		List<HouseGroup> lGroups = houseService.getAllHouseGroup();
		/*
		for (Room lRoom: lRooms)
		{
			List<Climate> lList = roomServiceInterface.fetchClimateBy(lRoom.getId());
			if (lList.size() > 0)
			{
				lClimates.put(lRoom.getName(), lList.get(0));
			}
		}
		*/
		//model.addAttribute("climates", lClimates);
		model.addAttribute("groups", lGroups);
		
		return "home";
	}
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}

}
