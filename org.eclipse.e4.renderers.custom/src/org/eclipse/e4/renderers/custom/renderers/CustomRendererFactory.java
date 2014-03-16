package org.eclipse.e4.renderers.custom.renderers;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

public class CustomRendererFactory extends WorkbenchRendererFactory {
	

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		
		//TODO 1: add condition to return custom window renderer
		//TODO 2: add condition for custom sash renderer
		//TODO 3: add condition for custom stack renderer
		
		return null;
	}

}
