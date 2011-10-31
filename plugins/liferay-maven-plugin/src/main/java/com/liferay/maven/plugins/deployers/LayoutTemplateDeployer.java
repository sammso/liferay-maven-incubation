package com.liferay.maven.plugins.deployers;

import java.util.List;

public class LayoutTemplateDeployer extends
		com.liferay.portal.tools.deploy.HookDeployer {

	public LayoutTemplateDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}

}
