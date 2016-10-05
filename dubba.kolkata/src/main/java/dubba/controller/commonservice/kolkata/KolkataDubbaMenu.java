package dubba.controller.commonservice.kolkata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import dubba.dataaccessobject.kolkata.commondao.DubbaKolkataMenuListDAO;

@RestController
@RequestMapping(value = "/menu")
public class KolkataDubbaMenu {

	@RequestMapping(value = "/getItems", method = RequestMethod.POST)
	public String getItems (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List menuList = new ArrayList();
		try {
			menuList = new DubbaKolkataMenuListDAO().getMenuListDetails();
		} catch (Exception e) {
			//Need to handle logger
			e.printStackTrace();
		}
		Gson gson = new Gson();
		String menuListDetails = gson.toJson(menuList);
		return menuListDetails;
	}
	@RequestMapping(value = "/updateItems", method = RequestMethod.POST)
	public String updateItems (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
