import java.io.FileWriter;
import java.io.IOException;

public class OutputerImpl implements Outputer {

	@Override
	public void writeMessage(String msg) throws IOException {
		FileWriter f = new FileWriter( "save.txt");
		f.write( msg );
		f.close();


	}

}
