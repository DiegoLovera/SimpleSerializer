# SimpleSerializer
An android simple json serializer

# Usage
Simple examples to use the library

## Download
Add jitpack to your build.gradle(Project) repositories
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and in your build.gradle(Module:app)
```gradle
dependencies {
    implementation 'com.github.DiegoLovera:SimpleSerializer:0.3'
}
```

## Serialize
```java
ExampleClass class = new ExampleClass("variable inside the class");
String s = SimpleSerializer.Serialize(class);
```
## Deserialize
```java
ExampleClass class = SimpleSerializer.Deserialize(jsonString, ExampleClass.class);
```
