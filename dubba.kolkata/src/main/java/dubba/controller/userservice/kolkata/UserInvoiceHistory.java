package dubba.controller.userservice.kolkata;

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

import dubba.valueobject.kolkata.circle.MenuItemRepo;

@RestController
@RequestMapping(value = "/user")
public class UserInvoiceHistory {

	@Autowired
	private MenuItemRepo repository;	
	@RequestMapping(value = "/getInvoiceHistory", method = RequestMethod.POST)
	public String getInvoiceHistory (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List invoiceList = new ArrayList();
		
		try {			
			invoiceList = repository.findAll();
		} catch (Exception e) {
			//Need to handle logger
			e.printStackTrace();
		}
		Gson gson = new Gson();	
		return gson.toJson(invoiceList);	
		
	}
	@RequestMapping(value = "/updateInvoiceHistory", method = RequestMethod.POST)
	public String updateInvoiceHistory (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
