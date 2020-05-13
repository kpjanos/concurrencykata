package kata.concurrency.tests.testcases;

import kata.concurrency.testframework.api.TestCase;

import static kata.concurrency.tests.domain.TestCities.*;
import static kata.concurrency.tests.steps.SampleTestSteps.*;

/**
 * This class usually a 'JBehave story file' or a 'Cucumber feature file', but that's not in scope now.
 */
public class SampleTest {

    @TestCase
    public void citySearchEndpointShouldSupportKm() {
        givenAGeoLoc(51.509865, -0.118092);
        givenARadiusInKm(5);

        whenCitySearchEndpointIsCalled();

        thenReturnedCitiesAre(LONDON);
    }

    @TestCase
    public void citySearchEndpointShouldSupportMiles() {
        givenARadiusInMile(500);
        givenAGeoLoc(48.210033, 16.363449);

        whenCitySearchEndpointIsCalled();

        thenReturnedCitiesAre(BERLIN, BUDAPEST);
    }
}
