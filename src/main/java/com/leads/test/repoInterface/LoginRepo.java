package com.leads.test.repoInterface;

import java.io.IOException;

import com.leads.test.model.Login;

@SuppressWarnings("hiding")
public interface LoginRepo<Login>{

	Login get() throws IOException;
}
