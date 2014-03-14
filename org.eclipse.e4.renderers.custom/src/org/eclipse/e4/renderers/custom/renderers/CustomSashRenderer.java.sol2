package org.eclipse.e4.renderers.custom.renderers;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class CustomSashRenderer extends SashRenderer{
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		final Composite sashComposite = (Composite) super.createWidget(element, parent);
		MPartSashContainer psc = (MPartSashContainer) element;
		sashComposite.setLayout(psc.isHorizontal()?new FillLayout(SWT.HORIZONTAL):new FillLayout(SWT.VERTICAL));
		return sashComposite;
	}

}
