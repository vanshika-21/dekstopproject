package com.vp.fp;

public class FileFolder {
	
	private String fileFolderName;
	private String fileFolderPath;
	private boolean isFile;
	private boolean isFolder;
	private float size;
	
	public FileFolder() {}
	
	
	
	public FileFolder(String fileFolderName, String fileFolderPath, boolean isFile, boolean isFolder, float size) {
		super();
		this.fileFolderName = fileFolderName;
		this.fileFolderPath = fileFolderPath;
		this.isFile = isFile;
		this.isFolder = isFolder;
		this.size = size;
	}



	public String getFileFolderName() {
		return fileFolderName;
	}
	public void setFileFolderName(String fileFolderName) {
		this.fileFolderName = fileFolderName;
	}
	public String getFileFolderPath() {
		return fileFolderPath;
	}
	public void setFileFolderPath(String fileFolderPath) {
		this.fileFolderPath = fileFolderPath;
	}
	public boolean isFile() {
		return isFile;
	}
	public void setFile(boolean isFile) {
		this.isFile = isFile;
	}
	public boolean isFolder() {
		return isFolder;
	}
	public void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileFolderName == null) ? 0 : fileFolderName.hashCode());
		result = prime * result + (isFile ? 1231 : 1237);
		result = prime * result + (isFolder ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(size);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileFolder other = (FileFolder) obj;
		if (fileFolderName == null) {
			if (other.fileFolderName != null)
				return false;
		} else if (!fileFolderName.equals(other.fileFolderName))
			return false;
		if (isFile != other.isFile)
			return false;
		if (isFolder != other.isFolder)
			return false;
		if (Float.floatToIntBits(size) != Float.floatToIntBits(other.size))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FileFolder [fileFolderName=" + fileFolderName + ", fileFolderPath=" + fileFolderPath + ", isFile="
				+ isFile + ", isFolder=" + isFolder + ", size=" + size + "]";
	}
	
	

}
