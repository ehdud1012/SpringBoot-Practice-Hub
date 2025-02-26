package com.kdy.jan061bh.man;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class BHMapper extends Mapper<Object, Text, Text, IntWritable>{
	
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat E = new SimpleDateFormat("E");
	private static final Text YOIL_SUM = new Text();
	private static final Text YOIL_CNT = new Text();
	private static final IntWritable SUM = new IntWritable();
	private static final IntWritable ONE = new IntWritable(1);
	
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		try {
			String[] line = value.toString().split(",");			
			String yoil = E.format(SDF.parse(line[0] + line[1] + line[2]));
			YOIL_SUM.set(yoil+"_합");
			YOIL_CNT.set(yoil+"_갯수");
			SUM.set(Integer.parseInt(line[line.length - 2])
					+ Integer.parseInt(line[line.length - 1]));
			context.write(YOIL_SUM, SUM);
			context.write(YOIL_CNT, ONE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
