# MathParser-Java v1 #

### Description ###

MathParser-java is a cross platform mathematical parser library written in Java. With a couple lines of code, the library can process complex arithmetic expressions efficiently, as it is powered by Dijkstra's Shuting-yard algorithm.

**Version**
1.0.0

**Complex arithmetic expressions**


### Dependency ###

```
<dependency>
  <groupId>com.google.code.mathparser-java</groupId>
  <artifactId>mathparser-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Usage ###

<u>Arithmetic expressions</u>

Instanciate the object using **_MathParserFactory_** and invoke calculate method with the desired expression. An object **_Result_** will be returned

```
MathParser mathParser = MathParserFactory.create();
Result result = mathParser.calculate("-5*((-3*2)/(-3)+1)");
System.out.println(result.doubleValue());
```

<u>Supported operators</u>

```
+ //Addition
- //Substraction
* //Multiplication
/ //Division
^ //Pow
( //Left Parentheses
) //Right Parentheses
```

<u>Examples of valid expressions</u>

```
3-[4-(5-7)]-{9-[5-(-4)]}
-5*[(-3*2)/(-3)+1]
7*(-3)+[2+3(-5)]
-[-13+(24-68)]-(-48+95)
(((2-1/5)^2)/((3-2/9)^(-1))) / (((6/7)*(5/4)-(2/7)/(1/2))^3)/((1/2)-(1/3)*(1/4)/(1/5))-5(1/7)
```

### Next release features ###

  * Function support
    * sin, cos, tan, sqrt, etc..

### Contact ###

Be aware this is a project I'm working in my free time.
You can send me any commentary or suggestion at this email: <u><b><i>daniel.rguez.hdez(at)gmail.com</i></b></u>

Daniel Rodriguez Hernandez

Last Update: March / 09 / 2013