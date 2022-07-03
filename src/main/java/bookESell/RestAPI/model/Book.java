package bookESell.RestAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id; 

import lombok.Data;

//@Data
@Entity
@Table(name="book")
public class Book {
	


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String description, String image, int price, int discount) {
		super();
		Id = id;
		this.title = title;
		this.description = description;
		this.image = image;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", description=" + description + ", image=" + image + ", price="
				+ price + ", discount=" + discount + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription() + ", getImage()=" + getImage() + ", getPrice()=" + getPrice()
				+ ", getDiscount()=" + getDiscount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image")
	private String image;
	
	@Column(name="price")
	private int price;
	
	@Column(name="discount")
	private int discount;
	

}
