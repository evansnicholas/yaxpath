package eu.nevans.yaxpath.function.standard

import eu.cdevreeze.yaidom.{EName, Elem}

/**
 * Contains all the standard functions needed to evaluate an xpath expression.
 */
object StandardFunctions {
  
  val fnDataFunc: IndexedSeq[Any] => IndexedSeq[Any] = (items: IndexedSeq[Any]) => 
    {
      items map { 
        case s: String => s
        case i: Int => i
        case f: Float => f
        case d: Double => d
        case e: Elem => e.text
        case err => throw new Exception(s"Invalid type for application of fn:data, found ${err.getClass}")
      }
    }
    
    
  type SeqToSeqFunc = IndexedSeq[Any] => IndexedSeq[Any]  
   
  val seqFunctionsByEName: Map[EName, SeqToSeqFunc] =
    Map(fnDataEName -> fnDataFunc)
    
  def apply(ename: EName): SeqToSeqFunc = {
    seqFunctionsByEName(ename)
  }
  
}