package com.project.model.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.dao.RestaurantDao;
import com.project.domain.Restaurant;
import com.project.model.RestaurantModel;
@Service(value="restService")
public class RestaurantModelImpl extends BaseModelImpl<Restaurant> implements RestaurantModel{
	@Resource(name="restDao")
	private RestaurantDao restDao;
}
