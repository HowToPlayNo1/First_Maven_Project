package mongodb;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by le.shen on 2016/9/28.
 */
public class MongoDBHelper {

    MongoClient mongoClient;
    MongoDatabase mongoDatabase;

    MongoDBHelper(String dbName) {
        mongoClient = new MongoClient("localhost", 27017);
        // 连接到数据库
        mongoDatabase = mongoClient.getDatabase(dbName);
    }


    public MongoCollection<Document> getCollection(String collectionName) {
        return mongoDatabase.getCollection(collectionName);
    }


}
