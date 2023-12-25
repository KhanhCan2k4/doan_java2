package core;

import java.util.Arrays;

import jakarta.servlet.http.Part;

public class Product {
	private int id;
	private String name;
	private String origin;
	private float price;
	private String detail;
	private byte[] image;
	private Part imageFile;
	private int category_id;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Part getImageFile() {
		return imageFile;
	}
	public void setImageFile(Part imageFile) {
		this.imageFile = imageFile;
	}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	public Product(int id, String name, float price, String detail, String origin, byte[] image, int category_id) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.origin = origin;
		this.detail = detail;
		this.image = image;
		this.category_id = category_id;
	}
	
	public Product(int id, String name, float price, String detail,String origin, Part image, int category_id) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.origin = origin;
		this.imageFile = image;
		this.category_id = category_id;
	}
	
	public Product() {
		this.id = 0;
		this.name = "";
		this.price = 0.0f;
		this.detail = "";
		this.image = new byte[0];
		this.origin = "";
		this.category_id = 0;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", image="
				+ ", origin=" + origin + ", image=" + Arrays.toString(image) + ", category_id=" + category_id + "]";
	}
	
	
}
