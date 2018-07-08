package thesis

import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter
import org.palladiosimulator.pcm.repository.CompositeComponent

public class KampXtendTest {
	public static def Stream<? extends EObject> evaluateRule(Stream<CompositeComponent> source, ECrossReferenceAdapter adapter) {
		source;
	}
}  
