package strategies.clients;

import strategies.IStrategy;

public class RateLimitingClient {
    public IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
