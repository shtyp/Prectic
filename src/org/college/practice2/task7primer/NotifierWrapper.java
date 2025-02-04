package org.college.practice2.task7primer;

abstract class NotifierWrapper implements IWrapper {
    protected IWrapper wrapper;

    public NotifierWrapper(IWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(SystemAlert alert) {
        if (wrapper != null) {
            wrapper.notify(alert);
        }
    }
}

