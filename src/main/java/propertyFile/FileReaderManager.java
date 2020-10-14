package propertyFile;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
	
	public static ConfiqReader getInstances() {
		ConfiqReader cr=new ConfiqReader();
		return cr;
	}

}
