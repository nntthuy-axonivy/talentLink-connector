package com.axonivy.connector.talentlink.features;

import javax.ws.rs.core.FeatureContext;

import ch.ivyteam.ivy.rest.client.mapper.JsonFeature;

public class TalentLinkApiKeyFeature extends JsonFeature{

	@Override
	public boolean configure(FeatureContext context) {
		context.register(TalentlinkQueryStringFilter.class);
		return true;
	}
}
