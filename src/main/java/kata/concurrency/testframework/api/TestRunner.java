package kata.concurrency.testframework.api;

public class TestRunner {

    private final int maxThreadCount;

    public TestRunner(int maxThreadCount) {
        this.maxThreadCount = maxThreadCount;
    }

    public void run(Runnable... testCases) {
        //TODO execute tests and log both success and failure for each test case.
    }
}
