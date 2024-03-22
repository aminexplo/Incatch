/*
 * generated by Xtext 2.27.0
 */
package zombie.incatch.constraintdsl.serializer;

import ConstraintDsl.ConstraintCollection;
import ConstraintDsl.ConstraintDslPackage;
import ConstraintDsl.RangeRule;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import zombie.incatch.constraintdsl.services.ConstraintDslTextualGrammarAccess;

@SuppressWarnings("all")
public class ConstraintDslTextualSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConstraintDslTextualGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ConstraintDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ConstraintDslPackage.CONSTRAINT_COLLECTION:
				sequence_ConstraintCollection(context, (ConstraintCollection) semanticObject); 
				return; 
			case ConstraintDslPackage.RANGE_RULE:
				sequence_RangeRule(context, (RangeRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConstraintCollection returns ConstraintCollection
	 *
	 * Constraint:
	 *     (name=EString rules+=Rule rules+=Rule*)
	 * </pre>
	 */
	protected void sequence_ConstraintCollection(ISerializationContext context, ConstraintCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns RangeRule
	 *     RangeRule returns RangeRule
	 *
	 * Constraint:
	 *     (
	 *         equalLow?='equalLow'? 
	 *         equalHigh?='equalHigh'? 
	 *         name=EString 
	 *         artifact=EString? 
	 *         attribute=EString? 
	 *         low=EDouble? 
	 *         high=EDouble? 
	 *         relatedRule=[Rule|EString]
	 *     )
	 * </pre>
	 */
	protected void sequence_RangeRule(ISerializationContext context, RangeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}