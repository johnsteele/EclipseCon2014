package org.eclipse.e4.renderers.custom.renderers;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

public class CustomRendererFactory extends WorkbenchRendererFactory {
	

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		return null;
	}

}
