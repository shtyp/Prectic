package org.college.practice2.task10;

public class FarmDataAccessProxy implements IFarmDataAccessProxy {
    private FarmDataAccess farmDataHandle;

    public FarmDataAccessProxy(FarmDataAccess farmDataHandle) {
        this.farmDataHandle = farmDataHandle;
    }

    public String[] getCropData(int[] fieldIds) {
        long startTime = System.currentTimeMillis();
        String[] result = farmDataHandle.getCropData(fieldIds);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        return result;
    }

    public void updateCropData(int[] fieldIds) {
        farmDataHandle.updateCropData(fieldIds);
    }

    public boolean checkSystemStatus() {
        return farmDataHandle.checkSystemStatus();
    }

    public void connect(String farmId) {
        farmDataHandle.connect(farmId);
    }

    public void disconnect() {
        farmDataHandle.disconnect();
    }

    public void saveChanges() {
        farmDataHandle.saveChanges();
    }

    public void discardChanges() {
        farmDataHandle.discardChanges();
    }
}
