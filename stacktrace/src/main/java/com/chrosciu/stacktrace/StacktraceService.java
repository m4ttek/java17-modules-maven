package com.chrosciu.stacktrace;

import java.util.List;
import java.util.stream.Collectors;

public class StacktraceService {
    public List<String> getCallStackClassNames() {
        return StackWalker
                .getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
                .walk(stackFrameStream -> stackFrameStream
                        .map(StackWalker.StackFrame::getClassName)
                        .collect(Collectors.toList()));
    }
}
