package saucedemo.database.interfaces;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import saucedemo.database.MongoConnection;

import java.util.ArrayList;
import java.util.List;

public interface MongoOps {
    MongoConnection mongo = new MongoConnection();
     public default List<Document> getCollectionAutomation(){
        MongoCollection<Document> collection = mongo.mongoDatabase.getCollection("automation");
        return collection.find().into(new ArrayList<Document>());
    }
}
