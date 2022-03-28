import java.lang.System.getProperty

plugins {
    java
}

group = "moe.caramel"
version = "1.0"
base.archivesName.set("JavaCheck")

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.getByName<Jar>("jar") {
    archiveFileName.set("JavaCheck.jar")
    manifest.attributes(
        "Created-By" to "${getProperty("java.version")} (${getProperty("java.vendor")})",
        "Main-Class" to "JavaCheck"
    )
}
