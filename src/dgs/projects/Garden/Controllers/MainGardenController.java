package dgs.projects.Garden.Controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dgs.projects.Garden.Models.User;
import dgs.projects.Garden.mongo.repositories.UsersRepository;


@RestController
public class MainGardenController {
	
	@Autowired
	private UsersRepository repository;
	
	@RequestMapping(value="/user/{idstring}",method = RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody User RetreiveUserInfo (@PathVariable String idstring)
	{
		User u = repository.findOne(idstring);
		return u;
	}

}
