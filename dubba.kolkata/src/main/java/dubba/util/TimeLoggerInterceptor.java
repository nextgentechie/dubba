package dubba.util;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.messaging.support.ExecutorChannelInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeLoggerInterceptor extends HandlerInterceptorAdapter{

	private static final Logger logger = Logger.getLogger(TimeLoggerInterceptor.class);
    private static String STARTTIME ="startTime";
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler)
	    throws Exception {

		long startTime = System.currentTimeMillis();
		request.setAttribute(STARTTIME, startTime);
		//String tst = null;
       // System.out.println("######## startTime ########## "+startTime+"===");//+tst.toString());
		logger.info("Start time === > "+startTime+" \n request ====> "+request);
		return true;
	}

	//after the handler is executed
	public void postHandle(
		HttpServletRequest request, HttpServletResponse response,
		Object handler, ModelAndView modelAndView)
		throws Exception {

		long startTime = (Long)request.getAttribute(STARTTIME);

		long endTime = System.currentTimeMillis();

		long executeTime = endTime - startTime;

		
		//log it
		if(logger.isDebugEnabled()){
		   logger.debug("[" + handler + "] executeTime : " + executeTime + "ms");
		}
		
	}
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (Long) request.getAttribute(STARTTIME);
		logger.info("Request URL::" + request.getRequestURL().toString()
				+ ":: End Time=" + System.currentTimeMillis());
		logger.info("Request URL::" + request.getRequestURL().toString()
				+ ":: Time Taken=" + (System.currentTimeMillis() - startTime));
		//logger.info("-----------"+handler.toString());
		
		logger.info("Start time === > "+startTime+" \n response ====> "+response);
	}

}
