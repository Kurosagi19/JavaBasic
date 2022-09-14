package AssignmentPhones;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class phoneFile {
    private static final String phoneFileName = "phones.txt";

    public static void write(List<phoneManager> phonesList) throws FileNotFoundException, NotSerializableException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream((new File(phoneFileName)));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phonesList);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (NotSerializableException e) {
            throw new NotSerializableException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public List<phoneManager> read() {
        List<phoneManager> phonesList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(phoneFileName));
            ois = new ObjectInputStream(fis);
            phonesList = (List<phoneManager>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return phonesList;
    }


    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
