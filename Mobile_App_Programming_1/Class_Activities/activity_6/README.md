
=======
# Activity 6: Activities, Intents, Intent Filters
  Rob Russell, Ryan Cauble, Christian Okoli, Ethan Cumming

# Where do you register activity information?

In the AndroidManifest.xml file using the `<activity>` tag.
  
# When declaring an activity, what attributes can you specify?

You can declare the name of the activity, the label which is displayed at the top of the screen, and a theme to help stylize the activity.

# Why would an activity specify an intent-filter attribute? 
 
 The ability to implicitly launch an activity based on certain parameters. The `intent-filter` has an action element that specifies what type of intent the activity can receive requests from. Other elements include category that specify how the activity will launch. 



# What are three fundamental use cases of intents?

Starting activity: This represents a screen in an application. 


Starting a service: This is something that runs in the background with no user interface.


Delivering a broadcast: A message that can be received by all applications.


# What are the differences between explicit and implicit intents?

Explicit intents are typically used in your own application and can start a componet by its name. 


Implicit intents instead declear a general action and not a name. This allows another applications component to work with it. 


# Is intent or intent filter specified in manifest as an attribute for activity?

Intent filter's are specified in the manifest as <intent-filter> elements

# What is the intent’s action type if you want to share a photo through another app? 

ACTION_SEND is the action type to share a photo to another app



# What is stored in intent’s Extras?

Key-value pairs that carry additional information required to accomplish the requested action. Just as some actions use particular kinds of data URIs, some actions also use particular extras. 

# What aspects are used to resolve intents against intent filters?

The filter types, <action>, <category>, and <data>. are used to resolve intents. 
The intent needs to match all three filter types to get delivered by the Android system.
 

# Which method can be used to determine whether an intent can resolve to any activity?

By comparing it to intent filters and see if it passes three filter test:

 For the action filter, the action specified in the Intent must match one of the actions listed in the filter. 
 
 For the category filter, all the intent's categories must match a category in the filter, or have no categories at all to   pass.
  
 For the data filter, both the intent's URI and data type are matched against the filter. The intent can pass the URI part of the test if its URI matches a URI in the filter or if it has a content: or file:

 If the intent doesn't specify mime type or the URI it will still pass as long as the filter did not specify the missing part either.  
