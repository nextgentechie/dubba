package dubba.controller.sellerservice.kolkata;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dubba.util.CommonUtils;
import dubba.valueobject.kolkata.circle.PartnerDetails;
import dubba.valueobject.kolkata.circle.PartnerDetailsRepo;
import dubba.valueobject.kolkata.circle.UserBasicDetails;
import dubba.valueobject.kolkata.circle.UserBasicDetailsRepo;

@RestController
@RequestMapping(value = "/kolkatapartner")
public class DubbaPartner {
	
	@Autowired
	private PartnerDetailsRepo repository;
	
	@RequestMapping(value = "/updateDetails", method = RequestMethod.POST)
	public String updateDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String message = "Success";
		try {
			System.out.println("############################ Call Update Delevary Service #############################");
			//menuList = new DubbaKolkataMenuListDAO().getMenuListDetails();
			PartnerDetails partnerdetail = new PartnerDetails();
			partnerdetail.setName("M Bose");	
			partnerdetail.setAddress("Baguihati");
			partnerdetail.setState("West Bengal");
			partnerdetail.setCity("Kolkata");
			partnerdetail.setContactno("92305594582");
			partnerdetail.setCreatedBy("M Bose");			
			partnerdetail.setPartnerid("0002PARTNER");
			partnerdetail.setEmail("mbose@gmail.com");
			partnerdetail.setLat("0.0");
			partnerdetail.setLng("0.0");
			partnerdetail.setCreatedatetime(CommonUtils.getLocalTime());
			repository.save(partnerdetail);
		} catch (Exception e) {
			//Need to handle logger
			message = e.getMessage();
			e.printStackTrace();
		}
		
		return message;
	}
	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	public List<PartnerDetails> getDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String partnerid = request.getParameter("partnerid");
		List<PartnerDetails> partnerList = repository.findByPartnerid(partnerid);
		return partnerList;
	}
}
