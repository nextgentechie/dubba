package dubba.controller.commonservice.kolkata;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import dubba.valueobject.kolkata.circle.LoggerMasterRepo;

@RestController
@RequestMapping(value = "/logger")
public class GetProjectLog {
	
	@Autowired
	private LoggerMasterRepo repository;
	
	@RequestMapping(value = "/getLogDetails", method = RequestMethod.POST)
	public String getLogDetails (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List logList = repository.findAll();
		Gson gson = new Gson();	
		return gson.toJson(logList);
	}
}
