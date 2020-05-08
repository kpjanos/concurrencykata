package kata.concurrency.tests.testcases;

import static kata.concurrency.tests.steps.SampleTestSteps.*;
import static kata.concurrency.tests.domain.TestCities.*;

/**
 * This class usually a 'JBehave story file' or a 'Cucumber feature file', but that's not in scope now.
 */
public class SampleTest {

    public void citySearchEndpointShouldSupportKm() {
        givenAGeoLoc(51.509865, -0.118092);
        givenARadiusInKm(5);

        whenCitySearchEndpointIsCalled();

        thenReturnedCitiesAre(LONDON);
    }

    public void citySearchEndpointShouldSupportMiles() {
        givenARadiusInMile(500);
        givenAGeoLoc(48.210033, 16.363449);

        whenCitySearchEndpointIsCalled();

        thenReturnedCitiesAre(BERLIN, BUDAPEST);
    }
}
