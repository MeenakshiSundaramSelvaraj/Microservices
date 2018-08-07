package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebController {

	@Autowired
	protected RestTemplate restTemplate;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/userList")
	public String getAllUser(Model model) {
		model.addAttribute("users",
				restTemplate.getForObject(ClientApplication.USER_SERVICE_URL + "/users", User[].class));
		return "userList";
	}

	@RequestMapping("/userDetails")
	public String accountDetails(@RequestParam("number") String id, Model model) {
		model.addAttribute("user",
				restTemplate.getForObject(ClientApplication.USER_SERVICE_URL + "/user/{id}", User.class, id));
		return "userDetails";
	}

}
