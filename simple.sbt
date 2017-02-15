name := "spr"
version := "1.6"
scalaVersion := "2.10.5"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0" 
resolvers ++=Seq(
"Akka Repository" at "http://repo.akka.io/releases/",
"Spray Repository" at "http://repo.spray.cc/"
)
