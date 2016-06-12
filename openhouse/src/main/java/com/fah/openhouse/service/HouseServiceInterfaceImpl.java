package com.fah.openhouse.service;

import java.util.List;

import com.fah.openhouse.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fah.openhouse.entity.HouseGroup;

@Service
@Transactional
public class HouseServiceInterfaceImpl implements HouseServiceInterface {

	@Autowired
	protected GroupRepository groupRepository;
	
	@Override
	public List<HouseGroup> getAllHouseGroup() {
		return (List<HouseGroup>) groupRepository.findAll();
	}

}
