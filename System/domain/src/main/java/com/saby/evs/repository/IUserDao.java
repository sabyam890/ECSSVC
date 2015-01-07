package com.saby.evs.repository;

import com.saby.entity.Userdetail;

public interface IUserDao extends IDataAccessObject<IIdentityObject<Userdetail>> {
	public Userdetail findCabByUserName(String UserName);
}
