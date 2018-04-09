package main.logic;

import java.util.Map;

import javax.annotation.Resource;

import service.LoginService;


public class LoginLogic {

	@Resource(name="LoginService")
	LoginService loginservice; 
	
	public int Login(Map<String, Object> map) {
		
		return loginservice.login(map);
	}
	
}
