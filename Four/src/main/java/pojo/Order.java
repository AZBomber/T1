package pojo;

import java.util.Date;
import java.util.List;

public class Order {
int oid;
double total;
Date ordertime;
Integer state;
String name;
String phone;
String address;
int uid;
List<OrderItem> orderItems;

public List<OrderItem> getOrderItems() {
	return orderItems;
}
public void setOrderItems(List<OrderItem> orderItems) {
	this.orderItems = orderItems;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Date getOrdertime() {
	return ordertime;
}
public void setOrdertime(Date ordertime) {
	this.ordertime = ordertime;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}

}
