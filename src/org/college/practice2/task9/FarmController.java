package org.college.practice2.task9;

class FarmController {
    private FarmManagementProxy farmProxy;

    public FarmController(FarmManagementProxy farmProxy) {
        this.farmProxy = farmProxy;
    }

    public void fetchCropsData() {
        farmProxy.executeQuery("SELECT * FROM crops");
    }

    public void insertNewAnimal() {
        farmProxy.executeUpdate("INSERT INTO livestock (name, type) VALUES ('Bessie', 'Cow')");
    }

    public void checkSystemStatus() {
        System.out.println("System status: " + farmProxy.checkSystemStatus());
    }
}
