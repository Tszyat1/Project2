import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.zip.DataFormatException;

public interface MemberReaderInterface {
    public List<MemberInterface> readDataSet(Reader inputFileReader) throws FileNotFoundException, IOException,
            DataFormatException;
}
