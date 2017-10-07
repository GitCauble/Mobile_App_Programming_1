# Activity 7: ArrayAdapter and Manifest
Rob Russell, Ryan Cauble, Christian Okoli, Ethan Cumming
### Can GridView be scrolled like the ListView?

 Yes, GridView and ListView can both be scrolled.


### By default, ArrayAdapter with ListView will display each item as a _____?

 TextView

### To use a custom appearance, which function of ArrayAdapter should be overridden?

 The getView() method on Adapter should be overridden for a custom apperance.

Review Manifest and answer following questions:

### You can decide who gets to launch your activity by either specifying an intent filter or a permission, but what is the difference of these two approaches?
Permission keep certain features or data on your device protected, only granting an app access after checking the  
authorities that signed the application's certificates or asking the user to grant the request. 
Intent filters just signal what intents components of the application can respond to. 

### If your application protects its own activity with a permission, does your application’s manifest still needs to declare to use that permission?

Yes an applications own component can define its own permission. For other components of the app to use the protected component it needs to have the same `<uses-permission>` element.
