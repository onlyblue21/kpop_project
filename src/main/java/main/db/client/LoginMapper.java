package main.db.client;

import java.util.List;

import main.Form.MemberForm;

public interface LoginMapper {

	List<MemberForm> selectAll();
}
