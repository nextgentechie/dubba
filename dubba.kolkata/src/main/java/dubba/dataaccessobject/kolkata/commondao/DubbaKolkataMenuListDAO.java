package dubba.dataaccessobject.kolkata.commondao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class DubbaKolkataMenuListDAO {

public List getMenuListDetails() throws Exception
 {
        List menuList = new ArrayList();		
		DBCollection table = CreateMongoConnection.createMongoConnection().getCollection("menuitems");
		DBCursor cursor = table.find();
		String menuitems= "";
		while (cursor.hasNext()) {
			menuitems = cursor.next().toString();
			System.out.println(menuitems);
			menuList.add(menuitems);
		}
		return menuList;
 }
}
