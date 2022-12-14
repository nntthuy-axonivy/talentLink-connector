package com.axonivy.connector.talentlink.features;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.webservice.exec.feature.WebServiceClientFeature;
import ch.ivyteam.ivy.webservice.exec.feature.WebServiceClientFeatureContext;

public class ApiFeature implements WebServiceClientFeature {

	@Override
	public void initialize(WebServiceClientFeatureContext context) {
		Client proxy = ClientProxy.getClient(context.getBindingProvider());
		proxy.getRequestContext().put("org.apache.cxf.message.Message.QUERY_STRING", "api_key="+Ivy.var().variable("talentlink-connector.apikey").value());
	}
}
