package dubba.controller.sellerservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/partner")
public class PartnerInvoiceHistory {
@RequestMapping(value = "/updateInvoiceHistory", method = RequestMethod.POST)
public String updatePartnerInvDetails (HttpServletRequest request,
		HttpServletResponse response) throws IOException {
	return "";
}
@RequestMapping(value = "/getInvoiceHistory", method = RequestMethod.POST)
public String getPartnerInvDetails (HttpServletRequest request,
		HttpServletResponse response) throws IOException {
	return "";
}
}
