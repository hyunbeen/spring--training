package annotation2.autowired;
import java.io.FileWriter;
import java.io.IOException;

public class OutputerImpl implements Outputer {
	
	private String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void writeMessage(String msg) throws IOException {
		FileWriter f = new FileWriter(path);
		f.write( msg );
		f.close();


	}

}
