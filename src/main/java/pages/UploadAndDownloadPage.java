package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.nio.file.Paths;

public class UploadAndDownloadPage {

    private final SelenideElement downloadBtn = $("#downloadButton");

    /**
     * Opens the Upload and Download page.
     */
    public void openUploadAndDownloadPage() {
        open("https://demoqa.com/upload-download");
    }

    /**
     * Clicks the download button and verifies the file has been downloaded.
     */
    public void downloadFile() {
        // Dosya indirme işlemini başlatıyoruz.
        downloadBtn.click();

        // Mac üzerinde indirme klasörü
        String downloadDirectory = System.getProperty("user.home") + "/Downloads/";
        File dir = new File(downloadDirectory);

        // İndirilen dosyanın mevcut olup olmadığını kontrol et
        boolean fileDownloaded = false;
        File[] files = dir.listFiles();

        // Dosyaların üzerinden geçiyoruz ve sampleFile.jpeg dosyasını arıyoruz
        for (File file : files) {
            if (file.getName().equals("sampleFile.jpeg")) {  // Dosya adını tam olarak kontrol et
                fileDownloaded = true;
                break;
            }
        }

        // Dosya indirildi mi kontrol et
        assertTrue("Downloaded file 'sampleFile.jpeg' does not exist.", fileDownloaded);
    }

    /**
     * Closes the browser window or the whole WebDriver session.
     */
    public void closeUploadAndDownloadPage() {
        closeWebDriver(); // Closes the browser and cleans up the session
    }
}
