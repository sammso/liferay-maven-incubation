package com.liferay.maven.plugins.deployers;

import java.util.List;

public class PortletDeployer extends com.liferay.portal.tools.deploy.HookDeployer {

	public PortletDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}

}
