package com.leads.test.repoInterface;

import java.io.IOException;

import com.leads.test.model.BookFlight;

@SuppressWarnings("hiding")
public interface BookFlightRepo<BookFlight> {

	BookFlight get() throws IOException;
}
