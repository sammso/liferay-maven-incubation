package com.liferay.maven.plugins.deployers;

import java.util.List;

public class HookDeployer extends com.liferay.portal.tools.deploy.HookDeployer {

	public HookDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}
}
