package com.hbh.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	
	private static final int BSIZE = 1024;
	
	public static void main(String[] args) throws IOException {
		String filename = "text.txt";
		FileChannel fc = new FileOutputStream(filename).getChannel();
		fc.write(ByteBuffer.wrap("some text".getBytes()));
		fc.close();
		fc = new RandomAccessFile(filename, "rw").getChannel();
		fc.position();
		fc.write(ByteBuffer.wrap("some more".getBytes()));
		fc.close();
		fc = new FileInputStream(filename).getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining()) {
			System.out.println((char)buff.get());
		}
	}
	
}
