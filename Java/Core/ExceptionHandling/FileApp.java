package Java.Core.ExceptionHandling;

public class FileApp {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        try {
            fileService.uploadFile("report.pdf");
        } catch (FileUploadException e) {
            System.out.println(e.getMessage());
            System.out.println("Reason : " + e.getCause().getMessage());
        }
    }
}

class FileStorageException extends Exception {
    public FileStorageException(String message) {
        super(message);
    }
}

class FileUploadException extends Exception {
    public FileUploadException(String message) {
        super(message);
    }
}

class FileService {
    public void uploadFile(String name) throws FileUploadException {
        try {
            throw new FileStorageException("Insufficient Disk Space");
        } catch (FileStorageException e) {
            FileUploadException fue = new FileUploadException("Failed TO Upload");
            fue.initCause(e);
            throw fue;
        }
    }
}
