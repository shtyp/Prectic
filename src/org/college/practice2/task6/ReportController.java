package org.college.practice2.task6;

class ReportController {
    private FarmRecord record;
    private ReportStrategy reportStrategy;

    public void generateReport() {
        if (reportStrategy != null) {
            reportStrategy.generateReport(record);
        }
    }

    public void sendReportViaEmail() {
        if (reportStrategy != null) {
            reportStrategy.sendReportViaEmail(record);
        }
    }

    public void sendReportViaSMS() {
        if (reportStrategy != null) {
            reportStrategy.sendReportViaSMS(record);
        }
    }

    public void setReportStrategy(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }
}
