package wordcount.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.io.InterruptedIOException;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
    private Text outK = new Text();
    private IntWritable outV = new IntWritable(1);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedIOException {
        String line = value.toString();

        String[] words = line.split(" ");
        for (String word: words) {
            System.out.println(word);
        }
        for (String word: words) {
            outK.set(word);

            try {
                context.write(outK, outV);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
