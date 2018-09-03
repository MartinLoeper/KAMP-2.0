package edu.kit.ipd.sdq.kamp.ruledsl.util

import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardReferenceInstanceSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardReferenceMetaclassSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceIdDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstancePredicateDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceProjection
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceRuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Lookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.MetaclassForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.MetaclassRuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.PropagationReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StructuralFeatureForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.TypeProjection
import edu.kit.ipd.sdq.kamp.ruledsl.scoping.KampRuleLanguageScopeProviderDelegate
import org.eclipse.emf.ecore.EClass

import static edu.kit.ipd.sdq.kamp.ruledsl.util.EcoreUtil.*
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ExternalRuleSource

final class KampRuleLanguageEcoreUtil {
	private new() {}
	
	/**
	 * Returns the type of the forward reference's feature.
	 */
	def static dispatch EClass getMetaclass(StructuralFeatureForwardReferenceTarget refTarget) {
		return refTarget?.feature?.EType as EClass;
	}
	
	/**
	 * Returns the type of the type projection.
	 * Please note: Only the first type of a type projection is used for the typing.
	 * Please note: Only imported metaclasses are found
	 */
	def static dispatch EClass getMetaclass(TypeProjection typeProjection) {
		val eClass = KampRuleLanguageScopeProviderDelegate.getEClassForInstanceClass(typeProjection.eResource, typeProjection.types?.head?.qualifiedName);
	
		return eClass
	} 
	
	def static dispatch EClass getMetaclass(InstanceProjection instanceProjection) {
		getMetaclass(instanceProjection.instanceDeclarationReference)
	} 
	
	def static dispatch EClass getMetaclass(MetaclassForwardReferenceTarget metaclassTarget) {
		metaclassTarget.metaclassReference.metaclass
	}
	
	/**
	 * Returns the metaclass of the given metaclass rule source.
	 */
	def static dispatch EClass getMetaclass(MetaclassRuleSource metaclassRuleSource) {
		metaclassRuleSource.metaclassReference.metaclass;
	}
	
	def static dispatch EClass getMetaclass(InstanceRuleSource instanceRuleSource) {
		getMetaclass(instanceRuleSource.instanceReference)
	}
	
	def static dispatch EClass getMetaclass(InstanceIdDeclaration instanceIdDeclaration) {
		return instanceIdDeclaration.instanceReference.instance.eClass;
	}
	
	def static dispatch EClass getMetaclass(InstancePredicateDeclaration instancePredicateDeclaration) {
		return instancePredicateDeclaration.type.metaclass;
	}
	
	def static dispatch EClass getMetaclass(BackwardReferenceInstanceSource instanceSource) {
		getMetaclass(instanceSource.instanceReference)
	}
	
	def static dispatch EClass getMetaclass(InstanceForwardReferenceTarget instanceForwardReferenceTarget) {
		getMetaclass(instanceForwardReferenceTarget.instanceReference)
	}
	
	/**
	 * Returns the metaclass of the given backward reference metaclass source.
	 */
	def static dispatch EClass getMetaclass(BackwardReferenceMetaclassSource metaclassSource) {
		metaclassSource.mclass.metaclass
	}
	
	/**
	 * Returns the metaclass of the last lookup of the given RuleReference's target rule.
	 */
	def static dispatch EClass getMetaclass(RuleReference ref) {
		val Lookup lastLookup = ref.rule.instructions.filter[i | i instanceof Lookup].map(i | Lookup.cast(i)).last;
		
		return getMetaclass(lastLookup);
	}
	
	def static dispatch EClass getMetaclass(ExternalRuleSource ruleSource) {
		val Lookup lastLookup = ruleSource.rule.instructions.filter[i | i instanceof Lookup].map(i | Lookup.cast(i)).last;
		
		return getMetaclass(lastLookup);
	}
	
	/**
	 * Returns the metaclass that is previous to the given {@link PropagationReference}.
	 */
	def static getPreviousMetaclass(Lookup ref) {
		getMetaclass(
			getPreviousSiblingOfType(ref, getLookupChainTypes())
		)
	}
	
	def static getPreviousInstanceClass(Lookup ref) {
		getPreviousMetaclass(ref).instanceClass
	}	
	
	def static getLookupChainTypes() {
		return newArrayList(RuleSource, Lookup);
	}
}