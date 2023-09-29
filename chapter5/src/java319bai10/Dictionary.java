package java319bai10;

public class Dictionary extends PairMap {
	    private int size;
	    private int capacity;
//	    
//	    public Dictionary(int size, int capacity) {
//			this.size = size;
//			this.capacity = capacity;
//		}

		public Dictionary(int capacity) {
	    	keyArray = new String[capacity];
	        this.valueArray = new String[capacity];
	        this.size = 0;
	        this.capacity = capacity;
	    }

	    public void put(String key, String value) {
	        for (int i = 0; i < size; i++) {
	            if (keyArray[i].equals(key)) {
	                valueArray[i] = value;
	                return;
	            }
	        }
	        if (size < capacity) {
	            keyArray[size] = key;
	            valueArray[size] = value;
	            size++;
	        }
	    }
	    public String get(String key) {
	        for (int i = 0; i < size; i++) {
	            if (keyArray[i].equals(key)) {
	                return valueArray[i];
	            }
	        }
	        return null;
	    }
	    public String delete(String key) {
	        for (int i = 0; i < size; i++) {
	            if (keyArray[i].equals(key)) {
	                String deletedValue = valueArray[i];
	                for (int j = i; j < size - 1; j++) {
	                    keyArray[j] = keyArray[j+1];
	                    valueArray[j] = valueArray[j+1];
	                }
	                keyArray[size-1] = null;
	                valueArray[size-1] = null;
	                size--;
	                return deletedValue;
	            }
	        }
	        return null;
	    }

	    public int length() {
	        return 0;
//	        return size;
	    }
	}

	

