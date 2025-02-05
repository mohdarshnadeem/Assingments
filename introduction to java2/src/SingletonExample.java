public class SingletonExample {
    public static void main(String[] args) {

        DatabaseConn db1 = DatabaseConn.getInstance();
        db1.message();

        DatabaseConn db2 = DatabaseConn.getInstance();
        db2.message();

        System.out.println(db1 == db2);

    }
}

class DatabaseConn{
//    private: Prevents direct modification from outside the class
//    static: Ensures a single shared instance across all objects
   private static DatabaseConn dbConn;
// this constructer is private so it cannot be accessed from outside the class
    private DatabaseConn(){
        System.out.println("Initializing db connection");
    }
// making it static so that :The static variable (instance) belongs to the class,
// not any specific object.This way, all objects share the same instance.
    public static DatabaseConn getInstance(){
        if(dbConn == null){
            dbConn = new DatabaseConn();
        }
        return dbConn;
    }

    public void message(){
        System.out.println("Connected to db");
    }
}
