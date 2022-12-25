plugins {
    id("java-library")
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.springframework.boot") version "2.7.2"
    id("org.openapi.generator") version "6.0.1"
    id("java")
}

group = "com.example"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")

    implementation("io.swagger.core.v3:swagger-annotations:2.2.1")
    implementation("io.swagger.core.v3:swagger-core:2.2.1")
    implementation("io.springfox:springfox-swagger2:3.0.0")
    implementation("io.springfox:springfox-swagger-ui:3.0.0")
    implementation("org.openapitools:jackson-databind-nullable:0.1.0")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("javax.validation:validation-api:2.0.1.Final")

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.liquibase:liquibase-core")
    implementation("org.mapstruct:mapstruct:1.5.2.Final")

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    runtimeOnly("org.postgresql:postgresql")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")

}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(
            listOf(
                    "-Amapstruct.unmappedTargetPolicy=IGNORE",
                    "-Amapstruct.defaultComponentModel=spring",
                    "-Amapstruct.defaultInjectionStrategy=constructor"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val spec = "$rootDir/docs/openapi/User.yaml"
val generatedSourcesDir = "$buildDir/generated/openapi"
openApiGenerate {
    generatorName.set("spring")
    inputSpec.set(spec)
    outputDir.set(generatedSourcesDir)
    apiPackage.set("org.openapi.example.api")
    invokerPackage.set("org.openapi.example.invoker")
    modelPackage.set("org.openapi.example.model")
    configOptions.set(mapOf(
            "dateLibrary" to "java8"
    ))
}

springBoot {
    mainClass.set("com.example.hava_hava.HavaHavaApp")
}

sourceSets {
    getByName("main") {
        java {
            srcDir("$buildDir/generated/openapi/src/main/java")
        }
    }
}

tasks {
    val openApiGenerate by getting

    val compileJava by getting {
        dependsOn(openApiGenerate)
    }
}

