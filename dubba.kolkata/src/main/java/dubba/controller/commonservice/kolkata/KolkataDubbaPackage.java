package dubba.controller.commonservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/package")
public class KolkataDubbaPackage {

	@RequestMapping(value = "/getComboMenu", method = RequestMethod.POST)
	public String getComboMenu (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
	@RequestMapping(value = "/updateComboMenu", method = RequestMethod.POST)
	public String doHtmlHitting (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
