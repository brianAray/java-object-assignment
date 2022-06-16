# Instructions
This assignment is to get you used to working with Java if you have not before. This may also be your first introduction to TestNG, the testing tool we will be using to run tests against the code with Maven. Within the POM.xml file you will see how we have integrated TestNG into Maven, so on your local system you can run:

```
mvn verify
```

And this will run the tests within the test folder. Make sure to run this command when you are in the same folder that contains your pom.xml otherwise the `mvn` command will not know how to run anything.

TestNG using xml files within the test resources folder that is used to organize your tests. The tests themselves are coded within the test folder too.

1. Read through the project files and make sure you understand what everything is before using it
2. Run the command `mvn verify` in a terminal and make sure the failure is due to failed tests and not a build error
3. Go to the AnimalTest file in the test folder, and make sure all the tests run successfully

## Hints

Here are some resources

[Java OOP](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)

[TestNG Docs](https://testng.org/doc/)
