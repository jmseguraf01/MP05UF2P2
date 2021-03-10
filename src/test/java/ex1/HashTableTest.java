package ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void count() {
        HashTable hashTable = new HashTable();
        Assertions.assertEquals(0, hashTable.count());
    }

    @Test
    void size() {
        HashTable hashTable = new HashTable();
        Assertions.assertEquals(16, hashTable.size());
    }

    @Test
    void put() {
    }

    @Test
    void get() {
    }

    @Test
    void drop() {
    }
}