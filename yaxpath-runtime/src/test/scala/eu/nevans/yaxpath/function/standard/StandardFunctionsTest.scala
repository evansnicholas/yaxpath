package eu.nevans.yaxpath.function.standard

import org.junit.Test
import eu.cdevreeze.yaidom.convert.ScalaXmlConversions
import eu.cdevreeze.yaidom.{ EName, indexed, Elem, QName }

class StandardFunctionsTest {

  @Test
  def testfnDataFunction(): Unit = {
    
    val fnDataFunction = StandardFunctions(fnDataEName)
     
    val testInt = Vector(1)
    assert(fnDataFunction(testInt) == Vector(1))
    
    val xml = <Title language="en">The Leopard</Title>
    val elem = ScalaXmlConversions.convertToElem(xml)
    assert(fnDataFunction(Vector(elem)) == Vector("The Leopard"))
      
    
  }
  
}