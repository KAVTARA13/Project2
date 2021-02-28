package StepObjects;

import org.testng.ITestResult;
import org.testng.IRetryAnalyzer;

public class MyRetry implements IRetryAnalyzer{
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

}
