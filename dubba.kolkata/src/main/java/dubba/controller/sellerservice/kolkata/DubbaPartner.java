package dubba.controller.sellerservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/partner")
public class DubbaPartner {
	@RequestMapping(value = "/updateDetails", method = RequestMethod.POST)
	public String updateDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	public String getDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
