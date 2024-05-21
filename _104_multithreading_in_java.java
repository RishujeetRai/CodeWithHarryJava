/*
Multiprocessing and multithreading both are used to achieve multitasking
but
threads use shared memory area of a process
threads have faster content switching
and a thread is lightweight whereas a process is heavyweight
unlike processes, control can toggle between threads till their job is finished

Control Flow without Threading:
    main() --> func1() --> func2() --> end
Control Flow with Threading:
    main() --> func1()/func2() --> end

There are two types to create a thread in Java:
1) By extending Thread Class
2) By implementing Runnable Interface

Concurrency vs Parallelism
Concurrency is the task of running and managing the multiple computations at the same time.
While parallelism is the task of running multiple computations simultaneously.
Concurrency can be done using a single processing unit.
*/
public class _104_multithreading_in_java {
    public static void main(String[] args) {

    }
}
