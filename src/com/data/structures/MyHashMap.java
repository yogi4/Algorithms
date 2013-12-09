package com.data.structures;

/**
 * Created with IntelliJ IDEA.
 * User: bazinga
 * Date: 11/18/13
 * Time: 4:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyHashMap {
    public int INITIAL_SIZE = 32 ;

    MyEntry[] dataStore = new MyEntry[INITIAL_SIZE];


    private class MyEntry {
        private String key;
        private String value;
        private MyEntry nextEntry;

        private MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        private String getKey()
        {
            return key;
        }

        private String getValue()
        {
            return value;
        }

        private MyEntry getNextEntry()
        {
            return nextEntry;
        }
    }


    private void putEntry(String key, String value)
    {
        int bucketValue = compressHash(hashCode(key));
        MyEntry newEntry = new MyEntry(key,value);
        MyEntry e = dataStore[bucketValue];

        if (e==null)
        {

            dataStore[bucketValue] = newEntry;
            System.out.println("bazinga ..... inserted new element yo");
        }else
        {
            while ( e !=null)
            {
                // this means that there is a value in the bucket so check to see if it has to be replaced or chained
                if( e.getKey().equals(key))
                {
                    dataStore[bucketValue] = newEntry;
                    return ;
                }else
                {
                     e = e.nextEntry;
                }

            }

            e.nextEntry = newEntry;


        }
    }


    private int hashCode(String key)
    {
        int hashVal=0;
       // either use key.hashCode or generate yours
       for ( int i =0 ; i < key.length(); i++ )
       {
             hashVal = ( hashVal * 127 + key.charAt(i)) % 16908799;

       }
       return hashVal;
    }

    private int compressHash(int hash)
    {
        int bucketCode = 0;
        bucketCode = (((3 * hash + 5) %  16908799) % INITIAL_SIZE );

        return bucketCode;

    }

}
