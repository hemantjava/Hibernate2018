package auto;

//Product.java(pojo class)
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
@Table(name="monu")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	private int productId;
	private String productName;
	@Transient //ignore thie propety value
	private double price;
	@Lob
	private String des;
	
    @Temporal(TemporalType.TIME)
	@Column(name = "joinate")
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public Product() {
	}

	public Product(int productId) {
		this.productId = productId;
	}

	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	// setter & getter
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductName(String productName) {

		this.productName = productName;

	}

	public String getProductName() {
		return this.productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {

		return this.price;

	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", des=" + des
				+ ", date=" + date + "]";
	}
	
	

}
