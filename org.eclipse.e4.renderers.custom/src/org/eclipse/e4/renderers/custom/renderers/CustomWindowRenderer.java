package org.eclipse.e4.renderers.custom.renderers;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.renderers.swt.WBWRenderer;
import org.eclipse.swt.widgets.Shell;

public class CustomWindowRenderer extends WBWRenderer {
	

	@Override
	public Object createWidget(MUIElement element, Object parent) {
//		IEclipseContext context = win.getContext();
//		EPartService ePartService = context.get(EPartService.class);
//		MPart activePart = ePartService.getActivePart();
		Shell shell = (Shell) super.createWidget(element, parent);
		MWindow win = (MWindow) element;
		String alpha = (String) win.getContext().get("alpha");
		shell.setAlpha(Integer.parseInt(alpha));
		return shell;
	}

}
