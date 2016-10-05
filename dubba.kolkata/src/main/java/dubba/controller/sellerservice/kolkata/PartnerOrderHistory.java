package dubba.controller.sellerservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/partner")
public class PartnerOrderHistory {
	@RequestMapping(value = "/updateOrderHistory", method = RequestMethod.POST)
	public String updatePartnerOrderDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/getOrderHistory", method = RequestMethod.POST)
	public String getOrderInvDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
