package org.coder.lucky.shopping.gifts.cache.loader;

import com.hazelcast.core.MapLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.*;


public class ZipCodeMapLoader implements MapLoader<Integer, String> {

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public String load(Integer integer) {
        return "Doddaballapur";
    }

    @Override
    public Map<Integer, String> loadAll(Collection<Integer> collection) {
        Map<Integer, String> loadData = new HashMap<Integer, String>();
        loadData.put(561203, "Doddaballapur");
        return loadData;
    }

    @Override
    public Iterable<Integer> loadAllKeys() {
        List<Integer> keys = new ArrayList<Integer>();
        keys.add(561203);
        return keys;
    }
}
