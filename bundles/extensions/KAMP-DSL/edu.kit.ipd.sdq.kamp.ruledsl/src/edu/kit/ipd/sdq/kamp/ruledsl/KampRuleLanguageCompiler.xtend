package edu.kit.ipd.sdq.kamp.ruledsl;

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

public class KampRuleLanguageCompiler extends XbaseCompiler {

    override protected internalToConvertedExpression(XExpression obj, ITreeAppendable appendable) {
   		super.internalToConvertedExpression(obj, appendable)
    }
}
