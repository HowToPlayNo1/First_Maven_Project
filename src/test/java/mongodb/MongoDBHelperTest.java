package mongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Test;

/**
 * Created by le.shen on 2016/9/28.
 */
public class MongoDBHelperTest {
    @Test
    public void getCollection() throws Exception {
        String dbName = "footbar";
        String collectionName = "blog";
        MongoDBHelper helper = new MongoDBHelper(dbName);
        MongoCollection<Document> collection = helper.getCollection(collectionName);
        FindIterable<Document> documents = collection.find();
        for (Document doc : documents) {
            System.out.println(doc);
        }

    }

}