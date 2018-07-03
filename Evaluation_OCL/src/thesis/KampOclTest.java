package thesis;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import java.util.Collection;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

public class KampOclTest {
	public static void run(AbstractModification element) {
		CompositeComponent affectedElement = (CompositeComponent) element.getAffectedElement();
		// Create OCL and helper object (could be moved to field, only needed once)
		OCL ocl = OCL.newInstance();
		Helper helper = ocl.createOCLHelper();
		// Context (eClass of element) necessary, otherwise exception
		helper.setContext(RepositoryPackage.Literals.REPOSITORY_COMPONENT);
		String queryString = "self->closure(e | if e.oclIsKindOf(CompositeComponent) then e.oclAsType(CompositeComponent).assemblyContexts__ComposedStructure.encapsulatedComponent__AssemblyContext else Bag{e} endif)";
		try {
			OCLExpression query = helper.createQuery(queryString); 
			System.out.println(query.toString());
			//System.out.println(ocl.evaluate(affectedElement, query));
			// Result type depends on kind of query; Collection here, but could also be Boolean etc.
			Collection<?> result = (Collection<?>) ocl.evaluate(affectedElement, query);
			System.out.println("---Results--- (for " + affectedElement.getEntityName() + ")");
			for (Object resultElement: result) {
				RepositoryComponent cElement = (RepositoryComponent) resultElement;
				System.out.println(cElement.getEntityName());
			} 
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}
}
