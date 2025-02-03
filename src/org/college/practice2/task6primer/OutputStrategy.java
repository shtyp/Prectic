package org.college.practice2.task6primer;

interface OutputStrategy {
    void printReport(Document document);
    void sendReportViaMail(Document document);
    void sendReportViaTelegram(Document document);
}
