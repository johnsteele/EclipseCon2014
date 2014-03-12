package org.eclipse.e4.renderers.custom.renderers;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

public class CustomRendererFactory extends WorkbenchRendererFactory {
	
	private AbstractPartRenderer stackRenderer;
	private CustomWindowRenderer windowRenderer;

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if (uiElement instanceof MPartStack){
			if (stackRenderer == null) {
				stackRenderer = new CustomStackRenderer();
				initRenderer(stackRenderer);
			}
			return stackRenderer;
		}
		
		if (uiElement instanceof MWindow){
			if (windowRenderer== null){
				windowRenderer = new CustomWindowRenderer();
				initRenderer(windowRenderer);
				return windowRenderer;
			}
		}
		return super.getRenderer(uiElement, parent);
	}

}
