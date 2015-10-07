package com.fs;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.common.jimfs.Jimfs;
import com.util.OSUtil;

public class InMemoryFileSystem {

	private FileSystem fs; 
	private Path path;

	public InMemoryFileSystem(String path) throws IOException {
		super();
		this.fs = Jimfs.newFileSystem(OSUtil.getfileSystemConfiguration());
		this.path =  fs.getPath(path);
		Files.createDirectory(this.path);
	}

	public FileSystem getFs() {
		return fs;
	}
}
