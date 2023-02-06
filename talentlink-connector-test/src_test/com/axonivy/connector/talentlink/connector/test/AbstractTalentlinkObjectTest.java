package com.axonivy.connector.talentlink.connector.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.environment.AppFixture;
import ch.ivyteam.ivy.scripting.objects.List;

public abstract class AbstractTalentlinkObjectTest <T extends Object> extends AbstractTalentlinkTest<T>{

	@Test
	public void testGetById(BpmClient bpmClient, AppFixture fixture) {
		ExecutionResult result = bpmClient.start().subProcess(getTestee()).withParam("top", 5).execute();
		List<T> entities = result.subResult().firstParam();
		assertThat(entities.size()).isGreaterThan(0);
		assertThat(entities.size()).isLessThanOrEqualTo(5);
	}
	
	protected abstract String getId(T entity);
}
