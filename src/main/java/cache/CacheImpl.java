package cache;

import cache.Cache;

import java.util.ArrayList;
import java.util.Date;

public class CacheImpl {
    int cacheMaxSize = 5;
    int cacheCurrentSize = 0;
    ArrayList<Cache> cacheList = new ArrayList<>();

    public void putCache(Cache c){
        Cache leastUsed;
        if(cacheCurrentSize < cacheMaxSize){
            cacheList.add(c);
            cacheCurrentSize++;
        }else{
            leastUsed = getLeastUsedCache();
            cacheList.remove(leastUsed);
            cacheList.add(c);
        }
    }

    public Cache getCache(String name) throws Exception {
        System.out.println("getCache for " + name);
        for(Cache c : cacheList) {

            if(c.getName().equals(name)){
                c.setLastUsedOn(new Date());
                System.out.println("Accessing Cache..."+c.getName()+ "     "+ c.getLastUsedOn());
                return c;
            }

        }
        throw new Exception("Cache not available...");
    }


    public Cache getLeastUsedCache(){
        Date lastUsedOn = new Date();
        Cache tempCache = cacheList.get(0);
        for(Cache c : cacheList) {
           if(c.getLastUsedOn().before(tempCache.getLastUsedOn()) || c.getLastUsedOn().equals(tempCache.getLastUsedOn()))
               tempCache = c;
        }
        return tempCache;
    }

    public void printAllCache(){
        System.out.println("**************************************");
        for(Cache c : cacheList)
            System.out.println(c.getName()+ "     "+ c.getLastUsedOn());
        System.out.println("**************************************");
    }
}
