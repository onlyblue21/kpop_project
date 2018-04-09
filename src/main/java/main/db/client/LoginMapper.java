package main.db.client;

import java.util.List;

import main.Form.LoginForm;

public interface LoginMapper {

	List<LoginForm> selectAll();
}
