package ood;

public class SingletonExample{

    private static SingletonExample _instance = null;//* private static object
    
    protected SingletonExample(){//protected constructor
       
    }
    
    public static SingletonExample getInstance(){//get instance
        if(_instance == null){
            _instance = new SingletonExample();
        }
        return _instance;
    }
}
