name := "allergy"

version := "1.0"

scalaVersion := "2.11.7"

//Creating dependencies for PHIR and Sl4J

libraryDependencies ++= Seq(
  "ca.uhn.hapi.fhir" % "hapi-fhir-base" % "1.2-SNAPSHOT",
  "ca.uhn.hapi.fhir" % "hapi-fhir-structures-dstu2" % "1.2-SNAPSHOT",
  "ca.uhn.hapi.fhir" % "hapi-fhir-structures-hl7org-dstu2" % "1.2-SNAPSHOT",
  "ca.uhn.hapi.fhir" % "hapi-fhir-validation-resources-dstu2" % "1.2-SNAPSHOT",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.6.4",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

//Adding sonatype resolver
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    