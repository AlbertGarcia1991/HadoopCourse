import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.conf.*;

public class MaxTemperature {

    // This is the main function to be run as a Hadoop job
    public static void main(String[] args) throws Exception {

        // It requires two arguments: input data and output folder (must no exists before running the job)
        if (args.length != 2) {
            System.err.println("Usage: MaxTemperature <input path> <output path>");
            System.exit(-1);
        }

        Job job = Job.getInstance(new Configuration());  // Create a new Hadoop job
        job.setJarByClass(MaxTemperature.class);  // Declares which jar should be sent to nodes to perform MR
        job.setJobName("Max temperature");  // Sets the job name

        FileInputFormat.addInputPath(job, new Path(args[0]));  // Takes the first argument of this method as the input data
        FileOutputFormat.setOutputPath(job, new Path(args[1]));  // Sets the second argument of this method as the output directory

        job.setMapperClass(MaxTemperatureMapper.class);  // Indicates which class to use as Map function
        job.setCombinerClass(MaxTemperatureReducer.class);  // Indicates which combiner class to use just before shuffling and sending data to the Reducer
        job.setReducerClass(MaxTemperatureReducer.class);  // Indicates which class to use as Reduce function

        job.setOutputKeyClass(Text.class);  // Declares the expected type of the output key (for both map and reduce phases)
        job.setOutputValueClass(IntWritable.class);  // Declares the expected type of the output value (for both map and reduce phases)

        System.exit(job.waitForCompletion(true) ? 0 : 1);  // waitForCompletion method returns (1) only when the job is finished
    }
}