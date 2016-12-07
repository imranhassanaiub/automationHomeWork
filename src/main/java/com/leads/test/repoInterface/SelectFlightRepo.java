package com.leads.test.repoInterface;

import java.io.IOException;

import com.leads.test.model.SelectFlight;

@SuppressWarnings("hiding")
public interface SelectFlightRepo<SelectFlight> {

	SelectFlight get() throws IOException;
}
