package dubba.controller.commonservice.kolkata;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import dubba.util.CommonUtils;
import dubba.valueobject.kolkata.circle.MenuItemRepo;
import dubba.valueobject.kolkata.circle.MenuItems;
import sun.util.logging.resources.logging_zh_TW;

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
		String menuListDetails = gson.toJson(menuList);		
		//printLog(menuListDetails);
		return menuListDetails;
	}
	
	
	


	@RequestMapping(value = "/updateItems", method = RequestMethod.POST)
	public String updateItems (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String message = "Success";
		try {
			System.out.println("############################ Call Update MenuItem Service #############################");
			//menuList = new DubbaKolkataMenuListDAO().getMenuListDetails();
			MenuItems menuitems = new MenuItems();
			menuitems.setMenuid("0011MI");	
			menuitems.setMenuname("Non Veg Combo");
			menuitems.setMenucode("NVM");
			menuitems.setMenudesc("Rice,Dal,Alu Bhaja,Fish,Mutton");
			menuitems.setMenuprice("170.0");
			menuitems.setCreatedBy("adminsystem");
			menuitems.setCreatedatetime(CommonUtils.getLocalTime());
			//menuitems.setModifiedBy(null);
			repository.save(menuitems);
		} catch (Exception e) {
			//Need to handle logger
			message = e.getMessage();
			e.printStackTrace();
		}
		
		return message;
	}
}
