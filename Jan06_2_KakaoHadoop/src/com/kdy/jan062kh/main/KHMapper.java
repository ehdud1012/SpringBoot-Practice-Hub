package com.kdy.jan062kh.main;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class KHMapper extends Mapper<Object, Text, Text, IntWritable>{
	private static final Text NAME = new Text();
	private static final IntWritable ONE = new IntWritable(1);
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		try {
			String[] line = value.toString().split(", ");
			String name = line[1].split(" : ")[0];
			NAME.set(name);
			context.write(NAME, ONE);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
