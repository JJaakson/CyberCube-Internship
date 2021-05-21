For Task #1 solution I expect that the two strings are always in the correct form by the 
following constraints, which I did not check in my code:

0<= s.length <= 1000

t.length == s.length + 1

s and t consist of lower-case English letters

I start by looping through the both strings character(letter) by character and counting them by
adding them to a two seperate maps. When that is done I will start to compare them
and when I that before(map "s") does not have the type of Character in after(map "t")
or I find that before(map "s") does not have the same amount of one Character as in after(map "t")
I return it and it is the anwser.
