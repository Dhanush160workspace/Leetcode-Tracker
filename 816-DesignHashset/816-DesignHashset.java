// Last updated: 7/9/2026, 3:08:54 PM
import java.util.LinkedList;
import java.util.List;

class MyHashSet {
    
    // We choose a prime number for the base size to reduce potential collisions
    private final int SIZE = 769;
    private List<Integer>[] buckets;

    public MyHashSet() {
        // Initialize the array of buckets
        // Note: Java doesn't allow generic array creation nicely, so we suppress the warning or use raw types
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    // Helper function to calculate the hash index
    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets[index];
        
        // Only add if the key doesn't already exist to maintain "Set" property
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets[index];
        
        // Important: We must cast key to Integer object to remove by Value, not by Index
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets[index];
        
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */