package wordcount.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private IntWritable outV = new IntWritable();

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException {
        int sum = 0;
        for (IntWritable value: values) {
            sum += value.get();
        }

        try {
            outV.set(sum);
            context.write(key, outV);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
