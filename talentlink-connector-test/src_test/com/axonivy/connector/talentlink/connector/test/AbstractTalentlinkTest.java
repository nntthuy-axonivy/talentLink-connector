package com.axonivy.connector.talentlink.connector.test;

import org.junit.jupiter.api.BeforeAll;

import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.environment.AppFixture;

public abstract class AbstractTalentlinkTest <T extends Object> {

	private static final String REST_CLIENT_ID = "talentlink";
	
	protected abstract BpmElement getTestee();
	
	@BeforeAll
	public static void prepare(AppFixture fixture) {
		fixture.config("RestClients." + REST_CLIENT_ID + ".Url", "${ivy.app.baseurl}/api/talentlinkMock");
	}
	
}
