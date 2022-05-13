package tutorial_000.languageNewFeatures;

public class _004_JvmChanges {
	/*
	 * Java 14 delivered various changes concerning JVM. Here are some.
	 */
	
	/*
	 * Packaging Tool
	 * 
	 * Java 14 introduce jpackage based on javapackager ( javapackager was introduced in Java 8 as part of JavaFX kit
	 * but this kit was splited from Java from version 11. Thus, this packaging tool is no more available in standard offering).
	 * 
	 * jpackage was developed to provide native installer for an operating system. For example, an msi/exe for windows, pkg/dmg for MacOS
	 * or deb/rpm for Linux. Without this tool, developer generally share a jar file which a user has to run within a JVM.
	 * 
	 * So now, developers can use jlink to compress the required JDK modules to minimum modules and use the jpackage to create a lightweight image.
	 * 
	 * For example, if we want to create an executable for windows, we may download "WiX Toolset" (https://github.com/wixtoolset/wix3/releases/tag/wix3112rtm)
	 *  and add the toolkit to ou path. Then, we may create jar, put it in a folder (let say "lib") and run the following command to create 
	 *  a windows MSI installer :
	 *  
	 	jpackage --input lib --name APITester --main-jar APITester.jar --main-class APITester --type msi --java-options '--enable-preview'
	 *  
	 */
	
	/*
	 * NUMA Aware G1
	 * 
	 * NUMA stands for Non-Uniform Memory Access. It is a memory architecture in which each processor core has its own local memory but other cores 
	 * have permissions to access it. Paraller GC, when used with "-XX:+UseParallelGC", is NUMA Aware for couple of years. It improves the performance 
	 * of configurations running a single JVM across multiple sockets. With Java 14, G1 is enhanced to manage memory usage better.
	 */
	
	/*
	 *  Z Garbage Collector
	 * 
	 * The Z Garbage Collector (ZGC) is a scalable, low-latency garbage collector introduced by Java 11 as preview feature. It was supported only
	 * for Linux/x64. With Java 14, ZGC is ported for Windows and Mac OS. It's still a preview feature.
	 */
	
	/*
	 * JFR Event Streaming
	 * 
	 * It enhances JDK Flight Recorder data to continuous monitoring for in-process as well as out-of-process applications.
	 * Till Java 13, in order to use JFR data, user need to start a recording, stop and dump the content to disk and then parse the recording file. 
	 * This approach is well suited for application profiling but not for monitoring.
	 * 
	 * Now the package jdk.jfr.consumer is enhanced to subscribe to events asynchronously. Using this subscription, User can read recording data 
	 * directly, or stream, from the disk repository without a need to dump a recording file.
	 */
	
	/*
	 * Non-Volatile Mapped Byte Buffers
	 * 
	 * Java 13 adds a new JDK-specific file mapping mode to allow FileChannel API usage to create a MappedByteBuffer instance and Non-volatile memory 
	 * can be accessed. Non-Volatile Memory or NVM is a persistent memory and is used to store data permanently.
	 * 
	 * Now MappedByteBufer API supports direct memory updates and provides a durability guarantee which is required for higher level APIs like block 
	 * file systems, journal logs, persistent objects, etc to implement persistent data types.
	 */
	
	/*
	 * Foreign-Memory Access API
	 * 
	 * Java 14 now allows java programs to safely and efficiently access foreign memory outside of the Java heap. Earlier mapDB, memcached java 
	 * libraries provided the foreign memory access. This feature aims to provide a cleaner API to operate on all types of foreign memories
	 * (native memory, persistent memory, managed heap memory etc. ) in a seamless way. This JEP takes care of safety of JVM regardless of foreign
	 *  memory type. Garbage collection/Memory deallocation operations should be explicitly mentioned as well.
	 * 
	 * This API is based on three main abstractions : MemorySegment, MemoryAddress and MemoryLayout, and is a safe way to access both heap as well 
	 * as non-heap memory.
	 */
}
