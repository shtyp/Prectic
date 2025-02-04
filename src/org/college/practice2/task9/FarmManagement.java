package org.college.practice2.task9;

import java.util.ArrayList;
import java.util.List;

class FarmManagement {
    private boolean isConnected;

    public List<Object> executeQuery(String query) {
        System.out.println("Executing query: " + query);
        return new ArrayList<>();
    }

    public boolean executeUpdate(String query) {
        System.out.println("Executing update: " + query);
        return true;
    }

    public boolean checkSystemStatus() {
        return isConnected;
    }

    public void connect() {
        isConnected = true;
        System.out.println("Connected to farm management system");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from farm management system");
    }
}
