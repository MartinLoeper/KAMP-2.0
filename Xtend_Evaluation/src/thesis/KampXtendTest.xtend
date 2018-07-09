package thesis

import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter
import org.palladiosimulator.pcm.core.composition.AssemblyContext
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.pcm.repository.RepositoryComponent
import org.palladiosimulator.pcm.subsystem.SubSystem
import org.palladiosimulator.pcm.repository.CompositeComponent
import java.util.stream.Collectors
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper
import java.util.concurrent.atomic.AtomicBoolean
import java.util.List
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping

public class KampXtendTest {
	public static def Stream<CausingEntityMapping<RepositoryComponent, EObject>> evaluateRule(Stream<CausingEntityMapping<CompositeComponent, EObject>> source, ECrossReferenceAdapter adapter) {
		source
			.flatMap(o | 
				o.affectedElement.assemblyContexts__ComposedStructure.stream.map(e | 
					new CausingEntityMapping(e, o)
				).peek(e |
					e.addCausingEntityDistinct(e.affectedElement)
				)
			)
			.map(o | 
				new CausingEntityMapping(o.affectedElement.encapsulatedComponent__AssemblyContext, o)
			);
	}
}  
