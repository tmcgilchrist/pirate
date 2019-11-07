name := "pirate"

version := "0.1"

scalaVersion := "2.12.10"

scalaVersion in ThisBuild := "2.12.10"

resolvers ++= Seq(
    "oss snapshots"       at "http://oss.sonatype.org/content/repositories/snapshots"
  , "oss releases"        at "http://oss.sonatype.org/content/repositories/releases"
  , "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
  , Resolver.bintrayRepo("scalaz", "scalaz")
)

libraryDependencies ++= Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.29"
  , "org.scalaz" %% "scalaz-effect" % "7.2.29"
  , "org.scalaz" %% "scalaz-scalacheck-binding" % "7.2.29-scalacheck-1.14"
  , "org.specs2" %% "specs2-core" % "4.8.0" % "test"
  , "org.specs2" %% "specs2-scalacheck" % "4.8.0" % "test"
  , "com.chuusai" %% "shapeless" % "2.3.3"
)

scalacOptions := Seq(
  "-deprecation"
  , "-unchecked"
  , "-feature"
  , "-language:_"
  , "-Ywarn-value-discard"
  , "-Ywarn-macros:after"
  , "-Xlint"
  , "-Xfatal-warnings"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8")
