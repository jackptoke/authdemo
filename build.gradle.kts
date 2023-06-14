// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        // other repositories...
        google()
        mavenCentral()
    }
    dependencies {
        // other plugins...
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.46.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.8.21")
    }
}

//@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.androidLibrary) apply false
}
true // Needed to make the Suppress annotation work for the plugins block