package saucedemo.database;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoDatabase;


public class MongoConnection {
    protected MongoClientSettings settings;
    protected MongoClient mongoClient;
    public MongoDatabase database;
    public MongoConnection(){
            mongoClient = new MongoClient();
            settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString("mongodb+srv://gabriel:62go-re61@andrade.wfkykca.mongodb.net/test")).build();
            database = mongoClient.getDatabase("study_selenium");

    }
}
