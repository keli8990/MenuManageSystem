package com.project.model.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.dao.MenuDao;
import com.project.domain.MenuTable;
import com.project.model.MenuModel;
@Service(value="menuService")
public class MenuModelImpl extends BaseModelImpl<MenuTable> implements MenuModel{
	@Resource(name="menuDao")
	private MenuDao menuDao;


}
