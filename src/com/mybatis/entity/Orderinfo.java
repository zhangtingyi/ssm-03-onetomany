package com.mybatis.entity;

public class Orderinfo {
	private int id;
	private int orders_id;
	private int products_id;
	private int products_NUM;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getProducts_id() {
		return products_id;
	}
	public void setProducts_id(int products_id) {
		this.products_id = products_id;
	}
	public int getProducts_NUM() {
		return products_NUM;
	}
	public void setProducts_NUM(int products_NUM) {
		this.products_NUM = products_NUM;
	}
	@Override
	public String toString() {
		return "Orderinfo [id=" + id + ", orders_id=" + orders_id + ", products_id=" + products_id + ", products_NUM="
				+ products_NUM + "]";
	}
	

}
