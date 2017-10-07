# Activity 5
  Rob Russell, Ryan Cauble, Christian Okoli


# Step 1: Review Screen Sizes and Screen Densities and answer following questions:

# To ensure that your layout is flexible, how should you specify the width and height of view components?

The width and height should use "wrap_content" and "match_parent" to ensure a flexible layout. 
The "wrap_content" sets to the minimum size needed to fit contents within that view.
The "match_parent" sets the size to match the parents view. This is good since different devices are different sizes.



# What is the benefit using RelativeLayout than nested LinearLayout?

RelativeLayout allows you to easily position views relative to each other in multiple directions giving you more precise positioning of them than LinearLayout views are just stacked next to each in a straight line.


# Give an example where you want to have different layouts on different screen configurations?

You'll want different layouts if your app is going to be used on different device types such as tablets and phones, so that you acn maximize the usability of your app on those devices.



# If your app requires minimal screen width to be 400dp, how do you specify resource qualifier?

You do so by using configuration qualifiers, specifically the Smallest-width qualifier, which allows you to target screens that have a certain minimum width given in dp.



# Where you should use sp to specify size?

This should only be used to specify text size and never be used for layout sizes. "sp" stands for scaled pixel and it scales to the users text size. 

A dp is a density-independent pixel that corresponds to the physical size of a pixel at 160 dpi. 



# If you generate 300x300 image for hdpi devices, what is the image size you should generate for xhdpi devices?

225x225 since the scale for ldpi is .75

you take 300 x .75 = 225.


# The Screenshot:

![screenshot_breakpoint](https://user-images.githubusercontent.com/17748575/30727077-f943dbe2-9f1c-11e7-8c80-526d54109a92.png)


