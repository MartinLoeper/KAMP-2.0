/*
 * generated by Xtext 2.10.0
 */
package edu.kit.ipd.sdq.kamp.ruledsl.validation

import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRuleLanguagePackage
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ModelImport
import org.eclipse.core.internal.resources.ResourceException
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.PackageNotFoundException
import org.eclipse.xtext.validation.Check
import edu.kit.ipd.sdq.kamp.ruledsl.runtime.KarlModelLoader;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KampRuleLanguageValidator extends AbstractKampRuleLanguageValidator {
	
	public static val INVALID_IMPORT_WRONG_TYPE = 'invalidImport__notModelFile'
	public static val INVALID_IMPORT_UNCAUGHT_ERROR = 'invalidImport__unknownError'
	public static val INVALID_IMPORT_FILE_NOT_FOUND = 'invalidImport__notFound'

	@Check(FAST)
	def checkValidModelImport(ModelImport modelImport) {
		val filePath = modelImport.file;
		val alias = modelImport.name;
		try {
			KarlModelLoader.INSTANCE.loadModelFromFile(filePath, alias, false);
		} catch(Exception e) {
			if(e instanceof IOWrappedException) {
				val wrappedException = e.cause;
				if(wrappedException instanceof PackageNotFoundException) {
					error('This is not a valid model file', 
						KampRuleLanguagePackage.Literals.MODEL_IMPORT__FILE,
						INVALID_IMPORT_WRONG_TYPE)	
				} else if(wrappedException instanceof ResourceException) {
					error('Could not find the specified file', 
						KampRuleLanguagePackage.Literals.MODEL_IMPORT__FILE,
						INVALID_IMPORT_FILE_NOT_FOUND)	
				} else {
					error('Could not import model', 
						KampRuleLanguagePackage.Literals.MODEL_IMPORT__FILE,
						INVALID_IMPORT_UNCAUGHT_ERROR,
						e.message)	
				}
			} else {
				error('Could not import model', 
					KampRuleLanguagePackage.Literals.MODEL_IMPORT__FILE,
					INVALID_IMPORT_UNCAUGHT_ERROR,
					e.message)	
			}
		}
	}	
}
