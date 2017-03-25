package org.coder.lucky.shopping.gifts.cache;


        import com.hazelcast.client.HazelcastClient;
        import com.hazelcast.core.Hazelcast;
        import com.hazelcast.core.HazelcastInstance;
        import com.hazelcast.core.IMap;
        import com.hazelcast.core.IQueue;
        import org.coder.lucky.shopping.gifts.domain.Country;

        import java.util.Set;

public class TestClient {

    public static void main(String[] args) {
        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient();

        IQueue<Country> countriesQ = hazelcastInstance.getQueue("countries");
        System.out.println(countriesQ.poll());


        IMap<Integer, String> zipCodeMap = hazelcastInstance.getMap("zipcodes");
        System.out.println(zipCodeMap.keySet());
    }
}
