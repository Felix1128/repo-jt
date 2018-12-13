package com.jt.sso.service;

import com.jt.sso.pojo.User;

public interface UserService {

	Integer check(String param, Integer type) ;
	String register(User user) ;
	String login(String username, String password);
	String queryByTicket(String ticket) ;

}
