package eu.nevans.yaxpath.experiments

import eu.cdevreeze.yaidom.convert.ScalaXmlConversions
import eu.cdevreeze.yaidom.{ EName, indexed, Elem, QName }
import org.junit.Test

class YaxpathExperiments {

  @Test
  def testReport = {
   
      val xml = 
        <Books>
           <Book language="it">
              <Title language="en"> The Leopard </Title>
              <Author> 
                <FirstName> Giuseppe </FirstName>
                <LastName> de Lampedusa </LastName>
              </Author>
           </Book>
          <Book language="rus">
               <Title language="en"> Anna Karenina </Title>
               <Author>
                  <FirstName> Leo </FirstName>
                  <LastName> Tolstoy </LastName>
               </Author>
          </Book>
        </Books>
        
        case class Focus(contextItem: Any, position: Int)
       
      val elem = ScalaXmlConversions.convertToElem(xml)
      val indexedElem = indexed.Elem(elem)
      val document = indexed.Document(indexedElem)
      val documentElem = Elem(QName("documentNode"))
      val totalElem = documentElem.withChildren(Vector(elem))
      
      val selectedElems = totalElem.filterChildElems(EName("Books"))
                          .flatMap { _.filterChildElems(EName("Book")) }
                          .flatMap { _.filterChildElems(EName("Title")) }
                          
                          
def xpath(elem: Elem): IndexedSeq[Any] = {
  val documentElem = Elem(QName("documentNode"))
  val totalElem = documentElem.withChildren(Vector(elem))
  var focus = Vector(Focus(totalElem, 1))
  focus = { 
    val search = focus flatMap { case Focus(contextItem, position) => 
      contextItem match {
    	  case elem: Elem => elem.filterChildElems { EName("Books") } 
    	  case _ => ???
      }
    }
    search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }
    }
  focus = { 
    val search = focus flatMap { case Focus(contextItem, position) => 
      contextItem match {
    	  case elem: Elem => elem.filterChildElems { EName("Book") } 
    	  case _ => ???
      }
    }
    search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }
    }
  focus = {
    focus filter { outerFocus => 
      { 
        var focus = Vector(outerFocus)
        focus = Vector(Focus(2, 1))
  	  focus match {
  	    case Vector(Focus(b:Boolean, pos)) => b
  		case Vector(Focus(int:Int, pos)) => outerFocus.position == int
  		case _ => ???
  	  }
      }
    }
  }
  focus = { 
    val search = focus flatMap { case Focus(contextItem, position) => 
      contextItem match {
    	  case elem: Elem => elem.filterChildElems { EName("Title") } 
    	  case _ => ???
      }
    }
    search.zip(1 until search.size + 1) map { case (result, position) => Focus(result, position) }
    }
  focus = { 
  	val result = focus map { case Focus(contextItem, pos) => 
            contextItem match {
            	case elem: Elem => elem.text
            	case _ => ???
            }
       }
      result.zip(1 until result.size + 1) map { case (text, pos) => Focus(text, pos) }
  }
  focus
}
      val result = xpath(elem)
      println(result)
      println(s"Size = ${result.size}")
        
  }
  
}