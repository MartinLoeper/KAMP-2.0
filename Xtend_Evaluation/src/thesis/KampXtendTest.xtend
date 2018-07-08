package thesis

import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter
import org.palladiosimulator.pcm.repository.RepositoryComponent

public class KampXtendTest {
	public static def Stream<? extends EObject> evaluateRule(Stream<RepositoryComponent> source, ECrossReferenceAdapter adapter) {
		source;
	}
}  
