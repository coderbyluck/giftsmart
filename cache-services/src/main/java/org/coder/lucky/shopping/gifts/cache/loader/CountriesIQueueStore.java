package org.coder.lucky.shopping.gifts.cache.loader;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.QueueStore;
import org.coder.lucky.shopping.gifts.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.*;


public class CountriesIQueueStore implements QueueStore<Country> {

    @Autowired
    MongoTemplate mongoTemplate;




    @Override
    public void storeAll(Map map) {

    }

    @Override
    public void store(Long aLong, Country country) {

    }

    @Override
    public void delete(Long aLong) {
        //Never Delete from Database
    }

    @Override
    public Country load(Long aLong) {
        return null;
    }

    @Override
    public Set<Long> loadAllKeys() {
        Set<Long> keys = new HashSet<Long>();
        keys.add(561203L);
        return keys;
    }

    @Override
    public Map loadAll(Collection collection) {
        Map<Integer, String> loadData = new HashMap<Integer, String>();
        loadData.put(561203, "Doddaballapur");
        loadData.put(123, "ABC");

        return loadData;
    }

    @Override
    public void deleteAll(Collection collection) {

    }
}
