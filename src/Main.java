import strategies.LeakyBucketStrategy;
import strategies.TokenBucketStrategy;
import strategies.clients.RateLimitingClient;

public class Main {
    public static void main(String[] args) {
        RateLimitingClient client = new RateLimitingClient();

        client.setStrategy(new TokenBucketStrategy());
        client.strategy.rateLimiter();

        client.setStrategy(new LeakyBucketStrategy());
        client.strategy.rateLimiter();
    }
}
