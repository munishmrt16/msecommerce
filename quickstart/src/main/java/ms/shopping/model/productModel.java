package ms.shopping.model;

public class productModel
{

	public int id;
	public String name;
	public int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "productmodel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
