package com.axonivy.connector.talentlink.connector.test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public abstract class AbstractServiceMock {

	protected String load(String path) {
		try (InputStream is = TalentlinkServiceMock.class.getResourceAsStream(path)) {
			return IOUtils.toString(is, StandardCharsets.UTF_8);
		} catch (IOException ex) {
			throw new RuntimeException("Failed to read resource: " + path);
		}
	}
	
}