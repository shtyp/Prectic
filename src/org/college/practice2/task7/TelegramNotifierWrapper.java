package org.college.practice2.task7;

class TelegramNotifierWrapper extends FarmNotifierWrapper {
    private String userId;
    private boolean isInstant;

    public TelegramNotifierWrapper(IWrapper wrapper, String userId, boolean isInstant) {
        super(wrapper);
        this.userId = userId;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(FarmOperation operation) {
        super.notify(operation);
        System.out.println("[Telegram] " + userId + " -> " + operation.getDescription());
    }
}
