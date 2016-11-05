package dubba.util;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.ExecutorChannelInterceptor;

import dubba.valueobject.kolkata.circle.CommonGenericObject;
import dubba.valueobject.kolkata.circle.LoggerMaster;
import dubba.valueobject.kolkata.circle.LoggerMasterRepo;
import dubba.valueobject.kolkata.circle.UserBasicDetailsRepo;

@Aspect
public class DubbaLogger {
	
	private static final Logger logger = Logger.getLogger(DubbaLogger.class);
	private static AtomicInteger hittcounter = new AtomicInteger(0);
	@Autowired
	private LoggerMasterRepo repository;
	private StringBuffer loggerReqStr = new StringBuffer();
	private StringBuffer loggerRootStraceStr = new StringBuffer();
	
	
	@Before("execution(* dubba.controller.*.*.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("logBefore() is running!");
		hittcounter.getAndIncrement();
		Object[] objs = joinPoint.getArgs();
		loggerRootStraceStr.append(joinPoint.getSignature().getDeclaringTypeName()+":"+joinPoint.getSignature().getName());
		for(int i =0;i<objs.length;i++)
		{
			if(objs[i] instanceof HttpServletRequest){
				HttpServletRequest req = (HttpServletRequest)objs[i];
				Map <String, String> map = req.getParameterMap();
				for(Map.Entry<String, String> entry : map.entrySet()){
					loggerReqStr.append(entry.getKey() + ":" + (String)req.getParameter(entry.getKey())+"##");
					logger.info(entry.getKey() + ":" + (String)req.getParameter(entry.getKey()));
				}
				logger.info("** map *** "+map);
			}
		}
		
	}
	@AfterReturning(pointcut ="execution(* dubba.controller.*.*.*.*(..))",returning="val")
	public void logAfterReturning(Object val) throws Exception{
		StringBuffer loggerResStr = new StringBuffer();
		try {
		//System.out.println("Method return value:"+ val);
		
		loggerResStr.append(val);
		System.out.println("@AfterReturning:"+new Date());
		logger.info("** loggerReqStr *** "+loggerReqStr+"\n");
		logger.info("** loggerResStr *** "+loggerResStr+"\n");
		
			LoggerMaster loggerMaster = new LoggerMaster();
			loggerMaster.setRequest(loggerReqStr.toString());
			loggerMaster.setResponse(loggerResStr.toString());
			loggerMaster.setStatus("Success");
			loggerMaster.setCreatedatetime(CommonUtils.getLocalTime());
			loggerMaster.setMethodRoot(loggerRootStraceStr.toString());
			loggerMaster.setCreatedBy("Admin");
			logger.info("repository----->"+repository);
			loggerMaster.setLogid("LOG_0"+String.valueOf(hittcounter.get()));//LOg id need to dynamic
			repository.save(loggerMaster);
		} catch (Exception e) {
			LoggerMaster loggerMaster = new LoggerMaster();
			loggerMaster.setRequest(loggerReqStr.toString());
			loggerMaster.setResponse(loggerResStr.toString());
			loggerMaster.setStatus("ERROR : "+e.getMessage());
			loggerMaster.setCreatedatetime(CommonUtils.getLocalTime());
			loggerMaster.setMethodRoot(loggerRootStraceStr.toString());
			loggerMaster.setCreatedBy("Admin");
			logger.info("repository----->"+repository);
			loggerMaster.setLogid("LOG_0"+String.valueOf(hittcounter.get()));//LOg id need to dynamic
			repository.save(loggerMaster);
			e.printStackTrace();
		}
		loggerReqStr = new StringBuffer();
		loggerRootStraceStr = new StringBuffer();
	}
}
