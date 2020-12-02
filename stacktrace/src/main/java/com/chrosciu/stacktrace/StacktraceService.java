package com.chrosciu.stacktrace;

import sun.reflect.Reflection;

import java.util.ArrayList;
import java.util.List;

public class StacktraceService {
    public List<String> getCallStackClassNames() {
        List<String> clazzez = new ArrayList<>();
        int i = 0;
        Class<?> caller = Reflection.getCallerClass(i++);
        do {
            String clazz = caller.getName();
            clazzez.add(clazz);
            caller = Reflection.getCallerClass(i++);
        } while (caller != null);
        return clazzez;
    }
}
