package thesis

import edu.kit.ipd.sdq.kamp.architecture.CrossReferenceProvider
import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.pcm.repository.RepositoryComponent

public class KampXtendTest {
	public static def Stream<? extends EObject> evaluateRule(Stream<RepositoryComponent> source, CrossReferenceProvider provider) {
		source;
	}
}  
