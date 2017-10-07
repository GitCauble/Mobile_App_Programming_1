# activity-3-ui-layout-ethan-ryan-christian
Christian Okoli, Ethan Cumming, Ryan Cauble

**UI Overview:**

**What is the difference between View and ViewGroup?**
 A View object is the basic UI building element that is the shape of a rectangle. A ViewGroup is multiple views that are held in an invisible container.

**Is TextView a View or ViewGroup? What is its purpose? What is the widget if you want to allow editable text input?**

  TextView is a View. It&#39;s a box where text can be placed on the screen. The attribute is called "android:editable" to have text input.

**What other UI elements can you find out?**

Images, Buttons, App Bar, Notifications, etc.

**Layout:**

**What is a layout? How does it relate to an Activity?**

The layout is where all the visual aspects of a UI is setup.

**Why declaring layout &amp; UI in XML? Where can you find the XML layout file?**

It is good to declare the layout and UI in XML because it keeps the visual aspects of the application seperate from the code of how the application works. This is useful since it allows you to make changes to the visual part of your application without having to change anything about how it works. The XML layout file is located in resources.

**What does android:layout\_height=&quot;match\_parent&quot; mean?**

This basically means that the layout height will scale to the devices window size.

**What does + below mean? How to reference this ID in XML and Java code?**

The plus-symbol (+) means that this is a new resource name that must be created and added to our resources (in the R.java file).

**HappyBirthday App:**

  If we move ImageView before the TextViews then the image overlaps both texts on screen. If we change it to LinearLayouts all the Views are lined up horizontally. To make the views line up vertically we would change the orientation to vertical.
