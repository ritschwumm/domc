name			:= "domc"

organization	:= "de.djini"

version			:= "0.9.0"

scalaVersion	:= "2.10.0"

libraryDependencies	++= Seq(
	"de.djini"		%%	"scutil"			% "0.16.0"	% "compile",
	"de.djini"		%%	"scwebapp"			% "0.13.0"	% "compile",
	"org.scalaz"	%%	"scalaz-core"		% "6.0.4"	% "compile",
	"javax.servlet"	%	"javax.servlet-api"	% "3.0.1"	% "provided"
)

scalacOptions	++= Seq(
	"-deprecation",
	"-unchecked",
	// "-language:implicitConversions",
	// "-language:existentials",
	// "-language:higherKinds",
	// "-language:reflectiveCalls",
	// "-language:dynamics",
	"-language:postfixOps",
	// "-language:experimental.macros"
	"-feature"
)
