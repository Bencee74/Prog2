import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileHandling {
    public void writeToFile(int N) throws Exception{
        FileWriter fileWriter = new FileWriter("Floyd.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);

        int i, j, value = 1;


        for(i = 1; i <= N; i++) {
            for(j = 1; j <= i; j++){
                bw.write(value + " ");
                value++;
            }
            if (i < N) bw.write("\n");
        }
        bw.close();
    }
}