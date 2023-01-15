package saucedemo.database.interfaces;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import saucedemo.database.MongoConnection;

import java.util.ArrayList;
import java.util.List;

public interface MongoOps {
    MongoConnection mongoConnection = new MongoConnection();
    default List<Document> getCollection(){
        MongoCollection<Document> collection = mongoConnection.database.getCollection("automation");
        return collection.find().into(new ArrayList<>());
    };
}
