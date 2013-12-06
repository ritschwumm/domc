name	:= "domc-servlet"

libraryDependencies	++= Seq(
	"de.djini"		%%	"scutil"			% "0.36.0"	% "compile",
	"de.djini"		%%	"scwebapp"			% "0.36.0"	% "compile",
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
	// "-language:postfixOps",
	// "-language:experimental.macros"
	"-feature"
)