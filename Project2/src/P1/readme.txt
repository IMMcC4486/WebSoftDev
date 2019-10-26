**************************
SIMPLE
**************************

1)javac -cp "P1/java-json.jar" P1/Info.java P1/Drink.java
2)java -cp ".:P1/java-json.jar" P1/Info
3)Press 1 then press enter 
4)Type "irish" then press enter
5)Press 2 then press enter
6)Press 1 then press enter
7)Type "apple" then press enter
8)Press 2 then press enter
9)Press 3 then press enter




**************************
Explanation
**************************
There should be a folder called "P1" in the same directory as this readme.
The "P1" folder contains Info.java, Drink.java, and java-json.jar.

Compile from the directory containing the "P1" folder by running the following command:
1)javac -cp "P1/java-json.jar" P1/Info.java P1/Drink.java

Execute the program by running the following command:
2)java -cp ".:P1/java-json.jar" P1/Info

The UI of the program provides some guidance.
You will type in a number for the choice provided on the screen.

3)Press 1 then press enter 
This will select the "Search a drink" option. 
From here, you can type in part of a drink name.
4)Type "irish" then press enter
After you type in part of the drink's name that you're searching for hit enter.
If any drinks from the website DB match your search, a list of drink names will appear.
If no drinks are found, a response indicating that is shown.
After your search, you will return to the original options.

5)Press 2 then press enter
This will select the "Drinks searched" option, showing all the results found from your searches.

6)Press 1 then press enter
The more you search, the more the total drinks found list will grow.
7)Type "apple" then press enter
You will see drink names containing "apple"
8)Press 2 then press enter
You will now see the full list with both the results from the "irish" and "apple" searches.
Note: No duplicates are placed in the list
9)Press 3 then press enter
You have exited the program.




****************************
Thought Process
****************************
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
