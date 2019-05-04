`Drawbacks of Anonoymous Class`
1. JVM creates separate .class file for all anonymous class. This increase application startup time. 
    > Example: when extracting jar file, you can find a .class file named AnonymousClassExample$1.class for the anonymous class declared in class AnonymousClassExample.class
2. When an anonymous
 .class gets loaded by JVM it takes space in jvm meta space.