package org.college.practice2.task7;

class EmailNotifierWrapper extends FarmNotifierWrapper {
    private String uniqueName;

    public EmailNotifierWrapper(IWrapper wrapper, String uniqueName) {
        super(wrapper);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(FarmOperation operation) {
        super.notify(operation);
        System.out.println("[Email] " + uniqueName + " -> " + operation.getDescription());
    }
}
