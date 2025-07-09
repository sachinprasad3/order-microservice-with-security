package com.user.service.servise;

import java.util.List;

import com.user.service.entity.MyUser;

public interface MyUserService {
	
	public MyUser create(MyUser myUser);
	
	public MyUser getById(long id);
	
	public List<MyUser> getAll();
	
}
