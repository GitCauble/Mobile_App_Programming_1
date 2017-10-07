# Activity 8 Activity Lifecycle

# Ryan Cauble, Christian Okoli, Ethan Cumming


# if an app needs to use camera, which callback is a good place to initialize camera?

The onResume() is a god place to initialize the camera. The onPause() is the counterpart to onResume() and should be used to release the camera. 

# why you should not use onPause() to save application or user data?

It has very short execution time and there woudld not be enough time to conduct save operations. So that is why you do not want to use onPause() to save.


# when the activity is resumed, how do you keep track of the user entered text?

You don’t need to re-initialize components that were created during any of the callback methods leading up to the Resumed state. The system also keeps track of the current state for each View object in the layout, so if the user entered text into an EditText widget, that content is retained so you don't need to save and restore it.


# which methods are called when device orientation is changed?

The onDestroy() method is called then right after the onCreate() is called to recreate components and processes in a new orientation.


# if a parent activity starts a child activity, which method should the parent activity override to obtain result from the child activity?

`onActivityResult(int, int, Intent)` is used to return specifc information to the parent.



# if an user hits back button to release an activity, will onSaveInstanceState be called?

there is no guarantee that onSaveInstanceState() will be called prior to activity being destroyed. This is because it is not always a need to save the state. An example of this is when a user closes an application. 


# The Screenshot:

![screenshot](https://user-images.githubusercontent.com/17748575/31147514-20bbb05c-a858-11e7-93b9-fa46a4efbc13.png)
