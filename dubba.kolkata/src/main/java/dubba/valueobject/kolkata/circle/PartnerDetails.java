package dubba.valueobject.kolkata.circle;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="partnerdetails")
public class PartnerDetails extends CommonGenericObject implements Serializable{
	    private String name;
	    private String address;
	    private String state;
	    private String city;
	    private String contactno;	
	    private String lat;
	    private String email;
	    private String lng;
	    @Id
	    private String partnerid;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public String getLat() {
			return lat;
		}
		public void setLat(String lat) {
			this.lat = lat;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLng() {
			return lng;
		}
		public void setLng(String lng) {
			this.lng = lng;
		}
		public String getPartnerid() {
			return partnerid;
		}
		public void setPartnerid(String partnerid) {
			this.partnerid = partnerid;
		}
	    
	    
	}
