package dubba.controller.commonservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/basic")
public class GetGeneralInformation {
	@RequestMapping(value = "/getInformation", method = RequestMethod.POST)
	public String getInformation (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/updateInformation", method = RequestMethod.POST)
	public String updateInformation (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
