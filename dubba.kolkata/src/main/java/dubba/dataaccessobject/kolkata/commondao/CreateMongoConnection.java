package dubba.dataaccessobject.kolkata.commondao;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class CreateMongoConnection {
    private static volatile MongoClient mongo = null;
    private CreateMongoConnection(){ }
	public static DB createMongoConnection() throws UnknownHostException{
		if(mongo==null){
			mongo = new MongoClient( "localhost" , 27017 );
		}
		DB db = mongo.getDB("dubbakolkata");		
		return db;
	}
}
