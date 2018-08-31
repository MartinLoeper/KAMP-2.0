package edu.kit.ipd.sdq.kamp.ruledsl.util

import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Lookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.MetaclassRuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.PropagationReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleSource
import org.eclipse.emf.ecore.EClass

import static edu.kit.ipd.sdq.kamp.ruledsl.util.EcoreUtil.*
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceRuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceIdDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstancePredicateDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.MetaclassForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StructuralFeatureReferenceTarget

final class KampRuleLanguageEcoreUtil {
	private new() {}
	
	/**
	 * Returns the type of the forward reference's feature.
	 */
	def static dispatch EClass getMetaclass(StructuralFeatureReferenceTarget refTarget) {
		val feature = refTarget.feature;
		if(feature !== null) {
			return feature.EType as EClass;
		}
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
	
	/**
	 * Returns the metaclass of the given backward reference.
	 */
	def static dispatch EClass getMetaclass(BackwardEReference ref) {
		// TODO is this cast risky?? which of those subclasses of eclassifier is possible? EClassifierImpl, EClassImpl, EDataTypeImpl, EEnumImpl
		ref.mclass.metaclass as EClass;
	}
	
	/**
	 * Returns the metaclass of the last lookup of the given RuleReference's target rule.
	 */
	def static dispatch EClass getMetaclass(RuleReference ref) {
		val Lookup lastLookup = ref.rule.instructions.filter[i | i instanceof Lookup].map(i | Lookup.cast(i)).last;
		
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