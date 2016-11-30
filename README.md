# processing-demo
Shows how to run Processing projects in Spring Boot

The guide at https://processing.org/tutorials/eclipse/ shows how to run a vanilla Java applicationt that uses Processing core libraries. 
However for more "serious" or enterprise applications, a framework such as Spring  may be preferred which will allow for powerful extensions to the simplicity of graphics programming using Processing.

This sample application shows how to use Spring Boot to bootstrap a Java Spring application with Processing behind its main UI.
Spring requires the creation of a specific application context through initialization classes which in addition will create by default headless applications. The static method provided by Processing:

<code>
static void processing.core.PApplet.main(Class<?> mainClass, String... args)
</code>

Or any of its overloaded alternatives does not initialize the Spring context and require a non-headless app setup, so they are not the preferred method.

The solution uses standard Spring Boot context builders, setting a non-headless context for Processing.
