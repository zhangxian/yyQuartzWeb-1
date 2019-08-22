package com.yycoin.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource(value = "commonconfig.properties")
public class CommonConfigProperties {

	@Value("${upload.tcpAttachmentPath}")
	private String tcpAttachmentPath;

	public String getTcpAttachmentPath() {
		return tcpAttachmentPath;
	}

	public void setTcpAttachmentPath(String tcpAttachmentPath) {
		this.tcpAttachmentPath = tcpAttachmentPath;
	}

}
