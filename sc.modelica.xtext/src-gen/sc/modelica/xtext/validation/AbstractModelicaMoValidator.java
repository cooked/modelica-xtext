/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractModelicaMoValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(sc.modelica.xtext.modelicaMo.ModelicaMoPackage.eINSTANCE);
		return result;
	}
	
}
