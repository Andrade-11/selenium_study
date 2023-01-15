package saucedemo.database;



import com.mongodb.MongoClientURI;
import com.mongodb.client.*;


public class MongoConnection {
    public MongoDatabase mongoDatabase;
    public MongoConnection(){
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb+srv://gabriel:62go-re61@andrade.wfkykca.mongodb.net/test");
        com.mongodb.MongoClient mongoClient = new com.mongodb.MongoClient(mongoClientURI);
        this.mongoDatabase = mongoClient.getDatabase("study_selenium");
    }
}
