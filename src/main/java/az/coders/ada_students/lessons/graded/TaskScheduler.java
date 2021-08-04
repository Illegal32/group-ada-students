package az.coders.ada_students.lessons.graded;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

    public class TaskScheduler {

        // This task is responsible to run multi thread (probably 20 thread)
        // and execute all Azerbaijan regions
        public static void main(String[] args) {

            try {
                Queue<CsvModel> queue = getAllTasksInQueue();

                ParallelTaskExecutor[] workers = new ParallelTaskExecutor[10];
                LocalDateTime first = LocalDateTime.now();
                long start = System.currentTimeMillis();

                for (int i = 0; i < workers.length; i++) {
                    workers[i] = new ParallelTaskExecutor("Worker " + (i + 1), queue);
                    workers[i].start();
                    // workers[i].join();
                }

                for (ParallelTaskExecutor ex : workers)
                    ex.join();
                LocalDateTime second = LocalDateTime.now();
                System.out.printf("=> Time difference : %s \n", (second.getNano() - first.getNano()));
                long end = System.currentTimeMillis();
                System.out.println("Total time cost: " + (end - start));
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }

        static Queue<CsvModel> getAllTasksInQueue() throws IOException {
            File file = new File("C:\\Users\\Administrator\\Desktop\\group-ada-students-master\\src\\main\\java\\az\\coders\\ada_students\\lessons\\data\\world-cities_csv.csv");
            Queue<CsvModel> tasks = new PriorityQueue<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if ( line.split(",")[1].equals("Azerbaijan") ) {
                    tasks.add(new CsvModel(
                            line.split(",")[0],
                            line.split(",")[1]));
                }
            }
            return tasks;
        }
    }
