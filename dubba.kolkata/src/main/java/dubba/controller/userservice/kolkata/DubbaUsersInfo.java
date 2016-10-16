package dubba.controller.userservice.kolkata;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dubba.util.CommonUtils;
import dubba.valueobject.kolkata.Circle.KolkataCircleMenuItemRepo;
import dubba.valueobject.kolkata.Circle.UserBasicDetails;
import dubba.valueobject.kolkata.Circle.UserBasicDetailsRepo;


@RestController
@RequestMapping(value = "/user")
public class DubbaUsersInfo {
	@Autowired
	private UserBasicDetailsRepo repository;
	
	@RequestMapping(value = "/updateDetails", method = RequestMethod.POST)
	public String updateDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String message = "Success";
		try {
			System.out.println("############################ Call Update MenuItem Service #############################");
			//menuList = new DubbaKolkataMenuListDAO().getMenuListDetails();
			UserBasicDetails dubbauser = new UserBasicDetails();
			dubbauser.setName("A Bose");	
			dubbauser.setAddress("Baguihati");
			dubbauser.setState("West Bengal");
			dubbauser.setCity("Kolkata");
			dubbauser.setContactno("9230559097");
			dubbauser.setCreatedBy("A Bose");
			dubbauser.setImeino("98658655652302");
			dubbauser.setUserid("0002USER");
			dubbauser.setEmail("abose@gmail.com");
			dubbauser.setLat("0.0");
			dubbauser.setLng("0.0");
			dubbauser.setCreatedatetime(CommonUtils.getLocalTime());
			repository.save(dubbauser);
		} catch (Exception e) {
			//Need to handle logger
			message = e.getMessage();
			e.printStackTrace();
		}
		
		return message;
	}
	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	public String getDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return "";
	}
}
