package com.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.dao.MenuDao;
import com.project.domain.MenuTable;

@Repository(value="menuDao")
public class MenuDaoImpl extends BaseDaoImpl<MenuTable> implements MenuDao{

//	@Override
//	public List<MenuTable> listMenuForRest(int id) {
//		String hql =  "select a from com.project.domain.MenuTable a where a.rest_menu.id="+id;
//		List<MenuTable> list = this.queryAll(hql);
//		if(list.size()>0 && list != null){
//			return list;
//		}
//		return null;
//	}

}
