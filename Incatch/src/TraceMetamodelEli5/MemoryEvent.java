package TraceMetamodelEli5;

import jdk.jfr.*;
import java.io.IOException;

@Label("Memory Event")
class MemoryEvent extends Event {
    @Label("Memory Used (Bytes)")
    long memoryUsed;
}