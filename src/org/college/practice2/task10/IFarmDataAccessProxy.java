package org.college.practice2.task10;

public interface IFarmDataAccessProxy {
    String[] getCropData(int[] fieldIds);
    void updateCropData(int[] fieldIds);
    boolean checkSystemStatus();
    void connect(String farmId);
    void disconnect();
    void saveChanges();
    void discardChanges();
}
