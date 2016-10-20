package ms.shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class UserDetailModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userid;
	String username;
	String pwd;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "UserDetailModel [userid=" + userid + ",username=" + username + ",pwd=" + pwd + "]";
	}
}


/*

public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pid;
	String pcat;
	String pname;
	String purl;
	int pprice;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPcat() {
		return pcat;
	}

	public void setPcat(String pcat) {
		this.pcat = pcat;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pcat=" + pcat + ",pname=" + pname + ", purl=" + purl + ",pprice="
				+ pprice + "]";
	}

	/*
	 * public int getId() {
	 * 
	 * return id; } public void setId(int id) { this.id = id; } public String
	 * getName() { return name; } public void setName(String name) { this.name =
	 * name; } public int getPrice() { return price; } public void setPrice(int
	 * price) { this.price = price; }
	 * 
	 * @Override public String toString() { return "ProductModel [id=" + id +
	 * ", name=" + name + ", price=" + price + "]"; }
	 */
/*
}
*/