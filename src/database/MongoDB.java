package database;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class MongoDB {
    private MongoClient mongoClient = null;

    @Lock(LockType.READ)
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void insert(Integer id, String session) {;
        String mongoIpAddress = "127.0.0.1";
        Integer mongoPort = 11000;
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("auth");
        MongoCollection<Document> session_key = database.getCollection("session_key");
        Document value = new Document();
        value.append("userId", id);
        value.append("session", session);

        session_key.insertOne(value);

        mongoClient.close();
    }
}
