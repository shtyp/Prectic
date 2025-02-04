package org.college.practice2.task9;

import java.util.List;

class FarmManagementProxyImpl implements FarmManagementProxy {
    private FarmManagement farmManagement;

    public FarmManagementProxyImpl(FarmManagement farmManagement) {
        this.farmManagement = farmManagement;
    }

    public List<Object> executeQuery(String query) {
        long startTime = System.currentTimeMillis();
        List<Object> result = farmManagement.executeQuery(query);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        return result;
    }

    public boolean executeUpdate(String query) {
        return farmManagement.executeUpdate(query);
    }

    public boolean checkSystemStatus() {
        return farmManagement.checkSystemStatus();
    }

    public void connect() {
        farmManagement.connect();
    }

    public void disconnect() {
        farmManagement.disconnect();
    }
}
