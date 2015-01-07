package com.saby.evs.transformar;

import com.saby.entity.Userdetail;
import com.saby.evs.dto.UserDto;

public class UserTransformer implements BaseTransformer<Userdetail, UserDto>{

	@Override
	public Userdetail syncToDomain(Userdetail domain, UserDto dto) {
		domain.setAddressline1(dto.getAddressline1());
		domain.setAddressline2(dto.getAddressline2());
		domain.setCity(dto.getCity());
		domain.setConstituincy(dto.getConstituincy());
		domain.setEmail(dto.getEmail());
		domain.setFirstname(dto.getFirstname());
		domain.setLastname(dto.getLastname());
		domain.setPassword(dto.getPassword());
		domain.setPhonenumber(dto.getPhonenumber());
		domain.setState(dto.getState());
		domain.setStatus(dto.getStatus());
		domain.setUsername(dto.getUsername());
		domain.setZip(dto.getZip());
		return domain;
	}

	@Override
	public UserDto syncToDto(Userdetail domain, UserDto dto) {
		dto.setAddressline1(domain.getAddressline1());
		dto.setAddressline2(domain.getAddressline2());
		dto.setCity(domain.getCity());
		dto.setConstituincy(domain.getConstituincy());
		dto.setEmail(domain.getEmail());
		dto.setFirstname(domain.getFirstname());
		dto.setLastname(domain.getLastname());
		dto.setPassword(domain.getPassword());
		dto.setPhonenumber(domain.getPhonenumber());
		dto.setState(domain.getState());
		dto.setStatus(domain.getStatus());
		dto.setUsername(domain.getUsername());
		dto.setZip(domain.getZip());
		return dto;
	}

}
