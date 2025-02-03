package org.college.practice2.task7;

abstract class FarmNotifierWrapper implements IWrapper {
    protected IWrapper wrapper;

    public FarmNotifierWrapper(IWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(FarmOperation operation) {
        if (wrapper != null) {
            wrapper.notify(operation);
        }
    }
}
