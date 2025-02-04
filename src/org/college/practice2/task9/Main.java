package org.college.practice2.task9;

public class Main {
    public static void main(String[] args) {
        FarmManagement realSystem = new FarmManagement();
        FarmManagementProxy proxy = new FarmManagementProxyImpl(realSystem);
        FarmController controller = new FarmController(proxy);

        proxy.connect();
        controller.fetchCropsData();
        controller.insertNewAnimal();
        controller.checkSystemStatus();
        proxy.disconnect();
    }
}

