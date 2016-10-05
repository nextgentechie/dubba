package dubba.controller.userservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class DubbaUserOrder {

	@RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
	public String updateOrder (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/displayOrder", method = RequestMethod.POST)
	public String displayOrder (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
