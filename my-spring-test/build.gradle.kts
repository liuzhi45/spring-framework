plugins {
    id("java")
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
	compile(project(":spring-aop"))
	compile(project(":spring-beans"))
	compile(project(":spring-context"))
	compile(project(":spring-core"))
	compile(project(":spring-expression"))
	compile(project(":spring-web"))
	compileOnly("javax.servlet:javax.servlet-api")
	testCompile(testFixtures(project(":spring-beans")))
	testCompile(testFixtures(project(":spring-core")))
	testCompile(testFixtures(project(":spring-context")))
	testCompile(testFixtures(project(":spring-web")))
	testCompile("javax.servlet:javax.servlet-api")
	testCompile("org.apache.httpcomponents:httpclient")
	testCompile("commons-fileupload:commons-fileupload")
	testCompile("commons-io:commons-io")
	testCompile("joda-time:joda-time")
	testCompile("org.mozilla:rhino")
	testCompile("dom4j:dom4j")
	testCompile("jaxen:jaxen")
	testCompile("org.xmlunit:xmlunit-assertj")
	testCompile("org.xmlunit:xmlunit-matchers")
	testCompile("org.hibernate:hibernate-validator")
	testCompile("javax.validation:validation-api")
	testCompile("io.projectreactor:reactor-core")
	testCompile("io.reactivex:rxjava")
	testCompile("io.reactivex:rxjava-reactive-streams")
	testCompile("io.reactivex.rxjava2:rxjava")
	testCompile("org.jetbrains.kotlin:kotlin-script-runtime")
	testRuntime("org.jetbrains.kotlin:kotlin-scripting-jsr223-embeddable")
	testRuntime("org.jruby:jruby")
	testRuntime("org.python:jython-standalone")
	testRuntime("org.webjars:underscorejs")
	testRuntime("org.glassfish:javax.el")
	testRuntime("com.sun.xml.bind:jaxb-core")
	testRuntime("com.sun.xml.bind:jaxb-impl")
	testRuntime("com.sun.activation:javax.activation")
}
tasks.test {
    useJUnitPlatform()
}
tasks.withType(JavaCompile::class.java){
    options.encoding = "UTF-8"
}
