package org.college.practice2.task7primer;

class EmailNotifierWrapper extends AlertNotifierWrapper {
    private String uniqueName;

    public EmailNotifierWrapper(IWrapper wrapper, String uniqueName) {
        super(wrapper);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        super.notify(alert);
        System.out.println("[Email] " + uniqueName + " -> " + alert.getMessage());
    }
}
