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
## First step
Take this class as example:
```java
public class ExampleClass {
    private String value;

    public ExampleObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
```
then you can do the following operations:
### Serialize
```java
ExampleClass class = new ExampleClass("variable inside the class");
String s = SimpleSerializer.Serialize(class);
```
### Deserialize
```java
ExampleClass class = SimpleSerializer.Deserialize(jsonString, ExampleClass.class);
```

And thats it, noting more.
