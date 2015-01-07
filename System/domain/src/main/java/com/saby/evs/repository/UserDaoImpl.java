package com.saby.evs.repository;

import org.springframework.stereotype.Repository;

import com.saby.entity.Userdetail;

@Repository
public class UserDaoImpl extends GenericDaoImpl<IIdentityObject<Userdetail>> implements IUserDao{

	@Override
	public Userdetail findCabByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

}
