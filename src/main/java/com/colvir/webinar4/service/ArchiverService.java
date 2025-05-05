package com.colvir.webinar4.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class ArchiverService {
    public void archiveFile(String contextPath, String inputName, String compressedName) throws IOException {
        String sourceFile = contextPath + inputName;
        System.out.println("Search file:" + sourceFile);
        try (FileOutputStream fos = new FileOutputStream(contextPath + compressedName)) {
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            File fileToZip = new File(sourceFile);

            try (FileInputStream fis = new FileInputStream(fileToZip)) {
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zipOut.putNextEntry(zipEntry);

                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zipOut.write(bytes, 0, length);
                }

                zipOut.closeEntry();
                zipOut.close();
            }
        }
    }
}
