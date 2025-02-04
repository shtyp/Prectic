package org.college.practice2.task9primer;

import java.util.ArrayList;

class DBAccess {
    private String url;
    private boolean isConnected;

    public ArrayList<Object> executeQuery(String query) {
        System.out.println("Executing query: " + query);
        return new ArrayList<>();
    }

    public boolean executeUpdate(String query) {
        System.out.println("Executing update: " + query);
        return true;
    }

    public boolean checkDatabaseStatus() {
        return isConnected;
    }

    public void connect() {
        isConnected = true;
        System.out.println("Connected to database");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from database");
    }
}
