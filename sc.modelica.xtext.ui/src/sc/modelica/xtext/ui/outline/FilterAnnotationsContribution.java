package sc.modelica.xtext.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;

public class FilterAnnotationsContribution extends AbstractFilterOutlineContribution {
	public static final String PREFERENCE_KEY =
			"ui.outline.filterAnnotations";
	@Inject
	private PluginImageHelper imageHelper;
	
	@Override
	protected boolean apply(IOutlineNode node) {
		return !(node instanceof EObjectNode)
				|| !((EObjectNode) node).getEClass()
				.equals(ModelicaMoPackage.Literals.ANNOTATION);
	}
	@Override
	public String getPreferenceKey() {
		return PREFERENCE_KEY;
	}
	@Override
	protected void configureAction(Action action) {
		action.setText("Hide annotations");
		action.setDescription("Hide annotations");
		action.setToolTipText("Hide annotations");
		//action.setChecked(true);
		stateChanged(true);
		action.setImageDescriptor(getImageDescriptor());
	}
	protected ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.createFromImage(
				imageHelper.getImage("page_white_text.png"));
	}
}