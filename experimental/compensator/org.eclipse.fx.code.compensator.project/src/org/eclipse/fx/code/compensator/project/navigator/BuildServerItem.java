package org.eclipse.fx.code.compensator.project.navigator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import org.eclipse.fx.code.compensator.project.ProjectNavigatorItem;
import org.eclipse.fx.core.URI;

public class BuildServerItem implements ProjectNavigatorItem {
	private final ProjectItem parent;
	
	public BuildServerItem(ProjectItem parent) {
		this.parent = parent;
	}
	
	@Override
	public ProjectNavigatorItem getParent() {
		return parent;
	}
	
	@Override
	public CharSequence getLabel() {
		return "Build-Server";
	}

	@Override
	public URI getIcon() {
		return URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.project","css/icons/16/update.png");
	}

	@Override
	public Object getDomainObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOpenCommandId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDeletable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ObservableList<ProjectNavigatorItem> getChildren() {
		return FXCollections.emptyObservableList();
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

}
