package dubba.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CommonUtils {

	public static String getLocalTime() throws Exception{
		Calendar cal = Calendar.getInstance();
		TimeZone timeZone = cal.getTimeZone();
		cal.setTimeZone(timeZone);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = format1.format(cal.getTime());
		return formatted;
	}
	/*public static void main(String[] args){
		try{
		System.out.println(CommonUtils.getLocalTime());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
