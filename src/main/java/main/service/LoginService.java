package main.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LoginService")
public class LoginService {

	@Autowired
	private SqlSession sqlSession;
	
	public int login(Map<String, Object> map) {
		
		return sqlSession.selectOne("login", map);
	}
}
