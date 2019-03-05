package com.diegolovera.simpleserializer;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Simple static class that implements the 2 basic methods to serialize and deserialize and object
 */
public class SimpleSerializer {
    /**
     * Serialize an object
     * @param obj object to be serialized
     * @param <T> Any object type
     * @return Returns the string of the object serialized
     */
    public static <T> String Serialize(T obj){
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    /**
     * Deserialize an object
     * @param json object to be deserialize
     * @param type type of the object to be serialized
     * @param <T> Any object type
     * @return The object deserialize
     */
    public static <T> T Deserialize(String json, Type type){
        Gson gson = new Gson();
        return (T)gson.fromJson(json, type);
    }
}
