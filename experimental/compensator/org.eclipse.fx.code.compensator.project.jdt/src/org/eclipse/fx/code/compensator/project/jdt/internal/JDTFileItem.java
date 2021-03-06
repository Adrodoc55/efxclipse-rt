package org.eclipse.fx.code.compensator.project.jdt.internal;

import java.nio.file.Path;

import org.eclipse.fx.code.compensator.project.ProjectNavigatorItem;
import org.eclipse.fx.code.compensator.project.navigator.FileItem;
import org.eclipse.fx.core.URI;

public class JDTFileItem extends FileItem implements JDTPathItem {

	public JDTFileItem(ProjectNavigatorItem parent, Path p) {
		super(parent,p);
	}

	@Override
	public URI getIcon() {
		return getJdtProject().getFileLookup().getFileIcon(getDomainObject().toUri().toString());
	}

	@Override
	public JDTModuleItem getModuleItem() {
		return ((JDTPathItem)parent).getModuleItem();
	}

	@Override
	public JDTInstanceProject getJdtProject() {
		return ((JDTPathItem)parent).getJdtProject();
	}

}
