package com.chrosciu.stacktrace;

import java.util.List;
import java.util.stream.Collectors;

public class StacktraceService {
    public List<String> getCallStackClassNames() {
        StackWalker stackWalker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        return stackWalker.walk(
                stackFrameStream -> stackFrameStream
                        .map(StackWalker.StackFrame::getClassName)
                        .collect(Collectors.toList())
        );
    }
}
