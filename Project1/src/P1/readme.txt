Looked up public apis.
Found one that satisfied the requirement of being able to query in the url.
Response output came in json format.

In Java.
Since the format was JSON, create a matching 'Drink' java bean object.

Design
Take query result
Read them in as objects
*** response came in json format. Downloaded java-json.jar. Added jar to build path. ***
Verify the objects against preexisting objects (by a particular trait to eventually be primary key in db)
Add or reject objects as they are verified.


UI
Let searches by drink name.
Let review searched drinks.
Exit.

Later (GUI)
Output in div
(Get creative here)

Javadoc
The Info.java and Drink.java classes have been updated with javadoc annotations.
when compiled in eclipse, the javadocs are created in a doc folder inside the Project1 folder.
When running from command line, ran the command: /path/to/javadoc -cp "src/P1/java-json.jar" src/P1/Info.java src/P1/Drink.java . 
Note: The latter option puts all the files loosely in the Project1 folder. 
