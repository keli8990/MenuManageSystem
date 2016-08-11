package com.project.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="restaurant")
public class Restaurant {
	
	@Id
	@GeneratedValue
	@Column(name="id" ,nullable=false)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@Column(name="intro")
	private String intro;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="img")
	private String img;
	
	@Column(name="situation")
	private String situation;
	
	@Column(name="date")
	private String date;

	@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY,mappedBy="rest_order")
	private Set<Order> orders;
	
	@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY,mappedBy="rest_menu")
	private Set<MenuTable> menusrest;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Set<MenuTable> getMenusrest() {
		return menusrest;
	}

	public void setMenusrest(Set<MenuTable> menusrest) {
		this.menusrest = menusrest;
	}

	
	
}
