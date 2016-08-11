package com.project.dao.impl;

import org.springframework.stereotype.Repository;

import com.project.dao.RestaurantDao;
import com.project.domain.Restaurant;
@Repository(value="restDao")
public class RestaurantDaoImpl extends BaseDaoImpl<Restaurant> implements RestaurantDao{

}
