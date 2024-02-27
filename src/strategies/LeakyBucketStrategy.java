package strategies;

public class LeakyBucketStrategy implements IStrategy {

    @Override
    public void rateLimiter() {
        System.out.println("Leaky bucket strategy");
    }
}
