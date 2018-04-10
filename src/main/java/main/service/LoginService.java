package main.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import main.db.client.LoginMapper;
import main.db.entity.LoginEntity;

@Service("LoginService")
public class LoginService {

	
	
	public int login(Map<String, Object> map) {
		LoginEntity loginEntity = new LoginEntity();
		
		return LoginMapper.login(loginEntity);
	}
}
