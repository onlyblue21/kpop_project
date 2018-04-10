package main.db.client;

import org.springframework.stereotype.Repository;

import main.db.entity.LoginEntity;

@Repository
public interface LoginMapper {

	String mapper ="/main/db/map/LoginMapper";
	
	public int login(LoginEntity Login) {
	}
	
}
