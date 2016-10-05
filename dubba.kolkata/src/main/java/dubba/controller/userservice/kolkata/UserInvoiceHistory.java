package dubba.controller.userservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserInvoiceHistory {

	@RequestMapping(value = "/getInvoiceHistory", method = RequestMethod.POST)
	public String getInvoiceHistory (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/updateInvoiceHistory", method = RequestMethod.POST)
	public String updateInvoiceHistory (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
