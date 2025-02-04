package org.college.practice2.task10;

public class LocalFarmDataAdapter implements IFarmDataDriverAdapter {
    private String farmId;

    public void connect(String farmId) {
        this.farmId = farmId;
        System.out.println("Connected to Local Farm Data for farm ID: " + farmId);
    }

    public void disconnect() {
        System.out.println("Disconnected from Local Farm Data.");
    }

    public String[] getCropData(int[] fieldIds) {
        return new String[]{"Crop Data for Field 1", "Crop Data for Field 2"};
    }

    public void updateCropData(int[] fieldIds) {
        System.out.println("Updated crop data for specified fields.");
    }

    public boolean checkSystemStatus() {
        return true;
    }

    public void saveChanges() {
        System.out.println("Changes saved to Local Farm Data.");
    }

    public void discardChanges() {
        System.out.println("Changes discarded from Local Farm Data.");
    }
}
