package dubba.valueobject.kolkata.MenuItem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="menuitems")

public class MenuItems {
	@Id
    private String menuid;
    private String menuname;
    private String menuprice;
    private String menudesc;
    private String menucode;
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(String menuprice) {
		this.menuprice = menuprice;
	}
	public String getMenudesc() {
		return menudesc;
	}
	public void setMenudesc(String menudesc) {
		this.menudesc = menudesc;
	}
	public String getMenucode() {
		return menucode;
	}
	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}
    
    
}
