# SSM [spring mybatis springmvc]

## 1、基本概念

## 1.1、Spring

        Spring是一个开源框架，Spring是于2003 年兴起的一个轻量级的Java 开发框架，
	由Rod Johnson 在其著作Expert One-On-One J2EE Development and Design中阐述的部分理念和原型衍生而来。
	它是为了解决企业应用开发的复杂性而创建的。Spring使用基本的JavaBean来完成以前只可能由EJB完成的事情。
	然而，Spring的用途不仅限于服务器端的开发。从简单性、可测试性和松耦合的角度而言，任何Java应用都可以从Spring中受益。
	简单来说，Spring是一个轻量级的控制反转（IoC）和面向切面（AOP）的容器框架。

## 1.2、SpringMVC
     
        Spring MVC属于SpringFrameWork的后续产品，已经融合在Spring Web Flow里面。
	Spring MVC 分离了控制器、模型对象、分派器以及处理程序对象的角色，这种分离让它们更容易进行定制。

## 1.3、MyBatis

       MyBatis 本是apache的一个开源项目iBatis, 2010年这个项目由apache software foundation 
       迁移到了google code，并且改名为MyBatis 。
       MyBatis是一个基于Java的持久层框架。iBATIS提供的持久层框架包括SQL Maps和Data Access Objects（DAO）
       MyBatis 消除了几乎所有的JDBC代码和参数的手工设置以及结果集的检索。
       MyBatis 使用简单的 XML或注解用于配置和原始映射，
       将接口和 Java 的POJOs（Plain Old Java Objects，普通的 Java对象）映射成数据库中的记录。
      
## maven构建项目
pom.xml

	<properties>
		<project.build.sourceEncoding>utf-8</project.build.sourceEncoding>
		<jdk.version>1.7</jdk.version>
		<junit.version>4.12</junit.version>
		<servlet.version>3.0.1</servlet.version>
		<log4j2.version>2.8.2</log4j2.version>
		<spring.version>4.3.3.RELEASE</spring.version>
		<mybatis-spring.version>1.3.0</mybatis-spring.version>
		<mybatis.version>3.4.0</mybatis.version>
		<mysql.version>5.1.38</mysql.version>
		<druid.version>1.0.18</druid.version>
		<jackson.version>2.5.4</jackson.version>
		<commons-io.version>2.5</commons-io.version>
	</properties>

	<dependencies>
		<!-- test begin -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>${junit.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>javax.el</groupId>
			<artifactId>javax.el-api</artifactId>
			<version>3.0.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish</groupId>
			<artifactId>javax.el</artifactId>
			<version>3.0.0</version>
			<scope>test</scope>
		</dependency>
		<!-- test end -->


		<!-- web begin -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>${servlet.version}</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jsp-api</artifactId>
			<version>2.0</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		<!-- web end -->

		<!-- log4j2 begin -->
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>${log4j2.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-jcl</artifactId>
			<version>${log4j2.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-slf4j-impl</artifactId>
			<version>${log4j2.version}</version>
		</dependency>
		<!-- log4j2 end -->

		<!-- Spring begin -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context-support</artifactId>
		</dependency>
		<!-- spring end -->

		<!-- mybaits start -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis-spring</artifactId>
			<version>${mybatis-spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis</artifactId>
			<version>${mybatis.version}</version>
		</dependency>

		<!-- mybaits end -->
		<!-- mysql -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>${commons-io.version}</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>${mysql.version}</version>
		</dependency>
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>druid</artifactId>
			<version>${druid.version}</version>
		</dependency>
		<!-- jackson begin -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>${jackson.version}</version>
		</dependency>
		<!-- jackson end -->

	</dependencies>

	<build>
		<finalName>shiro</finalName>
		<resources>
			<resource>
				<directory>src/main/resources</directory>
			</resource>
			<resource>
				<directory>src/main/conf/${profiles.active}</directory>
			</resource>
		</resources>
	</build>

	<profiles>
		<!-- 默认激活 dev 开发环境 -->
		<!-- 线上使用 mvn 打包添加 -Pproduction 变量 -->
		<profile>
			<!-- 本地开发环境 -->
			<id>development</id>
			<properties>
				<profiles.active>dev</profiles.active>
			</properties>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<dependencies>
			</dependencies>
		</profile>
		<profile>
			<!-- 生产环境 -->
			<id>production</id>
			<properties>
				<profiles.active>production</profiles.active>
			</properties>
		</profile>
	</profiles>
	<!-- spring-framework-bom -->
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-framework-bom</artifactId>
				<version>${spring.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
	
  
### 建立JDBC属性文件  

db.master.url=jdbc:mysql://127.0.0.1:3306/ssm?useUnicode=true

db.master.user=root

db.master.password=root


 ###  spring-datasource.xml
 
 配置数据库连接池
 
 
 ### spring-mybaits.xml 
 
 主要的就是自动扫描，自动注入
 配置SqlSessionFactory对象（mybatis）
扫描dao层接口，动态实现dao接口，也就是说不需要daoImpl，sql和参数都写在xml文件上

### spring-tx.xml
事务的配置信息
扫描service包所有注解 @Service
配置事务管理器，把事务管理交由spring来完成
配置基于注解的声明式事务，可以直接在方法上@Transaction

### 配置web层
开启SpringMVC注解模式，可以使用@RequestMapping，@PathVariable，@ResponseBody等
对静态资源处理，如js，css，jpg等
配置jsp 显示ViewResolver，例如在controller中某个方法返回一个string类型的"login"，实际上会返回"/WEB-INF/login.jsp"
扫描web层 @Controller

  
