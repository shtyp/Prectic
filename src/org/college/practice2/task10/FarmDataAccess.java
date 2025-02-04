package org.college.practice2.task10;

public class FarmDataAccess {
    private String farmId;
    private boolean isConnected;
    private IFarmDataDriverAdapter impl;

    public FarmDataAccess(IFarmDataDriverAdapter impl) {
        this.impl = impl;
    }

    public void setDriverAdapter(IFarmDataDriverAdapter impl) {
        this.impl = impl;
    }

    public String[] getCropData(int[] fieldIds) {
        return impl.getCropData(fieldIds);
    }

    public void updateCropData(int[] fieldIds) {
        impl.updateCropData(fieldIds);
    }

    public boolean checkSystemStatus() {
        return impl.checkSystemStatus();
    }

    public void connect(String farmId) {
        this.farmId = farmId;
        impl.connect(farmId);
        this.isConnected = true;
    }

    public void disconnect() {
        impl.disconnect();
        this.isConnected = false;
    }

    public void saveChanges() {
        impl.saveChanges();
    }

    public void discardChanges() {
        impl.discardChanges();
    }
}
