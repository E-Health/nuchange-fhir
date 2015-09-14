/**
 * Created by beapen on 2015-09-13.
 * A test scala project
 * To list all records with allergy severity code of fatal from UHN test server
 */
//Imports
import ca.uhn.fhir.context.FhirContext
import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance

object Allergy {
  def main(args: Array[String]): Unit = {

    // We're connecting to a DSTU2 compliant test server at UHN
    val ctx = FhirContext.forDstu2()
    val serverBase = "http://fhirtest.uhn.ca/baseDstu2"

    val client = ctx.newRestfulGenericClient(serverBase)

    //creating an instance to refer to its class
    val allergyIntolerance = new AllergyIntolerance

    // Perform a search
    val results = client.search().forResource(allergyIntolerance.getClass)
      .where(AllergyIntolerance.CRITICALITY.exactly().code("high")).execute()

    val allAllergies = results.getResources(allergyIntolerance.getClass)

    for (i <- 0 to results.size()-1) {
      val allergy = allAllergies.get(i)
      println((i+1).toString + ": " + allergy.getCategory() + " Type: " + allergy.getType() +
        " Status: " + allergy.getStatus())
    }

  }

}
