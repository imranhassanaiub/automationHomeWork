package com.leads.test.repoInterface;

import java.io.IOException;

public interface FlightFinderRepo<FlightFinder>{
FlightFinder get() throws IOException;
}
