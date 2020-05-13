package kata.concurrency.testframework.api;

public class TestRunner {

    private final int maxThreadCount;

    public TestRunner(int maxThreadCount) {
        this.maxThreadCount = maxThreadCount;
    }

    public void run(Class<?>... testClasses) {
        //TODO get all methods from testClasses which are annotated with @TestCase and execute them.
        //TODO log both success and failure for each test case (identify test cases with class and method name)
    }
}
