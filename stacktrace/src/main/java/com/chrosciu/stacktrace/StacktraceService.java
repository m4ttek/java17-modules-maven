package com.chrosciu.stacktrace;

import java.util.List;
import java.util.stream.Collectors;

public class StacktraceService {
    public List<String> getCallStackClassNames() {
        StackWalker instance = StackWalker.getInstance();
        return instance.walk(stackFrameStream -> stackFrameStream
                .map(StackWalker.StackFrame::getClassName)
                .collect(Collectors.toList()));
//        List<String> clazzez = new ArrayList<>();
//        int i = 0;
//        Class<?> caller = Reflection.getCallerClass(i++);
//        do {
//            String clazz = caller.getName();
//            clazzez.add(clazz);
//            caller = Reflection.getCallerClass(i++);
//        } while (caller != null);
//        return clazzez;
    }
}
