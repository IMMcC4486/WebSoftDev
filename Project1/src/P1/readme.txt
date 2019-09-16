Looked up public apis.
Found one that satisfied the requirement of being able to query in the url.
Response output came in json format.

In Java.
Since the format was JSON, create a matching 'Drink' java bean object.

Design
Take query results
Read them in as objects
Verify the objects against preexisting objects (by a particular trait to eventually be primary key in db)
Add or reject objects as they are verified.


UI
Let searches by drink name.
Let searches by attributes.
Output in div
(Get creative here)