This project is an example of how to set up RMI server and client with help of Spring.

This project contains 2 subprojects:
  1. Spring RMI Example Server, which is web application
  1. Spring RMI Example Client

Server Spring configuration looks following:
```
<bean id="helloService" class="com.etymgiko.springrmiexample.server.HelloServiceImpl">
</bean>

<bean id="rmiServiceExporter" class="org.springframework.remoting.rmi.RmiServiceExporter">
    <property name="serviceName" value="HelloService"/>
    <property name="service" ref="helloService"/>
    <property name="serviceInterface" value="com.etymgiko.springrmiexample.shared.HelloService"/>
    <!-- defaults to 1099 -->
    <property name="registryPort" value="1099"/>
</bean>
```

And Client Spring configuration looks following:
```
<bean id="helloService" class="org.springframework.remoting.rmi.RmiProxyFactoryBean">
    <property name="serviceUrl" value="rmi://localhost:1099/HelloService"/>
    <property name="serviceInterface" value="com.etymgiko.springrmiexample.shared.HelloService"/>
</bean>
```