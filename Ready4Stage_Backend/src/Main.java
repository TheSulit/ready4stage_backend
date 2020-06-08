

public class Main {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.initializeDB();
        //example Statement
        db.createDBStatement(db.connectDB(), "SELECT * FROM Teilnehmer");
    }

}
