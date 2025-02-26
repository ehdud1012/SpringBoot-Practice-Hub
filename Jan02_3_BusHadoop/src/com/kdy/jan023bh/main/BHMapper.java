package com.kdy.jan023bh.main;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class BHMapper extends Mapper<Object, Text, Text, IntWritable>{
	private static final Text NO = new Text();
	private static final IntWritable SUM = new IntWritable();
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		String[] line = value.toString().split(",");
		NO.set(line[3]);
		SUM.set(Integer.parseInt(line[line.length - 2])
				+ Integer.parseInt(line[line.length - 1]));
		context.write(NO, SUM);
	}
}