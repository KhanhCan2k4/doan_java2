package core;

import java.util.Arrays;

public class Category {
	private int id;
	private String name;
	
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
	
	public Category(int id, String name, String detail) {
		this.id = id;
		this.name = name;
	}
	
	public Category() {
		this.id = 0;
		this.name = "";
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}
