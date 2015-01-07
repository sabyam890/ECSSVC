package com.saby.evs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saby.entity.Userdetail;
import com.saby.evs.dto.UserDto;
import com.saby.evs.exception.ServiceException;
import com.saby.evs.repository.IUserDao;
import com.saby.evs.request.UserRequest;
import com.saby.evs.response.UserResponse;
import com.saby.evs.service.IUserService;
import com.saby.evs.transformar.UserTransformer;


/**
 * @author Sabyasachi
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userDao;

	@Override
	public UserResponse loginUser(UserRequest userRequest) throws ServiceException {
		UserDto dto = null;
		if(userRequest != null){
			dto = userRequest.getUserDto();
			if(dto!=null){
				
			}
		}
		return null;
	}

	@Override
	public UserResponse registerUser(UserRequest userRequest) throws ServiceException {
		UserResponse response = new UserResponse();
		UserDto dto = null;
		if(userRequest != null){
			dto = userRequest.getUserDto();
			if(dto!=null){
				Userdetail domain = new Userdetail();
				UserTransformer transformer = new UserTransformer();
				transformer.syncToDomain(domain, dto);
				userDao.save(domain);
				response.setUserDto(dto);
			}
		}
		return response;
	}

}
