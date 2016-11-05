package dubba.valueobject.kolkata.circle;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="loggermaster")
public class CommonGenericObject implements Serializable{
 
	private String createdBy;
	private String modifiedBy;
	private String createdatetime;
	private String modifieddatetime;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(String createdatetime) {
		this.createdatetime = createdatetime;
	}
	public String getModifieddatetime() {
		return modifieddatetime;
	}
	public void setModifieddatetime(String modifieddatetime) {
		this.modifieddatetime = modifieddatetime;
	}
	
}
