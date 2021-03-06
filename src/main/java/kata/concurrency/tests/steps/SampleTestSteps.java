package kata.concurrency.tests.steps;

import kata.concurrency.tests.domain.Deserializers;
import kata.concurrency.tests.domain.City;
import kata.concurrency.testframework.api.Test;

/**
 * Test steps should be independent from each other. Their order shouldn't count, they shouldn't depend on each other.
 * Test steps are building blocks, any combination should be valid.
 * Except for the rule that all 'given' is before the 'when' which is before all 'then' steps.
 */
public class SampleTestSteps {

    public static void givenAGeoLoc(double lat, double lon) {
        Test.addQueryParam("lat", String.valueOf(lat));
        Test.addQueryParam("lon", String.valueOf(lon));
    }

    public static void givenARadiusInKm(int radius) {
        Test.addQueryParam("radius", String.valueOf(radius));
        Test.addQueryParam("radiustype", "km");
    }

    public static void givenARadiusInMile(int radius) {
        Test.addQueryParam("radius", String.valueOf(radius));
        Test.addQueryParam("radiustype", "mile");
    }

    public static void whenCitySearchEndpointIsCalled() {
        Test.setBaseUrl("env.mydomain.com/citysearch");
        Test.setResponseDeserializer(Deserializers.CITY_SEARCH_ENDPOINT);
    }

    public static void thenReturnedCitiesAre(City... expectedCities) {
        Test.assertThat(CitySearchEndpointAssertions.returnedCitiesAre(expectedCities));
    }
}
