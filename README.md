# Coffee-Shop-Design-Low-Level-Design-
Hey this repository contains the coffee shop design allong with its proper explaination
Use Case -:

Let’s have a look on all the use cases of our coffee shop design -:

Order beverage .
Add new beverage .
Add new decorators (caremel , milk ,chocolate syrup etc).
Customize beverage using decorators .
Must be able to add multiple decorators .
So these are few use cases which we are going to cover here you can add more to it .

Here we are having a Beverage Interface which contians all the basic functionalities that a particular beverage can have . 
Then we have three different types of Coffee that implements beverage class and we also have a beverage decorator interface 
that implements beverage interface . Now the question is why this decorator interface implements beverage interface ?
So the answer to this question is that although it is decorator but it can have all the basic functionalities that a 
beverage can have (such as description , price , name etc) , we have made decorator interface in order to distinguish 
decorators from beverage . Then we have our different decorator classes that implements Beverage Decorator interface .

Now the question is why do we even need this Decorator interface ?

Suppose you have designed the coffee shop and made all the required interfaces and classes .
Now you have got a request for let’s say Espresso with Caramel now what you are going to do 
here is you will make one more class named “Espresso with Caramel” which implements beverage inetrface .
Now again you got a request for Espresso + Caramel + Caramel so again you will make a class for it and 
this way many classes can be formed of all possible combination . Forming numerous class is time consuming ,
memory consuming and tedious task it makes our code inefficient . So what we have came with is making a
decorator interface which is implemented by each and every decorator .

You can find complete explanation here -: https://medium.com/@akshatsharma0610/decorator-design-pattern-coffee-shop-design-515a714cd03c
