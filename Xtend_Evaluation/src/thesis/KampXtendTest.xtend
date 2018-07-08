package thesis

import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter
import org.palladiosimulator.pcm.repository.CompositeComponent
import org.palladiosimulator.pcm.core.composition.AssemblyContext
import org.palladiosimulator.pcm.repository.BasicComponent

public class KampXtendTest {
	public static def Stream<? extends EObject> evaluateRule(Stream<BasicComponent> source, ECrossReferenceAdapter adapter) {
		source.flatMap(o | 
			adapter.getInverseReferences(o).stream.filter(s |
				AssemblyContext.isAssignableFrom(s.getEObject().getClass())
			).map(s | s.EObject)
		)
	}
}  
