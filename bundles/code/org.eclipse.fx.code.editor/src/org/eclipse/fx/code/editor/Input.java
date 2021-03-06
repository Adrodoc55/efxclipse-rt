/*******************************************************************************
* Copyright (c) 2014 BestSolution.at and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* 	Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
*******************************************************************************/
package org.eclipse.fx.code.editor;

import java.util.Map;

public interface Input<O> {
	public void dispose();
	public O getData();
	public void setData(O data);
	public void persist();
	public Map<String, Object> getTransientData();
//	public void reset();
}
