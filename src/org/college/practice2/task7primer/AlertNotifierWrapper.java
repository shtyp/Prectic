package org.college.practice2.task7primer;

abstract class AlertNotifierWrapper implements IWrapper {
    protected IWrapper wrapper;

    public AlertNotifierWrapper(IWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(SystemAlert alert) {
        if (wrapper != null) {
            wrapper.notify(alert);
        }
    }
}
