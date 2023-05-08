package pattern;


public class Singleton {
    private static Singleton Instance;

    private Singleton(){

        System.out.println("Singleton is Instantiated.");

    }

    static Singleton getInstance(){
        if (Instance==null){
            Instance=new Singleton();

        }
return Instance;
    }
    public void showmessage(){
        System.out.println(" I am Singleton");
    }
}
