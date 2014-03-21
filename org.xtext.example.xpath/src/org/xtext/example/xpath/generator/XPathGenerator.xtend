/*
 * generated by Xtext
 */
package org.xtext.example.xpath.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.xpath.xPath.*
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.xpath.constants.StepChoice

import java.lang.StringBuilder

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class XPathGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val sb = new StringBuilder() 
		for (e: resource.allContents.toIterable.filter(ValueExpr)){
			val compiled = 
			'''def xpath(elem: Elem): IndexedSeq[Any] = {
  val documentElem = Elem(QName("documentNode"))
  val totalElem = documentElem.withChildren(Vector(elem))
  var focus = Vector(Focus(totalElem, 1))
  «e.compile»
  focus
}'''
			sb.append(compiled)
		}
		fsa.generateFile("generation.scala", sb)
	}
	
	def dispatch compile(Expr e){
		
	}
	
	def dispatch compile(ExprSingle es){
		
	}
	
	def dispatch compile(ForExpr fe){
		
	}
	
	def dispatch compile(SimpleForClause sfc){
		
	}
	
	def dispatch compile(AdditionalIn ai){
		
	}
	
	def dispatch compile(QuantifiedExpr qe){
		
	}
	
	def dispatch compile(IfExpr ie){
		
	}
	
	def dispatch compile(OrExpr oe){
		
	}
	
	def dispatch compile(AndExpr ae){
		
	}
	
	def dispatch compile(ComparisonExpr ce){
		
	}
	
	def dispatch compile(RangeExpr re){
		
	}
	
	def dispatch compile(AdditiveExpr ae){
		
	}
	
	def dispatch compile(MultiplicativeExpr me){
		
	}
	
	def dispatch compile(UnionExpr ue){
		
	}
	
	def dispatch compile(IntersectExceptExpr eie){
		
	}
	
	def dispatch compile(InstanceofExpr ioe){
		
	}
	
	def dispatch compile(TreatExpr te){
		
	}
	
	def dispatch compile(CastableExpr ce){
		
	}
	
	def dispatch compile(CastExpr ce){
		
	}
	
	def dispatch compile(UnaryExpr ue){
		
	}
	
	def dispatch compile(ValueExpr ve) {
		'''«ve.value.compile»'''
	}
	
	def dispatch compile(RelSingle rs) {
		'''«rs.relPathExpr.step.compile(StepChoice.SINGLE)»
		«IF rs.relPathExpr.extraSteps != null»
		«FOR extra: rs.relPathExpr.extraSteps»
  «extra.compile»
		«ENDFOR»
		«ENDIF»
		'''
	}
	
	def dispatch compile(RelDouble rd) {
		'''«rd.relPathExpr.step.compile(StepChoice.DOUBLE)»
		«IF rd.relPathExpr.extraSteps != null»
		«FOR extra: rd.relPathExpr.extraSteps»
  «extra.compile»
		«ENDFOR»
		«ENDIF»
		'''
	}
	
	def dispatch compile(Single s) {
		'''«compile(s.step, StepChoice.SINGLE)»'''
	}
	
	def dispatch compile(Double d) {
		'''«compile(d.step, StepChoice.DOUBLE)»'''
	}
	
	def dispatch compile(StepExpr se, StepChoice stepChoice) {
		'''«se.stepExpr.compile(stepChoice)»'''
	}
	
	def dispatch compile(AxisStep axs, StepChoice stepChoice) {
		'''«compile(axs.step, stepChoice)»«compile(axs.predicateList)»'''
	}
	
	def dispatch compile(PredicateList pl) {
		'''«FOR p: pl.predicates»«p.compile»«ENDFOR»'''
	}
	
	//Note the expr is evaluated against the inner focus... see the xpath spec.  This means that when calling expr.compile,
	//the inner focus must be passed along.
	def dispatch compile(Predicate p) {
		'''.filter { elem => 
		     { 
		      val expr = «p.expr.compile»
		      expr match {
		      	case b: Boolean => b
		      	case i: Int => ???
		      	case _ => ???
		      }
		     }
		   }
		'''
	}
	
	def dispatch compile(ForwardStep fs, StepChoice stepChoice) {
		'''«IF fs.forward != null»«fs.forward»«fs.test.compile»«ENDIF»«IF fs.abbrForward != null»«compile(fs.abbrForward, stepChoice)»«ENDIF»'''
	}
	
	def dispatch compile(Element e, StepChoice stepChoice) {
	  switch stepChoice {
				  case StepChoice.SINGLE: 
'''focus = { 
  val search = focus flatMap { case Focus(contextItem, position) => 
    contextItem match {
  	  case elem: Elem => elem.filterChildElems { «e.test.compile» } 
  	  case _ => ???
    }
  }
  search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }
  }'''
				                          
			      case StepChoice.DOUBLE: 
'''focus = {
   val search = focus flatMap { case Focus(contextItem, position) => 
     contextItem match {
  	   case elem: Elem => elem.filterElemsOrSelf { «e.test.compile» } 
  	   case _ => ???
     }
   }
   search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }
}'''
      }		 
	}
	
	def dispatch compile(Attribute a, StepChoice stepChoice){
      switch stepChoice {
        case StepChoice.SINGLE: 
'''focus = { 
  val search = focus collect {  case Focus(contextItem, position) => 
    contextItem match {
	  case elem:Elem if elem.attributeOption(«a.test.compile»).isDefined => elem.attribute(«a.test.compile»)
	  case _ => ???
	}
  }
  search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }  
}'''
		case StepChoice.DOUBLE: 
'''focus = { 
  val search = focus flatMap { case Focus(contextItem, position) => 
    contextItem match {
      case elem:Elem =>	elem.filterElemsOrSelf { _.attributeOption(«a.test.compile»).isDefined }
			            .map { _.attribute(«a.test.compile») }
    }
  }
  search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }			                     
}'''
	  }
		
	}
	
	def dispatch compile(NodeTest not) {
		'''«not.test.compile»'''
	}
	
	def dispatch compile(NameTest nat) {
		'''«IF nat.QName != null»«nat.QName.compile»«ENDIF»«IF nat.wildcard != null»«nat.wildcard.compile»«ENDIF»'''
	}
	
	def dispatch compile(FilterExpr f) {
		'''«f.primary.compile»«f.predicateList.compile»'''
	}
	
	def dispatch compile(PrimaryExpr pe) {
		'''«IF pe.literal != null»«pe.literal.compile»«ENDIF»'''
	}
	
	def dispatch compile(Literal l) {
		'''«IF l.num != null»«l.num»«ENDIF»«IF l.string != null»«l.string»«ENDIF»'''
	}
	
	def dispatch compile(UnprefixedName un) {
		'''EName("«un.localPart.ncName»")'''
	}
	
	def dispatch compile(EObject o) {
	}
	
}
