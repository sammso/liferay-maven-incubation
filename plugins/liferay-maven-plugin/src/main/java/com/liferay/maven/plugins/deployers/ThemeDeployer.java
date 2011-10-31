package com.liferay.maven.plugins.deployers;

import java.util.List;

public class ThemeDeployer extends com.liferay.portal.tools.deploy.HookDeployer {

	public ThemeDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}

}
