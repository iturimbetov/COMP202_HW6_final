class HashMap
{ 
    
    private HashNode[] bucketArray; // the array to store the front of each LinkedList 
    private int numBuckets; // the size of the array 
    private int size; // the total number of elements in the HashMap
    private int hashing; // defines which hashing function to use, since there are 2, can be either 0 or 1
    
    public HashMap(int hashing) 
    { 
    	this.hashing = hashing;
    	// TODO: your code here to initialize the hash map
    } 
  
    public int size() { return size; } 
    
    public boolean isEmpty() { return size() == 0; } 
    
    private int hashFirst() {
    	// TODO:  your code here, the first hashing function
    	return 0;
    }
    
    private int hashSecond() {
    	// TODO:  your code here, the second hashing function
    	return 0;
    }
  
    private int getBucketIndex(Student key) 
    { 
    	/* TODO: use a hashing function to get the bucket index, 
    	 depending on the "hashing" field value it's either first or second */
        return 0; 
    } 
  
    public Advisor remove(Student key) 
    { 
    	// TODO: your code here to remove an element from the HashMap and return its corresponding value
        return null; 
    } 
  
    public Advisor get(Student key) 
    {
    	// TODO: your code here to get the corresponding value (Advisor) of the key (Student)
    	return null; 
    } 
  
    public void add(Student key, Advisor value) 
    { 
    	// TODO: your code here to add the key-value pair to the HashMap
    } 
}

public class HW6 {
    // Driver method to test Map class 
    public static void main(String[] args) 
    { 
    	HashMap map = new HashMap(0); 
        map.add(new Student("Ahmet", 1, 3.91), new Advisor("Mehmet", "Mathematics")); 
        Student harry = new Student("Harry", 2, 3.22);
        Advisor dumbledore = new Advisor("Dumbledore", "Wizardy");
        map.add(harry, dumbledore); 
        map.add(new Student("Hermione", 3, 4.0), dumbledore); 
        map.add(new Student("Jesse", 4, 2.17), new Advisor("Walter White", "Chemistry")); 
        System.out.println(map.size()); 
        System.out.println(map.remove(harry)); 
        System.out.println(map.remove(harry)); 
        System.out.println(map.size()); 
        System.out.println(map.isEmpty()); 
    } 
} 
