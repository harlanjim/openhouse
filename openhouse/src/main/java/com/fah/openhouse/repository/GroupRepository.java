package com.fah.openhouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.fah.openhouse.entity.HouseGroup;

@EnableJpaRepositories
public interface GroupRepository extends CrudRepository<HouseGroup, Long>
{
    List<HouseGroup> findByName(String name);
}
