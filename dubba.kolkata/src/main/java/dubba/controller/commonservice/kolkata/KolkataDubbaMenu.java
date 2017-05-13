package dubba.controller.commonservice.kolkata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import dubba.util.CommonUtils;
import dubba.valueobject.kolkata.circle.MenuItemRepo;
import dubba.valueobject.kolkata.circle.MenuItems;

@RestController
@RequestMapping(value = "/menu")
public class KolkataDubbaMenu {
    
	@Autowired
	private MenuItemRepo repository;	
	
	@RequestMapping(value = "/getItems", method = RequestMethod.POST)
	public String getItems (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List menuList = new ArrayList();
		
		try {			
			menuList = repository.findAll();
		} catch (Exception e) {
			//Need to handle logger
			e.printStackTrace();
		}
		Gson gson = new Gson();			
		//printLog(menuListDetails);
		return gson.toJson(menuList);
	}
	
	
	


	@RequestMapping(value = "/updateItems", method = RequestMethod.POST)
	public String updateItems (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String message = "Success";
		try {
			System.out.println("############################ Call Update MenuItem Service #############################");
			MenuItems menuitems = new MenuItems();
			menuitems.setMenuid("0011MI");	
			menuitems.setMenuname("Non Veg Combo");
			menuitems.setMenucode("NVM");
			menuitems.setMenudesc("Rice,Dal,Alu Bhaja,Fish,Mutton");
			menuitems.setMenuprice("170.0");
			menuitems.setCreatedBy("adminsystem");
			menuitems.setCreatedatetime(CommonUtils.getLocalTime());
			repository.save(menuitems);
		} catch (Exception e) {
			message = e.getMessage();
			e.printStackTrace();
		}
		
		return message;
	}
}
