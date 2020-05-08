package kata.concurrency.testframework.api;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test {

    static protected void init() {
    }

    static public void addQueryParam(String key, String value) {
    }

    static public void addPath(String path) {
    }

    static public void setBaseUrl(String url) {
    }

    static public <T> void setResponseDeserializer(Function<String, T> deserializer) {
    }

    static public <T> void assertThat(Consumer<T> assertion) {
    }
}
