package com.project.model;

import java.util.List;

public interface BaseModel<T> {
	public void add(T t);
	public void del(T t);
	public void update(T t);
	public List<T> queryAll(String hql);
	public T queryOne(String hql,Integer id);
	public List<T> search(String table, String name,int firstResult, int MaxResults);
	public List<T> h_Page(String hql, int firstResult, int MaxResults);
	public List<T> searchTotals(String table, String name);
}
