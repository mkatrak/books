<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<parent>
		<groupId>sk.mka.books</groupId>
		<artifactId>sk-mka-books</artifactId>
		<version>1.0-SNAPSHOT</version>
	</parent>

	<groupId>sk.mka.books.threads</groupId>
	<artifactId>sk-mka-books-threads</artifactId>
	<version>1.0-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>sk-mka-books-threads</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<dependencies>
		<!-- internal dependency -->
		<dependency>
			<groupId>sk.mka.books.core</groupId>
			<artifactId>sk-mka-books-core</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>
	</dependencies>


	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<configuration>
						<source>1.6</source>
						<target>1.6</target>
						<encoding>UTF-8</encoding>
						<showWarnings>true</showWarnings>
					</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>
</project>
