public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Worker.OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}