# activity-9-fragments-team_go_crec

# Rob Russell, Ryan Cauble, Christian Okoli, Ethan Cumming

# What is the purpose of fragments?

A fragment is a way to display multiple behaviors in one activity that look tile panes. 

# Does fragments have to be attached to an Activity?

Fragments only need to be attached to an Activity to be drawn on the screen.  They can be used without their own UI as an invisible worker for the activity.

# Usually what 3 callback methods should be implemented? In which method you can provide a layout for a fragment?

When creating a fragment you should implement:
- onCreate() : initialize essential components of the fragment
- onCreateView() : return a view that is the root of fragment's layout
- onPause() : save any changes that should persist beyond the current session

# What does LayoutInflator do?

  LayoutInflater manipulates the screen using predefined XML layouts.  It instantiates a layout XML file into it's corresponding view objects.
  
It takes 3 arguments: 

*The resource ID of the layout you want to inflate.

*The ViewGroup to be the parent of the inflated layout.

*A boolean indicating whether the inflated layout should be attached to the ViewGroup.

# What are the two ways to add a fragment to an activity?

You can declare the fragment inside the activity's layout file or you can add it to an existing view group.


# What method can be used for fragment to find which activity it attaches to?

getActivity() can be used to get a context object, but only when the activity's already been attached.

# How can a fragment share events with an activity?

Define a callback interface inside the fragment and require that the host activity implement it. When the activity receives a callback through the interface, it can share the information with other fragments in the layout as necessary.


# True or False: when the activity receives onPause(), each fragment in the activity receives onPause().

TRUE


# FragmentBasics: Modify this code so when you rotate the device to landscape mode, the headline fragment shows on the left (⅓) while the article fragment shows on the right (⅔). Turn in the code and screenshots.
![screenshots](https://user-images.githubusercontent.com/14959322/31251046-b55fc732-a9ea-11e7-84e2-582a74d9be76.png)
