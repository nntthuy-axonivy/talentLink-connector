package com.axonivy.connector.talentlink.connector.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lumessetalentlink.shared.apiproxy.tlk.rest.client.OpeningFullDto;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;


/**
 * This sample ProcessTest simulates users and systems working through
 * your process flow. Created data and tasks can be easily asserted.
 * 
 * <p>The test can either be run<ul>
 * <li>in the Designer IDE ( <code>right click > run as > JUnit Test </code> )</li>
 * <li>or in a Maven continuous integration build pipeline ( <code>mvn clean verify</code> )</li>
 * </ul></p>
 * 
 * <p>Detailed guidance on writing these kind of tests can be found in our
 * <a href="https://developer.axonivy.com/doc/10.0/concepts/testing/process-testing.html">Process Testing docs</a>
 * </p>
 */
@IvyProcessTest(enableWebServer = true)
public class PositionTest extends AbstractTalentlinkTest<OpeningFullDto>{

private static final BpmElement getPositionTestee = BpmProcess.path("rest/Position").elementName("getPositionById(Long)");
	
	@Test
	public void testGetById(BpmClient bpmClient, AppFixture fixture) {
		ExecutionResult result = bpmClient.start().subProcess(getTestee()).withParam("positionId", 574L).execute();
		List<OpeningFullDto> entity = result.subResult().firstParam();
		assertThat(entity.get(0).getId()).isGreaterThan(0);
		assertThat(entity.size()).isGreaterThan(0);
	}
	
	@Override
	protected BpmElement getTestee() {
		return getPositionTestee;
	}
}
