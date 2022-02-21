package lesson18_multithreaded.homeWork.version2;

public class NewThread extends Thread {
    private ReaderFile readerFile;
    private WriterFile writerFile;

    public NewThread() {
    }

    public NewThread(ReaderFile readerFile, WriterFile writerFile) {
        this.readerFile = readerFile;
        this.writerFile = writerFile;
    }

    public ReaderFile getReaderFile() {
        return readerFile;
    }

    public void setReaderFile(ReaderFile readerFile) {
        this.readerFile = readerFile;
    }

    public WriterFile getWriterFile() {
        return writerFile;
    }

    public void setWriterFile(WriterFile writerFile) {
        this.writerFile = writerFile;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
