package dubba.controller.userservice.kolkata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import dubba.util.CommonUtils;
import dubba.valueobject.kolkata.circle.MenuItemRepo;
import dubba.valueobject.kolkata.circle.UserBasicDetails;
import dubba.valueobject.kolkata.circle.UserBasicDetailsRepo;


@RestController
@RequestMapping(value = "/kolkatauser")
public class DubbaUsersInfo {
	@Autowired
	private UserBasicDetailsRepo repository;
	
	@RequestMapping(value = "/updateDetails", method = RequestMethod.POST)
	public String updateDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String message = "Success";
		try {
			System.out.println("############################ Call Update Delevary Service #############################");
			//menuList = new DubbaKolkataMenuListDAO().getMenuListDetails();
			UserBasicDetails dubbauser = new UserBasicDetails();
			dubbauser.setName("A Bose");	
			dubbauser.setAddress("Baguihati");
			dubbauser.setState("West Bengal");
			dubbauser.setCity("Kolkata");
			dubbauser.setContactno("9230559099");
			dubbauser.setCreatedBy("A Bose");
			dubbauser.setImeino("98658655652301");
			dubbauser.setUserid("0003USER");
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
		String imeino = request.getParameter("imeino");
		List<UserBasicDetails> userList = repository.findByImeino(imeino);
		Gson gson = new Gson();
		String userListDetailsStr = gson.toJson(userList);		
		return userListDetailsStr;
	}
}
