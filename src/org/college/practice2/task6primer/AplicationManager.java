package org.college.practice2.task6primer;

class ApplicationManager {
    private OutputController ioController;

    public ApplicationManager() {
        ioController = new OutputController();
        String systemPlatform = System.getProperty("os.name");
        if (systemPlatform.contains("Windows")) {
            ioController.setOutputStrategy(new WindowsOutputStrategy());
        } else {
            ioController.setOutputStrategy(new LinuxOutputStrategy());
        }
    }

    public void AplicationManeger() {
        ioController.printReport();
        ioController.sendReportViaMail();
    }
}
