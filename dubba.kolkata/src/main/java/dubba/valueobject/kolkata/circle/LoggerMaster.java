package dubba.valueobject.kolkata.circle;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class LoggerMaster extends CommonGenericObject implements Serializable{
	   private String request;
	    private String response;
	    private String status;
	    private String methodRoot;
	    @Id
	    private String logid;
	    public String getResponse() {
			return response;
		}
		public void setResponse(String response) {
			this.response = response;
		}
		public String getRequest() {
			return request;
		}
		public void setRequest(String request) {
			this.request = request;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getLogid() {
			return logid;
		}
		public void setLogid(String logid) {
			this.logid = logid;
		}
		public String getMethodRoot() {
			return methodRoot;
		}
		public void setMethodRoot(String methodRoot) {
			this.methodRoot = methodRoot;
		}
}
