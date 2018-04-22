#学习编写struts-mvn框架

## 时序图
![mystruts参考时序图]("https://github.com/247989011/panstruts/blob/master/mystrutsmvc-timeDiagram.png" "时序图")

## 应用到了技术：
[JavaAPI:] (http://jszx-jxpt.cuit.edu.cn/JavaAPI/)

## 1.接口
## 2.抽象类
## 3.反射
	field.setAccessible(true);
	将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查。
	首先，如果存在安全管理器，则在 ReflectPermission("suppressAccessChecks") 权限下调用 checkPermission 方法。
	如果 flag 为 true，并且不能更改此对象的可访问性（例如，如果此元素对象是 Class 类的 Constructor 对象），则会引发 SecurityException。
	如果此对象是 java.lang.Class 类的 Constructor 对象，并且 flag 为 true，则会引发 SecurityException(安全管理器抛出的异常，指示存在安全侵犯。)。
## 4.设计模式-模版模式
意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
	模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
何时使用：有一些通用的方法。
如何解决：将这些通用算法抽象出来。
关键代码：在抽象类实现，其他步骤在子类实现。
*注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。

## 5.xml
引入dom4j架包
[dom4j 1.6.1API:](https://www.oschina.net/uploads/doc/dom4j-1.6.1/index.html)

## 6.maven

```xml

<properties>
  <!-- 文件拷贝时的编码 -->
  	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  	<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  	 <!-- 编译时的编码 -->  
  	<maven.compiler.encoding>UTF-8</maven.compiler.encoding>
  </properties>
  
  
  <build>  
         <plugins>  
              <plugin>  
                  <groupId>org.apache.maven.plugins</groupId>  
                  <artifactId>maven-compiler-plugin</artifactId>  
                  <version>3.1</version>  
                 <configuration>  
                     <source>1.7</source>  
                     <target>1.7</target>  
                 </configuration>  
             </plugin>  
         </plugins>  
 </build> 
 
```

