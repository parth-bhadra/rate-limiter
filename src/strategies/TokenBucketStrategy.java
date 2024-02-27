package strategies;

public class TokenBucketStrategy implements IStrategy {

    @Override
    public void rateLimiter() {
        System.out.println("Token Bucket Strategy");
    }
}
