/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    // ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    // Constructor that initializes the HashTable array
    // DO NOT change this Constructor
    public HashTable(int size) {
        this.ht = new FruitNode[size];
    }

    // This method basically prints the HashTable
    // DO NOT change this method
    public void show() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + " ");
            FruitNode n = ht[i];
            while (n != null) {
                System.out.print("('" + n.fruit[0] + "', " + n.fruit[1] + ") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    // you need to COMPLETE this method
    private int hashFunction(String key) {
        // TO DO
        int sum = 0;
        if (key.length() % 2 == 0) {
            for (int i = 0; i < key.length(); i += 2) {
                sum += (int) key.charAt(i);
            }
        } else {
            for (int i = 1; i < key.length(); i += 2) {
                sum += (int) key.charAt(i);
            }
        }
        return sum % ht.length; // remove this line
    }

    // you need to COMPLETE this method
    // The insert() method will create a FruitNode using name(Key) & price(value)
    // then inserts it in the proper hashed index
    // If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value) {
        // TO DO
        int idx = hashFunction(key);
        if (ht[idx] != null) {
            FruitNode temp = ht[idx];
            FruitNode FPrev = null;
            while (temp != null) {
                if (temp.fruit[0].equals(key)) {
                    if (value > (int) temp.fruit[1]) {
                        temp.fruit[1] = value;
                        break;
                    }
                }
                if ((int) temp.fruit[1] < value) {
                    FruitNode f = new FruitNode(key, value);
                    if (FPrev == null) {
                        ht[idx] = f;
                        f.next = temp;
                        break;
                    }
                    f.next = temp;
                    FPrev.next = f;
                    break;
                } else {
                    FPrev = temp;
                    temp = temp.next;
                }
                if (temp == null) {
                    FPrev.next = new FruitNode(key, value);
                    break;
                }
            }
        } else {
            ht[idx] = new FruitNode(key, value);
        }
    }

}
