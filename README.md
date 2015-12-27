# tdd_jbrains

Exercise project for JB Rainsbergers TDD course

##Exercise:Fraction

###How to build

Start  'sbt' Session and 

run tests on fraction subpackage
> fraction/test

publish the fraction module to your local ivy cache
> fraction/publish-local

compile/run test on the root subproject, fraction is loaded via libraryDependency from local ivy cache
> root/test

run all tests (fraction and root)
> test 



