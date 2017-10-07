Activity 2 Sept 12, 2017

Ethan Cumming &amp; Ryan Cauble

**Resources:**

**What are examples of project resources?**

Layout Resource, Drawable Resources, Menu Resource, String Resources, Style Resource

**Where should resource files be placed?**

All resource files should be placed in the res/ directory. They should then be organized into subdirectories based on the type of resource it is and what it is being used for.

**What is the purpose of alternative resources?**

Default resources are to be used no matter which device is being used.

Alternative resources allow you to create things like custom layout configurations for specific devices.

  An example of this would be to have alternative resources for different languages.

**Different Resources:**

**What are the subdirectory names for common resources?**

 The common drawable, layout, menu, etc.

**How to provide alternate resources through qualifier?**

 If you wanted to add alternate drawables then add a folder that specifies with a qualifier I.E. &#39;drawable-hdpi&#39;

**How to give multiple qualifiers for one subdirectory?**

Format as <resources_name>-<config_qualifier>.

**Why and how to create alias resource?**

A resource cannot have two qualifiers, so if you want to apply a resources to multiple qualifier you can create an alias.Here is how to create an alias:

`<?xml version="1.0" encoding="utf-8"?>
<resources>
    <drawable name="icon">@drawable/icon_ca</drawable>
</resources>`


**Accessing Resources:**

**What is the datatype of a Resource ID?**

The datatype of the resource ID is the R subclass within the R class which contains each type of resource like string, drawable, and layout.

**What is the difference between resource ID and resource name?**

The resource ID is both the resource type and resource name.

An example of resource type is: string, layout, drawable.

The resource name is a filename without the extension or simply just the value in the XML attribute when the resource is a simple value.

**What is the syntax when referencing resources in code? And in XML?**

_In code:_ Using a static integer from a sub-class of your R class, such as:

R.drawable.mypicture

_In XML:_ Using a special XML syntax that also corresponds to the resource ID defined in your R class, such as:

@string/example
