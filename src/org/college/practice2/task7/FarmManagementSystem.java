package org.college.practice2.task7;

class FarmManagementSystem {
    private List<FarmOperation> operationHistory = new ArrayList<>();
    private IWrapper notifier;

    public FarmManagementSystem(IWrapper notifier) {
        this.notifier = notifier;
    }

    public void addOperation(FarmOperation operation) {
        operationHistory.add(operation);
        notifier.notify(operation);
    }
}
