package org.college.practice2.task9primer;

class DatabaseController {
    private DatabaseAccessProxy dbProxy;

    public DatabaseController(DatabaseAccessProxy dbProxy) {
        this.dbProxy = dbProxy;
    }

    public void fetchData() {
        dbProxy.executeQuery("SELECT * FROM users");
    }

    public void insertData() {
        dbProxy.executeUpdate("INSERT INTO users (name) VALUES ('John Doe')");
    }

    public void checkStatus() {
        System.out.println("Database status: " + dbProxy.checkDatabaseStatus());
    }
}
