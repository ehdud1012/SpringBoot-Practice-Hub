package com.kdy.jan062kh.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class KHMain {
	public static void main(String[] args) {
		try {
			Configuration c = new Configuration();
			Job j = Job.getInstance(c);
			
			j.setMapperClass(KHMapper.class);
			j.setCombinerClass(KHReducce.class);
			j.setReducerClass(KHReducce.class);
			
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(j, new Path("/kakaoChat01.txt"));
			FileOutputFormat.setOutputPath(j, new Path("/kakaoChatNameCountResult"));
			
			j.waitForCompletion(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
