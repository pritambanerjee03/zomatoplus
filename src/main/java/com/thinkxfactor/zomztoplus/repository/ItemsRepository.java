package com.thinkxfactor.zomztoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.Item;


public interface ItemsRepository extends JpaRepository<Item,Long>{

}
