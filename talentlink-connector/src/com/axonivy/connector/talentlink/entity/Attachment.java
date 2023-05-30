package com.axonivy.connector.talentlink.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity for Attachment received from Rest call
 */
public class Attachment {
	@JsonProperty("fileName")
	private String fileName = null;

	@JsonProperty("mimeType")
	private String mimeType = null;

	@JsonProperty("base64EncodedContent")
	private String base64EncodedContent = null;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getBase64EncodedContent() {
		return base64EncodedContent;
	}

	public void setBase64EncodedContent(String base64EncodedContent) {
		this.base64EncodedContent = base64EncodedContent;
	}

}
