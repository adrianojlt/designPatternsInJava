package pt.adrz.designpatterns.singleton;

/**
 * Singleton pattern with double checked locking
 * @author adriano
 */
public class DoubleCheckedLockingSingleton {

    private volatile DoubleCheckedLockingSingleton INSTANCE;
 
    private DoubleCheckedLockingSingleton() {}
 
    public DoubleCheckedLockingSingleton getInstance() {

        if ( INSTANCE == null ) {

           synchronized(DoubleCheckedLockingSingleton.class) {

               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new DoubleCheckedLockingSingleton();
               }
           }
        }

        return INSTANCE;
    }
}

