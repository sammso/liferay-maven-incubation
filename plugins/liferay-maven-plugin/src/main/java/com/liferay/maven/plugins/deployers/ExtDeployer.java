package com.liferay.maven.plugins.deployers;

import java.util.List;

public class ExtDeployer extends com.liferay.portal.tools.deploy.ExtDeployer {
	public ExtDeployer(List<String> wars, List<String> jars) {
		super(wars, jars);
	}
}
