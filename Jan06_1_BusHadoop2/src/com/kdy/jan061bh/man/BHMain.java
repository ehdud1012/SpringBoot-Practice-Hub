package com.kdy.jan061bh.man;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class BHMain {
	public static void main(String[] args) {
		try {
			Configuration c = new Configuration();
			Job j = Job.getInstance(c);
			
			j.setMapperClass(BHMapper.class);
			j.setCombinerClass(BHReducer.class);
			j.setReducerClass(BHReducer.class);
			
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(j, new Path("/getBus.csv"));
			FileOutputFormat.setOutputPath(j, new Path("/busResult2"));
			
			j.waitForCompletion(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
