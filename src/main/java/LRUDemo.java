import java.util.LinkedHashMap;
import java.util.Map;

public class LRUDemo<K,V> extends LinkedHashMap<K,V> {

    private int cacheSize;

    public LRUDemo(int cacheSize){
        super(cacheSize,0.75f,true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }
}
