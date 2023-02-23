package com.axonivy.connector.talentlink.features;

import java.io.IOException;
import java.net.URI;
import java.util.regex.Matcher;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.UriBuilder;

import ch.ivyteam.ivy.environment.Ivy;

public class TalentlinkQueryStringFilter implements ClientRequestFilter{
	
	private final static String api_key = Ivy.var().get("talentlink-connector.apikey");

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		URI uri = requestContext.getUri();
		
		UriBuilder uriBuilder = UriBuilder.fromUri(uri);
		
		requestContext.setUri(uriBuilder.queryParam("api_key", api_key).build());
	}

	
}
