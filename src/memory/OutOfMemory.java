package memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bazinga
 * Date: 12/3/13
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class OutOfMemory {

    public static List persist = new ArrayList();


    public static void initiateOutofMemory()
    {
             while(1!=2)
             {
                 Object o = new Object();
                 persist.add(o);

             }
    }

    public static void main(String[] args)

    {


      // OutOfMemory oum = new OutOfMemory();
       initiateOutofMemory();
    }

}
