package com.liferay.maven.plugins.deployers;

import java.util.List;

public class WebDeployer extends com.liferay.portal.tools.deploy.HookDeployer {

	public WebDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}

}
