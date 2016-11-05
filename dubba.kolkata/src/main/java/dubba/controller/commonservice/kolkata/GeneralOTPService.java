package dubba.controller.commonservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class GeneralOTPService {

	@RequestMapping(value = "/genarateOTP", method = RequestMethod.POST)
	public String genarateOTP (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String otp = String.valueOf(Math.random());
		return otp;
	}
	
}
